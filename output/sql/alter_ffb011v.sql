declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb011v');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb011v
(

f0 NVARCHAR2(36) PRIMARY KEY,

fbiz_id NVARCHAR2(36) ,

fwhere_id NVARCHAR2(100) ,

fprev_state NVARCHAR2(10) ,

fnext_order NVARCHAR2(10) ,

fpurchase_batch_id NVARCHAR2(36) ,

ftrade_type NVARCHAR2(10) ,

fore_area NVARCHAR2(10) ,

fmaterial_id NVARCHAR2(36) ,

ftfe NVARCHAR2(20) ,

fh2o NVARCHAR2(20) ,

fsio2 NVARCHAR2(20) ,

fal2o3 NVARCHAR2(20) ,

fp NVARCHAR2(20) ,

fs NVARCHAR2(20) ,

fother NVARCHAR2(200) ,

fprice NVARCHAR2(50) ,

fpurchase_quantity NUMBER(20,5) ,

funit NVARCHAR2(10) ,

fport_load_date DATE ,

fport_load_name NVARCHAR2(30) ,

fport_arrived_date DATE ,

fport_arrived_name NVARCHAR2(30) ,

fbuyer NVARCHAR2(30) ,

fseller NVARCHAR2(30) ,

fresource_location NVARCHAR2(30) ,

faudit_state NVARCHAR2(10) ,

fvisible_department NVARCHAR2(30) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

fflowcd NVARCHAR2(36) ,

fendorder NVARCHAR2(10) ,

fcheckpost NVARCHAR2(36) ,

fcd_nm NVARCHAR2(80) ,

fcheckuserid NVARCHAR2(36) ,

fuser_nm NVARCHAR2(50) 

)';
    execute immediate
'
COMMENT ON TABLE ffb011v IS ''采购申请''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fbiz_id IS ''业务id''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fwhere_id IS ''审批条件id''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fprev_state IS ''上级审批状态''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fnext_order IS ''下级审批序号(1通过、0未通过)''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fpurchase_batch_id IS ''采购批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.ftrade_type IS ''贸易类型''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fore_area IS ''矿石产区''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fmaterial_id IS ''物料名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.ftfe IS ''TFe''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fh2o IS ''H2O''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fsio2 IS ''SiO2''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fal2o3 IS ''Al2O3''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fp IS ''P''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fs IS ''S''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fother IS ''粒度''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fprice IS ''价格''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fpurchase_quantity IS ''采购量''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.funit IS ''单位''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fport_load_date IS ''装港日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fport_load_name IS ''装港名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fport_arrived_date IS ''到港日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fport_arrived_name IS ''到港名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fbuyer IS ''买方（最终用户）''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fseller IS ''卖方（矿山/供应商）''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fresource_location IS ''资源位置''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.faudit_state IS ''审批状态''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fvisible_department IS ''可见部门''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fflowcd IS ''审批流程编码''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fendorder IS ''审批结束序号''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fcheckpost IS ''审批职务f0''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fcd_nm IS ''审批职务名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fcheckuserid IS ''审批人f0''
';

    execute immediate
'
COMMENT ON COLUMN ffb011v.fuser_nm IS ''审批人姓名''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fbiz_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fbiz_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fbiz_id IS ''业务id''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fbiz_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fbiz_id IS ''业务id''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fwhere_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fwhere_id NVARCHAR2(100))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fwhere_id IS ''审批条件id''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fwhere_id NVARCHAR2(100))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fwhere_id IS ''审批条件id''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fprev_state');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fprev_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fprev_state IS ''上级审批状态''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fprev_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fprev_state IS ''上级审批状态''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fnext_order');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fnext_order NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fnext_order IS ''下级审批序号(1通过、0未通过)''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fnext_order NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fnext_order IS ''下级审批序号(1通过、0未通过)''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fpurchase_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fpurchase_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fpurchase_batch_id IS ''采购批次''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fpurchase_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fpurchase_batch_id IS ''采购批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('ftrade_type');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (ftrade_type NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.ftrade_type IS ''贸易类型''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (ftrade_type NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.ftrade_type IS ''贸易类型''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fore_area');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fore_area NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fore_area IS ''矿石产区''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fore_area NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fore_area IS ''矿石产区''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fmaterial_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fmaterial_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fmaterial_id IS ''物料名称''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fmaterial_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fmaterial_id IS ''物料名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('ftfe');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (ftfe NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.ftfe IS ''TFe''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (ftfe NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.ftfe IS ''TFe''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fh2o');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fh2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fh2o IS ''H2O''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fh2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fh2o IS ''H2O''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fsio2');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fsio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fsio2 IS ''SiO2''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fsio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fsio2 IS ''SiO2''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fal2o3');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fal2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fal2o3 IS ''Al2O3''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fal2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fal2o3 IS ''Al2O3''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fp');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fp NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fp IS ''P''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fp NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fp IS ''P''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fs');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fs NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fs IS ''S''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fs NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fs IS ''S''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fother');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fother NVARCHAR2(200))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fother IS ''粒度''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fother NVARCHAR2(200))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fother IS ''粒度''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fprice');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fprice NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fprice IS ''价格''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fprice NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fprice IS ''价格''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fpurchase_quantity');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fpurchase_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fpurchase_quantity IS ''采购量''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fpurchase_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fpurchase_quantity IS ''采购量''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('funit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (funit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.funit IS ''单位''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (funit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.funit IS ''单位''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fport_load_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fport_load_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_load_date IS ''装港日期''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fport_load_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_load_date IS ''装港日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fport_load_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fport_load_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_load_name IS ''装港名称''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fport_load_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_load_name IS ''装港名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fport_arrived_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fport_arrived_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_arrived_date IS ''到港日期''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fport_arrived_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_arrived_date IS ''到港日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fport_arrived_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fport_arrived_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_arrived_name IS ''到港名称''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fport_arrived_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fport_arrived_name IS ''到港名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fbuyer');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fbuyer NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fbuyer IS ''买方（最终用户）''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fbuyer NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fbuyer IS ''买方（最终用户）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fseller');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fseller NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fseller IS ''卖方（矿山/供应商）''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fseller NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fseller IS ''卖方（矿山/供应商）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fresource_location');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fresource_location NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fresource_location IS ''资源位置''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fresource_location NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fresource_location IS ''资源位置''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('faudit_state');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (faudit_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.faudit_state IS ''审批状态''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (faudit_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.faudit_state IS ''审批状态''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fvisible_department');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fvisible_department IS ''可见部门''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fvisible_department IS ''可见部门''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fflowcd');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fflowcd NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fflowcd IS ''审批流程编码''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fflowcd NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fflowcd IS ''审批流程编码''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fendorder');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fendorder NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fendorder IS ''审批结束序号''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fendorder NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fendorder IS ''审批结束序号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fcheckpost');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fcheckpost NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcheckpost IS ''审批职务f0''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fcheckpost NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcheckpost IS ''审批职务f0''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fcd_nm');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fcd_nm NVARCHAR2(80))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcd_nm IS ''审批职务名称''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fcd_nm NVARCHAR2(80))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcd_nm IS ''审批职务名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fcheckuserid');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fcheckuserid NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcheckuserid IS ''审批人f0''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fcheckuserid NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fcheckuserid IS ''审批人f0''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011v')  and t.column_name = upper('fuser_nm');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011v ADD (fuser_nm NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fuser_nm IS ''审批人姓名''
';
    else
      execute immediate
'
ALTER TABLE ffb011v MODIFY (fuser_nm NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb011v.fuser_nm IS ''审批人姓名''
';
    end if;
    
  end if;
end;