declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb030t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb030t
(

f0 NVARCHAR2(36) PRIMARY KEY,

funload_port_id NVARCHAR2(36) ,

funload_port NVARCHAR2(36) ,

fship_batch_id NVARCHAR2(36) ,

farrived_port_date DATE ,

fberth_date DATE ,

funloaded_date DATE ,

fdepart_port_date DATE ,

ffinal_receiver NVARCHAR2(10) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb030t IS ''卸港''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.funload_port_id IS ''卸港: 卸港批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.funload_port IS ''卸港: 卸港''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fship_batch_id IS ''卸港: 船运批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.farrived_port_date IS ''卸港: NOR到港日''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fberth_date IS ''卸港: 靠泊日''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.funloaded_date IS ''卸港: 卸毕日''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fdepart_port_date IS ''卸港: 离港日''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.ffinal_receiver IS ''卸港: 最终收货人''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb030t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('funload_port_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (funload_port_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.funload_port_id IS ''卸港: 卸港批次''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (funload_port_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.funload_port_id IS ''卸港: 卸港批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('funload_port');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (funload_port NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.funload_port IS ''卸港: 卸港''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (funload_port NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.funload_port IS ''卸港: 卸港''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fship_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fship_batch_id IS ''卸港: 船运批次''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fship_batch_id IS ''卸港: 船运批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('farrived_port_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (farrived_port_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.farrived_port_date IS ''卸港: NOR到港日''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (farrived_port_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.farrived_port_date IS ''卸港: NOR到港日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fberth_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fberth_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fberth_date IS ''卸港: 靠泊日''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fberth_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fberth_date IS ''卸港: 靠泊日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('funloaded_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (funloaded_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.funloaded_date IS ''卸港: 卸毕日''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (funloaded_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.funloaded_date IS ''卸港: 卸毕日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fdepart_port_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fdepart_port_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fdepart_port_date IS ''卸港: 离港日''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fdepart_port_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fdepart_port_date IS ''卸港: 离港日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('ffinal_receiver');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (ffinal_receiver NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.ffinal_receiver IS ''卸港: 最终收货人''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (ffinal_receiver NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.ffinal_receiver IS ''卸港: 最终收货人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb030t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb030t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb030t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb030t.farchived IS ''归档''
';
    end if;
    
  end if;
end;