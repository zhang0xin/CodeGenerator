declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb050t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb050t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fship_number NVARCHAR2(36) ,

fship_company NVARCHAR2(30) ,

fship_owner NVARCHAR2(30) ,

fship_name NVARCHAR2(30) ,

fship_chinese_name NVARCHAR2(30) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb050t IS ''船舶''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fship_number IS ''船编号''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fship_company IS ''船运公司''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fship_owner IS ''船舶所属''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fship_name IS ''英文船名''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fship_chinese_name IS ''中文船名''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb050t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fship_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fship_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_number IS ''船编号''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fship_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_number IS ''船编号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fship_company');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fship_company NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_company IS ''船运公司''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fship_company NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_company IS ''船运公司''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fship_owner');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fship_owner NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_owner IS ''船舶所属''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fship_owner NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_owner IS ''船舶所属''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fship_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fship_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_name IS ''英文船名''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fship_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_name IS ''英文船名''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fship_chinese_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fship_chinese_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_chinese_name IS ''中文船名''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fship_chinese_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fship_chinese_name IS ''中文船名''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb050t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb050t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb050t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb050t.farchived IS ''归档''
';
    end if;
    
  end if;
end;