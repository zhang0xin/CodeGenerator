require 'erb'
require 'fileutils'
require 'yaml'
require_relative 'library/table'
require_relative 'library/entity'
require_relative 'library/paramloader'
require_relative 'library/nameformatter'
require_relative 'library/codehelper'
puts "#{__FILE__}"

db_params_dir = "resource_2_0_0/*t.txt"
vw_params_dir = "resource_2_0_0/*v.txt"
ui_params_dir = "resource_2_0_0/*p.txt"
output_dir = "output"
template_dir = "template_2_0_0"

def genernate_template template_file, output_file, param_binding
  File.open( template_file ) do |template| 
    erb = ERB.new( template.read )
    FileUtils.makedirs(File::dirname(output_file))
    
    File.open(output_file, "w") do |output|
      result = erb.result( param_binding ).encode('UTF-8')
      output.syswrite result
    end
  end
end

entities = Hash.new;
tables = Hash.new;
pages = Hash.new;
biz_name = 'purchase'

param_tables = ParamLoader.load_from_text db_params_dir
param_tables.each do |key, value|
  tables[key] = ParamLoader.create_table value
  entities[key] = ParamLoader.create_entity value
  pages[key] = ParamLoader.create_page_from_entity entities[key]
end
param_views = ParamLoader.load_from_text vw_params_dir
param_views.each do |key, value|
  tables[key] = ParamLoader.create_table value
  entities[key] = ParamLoader.create_entity value
  pages[key] = ParamLoader.create_page_from_entity entities[key]
end

tables.each do |key, value|
  table = tables[key]
  
  #Update Sqls
  genernate_template "#{template_dir}/AlterTable.sql.erb", \
    "#{output_dir}/sql/alter_#{table.name}.sql", binding
  
  #Currency Change Sqls
  genernate_template "#{template_dir}/currency_change.sql.erb", \
    "#{output_dir}/sql/currency_change_#{table.name}.sql", binding
end

entities.each do |key, value|
  table = tables[key]
  entity = entities[key]
  
  #Hibernate Configs
  genernate_template "#{template_dir}/EntityAuto.java.erb", \
    "#{output_dir}/java/POJO/#{entity.class_name}Auto.java", binding
  genernate_template "#{template_dir}/Entity.java.erb", \
    "#{output_dir}/java/POJO/#{entity.class_name}.java", binding
  genernate_template "#{template_dir}/EntityDAO.java.erb", \
    "#{output_dir}/java/DAO/#{entity.class_name}DAO.java", binding
  genernate_template "#{template_dir}/EntityService.java.erb", \
    "#{output_dir}/java/Service/#{entity.class_name}Service.java", binding
  
  #Entity Frame Genernators
  genernate_template "#{template_dir}/EntityFrame.java.erb", \
    "#{output_dir}/java/frame/#{entity.class_name}Frame.java", binding
  
  #Ui Genernators
  genernate_template "#{template_dir}/EntityUiAuto.java.erb", \
    "#{output_dir}/java/ui/#{entity.class_name}UiAuto.java", binding
  genernate_template "#{template_dir}/EntityUi.java.erb", \
    "#{output_dir}/java/ui/#{entity.class_name}Ui.java", binding
end

pages.each do |key, value|
  entity = entities[key]
  page = pages[key]
  downcase_class_name = entity.class_name.gsub(/^\w/){|s| s.downcase}
  
  #Struts Actions
  genernate_template "#{template_dir}/EntityAction.java.erb", \
    "#{output_dir}/java/Action/#{entity.class_name}Action.java", binding
  genernate_template "#{template_dir}/EntityParamsAuto.java.erb", \
    "#{output_dir}/java/Action/#{entity.class_name}ParamsAuto.java", binding
  genernate_template "#{template_dir}/EntityParams.java.erb", \
    "#{output_dir}/java/Action/#{entity.class_name}Params.java", binding
  
  #Jsp Page Segments
  genernate_template "#{template_dir}/entity_grid.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_class_name}_segments/#{downcase_class_name}_grid.jsp", binding
  genernate_template "#{template_dir}/entity_details.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_class_name}_segments/#{downcase_class_name}_details.jsp", binding
  genernate_template "#{template_dir}/entity_query.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_class_name}_segments/#{downcase_class_name}_query.jsp", binding
  genernate_template "#{template_dir}/entity_edit.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_class_name}_segments/#{downcase_class_name}_edit.jsp", binding
  genernate_template "#{template_dir}/entity_dialog_selector.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_class_name}_segments/#{downcase_class_name}_dialog_selector.jsp", binding
  genernate_template "#{template_dir}/entity_details_editor.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_class_name}_segments/#{downcase_class_name}_details_editor.jsp", binding
end

param_pages = ParamLoader.load_from_text ui_params_dir
param_pages.each do |key, value|
  page = ParamLoader.create_page_from_config pages, value
  pages[key] = page
end
pages.each do |key, value|
  page = pages[key]
  downcase_page_name = page.page_name.gsub(/^\w/){|s| s.downcase}

  genernate_template "#{template_dir}/PageAction.java.erb", \
    "#{output_dir}/java/Action/#{page.page_name}Action.java", binding
  #Jsp Pages
  genernate_template "#{template_dir}/page.jsp.erb", \
    "#{output_dir}/java/Jsp/#{downcase_page_name}.jsp", binding
end

#Configs
genernate_template "#{template_dir}/spring.xml.erb", "#{output_dir}/java/Config/spring.xml", binding
genernate_template "#{template_dir}/struts.xml.erb", "#{output_dir}/java/Config/struts.xml", binding
genernate_template "#{template_dir}/MenuFrag.xml.erb", "#{output_dir}/java/Config/menu.xml", binding

