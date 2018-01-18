package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb010tAuto extends BaseEntity {
  
  @Comment("合同号")
  @Column(name="fcontract_number", length=36)
  private java.lang.String contractNumber;
  
  @Comment("船运批次")
  @Column(name="fship_batch_id", length=36)
  private java.lang.String shipBatchId;
  
  @Comment("采购批次")
  @Column(name="fpurchase_batch_id", length=36)
  private java.lang.String purchaseBatchId;
  
  @Comment("贸易类型")
  @Column(name="ftrade_type", length=10)
  private java.lang.String tradeType;
  
  @Comment("矿石产区")
  @Column(name="fore_area", length=10)
  private java.lang.String oreArea;
  
  @Comment("资源种类")
  @Column(name="fmaterial_category", length=30)
  private java.lang.String materialCategory;
  
  @Comment("物料名称")
  @Column(name="fmaterial_id", length=36)
  private java.lang.String materialId;
  
  @Comment("TFe")
  @Column(name="ftfe", length=20)
  private java.lang.String tfe;
  
  @Comment("H2O")
  @Column(name="fh2o", length=20)
  private java.lang.String h2o;
  
  @Comment("SiO2")
  @Column(name="fsio2", length=20)
  private java.lang.String sio2;
  
  @Comment("Al2O3")
  @Column(name="fal2o3", length=20)
  private java.lang.String al2o3;
  
  @Comment("SiO2+Al2O3")
  @Column(name="fsio2_al2o3", length=20)
  private java.lang.String sio2Al2o3;
  
  @Comment("P")
  @Column(name="fp", length=20)
  private java.lang.String p;
  
  @Comment("S")
  @Column(name="fs", length=20)
  private java.lang.String s;
  
  @Comment("粒度")
  @Column(name="fother", length=200)
  private java.lang.String other;
  
  @Comment("定价模式")
  @Column(name="fprice", length=50)
  private java.lang.String price;
  
  @Comment("采购量")
  @Column(name="fpurchase_quantity")
  private java.lang.Double purchaseQuantity;
  
  @Comment("单位")
  @Column(name="funit", length=10)
  private java.lang.String unit;
  
  @Comment("装港日期")
  @Column(name="fport_load_date")
  private java.util.Date portLoadDate;
  
  @Comment("装港名称")
  @Column(name="fport_load_name", length=30)
  private java.lang.String portLoadName;
  
  @Comment("到港日期")
  @Column(name="fport_arrived_date")
  private java.util.Date portArrivedDate;
  
  @Comment("到港名称")
  @Column(name="fport_arrived_name", length=30)
  private java.lang.String portArrivedName;
  
  @Comment("买方（最终用户）")
  @Column(name="fbuyer", length=30)
  private java.lang.String buyer;
  
  @Comment("卖方（矿山/供应商）")
  @Column(name="fseller", length=30)
  private java.lang.String seller;
  
  @Comment("资源位置")
  @Column(name="fresource_location", length=30)
  private java.lang.String resourceLocation;
  
  @Comment("审批状态")
  @Column(name="faudit_state", length=10)
  private java.lang.String auditState;
  
  @Comment("可见部门")
  @Column(name="fvisible_department", length=30)
  private java.lang.String visibleDepartment;
  
  @Comment("B/L量")
  @Column(name="fbl_amount")
  private java.lang.Double blAmount;
  
  @Comment("B/L日")
  @Column(name="fbl_date")
  private java.util.Date blDate;
  
  @Comment("结算吨度价")
  @Column(name="fsettlement_price")
  private java.lang.Double settlementPrice;
  
  @Comment("结算吨度价币种")
  @Column(name="fsettlement_price_unit", length=10)
  private java.lang.String settlementPriceUnit;
  
  @Comment("单船结算价")
  @Column(name="fship_settlement_price")
  private java.lang.Double shipSettlementPrice;
  
  @Comment("单船结算价币种")
  @Column(name="fship_settlement_price_unit", length=10)
  private java.lang.String shipSettlementPriceUnit;
  
  @Comment("结算Fe")
  @Column(name="ffinal_fe")
  private java.lang.Double finalFe;
  
  @Comment("结算H2O")
  @Column(name="ffinal_h2o")
  private java.lang.Double finalH2o;
  
  @Comment("结算开始日")
  @Column(name="fsettlement_start_date")
  private java.util.Date settlementStartDate;
  
  @Comment("结算重量")
  @Column(name="fsettlement_quantity")
  private java.lang.Double settlementQuantity;
  
  @Comment("LC或托收首款（含息）")
  @Column(name="flc_first_fee")
  private java.lang.Double lcFirstFee;
  
  @Comment("LC或托收首款（含息）币种")
  @Column(name="flc_first_fee_unit", length=10)
  private java.lang.String lcFirstFeeUnit;
  
  @Comment("首款汇率")
  @Column(name="fcompany_first_rate")
  private java.lang.Double companyFirstRate;
  
  @Comment("首款人民币")
  @Column(name="fcompany_first_rmb")
  private java.lang.Double companyFirstRmb;
  
  @Comment("信用证利率")
  @Column(name="finterest_rate")
  private java.lang.Double interestRate;
  
  @Comment("远期利息")
  @Column(name="ffuture_accrual")
  private java.lang.Double futureAccrual;
  
  @Comment("远期利息币种")
  @Column(name="ffuture_accrual_unit", length=10)
  private java.lang.String futureAccrualUnit;
  
  @Comment("首款付款日")
  @Column(name="ffirst_pay_date")
  private java.util.Date firstPayDate;
  
  @Comment("首款到单日")
  @Column(name="ffirst_issue_date")
  private java.util.Date firstIssueDate;
  
  @Comment("首款干吨")
  @Column(name="ffirst_dry_quantity")
  private java.lang.Double firstDryQuantity;
  
  @Comment("矿山公司首款金额")
  @Column(name="fcompany_first_fee")
  private java.lang.Double companyFirstFee;
  
  @Comment("矿山公司首款金额币种")
  @Column(name="fcompany_first_fee_unit", length=10)
  private java.lang.String companyFirstFeeUnit;
  
  @Comment("运费补偿")
  @Column(name="ftransport_equalize")
  private java.lang.Double transportEqualize;
  
  @Comment("运费补偿币种")
  @Column(name="ftransport_equalize_unit", length=10)
  private java.lang.String transportEqualizeUnit;
  
  @Comment("最终运费")
  @Column(name="ffinal_transport_fee")
  private java.lang.Double finalTransportFee;
  
  @Comment("最终运费币种")
  @Column(name="ffinal_transport_fee_unit", length=10)
  private java.lang.String finalTransportFeeUnit;
  
  @Comment("二次货款额")
  @Column(name="fsecond_pay")
  private java.lang.Double secondPay;
  
  @Comment("二次货款额币种")
  @Column(name="fsecond_pay_unit", length=10)
  private java.lang.String secondPayUnit;
  
  @Comment("二次货款汇率")
  @Column(name="fsecond_pay_rate")
  private java.lang.Double secondPayRate;
  
  @Comment("二次货款额人民币")
  @Column(name="fsecond_pay_rmb")
  private java.lang.Double secondPayRmb;
  
  @Comment("二次货款付款日")
  @Column(name="fsecond_pay_date")
  private java.util.Date secondPayDate;
  
  @Comment("结算尾款（含滞期速遣费）")
  @Column(name="fsettlement_tail_fee")
  private java.lang.Double settlementTailFee;
  
  @Comment("结算尾款（含滞期速遣费）币种")
  @Column(name="fsettlement_tail_fee_unit", length=10)
  private java.lang.String settlementTailFeeUnit;
  
  @Comment("尾款汇率")
  @Column(name="fsettlement_tail_rate")
  private java.lang.Double settlementTailRate;
  
  @Comment("尾款人民币")
  @Column(name="fsettlement_tail_rmb")
  private java.lang.Double settlementTailRmb;
  
  @Comment("尾款付款日")
  @Column(name="ftail_fee_date")
  private java.util.Date tailFeeDate;
  
  @Comment("水尺优惠")
  @Column(name="fgauge_discount")
  private java.lang.Double gaugeDiscount;
  
  @Comment("水尺优惠币种")
  @Column(name="fgauge_discount_unit", length=10)
  private java.lang.String gaugeDiscountUnit;
  
  @Comment("结算考核周期")
  @Column(name="fsettlement_assessment_cycle")
  private java.lang.Double settlementAssessmentCycle;
  
  @Comment("FOB排水运费补偿")
  @Column(name="fdrain_equalize")
  private java.lang.Double drainEqualize;
  
  @Comment("FOB排水运费补偿币种")
  @Column(name="fdrain_equalize_unit", length=10)
  private java.lang.String drainEqualizeUnit;
  
  @Comment("海运费单价")
  @Column(name="focean_freight_price")
  private java.lang.Double oceanFreightPrice;
  
  @Comment("备注")
  @Column(name="fremarks", length=300)
  private java.lang.String remarks;
  
  @Comment("归档")
  @Column(name="fffb010t020p_archived", length=10)
  private java.lang.String ffb010t020pArchived;
  
  @Comment("保险公司")
  @Column(name="finsurance_company", length=30)
  private java.lang.String insuranceCompany;
  
  @Comment("保险费")
  @Column(name="finsurance_fee")
  private java.lang.Double insuranceFee;
  
  @Comment("保险费币种")
  @Column(name="finsurance_fee_unit", length=10)
  private java.lang.String insuranceFeeUnit;
  
  @Comment("归档")
  @Column(name="fffb010t030p_archived", length=10)
  private java.lang.String ffb010t030pArchived;
  
  @Comment("L/C号码")
  @Column(name="flc_number", length=30)
  private java.lang.String lcNumber;
  
  @Comment("押汇利息")
  @Column(name="fdocumentary_bills_interest")
  private java.lang.Double documentaryBillsInterest;
  
  @Comment("押汇加息")
  @Column(name="fdocumentary_bills_hike")
  private java.lang.Double documentaryBillsHike;
  
  @Comment("资金占用费")
  @Column(name="fcapital_occupation_fee")
  private java.lang.Double capitalOccupationFee;
  
  @Comment("开证费")
  @Column(name="fopening_charge")
  private java.lang.Double openingCharge;
  
  @Comment("承兑费")
  @Column(name="faccepting_charge")
  private java.lang.Double acceptingCharge;
  
  @Comment("关税保函费")
  @Column(name="fcustoms_guarantee_fee")
  private java.lang.Double customsGuaranteeFee;
  
  @Comment("代理服务费")
  @Column(name="fagent_service_fee")
  private java.lang.Double agentServiceFee;
  
  @Comment("展期期限/天")
  @Column(name="fextension_period", precision=10)
  private java.lang.Long extensionPeriod;
  
  @Comment("展期到期日")
  @Column(name="fextension_date")
  private java.util.Date extensionDate;
  
  @Comment("展期金额")
  @Column(name="fextension_amount")
  private java.lang.Double extensionAmount;
  
  @Comment("展期利率")
  @Column(name="fextension_rate")
  private java.lang.Double extensionRate;
  
  @Comment("展期利息")
  @Column(name="fextension_interest")
  private java.lang.Double extensionInterest;
  
  @Comment("展期执行单位")
  @Column(name="fextension_execute_unit", length=30)
  private java.lang.String extensionExecuteUnit;
  
  @Comment("开证单价")
  @Column(name="fissue_price")
  private java.lang.Double issuePrice;
  
  @Comment("开证单价币种")
  @Column(name="fissue_price_unit", length=10)
  private java.lang.String issuePriceUnit;
  
  @Comment("吨度价")
  @Column(name="fdry_ton_price", length=50)
  private java.lang.String dryTonPrice;
  
  @Comment("TFe")
  @Column(name="fcredit_tfe", length=50)
  private java.lang.String creditTfe;
  
  @Comment("FOB价")
  @Column(name="fpob_price", length=50)
  private java.lang.String pobPrice;
  
  @Comment("CFR价")
  @Column(name="fcfr_price", length=50)
  private java.lang.String cfrPrice;
  

  public Ffb010tAuto() {
  }

  
  public java.lang.String getContractNumber() {
    return this.contractNumber;
  }
  public void setContractNumber(java.lang.String contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public java.lang.String getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(java.lang.String shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public java.lang.String getPurchaseBatchId() {
    return this.purchaseBatchId;
  }
  public void setPurchaseBatchId(java.lang.String purchaseBatchId) {
    this.purchaseBatchId = purchaseBatchId;
  }
  
  public java.lang.String getTradeType() {
    return this.tradeType;
  }
  public void setTradeType(java.lang.String tradeType) {
    this.tradeType = tradeType;
  }
  
  public java.lang.String getOreArea() {
    return this.oreArea;
  }
  public void setOreArea(java.lang.String oreArea) {
    this.oreArea = oreArea;
  }
  
  public java.lang.String getMaterialCategory() {
    return this.materialCategory;
  }
  public void setMaterialCategory(java.lang.String materialCategory) {
    this.materialCategory = materialCategory;
  }
  
  public java.lang.String getMaterialId() {
    return this.materialId;
  }
  public void setMaterialId(java.lang.String materialId) {
    this.materialId = materialId;
  }
  
  public java.lang.String getTfe() {
    return this.tfe;
  }
  public void setTfe(java.lang.String tfe) {
    this.tfe = tfe;
  }
  
  public java.lang.String getH2o() {
    return this.h2o;
  }
  public void setH2o(java.lang.String h2o) {
    this.h2o = h2o;
  }
  
  public java.lang.String getSio2() {
    return this.sio2;
  }
  public void setSio2(java.lang.String sio2) {
    this.sio2 = sio2;
  }
  
  public java.lang.String getAl2o3() {
    return this.al2o3;
  }
  public void setAl2o3(java.lang.String al2o3) {
    this.al2o3 = al2o3;
  }
  
  public java.lang.String getSio2Al2o3() {
    return this.sio2Al2o3;
  }
  public void setSio2Al2o3(java.lang.String sio2Al2o3) {
    this.sio2Al2o3 = sio2Al2o3;
  }
  
  public java.lang.String getP() {
    return this.p;
  }
  public void setP(java.lang.String p) {
    this.p = p;
  }
  
  public java.lang.String getS() {
    return this.s;
  }
  public void setS(java.lang.String s) {
    this.s = s;
  }
  
  public java.lang.String getOther() {
    return this.other;
  }
  public void setOther(java.lang.String other) {
    this.other = other;
  }
  
  public java.lang.String getPrice() {
    return this.price;
  }
  public void setPrice(java.lang.String price) {
    this.price = price;
  }
  
  public java.lang.Double getPurchaseQuantity() {
    return this.purchaseQuantity;
  }
  public void setPurchaseQuantity(java.lang.Double purchaseQuantity) {
    this.purchaseQuantity = purchaseQuantity;
  }
  
  public java.lang.String getUnit() {
    return this.unit;
  }
  public void setUnit(java.lang.String unit) {
    this.unit = unit;
  }
  
  public java.util.Date getPortLoadDate() {
    return this.portLoadDate;
  }
  public void setPortLoadDate(java.util.Date portLoadDate) {
    this.portLoadDate = portLoadDate;
  }
  
  public java.lang.String getPortLoadName() {
    return this.portLoadName;
  }
  public void setPortLoadName(java.lang.String portLoadName) {
    this.portLoadName = portLoadName;
  }
  
  public java.util.Date getPortArrivedDate() {
    return this.portArrivedDate;
  }
  public void setPortArrivedDate(java.util.Date portArrivedDate) {
    this.portArrivedDate = portArrivedDate;
  }
  
  public java.lang.String getPortArrivedName() {
    return this.portArrivedName;
  }
  public void setPortArrivedName(java.lang.String portArrivedName) {
    this.portArrivedName = portArrivedName;
  }
  
  public java.lang.String getBuyer() {
    return this.buyer;
  }
  public void setBuyer(java.lang.String buyer) {
    this.buyer = buyer;
  }
  
  public java.lang.String getSeller() {
    return this.seller;
  }
  public void setSeller(java.lang.String seller) {
    this.seller = seller;
  }
  
  public java.lang.String getResourceLocation() {
    return this.resourceLocation;
  }
  public void setResourceLocation(java.lang.String resourceLocation) {
    this.resourceLocation = resourceLocation;
  }
  
  public java.lang.String getAuditState() {
    return this.auditState;
  }
  public void setAuditState(java.lang.String auditState) {
    this.auditState = auditState;
  }
  
  public java.lang.String getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(java.lang.String visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
  public java.lang.Double getBlAmount() {
    return this.blAmount;
  }
  public void setBlAmount(java.lang.Double blAmount) {
    this.blAmount = blAmount;
  }
  
  public java.util.Date getBlDate() {
    return this.blDate;
  }
  public void setBlDate(java.util.Date blDate) {
    this.blDate = blDate;
  }
  
  public java.lang.Double getSettlementPrice() {
    return this.settlementPrice;
  }
  public void setSettlementPrice(java.lang.Double settlementPrice) {
    this.settlementPrice = settlementPrice;
  }
  
  public java.lang.String getSettlementPriceUnit() {
    return this.settlementPriceUnit;
  }
  public void setSettlementPriceUnit(java.lang.String settlementPriceUnit) {
    this.settlementPriceUnit = settlementPriceUnit;
  }
  
  public java.lang.Double getShipSettlementPrice() {
    return this.shipSettlementPrice;
  }
  public void setShipSettlementPrice(java.lang.Double shipSettlementPrice) {
    this.shipSettlementPrice = shipSettlementPrice;
  }
  
  public java.lang.String getShipSettlementPriceUnit() {
    return this.shipSettlementPriceUnit;
  }
  public void setShipSettlementPriceUnit(java.lang.String shipSettlementPriceUnit) {
    this.shipSettlementPriceUnit = shipSettlementPriceUnit;
  }
  
  public java.lang.Double getFinalFe() {
    return this.finalFe;
  }
  public void setFinalFe(java.lang.Double finalFe) {
    this.finalFe = finalFe;
  }
  
  public java.lang.Double getFinalH2o() {
    return this.finalH2o;
  }
  public void setFinalH2o(java.lang.Double finalH2o) {
    this.finalH2o = finalH2o;
  }
  
  public java.util.Date getSettlementStartDate() {
    return this.settlementStartDate;
  }
  public void setSettlementStartDate(java.util.Date settlementStartDate) {
    this.settlementStartDate = settlementStartDate;
  }
  
  public java.lang.Double getSettlementQuantity() {
    return this.settlementQuantity;
  }
  public void setSettlementQuantity(java.lang.Double settlementQuantity) {
    this.settlementQuantity = settlementQuantity;
  }
  
  public java.lang.Double getLcFirstFee() {
    return this.lcFirstFee;
  }
  public void setLcFirstFee(java.lang.Double lcFirstFee) {
    this.lcFirstFee = lcFirstFee;
  }
  
  public java.lang.String getLcFirstFeeUnit() {
    return this.lcFirstFeeUnit;
  }
  public void setLcFirstFeeUnit(java.lang.String lcFirstFeeUnit) {
    this.lcFirstFeeUnit = lcFirstFeeUnit;
  }
  
  public java.lang.Double getCompanyFirstRate() {
    return this.companyFirstRate;
  }
  public void setCompanyFirstRate(java.lang.Double companyFirstRate) {
    this.companyFirstRate = companyFirstRate;
  }
  
  public java.lang.Double getCompanyFirstRmb() {
    return this.companyFirstRmb;
  }
  public void setCompanyFirstRmb(java.lang.Double companyFirstRmb) {
    this.companyFirstRmb = companyFirstRmb;
  }
  
  public java.lang.Double getInterestRate() {
    return this.interestRate;
  }
  public void setInterestRate(java.lang.Double interestRate) {
    this.interestRate = interestRate;
  }
  
  public java.lang.Double getFutureAccrual() {
    return this.futureAccrual;
  }
  public void setFutureAccrual(java.lang.Double futureAccrual) {
    this.futureAccrual = futureAccrual;
  }
  
  public java.lang.String getFutureAccrualUnit() {
    return this.futureAccrualUnit;
  }
  public void setFutureAccrualUnit(java.lang.String futureAccrualUnit) {
    this.futureAccrualUnit = futureAccrualUnit;
  }
  
  public java.util.Date getFirstPayDate() {
    return this.firstPayDate;
  }
  public void setFirstPayDate(java.util.Date firstPayDate) {
    this.firstPayDate = firstPayDate;
  }
  
  public java.util.Date getFirstIssueDate() {
    return this.firstIssueDate;
  }
  public void setFirstIssueDate(java.util.Date firstIssueDate) {
    this.firstIssueDate = firstIssueDate;
  }
  
  public java.lang.Double getFirstDryQuantity() {
    return this.firstDryQuantity;
  }
  public void setFirstDryQuantity(java.lang.Double firstDryQuantity) {
    this.firstDryQuantity = firstDryQuantity;
  }
  
  public java.lang.Double getCompanyFirstFee() {
    return this.companyFirstFee;
  }
  public void setCompanyFirstFee(java.lang.Double companyFirstFee) {
    this.companyFirstFee = companyFirstFee;
  }
  
  public java.lang.String getCompanyFirstFeeUnit() {
    return this.companyFirstFeeUnit;
  }
  public void setCompanyFirstFeeUnit(java.lang.String companyFirstFeeUnit) {
    this.companyFirstFeeUnit = companyFirstFeeUnit;
  }
  
  public java.lang.Double getTransportEqualize() {
    return this.transportEqualize;
  }
  public void setTransportEqualize(java.lang.Double transportEqualize) {
    this.transportEqualize = transportEqualize;
  }
  
  public java.lang.String getTransportEqualizeUnit() {
    return this.transportEqualizeUnit;
  }
  public void setTransportEqualizeUnit(java.lang.String transportEqualizeUnit) {
    this.transportEqualizeUnit = transportEqualizeUnit;
  }
  
  public java.lang.Double getFinalTransportFee() {
    return this.finalTransportFee;
  }
  public void setFinalTransportFee(java.lang.Double finalTransportFee) {
    this.finalTransportFee = finalTransportFee;
  }
  
  public java.lang.String getFinalTransportFeeUnit() {
    return this.finalTransportFeeUnit;
  }
  public void setFinalTransportFeeUnit(java.lang.String finalTransportFeeUnit) {
    this.finalTransportFeeUnit = finalTransportFeeUnit;
  }
  
  public java.lang.Double getSecondPay() {
    return this.secondPay;
  }
  public void setSecondPay(java.lang.Double secondPay) {
    this.secondPay = secondPay;
  }
  
  public java.lang.String getSecondPayUnit() {
    return this.secondPayUnit;
  }
  public void setSecondPayUnit(java.lang.String secondPayUnit) {
    this.secondPayUnit = secondPayUnit;
  }
  
  public java.lang.Double getSecondPayRate() {
    return this.secondPayRate;
  }
  public void setSecondPayRate(java.lang.Double secondPayRate) {
    this.secondPayRate = secondPayRate;
  }
  
  public java.lang.Double getSecondPayRmb() {
    return this.secondPayRmb;
  }
  public void setSecondPayRmb(java.lang.Double secondPayRmb) {
    this.secondPayRmb = secondPayRmb;
  }
  
  public java.util.Date getSecondPayDate() {
    return this.secondPayDate;
  }
  public void setSecondPayDate(java.util.Date secondPayDate) {
    this.secondPayDate = secondPayDate;
  }
  
  public java.lang.Double getSettlementTailFee() {
    return this.settlementTailFee;
  }
  public void setSettlementTailFee(java.lang.Double settlementTailFee) {
    this.settlementTailFee = settlementTailFee;
  }
  
  public java.lang.String getSettlementTailFeeUnit() {
    return this.settlementTailFeeUnit;
  }
  public void setSettlementTailFeeUnit(java.lang.String settlementTailFeeUnit) {
    this.settlementTailFeeUnit = settlementTailFeeUnit;
  }
  
  public java.lang.Double getSettlementTailRate() {
    return this.settlementTailRate;
  }
  public void setSettlementTailRate(java.lang.Double settlementTailRate) {
    this.settlementTailRate = settlementTailRate;
  }
  
  public java.lang.Double getSettlementTailRmb() {
    return this.settlementTailRmb;
  }
  public void setSettlementTailRmb(java.lang.Double settlementTailRmb) {
    this.settlementTailRmb = settlementTailRmb;
  }
  
  public java.util.Date getTailFeeDate() {
    return this.tailFeeDate;
  }
  public void setTailFeeDate(java.util.Date tailFeeDate) {
    this.tailFeeDate = tailFeeDate;
  }
  
  public java.lang.Double getGaugeDiscount() {
    return this.gaugeDiscount;
  }
  public void setGaugeDiscount(java.lang.Double gaugeDiscount) {
    this.gaugeDiscount = gaugeDiscount;
  }
  
  public java.lang.String getGaugeDiscountUnit() {
    return this.gaugeDiscountUnit;
  }
  public void setGaugeDiscountUnit(java.lang.String gaugeDiscountUnit) {
    this.gaugeDiscountUnit = gaugeDiscountUnit;
  }
  
  public java.lang.Double getSettlementAssessmentCycle() {
    return this.settlementAssessmentCycle;
  }
  public void setSettlementAssessmentCycle(java.lang.Double settlementAssessmentCycle) {
    this.settlementAssessmentCycle = settlementAssessmentCycle;
  }
  
  public java.lang.Double getDrainEqualize() {
    return this.drainEqualize;
  }
  public void setDrainEqualize(java.lang.Double drainEqualize) {
    this.drainEqualize = drainEqualize;
  }
  
  public java.lang.String getDrainEqualizeUnit() {
    return this.drainEqualizeUnit;
  }
  public void setDrainEqualizeUnit(java.lang.String drainEqualizeUnit) {
    this.drainEqualizeUnit = drainEqualizeUnit;
  }
  
  public java.lang.Double getOceanFreightPrice() {
    return this.oceanFreightPrice;
  }
  public void setOceanFreightPrice(java.lang.Double oceanFreightPrice) {
    this.oceanFreightPrice = oceanFreightPrice;
  }
  
  public java.lang.String getRemarks() {
    return this.remarks;
  }
  public void setRemarks(java.lang.String remarks) {
    this.remarks = remarks;
  }
  
  public java.lang.String getFfb010t020pArchived() {
    return this.ffb010t020pArchived;
  }
  public void setFfb010t020pArchived(java.lang.String ffb010t020pArchived) {
    this.ffb010t020pArchived = ffb010t020pArchived;
  }
  
  public java.lang.String getInsuranceCompany() {
    return this.insuranceCompany;
  }
  public void setInsuranceCompany(java.lang.String insuranceCompany) {
    this.insuranceCompany = insuranceCompany;
  }
  
  public java.lang.Double getInsuranceFee() {
    return this.insuranceFee;
  }
  public void setInsuranceFee(java.lang.Double insuranceFee) {
    this.insuranceFee = insuranceFee;
  }
  
  public java.lang.String getInsuranceFeeUnit() {
    return this.insuranceFeeUnit;
  }
  public void setInsuranceFeeUnit(java.lang.String insuranceFeeUnit) {
    this.insuranceFeeUnit = insuranceFeeUnit;
  }
  
  public java.lang.String getFfb010t030pArchived() {
    return this.ffb010t030pArchived;
  }
  public void setFfb010t030pArchived(java.lang.String ffb010t030pArchived) {
    this.ffb010t030pArchived = ffb010t030pArchived;
  }
  
  public java.lang.String getLcNumber() {
    return this.lcNumber;
  }
  public void setLcNumber(java.lang.String lcNumber) {
    this.lcNumber = lcNumber;
  }
  
  public java.lang.Double getDocumentaryBillsInterest() {
    return this.documentaryBillsInterest;
  }
  public void setDocumentaryBillsInterest(java.lang.Double documentaryBillsInterest) {
    this.documentaryBillsInterest = documentaryBillsInterest;
  }
  
  public java.lang.Double getDocumentaryBillsHike() {
    return this.documentaryBillsHike;
  }
  public void setDocumentaryBillsHike(java.lang.Double documentaryBillsHike) {
    this.documentaryBillsHike = documentaryBillsHike;
  }
  
  public java.lang.Double getCapitalOccupationFee() {
    return this.capitalOccupationFee;
  }
  public void setCapitalOccupationFee(java.lang.Double capitalOccupationFee) {
    this.capitalOccupationFee = capitalOccupationFee;
  }
  
  public java.lang.Double getOpeningCharge() {
    return this.openingCharge;
  }
  public void setOpeningCharge(java.lang.Double openingCharge) {
    this.openingCharge = openingCharge;
  }
  
  public java.lang.Double getAcceptingCharge() {
    return this.acceptingCharge;
  }
  public void setAcceptingCharge(java.lang.Double acceptingCharge) {
    this.acceptingCharge = acceptingCharge;
  }
  
  public java.lang.Double getCustomsGuaranteeFee() {
    return this.customsGuaranteeFee;
  }
  public void setCustomsGuaranteeFee(java.lang.Double customsGuaranteeFee) {
    this.customsGuaranteeFee = customsGuaranteeFee;
  }
  
  public java.lang.Double getAgentServiceFee() {
    return this.agentServiceFee;
  }
  public void setAgentServiceFee(java.lang.Double agentServiceFee) {
    this.agentServiceFee = agentServiceFee;
  }
  
  public java.lang.Long getExtensionPeriod() {
    return this.extensionPeriod;
  }
  public void setExtensionPeriod(java.lang.Long extensionPeriod) {
    this.extensionPeriod = extensionPeriod;
  }
  
  public java.util.Date getExtensionDate() {
    return this.extensionDate;
  }
  public void setExtensionDate(java.util.Date extensionDate) {
    this.extensionDate = extensionDate;
  }
  
  public java.lang.Double getExtensionAmount() {
    return this.extensionAmount;
  }
  public void setExtensionAmount(java.lang.Double extensionAmount) {
    this.extensionAmount = extensionAmount;
  }
  
  public java.lang.Double getExtensionRate() {
    return this.extensionRate;
  }
  public void setExtensionRate(java.lang.Double extensionRate) {
    this.extensionRate = extensionRate;
  }
  
  public java.lang.Double getExtensionInterest() {
    return this.extensionInterest;
  }
  public void setExtensionInterest(java.lang.Double extensionInterest) {
    this.extensionInterest = extensionInterest;
  }
  
  public java.lang.String getExtensionExecuteUnit() {
    return this.extensionExecuteUnit;
  }
  public void setExtensionExecuteUnit(java.lang.String extensionExecuteUnit) {
    this.extensionExecuteUnit = extensionExecuteUnit;
  }
  
  public java.lang.Double getIssuePrice() {
    return this.issuePrice;
  }
  public void setIssuePrice(java.lang.Double issuePrice) {
    this.issuePrice = issuePrice;
  }
  
  public java.lang.String getIssuePriceUnit() {
    return this.issuePriceUnit;
  }
  public void setIssuePriceUnit(java.lang.String issuePriceUnit) {
    this.issuePriceUnit = issuePriceUnit;
  }
  
  public java.lang.String getDryTonPrice() {
    return this.dryTonPrice;
  }
  public void setDryTonPrice(java.lang.String dryTonPrice) {
    this.dryTonPrice = dryTonPrice;
  }
  
  public java.lang.String getCreditTfe() {
    return this.creditTfe;
  }
  public void setCreditTfe(java.lang.String creditTfe) {
    this.creditTfe = creditTfe;
  }
  
  public java.lang.String getPobPrice() {
    return this.pobPrice;
  }
  public void setPobPrice(java.lang.String pobPrice) {
    this.pobPrice = pobPrice;
  }
  
  public java.lang.String getCfrPrice() {
    return this.cfrPrice;
  }
  public void setCfrPrice(java.lang.String cfrPrice) {
    this.cfrPrice = cfrPrice;
  }
  
}