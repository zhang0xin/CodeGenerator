declare 
  tableExistedCount number;
  columnExistedCount number;

begin
  select count(1) into tableExistedCount  from user_tables t where t.table_name = upper('ffb040t');
  if tableExistedCount  = 0 then
    execute immediate
'
CREATE TABLE ffb040t
(

f0 NVARCHAR2(36) PRIMARY KEY,

fpurchase_batch_id NVARCHAR2(36) ,

funload_port_id NVARCHAR2(36) ,

ftfe NVARCHAR2(20) ,

fsio2 NVARCHAR2(20) ,

fcao NVARCHAR2(20) ,

fmgo NVARCHAR2(20) ,

fal2o3 NVARCHAR2(20) ,

fsio2_al2o3 NVARCHAR2(20) ,

ftio2 NVARCHAR2(20) ,

fk2o NVARCHAR2(20) ,

fna2o NVARCHAR2(20) ,

fzno NVARCHAR2(20) ,

fas NVARCHAR2(20) ,

fpbo NVARCHAR2(20) ,

fcr NVARCHAR2(20) ,

fni NVARCHAR2(20) ,

fcu NVARCHAR2(20) ,

fmn NVARCHAR2(20) ,

fh2o NVARCHAR2(20) ,

ffeo NVARCHAR2(20) ,

fp NVARCHAR2(20) ,

fs NVARCHAR2(20) ,

fburn_lose NVARCHAR2(20) ,

fwet_weight NVARCHAR2(20) ,

fgrain_size NVARCHAR2(500) ,

fremark NVARCHAR2(500) ,

fcreate_by NVARCHAR2(30) ,

fcreate_date DATE ,

fupdate_by NVARCHAR2(30) ,

fupdate_date DATE ,

farchived NVARCHAR2(10) ,

fport_fee NUMBER(20,2) ,

fport_construction_fee NUMBER(20,2) ,

fdetect_fee NUMBER(20,2) ,

finspection_fee NUMBER(20,2) ,

fport_agent_fee NUMBER(20,2) ,

fsample_fee NUMBER(20,2) ,

fwater_gauge_fee NUMBER(20,2) ,

fboat_fee NUMBER(20,2) ,

fdeclare_agent_fee NUMBER(20,2) ,

fdeclare_insp_agent_fee NUMBER(20,2) ,

fdeclare_customs_agent NVARCHAR2(50) ,

ffreight_agent NVARCHAR2(50) ,

ffinal_receiver NVARCHAR2(10) ,

fffb040t050p_archived NVARCHAR2(10) ,

funload_delay_days NUMBER(20,5) ,

funload_delay_fee NUMBER(20,2) ,

funload_delay_fee_unit NVARCHAR2(10) ,

funload_delay_fee_rate NUMBER(20,5) ,

funload_transport_adjust NUMBER(20,2) ,

funload_transport_adjust_unit NVARCHAR2(10) ,

fspeed_delay_fee NUMBER(20,2) ,

fspeed_delay_fee_unit NVARCHAR2(10) ,

fship_agent NVARCHAR2(30) ,

fffb040t030p_archived NVARCHAR2(10) ,

fgoods_agent NVARCHAR2(30) ,

fdeclare_customs_company NVARCHAR2(30) ,

fdeposit_fee NUMBER(20,2) ,

fdeposit_fee_unit NVARCHAR2(10) ,

fdeclare_customs NVARCHAR2(30) ,

fcustoms_clearance_last_date DATE ,

fcustoms_clearance_actual_date DATE ,

fsafe_declar NVARCHAR2(30) ,

fdeclare_customs_date DATE ,

fdeclare_customs_bill NVARCHAR2(30) ,

fcustoms_clearance_state NVARCHAR2(20) ,

fdeclare_customs_fee NUMBER(20,2) ,

fdeclare_customs_fee_unit NVARCHAR2(10) ,

flicense_number NVARCHAR2(30) ,

fvalue_added_tax NUMBER(20,2) ,

fvalue_added_tax_unit NVARCHAR2(10) ,

fcustoms_tax_equalize NUMBER(20,2) ,

fcustoms_tax_equalize_unit NVARCHAR2(10) ,

fffb040t040p_archived NVARCHAR2(10) 

)';
    execute immediate
