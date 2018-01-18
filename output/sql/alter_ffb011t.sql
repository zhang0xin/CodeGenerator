declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb011t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb011t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fbiz_id NVARCHAR2(36) ,

fwhere_id NVARCHAR2(100) ,

fprev_state NVARCHAR2(10) ,

fnext_order NVARCHAR2(10) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb011t IS ''审核关系''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fbiz_id IS ''业务id''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fwhere_id IS ''审批条件id''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fprev_state IS ''上级审批状态''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fnext_order IS ''下级审批序号''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb011t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fbiz_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fbiz_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fbiz_id IS ''业务id''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fbiz_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fbiz_id IS ''业务id''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fwhere_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fwhere_id NVARCHAR2(100))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fwhere_id IS ''审批条件id''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fwhere_id NVARCHAR2(100))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fwhere_id IS ''审批条件id''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fprev_state');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fprev_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fprev_state IS ''上级审批状态''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fprev_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fprev_state IS ''上级审批状态''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fnext_order');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fnext_order NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fnext_order IS ''下级审批序号''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fnext_order NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fnext_order IS ''下级审批序号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb011t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb011t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb011t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb011t.farchived IS ''归档''
';
    end if;
    
  end if;
end;