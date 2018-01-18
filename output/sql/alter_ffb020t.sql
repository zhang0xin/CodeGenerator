declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb020t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb020t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fship_batch_id NVARCHAR2(36) ,

fship_number NVARCHAR2(36) ,

flc_number NVARCHAR2(30) ,

fport_load_name NVARCHAR2(30) ,

fport_load_ship_agent NVARCHAR2(30) ,

fseller_delay_days NUMBER(10) ,

fseller_delay_fee NUMBER(20,2) ,

fseller_delay_fee_unit NVARCHAR2(10) ,

fport_load_delay_fee NUMBER(20,2) ,

fport_load_delay_fee_unit NVARCHAR2(10) ,

fport_load_start_date DATE ,

fport_load_end_date DATE ,

fsea_first_single_fee NUMBER(20,2) ,

fsea_first_single_fee_unit NVARCHAR2(10) ,

fsea_last_single_fee NUMBER(20,2) ,

fsea_last_single_fee_unit NVARCHAR2(10) ,

foil_adjust_single_fee NUMBER(20,2) ,

foil_adjust_single_fee_unit NVARCHAR2(10) ,

fbase_fee NUMBER(20,2) ,

fbase_fee_unit NVARCHAR2(10) ,

fport_adjust NUMBER(20,2) ,

fport_adjust_unit NVARCHAR2(10) ,

foil_adjust_fee NUMBER(20,2) ,

foil_adjust_fee_unit NVARCHAR2(10) ,

ftransport_fee NUMBER(20,2) ,

ftransport_fee_unit NVARCHAR2(10) ,

ftransport_first_fee NUMBER(20,2) ,

ftransport_first_fee_unit NVARCHAR2(10) ,

fshipowner_first_fee_date DATE ,

ftransport_last_fee NUMBER(20,2) ,

ftransport_last_fee_unit NVARCHAR2(10) ,

fshipowner_last_fee_date DATE ,

frent_ship_first_fee NUMBER(20,2) ,

ftransport_first_fee_date DATE ,

fsea_last_fee NUMBER(20,2) ,

flast_issue_date DATE ,

funit_sea_fee NUMBER(20,2) ,

fload_unload_adjust NUMBER(20,2) ,

fuint_oil_adjust_fee NUMBER(20,2) ,

fsea_first_fee NUMBER(20,2) ,

fvoyage_shipowner_fee NUMBER(20,2) ,

fvoyage_rent_fee NUMBER(20,2) ,

funit_transport_fee NUMBER(20,2) ,

flast_transport_fee NUMBER(20,2) ,

fsettlement_date DATE ,

fcoa_difference NUMBER(20,2) ,

fexchange_rate NUMBER(20,5) ,

ffinal_receiver NVARCHAR2(30) ,

fffb020t050p_archived NVARCHAR2(10) ,

fcurrent_location NVARCHAR2(30) ,

farrived_singapore_date DATE ,

