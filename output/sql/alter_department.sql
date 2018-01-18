declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('department');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE department
(

f0 NVARCHAR2(36) PRIMARY KEY,

fdepartment_id NVARCHAR2(30) ,

fstudent_count NUMBER(10) ,

fname NVARCHAR2(36) ,

fdt DATE ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE department IS ''部门''
';

    execute immediate
'
COMMENT ON COLUMN department.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN department.fdepartment_id IS ''部门编码''
';

    execute immediate
'
COMMENT ON COLUMN department.fstudent_count IS ''学生数''
';

    execute immediate
'
COMMENT ON COLUMN department.fname IS ''部门名称''
';

    execute immediate
'
COMMENT ON COLUMN department.fdt IS ''时间''
';

    execute immediate
'
COMMENT ON COLUMN department.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN department.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN department.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN department.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN department.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN department.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN department.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fdepartment_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fdepartment_id NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN department.fdepartment_id IS ''部门编码''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fdepartment_id NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN department.fdepartment_id IS ''部门编码''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fstudent_count');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fstudent_count NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN department.fstudent_count IS ''学生数''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fstudent_count NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN department.fstudent_count IS ''学生数''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fname');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fname NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN department.fname IS ''部门名称''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fname NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN department.fname IS ''部门名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fdt');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fdt DATE)
';
      execute immediate
'
COMMENT ON COLUMN department.fdt IS ''时间''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fdt DATE)
';
      execute immediate
'
COMMENT ON COLUMN department.fdt IS ''时间''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN department.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN department.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN department.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN department.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN department.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN department.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN department.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN department.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('department')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE department ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN department.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE department MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN department.farchived IS ''归档''
';
    end if;
    
  end if;
end;