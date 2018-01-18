declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb020av');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb020av
(

fship_batch_id NVARCHAR2(36) ,

fvisible_department NVARCHAR2(30) 

)';
    execute immediate
'
COMMENT ON TABLE ffb020av IS ''船运可见部门''
';

    execute immediate
'
COMMENT ON COLUMN ffb020av.fship_batch_id IS ''船运批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb020av.fvisible_department IS ''可见部门''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020av')  and t.column_name = upper('fship_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020av ADD (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020av.fship_batch_id IS ''船运批次''
';
    else
      execute immediate
'
ALTER TABLE ffb020av MODIFY (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020av.fship_batch_id IS ''船运批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020av')  and t.column_name = upper('fvisible_department');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020av ADD (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020av.fvisible_department IS ''可见部门''
';
    else
      execute immediate
'
ALTER TABLE ffb020av MODIFY (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020av.fvisible_department IS ''可见部门''
';
    end if;
    
  end if;
end;