funload_date DATE ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb020t IS ''船运批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fship_batch_id IS ''装港: 船运批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fship_number IS ''装港: 船编号''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.flc_number IS ''装港: L/C号码''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_name IS ''装港: 装港名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_ship_agent IS ''装港: 装港船代''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_days IS ''装港: 装港对卖方滞期天数''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_fee IS ''装港: 装港对卖方滞期费''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_fee_unit IS ''装港: 装港对卖方滞期费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_delay_fee IS ''装港: 装港对船东滞期费''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_delay_fee_unit IS ''装港: 装港对船东滞期费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_start_date IS ''装港: 装港开始时间''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_end_date IS ''装港: 装港结束时间''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_single_fee IS ''海运付款: 首款海运费单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_single_fee_unit IS ''海运付款: 首款海运费单价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_single_fee IS ''海运付款: 尾款海运费单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_single_fee_unit IS ''海运付款: 尾款海运费单价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_single_fee IS ''海运付款: 油调单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_single_fee_unit IS ''海运付款: 油调单价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fbase_fee IS ''海运付款: 基价''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fbase_fee_unit IS ''海运付款: 基价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_adjust IS ''海运付款: 港口调整''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fport_adjust_unit IS ''海运付款: 港口调整币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_fee IS ''海运付款: 油价调整''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_fee_unit IS ''海运付款: 油价调整币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_fee IS ''海运付款: 运费单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_fee_unit IS ''海运付款: 运费单价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee IS ''海运付款: 运费首款额''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee_unit IS ''海运付款: 运费首款额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fshipowner_first_fee_date IS ''海运付款: 付船东首款日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_last_fee IS ''海运付款: 运费尾款额''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_last_fee_unit IS ''海运付款: 运费尾款额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fshipowner_last_fee_date IS ''海运付款: 付船东尾款日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.frent_ship_first_fee IS ''对租家结算: 收租家首款运费/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee_date IS ''对租家结算: 首款收到运费日''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_fee IS ''对租家结算: 海运费尾款/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.flast_issue_date IS ''对租家结算: 尾款出票日''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.funit_sea_fee IS ''对租家结算: 海运费单价/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fload_unload_adjust IS ''对租家结算: 装卸港调整/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fuint_oil_adjust_fee IS ''对租家结算: 油调单价/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_fee IS ''对租家结算: 付船东首款运费/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fvoyage_shipowner_fee IS ''对租家结算: 付船东尾款运费/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fvoyage_rent_fee IS ''对租家结算: 收租家尾款运费/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.funit_transport_fee IS ''对租家结算: 运费单价/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.flast_transport_fee IS ''对租家结算: 最终运费收付差额/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fsettlement_date IS ''对租家结算: 结算结束日''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fcoa_difference IS ''对租家结算: COA与外转运费差额/美元''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fexchange_rate IS ''对租家结算: 当时汇率''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.ffinal_receiver IS ''对租家结算: 最终收货人''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fffb020t050p_archived IS ''对租家结算: 归档''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fcurrent_location IS ''船舶动态: 当前位置''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.farrived_singapore_date IS ''船舶动态: 预计到新加坡日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.funload_date IS ''船舶动态: 预计卸港日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb020t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fship_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fship_batch_id IS ''装港: 船运批次''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fship_batch_id IS ''装港: 船运批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fship_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fship_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fship_number IS ''装港: 船编号''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fship_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fship_number IS ''装港: 船编号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('flc_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (flc_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.flc_number IS ''装港: L/C号码''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (flc_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.flc_number IS ''装港: L/C号码''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_load_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_load_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_name IS ''装港: 装港名称''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_load_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_name IS ''装港: 装港名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_load_ship_agent');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_load_ship_agent NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_ship_agent IS ''装港: 装港船代''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_load_ship_agent NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_ship_agent IS ''装港: 装港船代''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fseller_delay_days');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fseller_delay_days NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_days IS ''装港: 装港对卖方滞期天数''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fseller_delay_days NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_days IS ''装港: 装港对卖方滞期天数''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fseller_delay_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fseller_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_fee IS ''装港: 装港对卖方滞期费''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fseller_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_fee IS ''装港: 装港对卖方滞期费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fseller_delay_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fseller_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_fee_unit IS ''装港: 装港对卖方滞期费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fseller_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fseller_delay_fee_unit IS ''装港: 装港对卖方滞期费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_load_delay_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_load_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_delay_fee IS ''装港: 装港对船东滞期费''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_load_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_delay_fee IS ''装港: 装港对船东滞期费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_load_delay_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_load_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_delay_fee_unit IS ''装港: 装港对船东滞期费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_load_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_delay_fee_unit IS ''装港: 装港对船东滞期费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_load_start_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_load_start_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_start_date IS ''装港: 装港开始时间''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_load_start_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_start_date IS ''装港: 装港开始时间''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_load_end_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_load_end_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_end_date IS ''装港: 装港结束时间''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_load_end_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_load_end_date IS ''装港: 装港结束时间''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsea_first_single_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsea_first_single_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_single_fee IS ''海运付款: 首款海运费单价''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsea_first_single_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_single_fee IS ''海运付款: 首款海运费单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsea_first_single_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsea_first_single_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_single_fee_unit IS ''海运付款: 首款海运费单价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsea_first_single_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_single_fee_unit IS ''海运付款: 首款海运费单价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsea_last_single_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsea_last_single_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_single_fee IS ''海运付款: 尾款海运费单价''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsea_last_single_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_single_fee IS ''海运付款: 尾款海运费单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsea_last_single_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsea_last_single_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_single_fee_unit IS ''海运付款: 尾款海运费单价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsea_last_single_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_single_fee_unit IS ''海运付款: 尾款海运费单价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('foil_adjust_single_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (foil_adjust_single_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_single_fee IS ''海运付款: 油调单价''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (foil_adjust_single_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_single_fee IS ''海运付款: 油调单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('foil_adjust_single_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (foil_adjust_single_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_single_fee_unit IS ''海运付款: 油调单价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (foil_adjust_single_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_single_fee_unit IS ''海运付款: 油调单价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fbase_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fbase_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fbase_fee IS ''海运付款: 基价''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fbase_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fbase_fee IS ''海运付款: 基价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fbase_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fbase_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fbase_fee_unit IS ''海运付款: 基价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fbase_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fbase_fee_unit IS ''海运付款: 基价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_adjust');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_adjust NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_adjust IS ''海运付款: 港口调整''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_adjust NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_adjust IS ''海运付款: 港口调整''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fport_adjust_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fport_adjust_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_adjust_unit IS ''海运付款: 港口调整币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fport_adjust_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fport_adjust_unit IS ''海运付款: 港口调整币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('foil_adjust_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (foil_adjust_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_fee IS ''海运付款: 油价调整''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (foil_adjust_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_fee IS ''海运付款: 油价调整''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('foil_adjust_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (foil_adjust_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_fee_unit IS ''海运付款: 油价调整币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (foil_adjust_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.foil_adjust_fee_unit IS ''海运付款: 油价调整币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_fee IS ''海运付款: 运费单价''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_fee IS ''海运付款: 运费单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_fee_unit IS ''海运付款: 运费单价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_fee_unit IS ''海运付款: 运费单价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_first_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee IS ''海运付款: 运费首款额''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee IS ''海运付款: 运费首款额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_first_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_first_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee_unit IS ''海运付款: 运费首款额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_first_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee_unit IS ''海运付款: 运费首款额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fshipowner_first_fee_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fshipowner_first_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fshipowner_first_fee_date IS ''海运付款: 付船东首款日期''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fshipowner_first_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fshipowner_first_fee_date IS ''海运付款: 付船东首款日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_last_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_last_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_last_fee IS ''海运付款: 运费尾款额''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_last_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_last_fee IS ''海运付款: 运费尾款额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_last_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_last_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_last_fee_unit IS ''海运付款: 运费尾款额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_last_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_last_fee_unit IS ''海运付款: 运费尾款额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fshipowner_last_fee_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fshipowner_last_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fshipowner_last_fee_date IS ''海运付款: 付船东尾款日期''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fshipowner_last_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fshipowner_last_fee_date IS ''海运付款: 付船东尾款日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('frent_ship_first_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (frent_ship_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.frent_ship_first_fee IS ''对租家结算: 收租家首款运费/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (frent_ship_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.frent_ship_first_fee IS ''对租家结算: 收租家首款运费/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ftransport_first_fee_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ftransport_first_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee_date IS ''对租家结算: 首款收到运费日''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ftransport_first_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ftransport_first_fee_date IS ''对租家结算: 首款收到运费日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsea_last_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsea_last_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_fee IS ''对租家结算: 海运费尾款/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsea_last_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_last_fee IS ''对租家结算: 海运费尾款/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('flast_issue_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (flast_issue_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.flast_issue_date IS ''对租家结算: 尾款出票日''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (flast_issue_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.flast_issue_date IS ''对租家结算: 尾款出票日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('funit_sea_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (funit_sea_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.funit_sea_fee IS ''对租家结算: 海运费单价/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (funit_sea_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.funit_sea_fee IS ''对租家结算: 海运费单价/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fload_unload_adjust');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fload_unload_adjust NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fload_unload_adjust IS ''对租家结算: 装卸港调整/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fload_unload_adjust NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fload_unload_adjust IS ''对租家结算: 装卸港调整/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fuint_oil_adjust_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fuint_oil_adjust_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fuint_oil_adjust_fee IS ''对租家结算: 油调单价/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fuint_oil_adjust_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fuint_oil_adjust_fee IS ''对租家结算: 油调单价/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsea_first_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsea_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_fee IS ''对租家结算: 付船东首款运费/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsea_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsea_first_fee IS ''对租家结算: 付船东首款运费/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fvoyage_shipowner_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fvoyage_shipowner_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fvoyage_shipowner_fee IS ''对租家结算: 付船东尾款运费/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fvoyage_shipowner_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fvoyage_shipowner_fee IS ''对租家结算: 付船东尾款运费/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fvoyage_rent_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fvoyage_rent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fvoyage_rent_fee IS ''对租家结算: 收租家尾款运费/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fvoyage_rent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fvoyage_rent_fee IS ''对租家结算: 收租家尾款运费/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('funit_transport_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (funit_transport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.funit_transport_fee IS ''对租家结算: 运费单价/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (funit_transport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.funit_transport_fee IS ''对租家结算: 运费单价/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('flast_transport_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (flast_transport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.flast_transport_fee IS ''对租家结算: 最终运费收付差额/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (flast_transport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.flast_transport_fee IS ''对租家结算: 最终运费收付差额/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fsettlement_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fsettlement_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsettlement_date IS ''对租家结算: 结算结束日''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fsettlement_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fsettlement_date IS ''对租家结算: 结算结束日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fcoa_difference');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fcoa_difference NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcoa_difference IS ''对租家结算: COA与外转运费差额/美元''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fcoa_difference NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcoa_difference IS ''对租家结算: COA与外转运费差额/美元''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fexchange_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fexchange_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fexchange_rate IS ''对租家结算: 当时汇率''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fexchange_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fexchange_rate IS ''对租家结算: 当时汇率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('ffinal_receiver');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (ffinal_receiver NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ffinal_receiver IS ''对租家结算: 最终收货人''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (ffinal_receiver NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.ffinal_receiver IS ''对租家结算: 最终收货人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fffb020t050p_archived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fffb020t050p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fffb020t050p_archived IS ''对租家结算: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fffb020t050p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fffb020t050p_archived IS ''对租家结算: 归档''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fcurrent_location');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fcurrent_location NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcurrent_location IS ''船舶动态: 当前位置''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fcurrent_location NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcurrent_location IS ''船舶动态: 当前位置''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('farrived_singapore_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (farrived_singapore_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.farrived_singapore_date IS ''船舶动态: 预计到新加坡日期''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (farrived_singapore_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.farrived_singapore_date IS ''船舶动态: 预计到新加坡日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('funload_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (funload_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.funload_date IS ''船舶动态: 预计卸港日期''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (funload_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.funload_date IS ''船舶动态: 预计卸港日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb020t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb020t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb020t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb020t.farchived IS ''归档''
';
    end if;
    
  end if;
end;