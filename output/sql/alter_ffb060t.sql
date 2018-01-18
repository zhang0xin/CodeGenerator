declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb060t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb060t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fcontract_number NVARCHAR2(36) ,

fcontract_sign NVARCHAR2(36) ,

fcontract_nature NVARCHAR2(20) ,

fcontract_quantity NUMBER(20,5) ,

fcontract_money NUMBER(20,2) ,

fcontract_money_unit NVARCHAR2(10) ,

funit NVARCHAR2(10) ,

fmine NVARCHAR2(36) ,

fmaterial_id NVARCHAR2(36) ,

ftrade_type NVARCHAR2(20) ,

fpurchase_price_mode NVARCHAR2(20) ,

fsale_price_mode NVARCHAR2(20) ,

fseller NVARCHAR2(30) ,

ffinal_user NVARCHAR2(30) ,

fload_date_start DATE ,

fload_date_end DATE ,

fexercise_date DATE ,

fexercise_description NVARCHAR2(300) ,

fsign_date DATE ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb060t IS ''合同''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_number IS ''合同号''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_sign IS ''国内合同签订方''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_nature IS ''合同性质''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_quantity IS ''合同量''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_money IS ''合同金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_money_unit IS ''合同金额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.funit IS ''计量单位(干吨,湿吨)''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fmine IS ''矿山''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fmaterial_id IS ''物料名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.ftrade_type IS ''贸易类型''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fpurchase_price_mode IS ''北京采购定价模式''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fsale_price_mode IS ''北京销售定价模式''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fseller IS ''卖方''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.ffinal_user IS ''最终用户''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fload_date_start IS ''装期（始）''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fload_date_end IS ''装期（终）''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fexercise_date IS ''合同执行完毕日''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fexercise_description IS ''合同执行情况说明''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fsign_date IS ''签订日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb060t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcontract_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcontract_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_number IS ''合同号''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcontract_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_number IS ''合同号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcontract_sign');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcontract_sign NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_sign IS ''国内合同签订方''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcontract_sign NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_sign IS ''国内合同签订方''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcontract_nature');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcontract_nature NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_nature IS ''合同性质''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcontract_nature NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_nature IS ''合同性质''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcontract_quantity');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcontract_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_quantity IS ''合同量''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcontract_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_quantity IS ''合同量''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcontract_money');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcontract_money NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_money IS ''合同金额''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcontract_money NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_money IS ''合同金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcontract_money_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcontract_money_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_money_unit IS ''合同金额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcontract_money_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcontract_money_unit IS ''合同金额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('funit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (funit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.funit IS ''计量单位(干吨,湿吨)''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (funit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.funit IS ''计量单位(干吨,湿吨)''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fmine');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fmine NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fmine IS ''矿山''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fmine NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fmine IS ''矿山''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fmaterial_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fmaterial_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fmaterial_id IS ''物料名称''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fmaterial_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fmaterial_id IS ''物料名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('ftrade_type');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (ftrade_type NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.ftrade_type IS ''贸易类型''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (ftrade_type NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.ftrade_type IS ''贸易类型''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fpurchase_price_mode');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fpurchase_price_mode NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fpurchase_price_mode IS ''北京采购定价模式''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fpurchase_price_mode NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fpurchase_price_mode IS ''北京采购定价模式''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fsale_price_mode');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fsale_price_mode NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fsale_price_mode IS ''北京销售定价模式''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fsale_price_mode NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fsale_price_mode IS ''北京销售定价模式''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fseller');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fseller NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fseller IS ''卖方''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fseller NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fseller IS ''卖方''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('ffinal_user');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (ffinal_user NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.ffinal_user IS ''最终用户''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (ffinal_user NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.ffinal_user IS ''最终用户''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fload_date_start');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fload_date_start DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fload_date_start IS ''装期（始）''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fload_date_start DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fload_date_start IS ''装期（始）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fload_date_end');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fload_date_end DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fload_date_end IS ''装期（终）''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fload_date_end DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fload_date_end IS ''装期（终）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fexercise_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fexercise_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fexercise_date IS ''合同执行完毕日''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fexercise_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fexercise_date IS ''合同执行完毕日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fexercise_description');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fexercise_description NVARCHAR2(300))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fexercise_description IS ''合同执行情况说明''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fexercise_description NVARCHAR2(300))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fexercise_description IS ''合同执行情况说明''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fsign_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fsign_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fsign_date IS ''签订日期''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fsign_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fsign_date IS ''签订日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb060t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb060t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb060t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb060t.farchived IS ''归档''
';
    end if;
    
  end if;
end;