'
COMMENT ON TABLE ffb040t IS ''品质''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.f0 IS ''主键''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fpurchase_batch_id IS ''品质: 采购批次''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_port_id IS ''品质: 卸港批次(装港品质对应的卸港ID为空)''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.ftfe IS ''品质: TFe''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fsio2 IS ''品质: SiO2''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcao IS ''品质: CaO''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fmgo IS ''品质: MgO''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fal2o3 IS ''品质: Al2O3''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fsio2_al2o3 IS ''品质: SiO2+Al2O3''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.ftio2 IS ''品质: TiO2''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fk2o IS ''品质: K2O''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fna2o IS ''品质: Na2O''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fzno IS ''品质: ZnO''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fas IS ''品质: As''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fpbo IS ''品质: PbO''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcr IS ''品质: Cr''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fni IS ''品质: Ni''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcu IS ''品质: Cu''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fmn IS ''品质: Mn''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fh2o IS ''品质: H2O''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.ffeo IS ''品质: FeO''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fp IS ''品质: P''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fs IS ''品质: S''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fburn_lose IS ''品质: 烧损''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fwet_weight IS ''品质: 湿量''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fgrain_size IS ''品质: 粒度''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fremark IS ''品质: 备注''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcreate_by IS ''品质: 创建人''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcreate_date IS ''品质: 创建日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fupdate_by IS ''品质: 更新人''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fupdate_date IS ''品质: 更新日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.farchived IS ''品质: 归档''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fport_fee IS ''卸港口费: 港口费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fport_construction_fee IS ''卸港口费: 港口建设费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdetect_fee IS ''卸港口费: 检测费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.finspection_fee IS ''卸港口费: 商检费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fport_agent_fee IS ''卸港口费: 港口代理费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fsample_fee IS ''卸港口费: 制取样费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fwater_gauge_fee IS ''卸港口费: 水尺鉴定费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fboat_fee IS ''卸港口费: 小船费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_agent_fee IS ''卸港口费: 报关代理费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_insp_agent_fee IS ''卸港口费: 报检代理费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_agent IS ''卸港口费: 报关代理''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.ffreight_agent IS ''卸港口费: 货运代理''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.ffinal_receiver IS ''卸港口费: 最终收货人''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t050p_archived IS ''卸港口费: 归档''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_days IS ''卸港滞期速遣: 卸港滞期天数''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee IS ''卸港滞期速遣: 卸港对卖方滞速费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee_unit IS ''卸港滞期速遣: 卸港对卖方滞速费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee_rate IS ''卸港滞期速遣: 卸港滞速费率''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_transport_adjust IS ''卸港滞期速遣: CFR卸港运费调整''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.funload_transport_adjust_unit IS ''卸港滞期速遣: CFR卸港运费调整币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fspeed_delay_fee IS ''卸港滞期速遣: 卸港与船公司滞速费''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fspeed_delay_fee_unit IS ''卸港滞期速遣: 卸港与船公司滞速费币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fship_agent IS ''卸港滞期速遣: 船代''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t030p_archived IS ''卸港滞期速遣: 归档''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fgoods_agent IS ''报关报检: 货代''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_company IS ''报关报检: 报关单位''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeposit_fee IS ''报关报检: 保证金''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeposit_fee_unit IS ''报关报检: 保证金币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs IS ''报关报检: 报关海关''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_last_date IS ''报关报检: 最晚结关日''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_actual_date IS ''报关报检: 实际结关日''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fsafe_declar IS ''报关报检: 外管局申报''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_date IS ''报关报检: 首次报关日期''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_bill IS ''报关报检: 报关单号''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_state IS ''报关报检: 结关状态''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_fee IS ''报关报检: 首次报关金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_fee_unit IS ''报关报检: 首次报关金额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.flicense_number IS ''报关报检: 许可证号''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fvalue_added_tax IS ''报关报检: 海关征收增值税''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fvalue_added_tax_unit IS ''报关报检: 海关征收增值税币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_tax_equalize IS ''报关报检: 海关补税金额''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_tax_equalize_unit IS ''报关报检: 海关补税金额币种''
';

    execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t040p_archived IS ''报关报检: 归档''
