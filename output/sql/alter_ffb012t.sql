declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb012t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb012t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fbiz_id NVARCHAR2(36) ,

faudit_order NVARCHAR2(2) ,

faudit_suggestion NVARCHAR2(500) ,

faudit_duty NVARCHAR2(36) ,

fflow_id NVARCHAR2(36) ,

faudit_pass NVARCHAR2(10) ,

faudit_man NVARCHAR2(36) ,

faudit_date DATE ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb012t IS ''审核记录''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.fbiz_id IS ''业务id''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_order IS ''审批序号''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_suggestion IS ''审批意见''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_duty IS ''审批职务''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.fflow_id IS ''审批流程id''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_pass IS ''审批状态''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_man IS ''审批人''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_date IS ''审批时间''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb012t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('fbiz_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (fbiz_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fbiz_id IS ''业务id''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (fbiz_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fbiz_id IS ''业务id''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('faudit_order');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (faudit_order NVARCHAR2(2))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_order IS ''审批序号''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (faudit_order NVARCHAR2(2))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_order IS ''审批序号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('faudit_suggestion');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (faudit_suggestion NVARCHAR2(500))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_suggestion IS ''审批意见''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (faudit_suggestion NVARCHAR2(500))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_suggestion IS ''审批意见''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('faudit_duty');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (faudit_duty NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_duty IS ''审批职务''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (faudit_duty NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_duty IS ''审批职务''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('fflow_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (fflow_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fflow_id IS ''审批流程id''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (fflow_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fflow_id IS ''审批流程id''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('faudit_pass');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (faudit_pass NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_pass IS ''审批状态''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (faudit_pass NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_pass IS ''审批状态''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('faudit_man');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (faudit_man NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_man IS ''审批人''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (faudit_man NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_man IS ''审批人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('faudit_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (faudit_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_date IS ''审批时间''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (faudit_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.faudit_date IS ''审批时间''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb012t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb012t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb012t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb012t.farchived IS ''归档''
';
    end if;
    
  end if;
end;