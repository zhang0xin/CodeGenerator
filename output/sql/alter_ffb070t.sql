declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb070t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb070t
(

f0 NVARCHAR2(36) PRIMARY KEY,

flc_number NVARCHAR2(30) ,

fship_batch_id NVARCHAR2(36) ,

fissue_property NVARCHAR2(20) ,

fissue_bank NVARCHAR2(60) ,

fbeneficiary NVARCHAR2(20) ,

fissue_amount NUMBER(20,2) ,

fissue_amount_unit NVARCHAR2(10) ,

fissue_price NUMBER(20,4) ,

fissue_price_unit NVARCHAR2(10) ,

fissue_date DATE ,

fdry_ton_price NVARCHAR2(50) ,

ftfe NVARCHAR2(50) ,

fpob_price NVARCHAR2(50) ,

fcfr_price NVARCHAR2(50) ,

fton_sea_fee_equalize NUMBER(20,2) ,

fton_sea_fee_equalize_unit NVARCHAR2(10) ,

fvaluation_month NVARCHAR2(10) ,

fsee_fee_equalize NUMBER(20,2) ,

fsee_fee_equalize_unit NVARCHAR2(10) ,

fcommission NUMBER(20,2) ,

fcommission_unit NVARCHAR2(10) ,

fissue_ton NUMBER(20,5) ,

fexpire_days DATE ,

fextension_period NUMBER(10) ,

fextension_date DATE ,

fextension_amount NUMBER(20,5) ,

fextension_rate NUMBER(20,5) ,

fextension_interest NUMBER(20,5) ,

fextension_execute_unit NVARCHAR2(30) ,

fremark NVARCHAR2(300) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb070t IS ''信用证''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.flc_number IS ''L/C号码''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fship_batch_id IS ''船运批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_property IS ''开证性质''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_bank IS ''开证行''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fbeneficiary IS ''受益人''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_amount IS ''开证金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_amount_unit IS ''开证金额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_price IS ''开证单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_price_unit IS ''开证单价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_date IS ''开证日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fdry_ton_price IS ''吨度价''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.ftfe IS ''TFe''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fpob_price IS ''FOB价''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fcfr_price IS ''CFR价''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fton_sea_fee_equalize IS ''吨矿海运费''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fton_sea_fee_equalize_unit IS ''吨矿海运费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fvaluation_month IS ''计价月份''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fsee_fee_equalize IS ''海运费补偿''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fsee_fee_equalize_unit IS ''海运费补偿币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fcommission IS ''佣金''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fcommission_unit IS ''佣金币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_ton IS ''开证吨数''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fexpire_days IS ''信用证效期日''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_period IS ''展期期限/天''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_date IS ''展期到期日''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_amount IS ''展期金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_rate IS ''展期利率''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_interest IS ''展期利息''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_execute_unit IS ''展期执行单位''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fremark IS ''备注''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb070t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('flc_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (flc_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.flc_number IS ''L/C号码''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (flc_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.flc_number IS ''L/C号码''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fship_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fship_batch_id IS ''船运批次''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fship_batch_id IS ''船运批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_property');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_property NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_property IS ''开证性质''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_property NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_property IS ''开证性质''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_bank');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_bank NVARCHAR2(60))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_bank IS ''开证行''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_bank NVARCHAR2(60))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_bank IS ''开证行''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fbeneficiary');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fbeneficiary NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fbeneficiary IS ''受益人''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fbeneficiary NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fbeneficiary IS ''受益人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_amount');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_amount NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_amount IS ''开证金额''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_amount NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_amount IS ''开证金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_amount_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_amount_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_amount_unit IS ''开证金额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_amount_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_amount_unit IS ''开证金额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_price NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_price IS ''开证单价''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_price NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_price IS ''开证单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_price_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_price_unit IS ''开证单价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_price_unit IS ''开证单价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_date IS ''开证日期''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_date IS ''开证日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fdry_ton_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fdry_ton_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fdry_ton_price IS ''吨度价''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fdry_ton_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fdry_ton_price IS ''吨度价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('ftfe');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (ftfe NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.ftfe IS ''TFe''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (ftfe NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.ftfe IS ''TFe''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fpob_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fpob_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fpob_price IS ''FOB价''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fpob_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fpob_price IS ''FOB价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fcfr_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fcfr_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcfr_price IS ''CFR价''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fcfr_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcfr_price IS ''CFR价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fton_sea_fee_equalize');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fton_sea_fee_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fton_sea_fee_equalize IS ''吨矿海运费''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fton_sea_fee_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fton_sea_fee_equalize IS ''吨矿海运费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fton_sea_fee_equalize_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fton_sea_fee_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fton_sea_fee_equalize_unit IS ''吨矿海运费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fton_sea_fee_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fton_sea_fee_equalize_unit IS ''吨矿海运费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fvaluation_month');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fvaluation_month NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fvaluation_month IS ''计价月份''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fvaluation_month NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fvaluation_month IS ''计价月份''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fsee_fee_equalize');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fsee_fee_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fsee_fee_equalize IS ''海运费补偿''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fsee_fee_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fsee_fee_equalize IS ''海运费补偿''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fsee_fee_equalize_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fsee_fee_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fsee_fee_equalize_unit IS ''海运费补偿币种''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fsee_fee_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fsee_fee_equalize_unit IS ''海运费补偿币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fcommission');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fcommission NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcommission IS ''佣金''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fcommission NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcommission IS ''佣金''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fcommission_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fcommission_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcommission_unit IS ''佣金币种''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fcommission_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcommission_unit IS ''佣金币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fissue_ton');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fissue_ton NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_ton IS ''开证吨数''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fissue_ton NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fissue_ton IS ''开证吨数''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fexpire_days');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fexpire_days DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fexpire_days IS ''信用证效期日''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fexpire_days DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fexpire_days IS ''信用证效期日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fextension_period');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fextension_period NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_period IS ''展期期限/天''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fextension_period NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_period IS ''展期期限/天''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fextension_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fextension_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_date IS ''展期到期日''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fextension_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_date IS ''展期到期日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fextension_amount');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fextension_amount NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_amount IS ''展期金额''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fextension_amount NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_amount IS ''展期金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fextension_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fextension_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_rate IS ''展期利率''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fextension_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_rate IS ''展期利率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fextension_interest');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fextension_interest NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_interest IS ''展期利息''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fextension_interest NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_interest IS ''展期利息''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fextension_execute_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fextension_execute_unit NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_execute_unit IS ''展期执行单位''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fextension_execute_unit NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fextension_execute_unit IS ''展期执行单位''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fremark');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fremark NVARCHAR2(300))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fremark IS ''备注''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fremark NVARCHAR2(300))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fremark IS ''备注''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb070t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb070t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb070t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb070t.farchived IS ''归档''
';
    end if;
    
  end if;
end;