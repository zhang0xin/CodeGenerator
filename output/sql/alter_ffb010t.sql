declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb010t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb010t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fcontract_number NVARCHAR2(36) ,

fship_batch_id NVARCHAR2(36) ,

fpurchase_batch_id NVARCHAR2(36) ,

ftrade_type NVARCHAR2(10) ,

fore_area NVARCHAR2(10) ,

fmaterial_category NVARCHAR2(30) ,

fmaterial_id NVARCHAR2(36) ,

ftfe NVARCHAR2(20) ,

fh2o NVARCHAR2(20) ,

fsio2 NVARCHAR2(20) ,

fal2o3 NVARCHAR2(20) ,

fsio2_al2o3 NVARCHAR2(20) ,

fp NVARCHAR2(20) ,

fs NVARCHAR2(20) ,

fother NVARCHAR2(200) ,

fprice NVARCHAR2(50) ,

fpurchase_quantity NUMBER(20,5) ,

funit NVARCHAR2(10) ,

fport_load_date DATE ,

fport_load_name NVARCHAR2(30) ,

fport_arrived_date DATE ,

fport_arrived_name NVARCHAR2(30) ,

fbuyer NVARCHAR2(30) ,

fseller NVARCHAR2(30) ,

fresource_location NVARCHAR2(30) ,

faudit_state NVARCHAR2(10) ,

fvisible_department NVARCHAR2(30) ,

fbl_amount NUMBER(20,5) ,

fbl_date DATE ,

fsettlement_price NUMBER(20,4) ,

fsettlement_price_unit NVARCHAR2(10) ,

fship_settlement_price NUMBER(20,2) ,

fship_settlement_price_unit NVARCHAR2(10) ,

ffinal_fe NUMBER(20,4) ,

ffinal_h2o NUMBER(20,4) ,

fsettlement_start_date DATE ,

fsettlement_quantity NUMBER(20,5) ,

flc_first_fee NUMBER(20,2) ,

flc_first_fee_unit NVARCHAR2(10) ,

fcompany_first_rate NUMBER(20,5) ,

fcompany_first_rmb NUMBER(20,2) ,

finterest_rate NUMBER(20,5) ,

ffuture_accrual NUMBER(20,5) ,

ffuture_accrual_unit NVARCHAR2(10) ,

ffirst_pay_date DATE ,

ffirst_issue_date DATE ,

ffirst_dry_quantity NUMBER(20,5) ,

fcompany_first_fee NUMBER(20,2) ,

fcompany_first_fee_unit NVARCHAR2(10) ,

ftransport_equalize NUMBER(20,2) ,

ftransport_equalize_unit NVARCHAR2(10) ,

ffinal_transport_fee NUMBER(20,2) ,

ffinal_transport_fee_unit NVARCHAR2(10) ,

fsecond_pay NUMBER(20,2) ,

fsecond_pay_unit NVARCHAR2(10) ,

fsecond_pay_rate NUMBER(20,5) ,

fsecond_pay_rmb NUMBER(20,2) ,

fsecond_pay_date DATE ,

fsettlement_tail_fee NUMBER(20,2) ,

fsettlement_tail_fee_unit NVARCHAR2(10) ,

fsettlement_tail_rate NUMBER(20,5) ,

fsettlement_tail_rmb NUMBER(20,2) ,

ftail_fee_date DATE ,

fgauge_discount NUMBER(20,2) ,

fgauge_discount_unit NVARCHAR2(10) ,

fsettlement_assessment_cycle NUMBER(20,5) ,

fdrain_equalize NUMBER(20,2) ,

fdrain_equalize_unit NVARCHAR2(10) ,

focean_freight_price NUMBER(20,5) ,

fremarks NVARCHAR2(300) ,

fffb010t020p_archived NVARCHAR2(10) ,

finsurance_company NVARCHAR2(30) ,

finsurance_fee NUMBER(20,2) ,