';

  else
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('f0');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.f0 IS ''主键''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (f0 NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.f0 IS ''主键''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fpurchase_batch_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fpurchase_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fpurchase_batch_id IS ''品质: 采购批次''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fpurchase_batch_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fpurchase_batch_id IS ''品质: 采购批次''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_port_id');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_port_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_port_id IS ''品质: 卸港批次(装港品质对应的卸港ID为空)''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_port_id NVARCHAR2(36))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_port_id IS ''品质: 卸港批次(装港品质对应的卸港ID为空)''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('ftfe');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (ftfe NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ftfe IS ''品质: TFe''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (ftfe NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ftfe IS ''品质: TFe''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fsio2');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fsio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsio2 IS ''品质: SiO2''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fsio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsio2 IS ''品质: SiO2''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcao');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcao NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcao IS ''品质: CaO''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcao NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcao IS ''品质: CaO''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fmgo');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fmgo NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fmgo IS ''品质: MgO''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fmgo NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fmgo IS ''品质: MgO''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fal2o3');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fal2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fal2o3 IS ''品质: Al2O3''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fal2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fal2o3 IS ''品质: Al2O3''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fsio2_al2o3');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fsio2_al2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsio2_al2o3 IS ''品质: SiO2+Al2O3''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fsio2_al2o3 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsio2_al2o3 IS ''品质: SiO2+Al2O3''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('ftio2');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (ftio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ftio2 IS ''品质: TiO2''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (ftio2 NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ftio2 IS ''品质: TiO2''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fk2o');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fk2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fk2o IS ''品质: K2O''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fk2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fk2o IS ''品质: K2O''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fna2o');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fna2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fna2o IS ''品质: Na2O''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fna2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fna2o IS ''品质: Na2O''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fzno');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fzno NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fzno IS ''品质: ZnO''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fzno NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fzno IS ''品质: ZnO''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fas');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fas NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fas IS ''品质: As''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fas NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fas IS ''品质: As''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fpbo');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fpbo NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fpbo IS ''品质: PbO''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fpbo NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fpbo IS ''品质: PbO''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcr');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcr NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcr IS ''品质: Cr''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcr NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcr IS ''品质: Cr''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fni');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fni NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fni IS ''品质: Ni''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fni NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fni IS ''品质: Ni''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcu');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcu NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcu IS ''品质: Cu''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcu NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcu IS ''品质: Cu''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fmn');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fmn NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fmn IS ''品质: Mn''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fmn NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fmn IS ''品质: Mn''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fh2o');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fh2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fh2o IS ''品质: H2O''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fh2o NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fh2o IS ''品质: H2O''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('ffeo');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (ffeo NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ffeo IS ''品质: FeO''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (ffeo NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ffeo IS ''品质: FeO''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fp');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fp NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fp IS ''品质: P''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fp NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fp IS ''品质: P''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fs');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fs NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fs IS ''品质: S''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fs NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fs IS ''品质: S''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fburn_lose');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fburn_lose NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fburn_lose IS ''品质: 烧损''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fburn_lose NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fburn_lose IS ''品质: 烧损''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fwet_weight');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fwet_weight NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fwet_weight IS ''品质: 湿量''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fwet_weight NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fwet_weight IS ''品质: 湿量''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fgrain_size');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fgrain_size NVARCHAR2(500))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fgrain_size IS ''品质: 粒度''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fgrain_size NVARCHAR2(500))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fgrain_size IS ''品质: 粒度''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fremark');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fremark NVARCHAR2(500))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fremark IS ''品质: 备注''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fremark NVARCHAR2(500))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fremark IS ''品质: 备注''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcreate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcreate_by IS ''品质: 创建人''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcreate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcreate_by IS ''品质: 创建人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcreate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcreate_date IS ''品质: 创建日期''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcreate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcreate_date IS ''品质: 创建日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fupdate_by');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fupdate_by IS ''品质: 更新人''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fupdate_by NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fupdate_by IS ''品质: 更新人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fupdate_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fupdate_date IS ''品质: 更新日期''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fupdate_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fupdate_date IS ''品质: 更新日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('farchived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.farchived IS ''品质: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (farchived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.farchived IS ''品质: 归档''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fport_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fport_fee IS ''卸港口费: 港口费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fport_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fport_fee IS ''卸港口费: 港口费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fport_construction_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fport_construction_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fport_construction_fee IS ''卸港口费: 港口建设费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fport_construction_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fport_construction_fee IS ''卸港口费: 港口建设费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdetect_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdetect_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdetect_fee IS ''卸港口费: 检测费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdetect_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdetect_fee IS ''卸港口费: 检测费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('finspection_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (finspection_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.finspection_fee IS ''卸港口费: 商检费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (finspection_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.finspection_fee IS ''卸港口费: 商检费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fport_agent_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fport_agent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fport_agent_fee IS ''卸港口费: 港口代理费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fport_agent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fport_agent_fee IS ''卸港口费: 港口代理费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fsample_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fsample_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsample_fee IS ''卸港口费: 制取样费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fsample_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsample_fee IS ''卸港口费: 制取样费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fwater_gauge_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fwater_gauge_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fwater_gauge_fee IS ''卸港口费: 水尺鉴定费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fwater_gauge_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fwater_gauge_fee IS ''卸港口费: 水尺鉴定费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fboat_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fboat_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fboat_fee IS ''卸港口费: 小船费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fboat_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fboat_fee IS ''卸港口费: 小船费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_agent_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_agent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_agent_fee IS ''卸港口费: 报关代理费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_agent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_agent_fee IS ''卸港口费: 报关代理费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_insp_agent_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_insp_agent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_insp_agent_fee IS ''卸港口费: 报检代理费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_insp_agent_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_insp_agent_fee IS ''卸港口费: 报检代理费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs_agent');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs_agent NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_agent IS ''卸港口费: 报关代理''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs_agent NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_agent IS ''卸港口费: 报关代理''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('ffreight_agent');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (ffreight_agent NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ffreight_agent IS ''卸港口费: 货运代理''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (ffreight_agent NVARCHAR2(50))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ffreight_agent IS ''卸港口费: 货运代理''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('ffinal_receiver');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (ffinal_receiver NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ffinal_receiver IS ''卸港口费: 最终收货人''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (ffinal_receiver NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.ffinal_receiver IS ''卸港口费: 最终收货人''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fffb040t050p_archived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fffb040t050p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t050p_archived IS ''卸港口费: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fffb040t050p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t050p_archived IS ''卸港口费: 归档''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_delay_days');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_delay_days NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_days IS ''卸港滞期速遣: 卸港滞期天数''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_delay_days NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_days IS ''卸港滞期速遣: 卸港滞期天数''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_delay_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee IS ''卸港滞期速遣: 卸港对卖方滞速费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee IS ''卸港滞期速遣: 卸港对卖方滞速费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_delay_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee_unit IS ''卸港滞期速遣: 卸港对卖方滞速费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee_unit IS ''卸港滞期速遣: 卸港对卖方滞速费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_delay_fee_rate');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_delay_fee_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee_rate IS ''卸港滞期速遣: 卸港滞速费率''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_delay_fee_rate NUMBER(20,5))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_delay_fee_rate IS ''卸港滞期速遣: 卸港滞速费率''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_transport_adjust');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_transport_adjust NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_transport_adjust IS ''卸港滞期速遣: CFR卸港运费调整''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_transport_adjust NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_transport_adjust IS ''卸港滞期速遣: CFR卸港运费调整''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('funload_transport_adjust_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (funload_transport_adjust_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_transport_adjust_unit IS ''卸港滞期速遣: CFR卸港运费调整币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (funload_transport_adjust_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.funload_transport_adjust_unit IS ''卸港滞期速遣: CFR卸港运费调整币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fspeed_delay_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fspeed_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fspeed_delay_fee IS ''卸港滞期速遣: 卸港与船公司滞速费''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fspeed_delay_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fspeed_delay_fee IS ''卸港滞期速遣: 卸港与船公司滞速费''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fspeed_delay_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fspeed_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fspeed_delay_fee_unit IS ''卸港滞期速遣: 卸港与船公司滞速费币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fspeed_delay_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fspeed_delay_fee_unit IS ''卸港滞期速遣: 卸港与船公司滞速费币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fship_agent');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fship_agent NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fship_agent IS ''卸港滞期速遣: 船代''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fship_agent NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fship_agent IS ''卸港滞期速遣: 船代''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fffb040t030p_archived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fffb040t030p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t030p_archived IS ''卸港滞期速遣: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fffb040t030p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t030p_archived IS ''卸港滞期速遣: 归档''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fgoods_agent');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fgoods_agent NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fgoods_agent IS ''报关报检: 货代''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fgoods_agent NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fgoods_agent IS ''报关报检: 货代''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs_company');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs_company NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_company IS ''报关报检: 报关单位''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs_company NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_company IS ''报关报检: 报关单位''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeposit_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeposit_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeposit_fee IS ''报关报检: 保证金''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeposit_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeposit_fee IS ''报关报检: 保证金''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeposit_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeposit_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeposit_fee_unit IS ''报关报检: 保证金币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeposit_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeposit_fee_unit IS ''报关报检: 保证金币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs IS ''报关报检: 报关海关''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs IS ''报关报检: 报关海关''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcustoms_clearance_last_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcustoms_clearance_last_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_last_date IS ''报关报检: 最晚结关日''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcustoms_clearance_last_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_last_date IS ''报关报检: 最晚结关日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcustoms_clearance_actual_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcustoms_clearance_actual_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_actual_date IS ''报关报检: 实际结关日''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcustoms_clearance_actual_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_actual_date IS ''报关报检: 实际结关日''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fsafe_declar');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fsafe_declar NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsafe_declar IS ''报关报检: 外管局申报''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fsafe_declar NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fsafe_declar IS ''报关报检: 外管局申报''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs_date');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_date IS ''报关报检: 首次报关日期''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs_date DATE)
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_date IS ''报关报检: 首次报关日期''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs_bill');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs_bill NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_bill IS ''报关报检: 报关单号''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs_bill NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_bill IS ''报关报检: 报关单号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcustoms_clearance_state');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcustoms_clearance_state NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_state IS ''报关报检: 结关状态''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcustoms_clearance_state NVARCHAR2(20))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_clearance_state IS ''报关报检: 结关状态''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs_fee');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_fee IS ''报关报检: 首次报关金额''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs_fee NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_fee IS ''报关报检: 首次报关金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fdeclare_customs_fee_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fdeclare_customs_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_fee_unit IS ''报关报检: 首次报关金额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fdeclare_customs_fee_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fdeclare_customs_fee_unit IS ''报关报检: 首次报关金额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('flicense_number');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (flicense_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.flicense_number IS ''报关报检: 许可证号''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (flicense_number NVARCHAR2(30))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.flicense_number IS ''报关报检: 许可证号''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fvalue_added_tax');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fvalue_added_tax NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fvalue_added_tax IS ''报关报检: 海关征收增值税''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fvalue_added_tax NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fvalue_added_tax IS ''报关报检: 海关征收增值税''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fvalue_added_tax_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fvalue_added_tax_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fvalue_added_tax_unit IS ''报关报检: 海关征收增值税币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fvalue_added_tax_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fvalue_added_tax_unit IS ''报关报检: 海关征收增值税币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcustoms_tax_equalize');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcustoms_tax_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_tax_equalize IS ''报关报检: 海关补税金额''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcustoms_tax_equalize NUMBER(20,2))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_tax_equalize IS ''报关报检: 海关补税金额''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fcustoms_tax_equalize_unit');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fcustoms_tax_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_tax_equalize_unit IS ''报关报检: 海关补税金额币种''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fcustoms_tax_equalize_unit NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fcustoms_tax_equalize_unit IS ''报关报检: 海关补税金额币种''
';
    end if;
    
    select count(1) into columnExistedCount from user_tab_columns t where t.table_name = upper('ffb040t')  and t.column_name = upper('fffb040t040p_archived');   
    if columnExistedCount = 0 then
      execute immediate
'
ALTER TABLE ffb040t ADD (fffb040t040p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t040p_archived IS ''报关报检: 归档''
';
    else
      execute immediate
'
ALTER TABLE ffb040t MODIFY (fffb040t040p_archived NVARCHAR2(10))
';
      execute immediate
'
COMMENT ON COLUMN ffb040t.fffb040t040p_archived IS ''报关报检: 归档''
';
    end if;
    
  end if;
end;