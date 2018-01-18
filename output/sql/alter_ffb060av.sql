declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb060av');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb060av
(

fcontract_number NVARCHAR2(36) ,

fvisible_department NVARCHAR2(30) 

)';
    execute immediate
'
COMMENT ON TABLE ffb060av IS ''合同可见部门''
';

    execute immediate
'
COMMENT ON COLUMN ffb060av.fcontract_number IS ''合同号''
';

    execute immediate
'
COMMENT ON COLUMN ffb060av.fvisible_department IS ''可见部门''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060av')  and t.column_name = upper('fcontract_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060av ADD (fcontract_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060av.fcontract_number IS ''合同号''
';
    else
      execute immediate
'
ALTER TABLE ffb060av MODIFY (fcontract_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060av.fcontract_number IS ''合同号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060av')  and t.column_name = upper('fvisible_department');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060av ADD (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060av.fvisible_department IS ''可见部门''
';
    else
      execute immediate
'
ALTER TABLE ffb060av MODIFY (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060av.fvisible_department IS ''可见部门''
';
    end if;
    
  end if;
end;