finsurance_fee_unit NVARCHAR2(10) ,

fffb010t030p_archived NVARCHAR2(10) ,

flc_number NVARCHAR2(30) ,

fdocumentary_bills_interest NUMBER(20,2) ,

fdocumentary_bills_hike NUMBER(20,2) ,

fcapital_occupation_fee NUMBER(20,2) ,

fopening_charge NUMBER(20,2) ,

faccepting_charge NUMBER(20,2) ,

fcustoms_guarantee_fee NUMBER(20,2) ,

fagent_service_fee NUMBER(20,2) ,

fextension_period NUMBER(10) ,

fextension_date DATE ,

fextension_amount NUMBER(20,5) ,

fextension_rate NUMBER(20,5) ,

fextension_interest NUMBER(20,5) ,

fextension_execute_unit NVARCHAR2(30) ,

fissue_price NUMBER(20,4) ,

fissue_price_unit NVARCHAR2(10) ,

fdry_ton_price NVARCHAR2(50) ,

fcredit_tfe NVARCHAR2(50) ,

fpob_price NVARCHAR2(50) ,

fcfr_price NVARCHAR2(50) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb010t IS ''采购资源''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcontract_number IS ''合同: 合同号''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fship_batch_id IS ''船运批次: 船运批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fpurchase_batch_id IS ''采购申请: 采购批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ftrade_type IS ''采购申请: 贸易类型''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fore_area IS ''采购申请: 矿石产区''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fmaterial_category IS ''采购申请: 资源种类''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fmaterial_id IS ''采购申请: 物料名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ftfe IS ''采购申请: TFe''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fh2o IS ''采购申请: H2O''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsio2 IS ''采购申请: SiO2''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fal2o3 IS ''采购申请: Al2O3''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsio2_al2o3 IS ''采购申请: SiO2+Al2O3''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fp IS ''采购申请: P''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fs IS ''采购申请: S''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fother IS ''采购申请: 粒度''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fprice IS ''采购申请: 定价模式''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fpurchase_quantity IS ''采购申请: 采购量''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.funit IS ''采购申请: 单位''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fport_load_date IS ''采购申请: 装港日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fport_load_name IS ''采购申请: 装港名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fport_arrived_date IS ''采购申请: 到港日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fport_arrived_name IS ''采购申请: 到港名称''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fbuyer IS ''采购申请: 买方（最终用户）''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fseller IS ''采购申请: 卖方（矿山/供应商）''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fresource_location IS ''采购申请: 资源位置''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.faudit_state IS ''采购申请: 审批状态''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fvisible_department IS ''采购申请: 可见部门''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fbl_amount IS ''提单: B/L量''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fbl_date IS ''提单: B/L日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_price IS ''结算货款: 结算吨度价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_price_unit IS ''结算货款: 结算吨度价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fship_settlement_price IS ''结算货款: 单船结算价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fship_settlement_price_unit IS ''结算货款: 单船结算价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_fe IS ''结算货款: 结算Fe''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_h2o IS ''结算货款: 结算H2O''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_start_date IS ''结算货款: 结算开始日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_quantity IS ''结算货款: 结算重量''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.flc_first_fee IS ''结算货款: LC或托收首款（含息）''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.flc_first_fee_unit IS ''结算货款: LC或托收首款（含息）币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_rate IS ''结算货款: 首款汇率''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_rmb IS ''结算货款: 首款人民币''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.finterest_rate IS ''结算货款: 信用证利率''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffuture_accrual IS ''结算货款: 远期利息''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffuture_accrual_unit IS ''结算货款: 远期利息币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_pay_date IS ''结算货款: 首款付款日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_issue_date IS ''结算货款: 首款到单日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_dry_quantity IS ''结算货款: 首款干吨''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_fee IS ''结算货款: 矿山公司首款金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_fee_unit IS ''结算货款: 矿山公司首款金额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ftransport_equalize IS ''结算货款: 运费补偿''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ftransport_equalize_unit IS ''结算货款: 运费补偿币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_transport_fee IS ''结算货款: 最终运费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_transport_fee_unit IS ''结算货款: 最终运费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay IS ''结算货款: 二次货款额''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_unit IS ''结算货款: 二次货款额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_rate IS ''结算货款: 二次货款汇率''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_rmb IS ''结算货款: 二次货款额人民币''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_date IS ''结算货款: 二次货款付款日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_fee IS ''结算货款: 结算尾款（含滞期速遣费）''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_fee_unit IS ''结算货款: 结算尾款（含滞期速遣费）币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_rate IS ''结算货款: 尾款汇率''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_rmb IS ''结算货款: 尾款人民币''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.ftail_fee_date IS ''结算货款: 尾款付款日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fgauge_discount IS ''结算货款: 水尺优惠''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fgauge_discount_unit IS ''结算货款: 水尺优惠币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_assessment_cycle IS ''结算货款: 结算考核周期''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fdrain_equalize IS ''结算货款: FOB排水运费补偿''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fdrain_equalize_unit IS ''结算货款: FOB排水运费补偿币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.focean_freight_price IS ''结算货款: 海运费单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fremarks IS ''结算货款: 备注''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fffb010t020p_archived IS ''结算货款: 归档''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_company IS ''保险: 保险公司''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_fee IS ''保险: 保险费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_fee_unit IS ''保险: 保险费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fffb010t030p_archived IS ''保险: 归档''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.flc_number IS ''信用证（财）: L/C号码''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fdocumentary_bills_interest IS ''信用证（财）: 押汇利息''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fdocumentary_bills_hike IS ''信用证（财）: 押汇加息''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcapital_occupation_fee IS ''信用证（财）: 资金占用费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fopening_charge IS ''信用证（财）: 开证费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.faccepting_charge IS ''信用证（财）: 承兑费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcustoms_guarantee_fee IS ''信用证（财）: 关税保函费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fagent_service_fee IS ''信用证（财）: 代理服务费''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_period IS ''信用证（财）: 展期期限/天''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_date IS ''信用证（财）: 展期到期日''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_amount IS ''信用证（财）: 展期金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_rate IS ''信用证（财）: 展期利率''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_interest IS ''信用证（财）: 展期利息''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_execute_unit IS ''信用证（财）: 展期执行单位''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fissue_price IS ''信用证（商）: 开证单价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fissue_price_unit IS ''信用证（商）: 开证单价币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fdry_ton_price IS ''信用证（商）: 吨度价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcredit_tfe IS ''信用证（商）: TFe''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fpob_price IS ''信用证（商）: FOB价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcfr_price IS ''信用证（商）: CFR价''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcreate_by IS ''创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fcreate_date IS ''创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fupdate_by IS ''更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.fupdate_date IS ''更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb010t.farchived IS ''归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcontract_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcontract_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcontract_number IS ''合同: 合同号''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcontract_number NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcontract_number IS ''合同: 合同号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fship_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fship_batch_id IS ''船运批次: 船运批次''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fship_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fship_batch_id IS ''船运批次: 船运批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fpurchase_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fpurchase_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fpurchase_batch_id IS ''采购申请: 采购批次''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fpurchase_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fpurchase_batch_id IS ''采购申请: 采购批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ftrade_type');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ftrade_type NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftrade_type IS ''采购申请: 贸易类型''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ftrade_type NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftrade_type IS ''采购申请: 贸易类型''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fore_area');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fore_area NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fore_area IS ''采购申请: 矿石产区''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fore_area NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fore_area IS ''采购申请: 矿石产区''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fmaterial_category');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fmaterial_category NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fmaterial_category IS ''采购申请: 资源种类''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fmaterial_category NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fmaterial_category IS ''采购申请: 资源种类''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fmaterial_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fmaterial_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fmaterial_id IS ''采购申请: 物料名称''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fmaterial_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fmaterial_id IS ''采购申请: 物料名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ftfe');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ftfe NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftfe IS ''采购申请: TFe''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ftfe NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftfe IS ''采购申请: TFe''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fh2o');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fh2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fh2o IS ''采购申请: H2O''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fh2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fh2o IS ''采购申请: H2O''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsio2');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsio2 IS ''采购申请: SiO2''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsio2 IS ''采购申请: SiO2''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fal2o3');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fal2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fal2o3 IS ''采购申请: Al2O3''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fal2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fal2o3 IS ''采购申请: Al2O3''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsio2_al2o3');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsio2_al2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsio2_al2o3 IS ''采购申请: SiO2+Al2O3''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsio2_al2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsio2_al2o3 IS ''采购申请: SiO2+Al2O3''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fp');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fp NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fp IS ''采购申请: P''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fp NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fp IS ''采购申请: P''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fs');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fs NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fs IS ''采购申请: S''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fs NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fs IS ''采购申请: S''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fother');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fother NVARCHAR2(200))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fother IS ''采购申请: 粒度''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fother NVARCHAR2(200))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fother IS ''采购申请: 粒度''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fprice');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fprice NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fprice IS ''采购申请: 定价模式''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fprice NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fprice IS ''采购申请: 定价模式''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fpurchase_quantity');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fpurchase_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fpurchase_quantity IS ''采购申请: 采购量''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fpurchase_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fpurchase_quantity IS ''采购申请: 采购量''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('funit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (funit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.funit IS ''采购申请: 单位''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (funit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.funit IS ''采购申请: 单位''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fport_load_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fport_load_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_load_date IS ''采购申请: 装港日期''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fport_load_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_load_date IS ''采购申请: 装港日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fport_load_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fport_load_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_load_name IS ''采购申请: 装港名称''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fport_load_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_load_name IS ''采购申请: 装港名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fport_arrived_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fport_arrived_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_arrived_date IS ''采购申请: 到港日期''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fport_arrived_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_arrived_date IS ''采购申请: 到港日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fport_arrived_name');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fport_arrived_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_arrived_name IS ''采购申请: 到港名称''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fport_arrived_name NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fport_arrived_name IS ''采购申请: 到港名称''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fbuyer');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fbuyer NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fbuyer IS ''采购申请: 买方（最终用户）''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fbuyer NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fbuyer IS ''采购申请: 买方（最终用户）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fseller');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fseller NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fseller IS ''采购申请: 卖方（矿山/供应商）''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fseller NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fseller IS ''采购申请: 卖方（矿山/供应商）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fresource_location');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fresource_location NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fresource_location IS ''采购申请: 资源位置''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fresource_location NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fresource_location IS ''采购申请: 资源位置''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('faudit_state');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (faudit_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.faudit_state IS ''采购申请: 审批状态''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (faudit_state NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.faudit_state IS ''采购申请: 审批状态''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fvisible_department');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fvisible_department IS ''采购申请: 可见部门''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fvisible_department NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fvisible_department IS ''采购申请: 可见部门''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fbl_amount');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fbl_amount NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fbl_amount IS ''提单: B/L量''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fbl_amount NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fbl_amount IS ''提单: B/L量''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fbl_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fbl_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fbl_date IS ''提单: B/L日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fbl_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fbl_date IS ''提单: B/L日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_price NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_price IS ''结算货款: 结算吨度价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_price NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_price IS ''结算货款: 结算吨度价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_price_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_price_unit IS ''结算货款: 结算吨度价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_price_unit IS ''结算货款: 结算吨度价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fship_settlement_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fship_settlement_price NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fship_settlement_price IS ''结算货款: 单船结算价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fship_settlement_price NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fship_settlement_price IS ''结算货款: 单船结算价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fship_settlement_price_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fship_settlement_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fship_settlement_price_unit IS ''结算货款: 单船结算价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fship_settlement_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fship_settlement_price_unit IS ''结算货款: 单船结算价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffinal_fe');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffinal_fe NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_fe IS ''结算货款: 结算Fe''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffinal_fe NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_fe IS ''结算货款: 结算Fe''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffinal_h2o');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffinal_h2o NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_h2o IS ''结算货款: 结算H2O''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffinal_h2o NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_h2o IS ''结算货款: 结算H2O''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_start_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_start_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_start_date IS ''结算货款: 结算开始日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_start_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_start_date IS ''结算货款: 结算开始日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_quantity');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_quantity IS ''结算货款: 结算重量''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_quantity IS ''结算货款: 结算重量''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('flc_first_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (flc_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.flc_first_fee IS ''结算货款: LC或托收首款（含息）''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (flc_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.flc_first_fee IS ''结算货款: LC或托收首款（含息）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('flc_first_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (flc_first_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.flc_first_fee_unit IS ''结算货款: LC或托收首款（含息）币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (flc_first_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.flc_first_fee_unit IS ''结算货款: LC或托收首款（含息）币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcompany_first_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcompany_first_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_rate IS ''结算货款: 首款汇率''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcompany_first_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_rate IS ''结算货款: 首款汇率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcompany_first_rmb');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcompany_first_rmb NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_rmb IS ''结算货款: 首款人民币''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcompany_first_rmb NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_rmb IS ''结算货款: 首款人民币''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('finterest_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (finterest_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finterest_rate IS ''结算货款: 信用证利率''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (finterest_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finterest_rate IS ''结算货款: 信用证利率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffuture_accrual');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffuture_accrual NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffuture_accrual IS ''结算货款: 远期利息''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffuture_accrual NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffuture_accrual IS ''结算货款: 远期利息''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffuture_accrual_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffuture_accrual_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffuture_accrual_unit IS ''结算货款: 远期利息币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffuture_accrual_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffuture_accrual_unit IS ''结算货款: 远期利息币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffirst_pay_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffirst_pay_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_pay_date IS ''结算货款: 首款付款日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffirst_pay_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_pay_date IS ''结算货款: 首款付款日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffirst_issue_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffirst_issue_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_issue_date IS ''结算货款: 首款到单日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffirst_issue_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_issue_date IS ''结算货款: 首款到单日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffirst_dry_quantity');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffirst_dry_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_dry_quantity IS ''结算货款: 首款干吨''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffirst_dry_quantity NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffirst_dry_quantity IS ''结算货款: 首款干吨''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcompany_first_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcompany_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_fee IS ''结算货款: 矿山公司首款金额''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcompany_first_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_fee IS ''结算货款: 矿山公司首款金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcompany_first_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcompany_first_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_fee_unit IS ''结算货款: 矿山公司首款金额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcompany_first_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcompany_first_fee_unit IS ''结算货款: 矿山公司首款金额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ftransport_equalize');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ftransport_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftransport_equalize IS ''结算货款: 运费补偿''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ftransport_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftransport_equalize IS ''结算货款: 运费补偿''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ftransport_equalize_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ftransport_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftransport_equalize_unit IS ''结算货款: 运费补偿币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ftransport_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftransport_equalize_unit IS ''结算货款: 运费补偿币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffinal_transport_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffinal_transport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_transport_fee IS ''结算货款: 最终运费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffinal_transport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_transport_fee IS ''结算货款: 最终运费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ffinal_transport_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ffinal_transport_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_transport_fee_unit IS ''结算货款: 最终运费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ffinal_transport_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ffinal_transport_fee_unit IS ''结算货款: 最终运费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsecond_pay');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsecond_pay NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay IS ''结算货款: 二次货款额''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsecond_pay NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay IS ''结算货款: 二次货款额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsecond_pay_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsecond_pay_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_unit IS ''结算货款: 二次货款额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsecond_pay_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_unit IS ''结算货款: 二次货款额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsecond_pay_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsecond_pay_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_rate IS ''结算货款: 二次货款汇率''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsecond_pay_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_rate IS ''结算货款: 二次货款汇率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsecond_pay_rmb');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsecond_pay_rmb NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_rmb IS ''结算货款: 二次货款额人民币''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsecond_pay_rmb NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_rmb IS ''结算货款: 二次货款额人民币''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsecond_pay_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsecond_pay_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_date IS ''结算货款: 二次货款付款日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsecond_pay_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsecond_pay_date IS ''结算货款: 二次货款付款日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_tail_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_tail_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_fee IS ''结算货款: 结算尾款（含滞期速遣费）''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_tail_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_fee IS ''结算货款: 结算尾款（含滞期速遣费）''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_tail_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_tail_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_fee_unit IS ''结算货款: 结算尾款（含滞期速遣费）币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_tail_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_fee_unit IS ''结算货款: 结算尾款（含滞期速遣费）币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_tail_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_tail_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_rate IS ''结算货款: 尾款汇率''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_tail_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_rate IS ''结算货款: 尾款汇率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_tail_rmb');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_tail_rmb NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_rmb IS ''结算货款: 尾款人民币''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_tail_rmb NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_tail_rmb IS ''结算货款: 尾款人民币''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('ftail_fee_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (ftail_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftail_fee_date IS ''结算货款: 尾款付款日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (ftail_fee_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.ftail_fee_date IS ''结算货款: 尾款付款日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fgauge_discount');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fgauge_discount NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fgauge_discount IS ''结算货款: 水尺优惠''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fgauge_discount NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fgauge_discount IS ''结算货款: 水尺优惠''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fgauge_discount_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fgauge_discount_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fgauge_discount_unit IS ''结算货款: 水尺优惠币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fgauge_discount_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fgauge_discount_unit IS ''结算货款: 水尺优惠币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fsettlement_assessment_cycle');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fsettlement_assessment_cycle NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_assessment_cycle IS ''结算货款: 结算考核周期''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fsettlement_assessment_cycle NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fsettlement_assessment_cycle IS ''结算货款: 结算考核周期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fdrain_equalize');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fdrain_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdrain_equalize IS ''结算货款: FOB排水运费补偿''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fdrain_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdrain_equalize IS ''结算货款: FOB排水运费补偿''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fdrain_equalize_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fdrain_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdrain_equalize_unit IS ''结算货款: FOB排水运费补偿币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fdrain_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdrain_equalize_unit IS ''结算货款: FOB排水运费补偿币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('focean_freight_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (focean_freight_price NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.focean_freight_price IS ''结算货款: 海运费单价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (focean_freight_price NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.focean_freight_price IS ''结算货款: 海运费单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fremarks');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fremarks NVARCHAR2(300))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fremarks IS ''结算货款: 备注''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fremarks NVARCHAR2(300))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fremarks IS ''结算货款: 备注''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fffb010t020p_archived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fffb010t020p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fffb010t020p_archived IS ''结算货款: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fffb010t020p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fffb010t020p_archived IS ''结算货款: 归档''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('finsurance_company');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (finsurance_company NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_company IS ''保险: 保险公司''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (finsurance_company NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_company IS ''保险: 保险公司''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('finsurance_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (finsurance_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_fee IS ''保险: 保险费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (finsurance_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_fee IS ''保险: 保险费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('finsurance_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (finsurance_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_fee_unit IS ''保险: 保险费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (finsurance_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.finsurance_fee_unit IS ''保险: 保险费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fffb010t030p_archived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fffb010t030p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fffb010t030p_archived IS ''保险: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fffb010t030p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fffb010t030p_archived IS ''保险: 归档''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('flc_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (flc_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.flc_number IS ''信用证（财）: L/C号码''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (flc_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.flc_number IS ''信用证（财）: L/C号码''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fdocumentary_bills_interest');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fdocumentary_bills_interest NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdocumentary_bills_interest IS ''信用证（财）: 押汇利息''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fdocumentary_bills_interest NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdocumentary_bills_interest IS ''信用证（财）: 押汇利息''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fdocumentary_bills_hike');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fdocumentary_bills_hike NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdocumentary_bills_hike IS ''信用证（财）: 押汇加息''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fdocumentary_bills_hike NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdocumentary_bills_hike IS ''信用证（财）: 押汇加息''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcapital_occupation_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcapital_occupation_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcapital_occupation_fee IS ''信用证（财）: 资金占用费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcapital_occupation_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcapital_occupation_fee IS ''信用证（财）: 资金占用费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fopening_charge');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fopening_charge NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fopening_charge IS ''信用证（财）: 开证费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fopening_charge NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fopening_charge IS ''信用证（财）: 开证费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('faccepting_charge');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (faccepting_charge NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.faccepting_charge IS ''信用证（财）: 承兑费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (faccepting_charge NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.faccepting_charge IS ''信用证（财）: 承兑费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcustoms_guarantee_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcustoms_guarantee_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcustoms_guarantee_fee IS ''信用证（财）: 关税保函费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcustoms_guarantee_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcustoms_guarantee_fee IS ''信用证（财）: 关税保函费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fagent_service_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fagent_service_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fagent_service_fee IS ''信用证（财）: 代理服务费''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fagent_service_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fagent_service_fee IS ''信用证（财）: 代理服务费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fextension_period');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fextension_period NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_period IS ''信用证（财）: 展期期限/天''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fextension_period NUMBER(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_period IS ''信用证（财）: 展期期限/天''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fextension_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fextension_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_date IS ''信用证（财）: 展期到期日''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fextension_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_date IS ''信用证（财）: 展期到期日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fextension_amount');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fextension_amount NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_amount IS ''信用证（财）: 展期金额''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fextension_amount NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_amount IS ''信用证（财）: 展期金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fextension_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fextension_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_rate IS ''信用证（财）: 展期利率''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fextension_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_rate IS ''信用证（财）: 展期利率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fextension_interest');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fextension_interest NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_interest IS ''信用证（财）: 展期利息''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fextension_interest NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_interest IS ''信用证（财）: 展期利息''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fextension_execute_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fextension_execute_unit NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_execute_unit IS ''信用证（财）: 展期执行单位''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fextension_execute_unit NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fextension_execute_unit IS ''信用证（财）: 展期执行单位''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fissue_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fissue_price NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fissue_price IS ''信用证（商）: 开证单价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fissue_price NUMBER(20,4))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fissue_price IS ''信用证（商）: 开证单价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fissue_price_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fissue_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fissue_price_unit IS ''信用证（商）: 开证单价币种''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fissue_price_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fissue_price_unit IS ''信用证（商）: 开证单价币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fdry_ton_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fdry_ton_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdry_ton_price IS ''信用证（商）: 吨度价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fdry_ton_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fdry_ton_price IS ''信用证（商）: 吨度价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcredit_tfe');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcredit_tfe NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcredit_tfe IS ''信用证（商）: TFe''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcredit_tfe NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcredit_tfe IS ''信用证（商）: TFe''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fpob_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fpob_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fpob_price IS ''信用证（商）: FOB价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fpob_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fpob_price IS ''信用证（商）: FOB价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcfr_price');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcfr_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcfr_price IS ''信用证（商）: CFR价''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcfr_price NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcfr_price IS ''信用证（商）: CFR价''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcreate_by IS ''创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcreate_by IS ''创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcreate_date IS ''创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fcreate_date IS ''创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fupdate_by IS ''更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fupdate_by IS ''更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fupdate_date IS ''更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.fupdate_date IS ''更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb010t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb010t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.farchived IS ''归档''
';
    else
      execute immediate
'
ALTER TABLE ffb010t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb010t.farchived IS ''归档''
';
    end if;
    
  end if;
end;