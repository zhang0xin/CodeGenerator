package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("采购资源")
public class Ffb010tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("合同号")
  private TString contractNumber;
  
  @Comment("船运批次")
  private TString shipBatchId;
  
  @Comment("采购批次")
  private TString purchaseBatchId;
  
  @Comment("贸易类型")
  private TString tradeType;
  
  @Comment("矿石产区")
  private TString oreArea;
  
  @Comment("资源种类")
  private TString materialCategory;
  
  @Comment("物料名称")
  private TString materialId;
  
  @Comment("TFe")
  private TString tfe;
  
  @Comment("H2O")
  private TString h2o;
  
  @Comment("SiO2")
  private TString sio2;
  
  @Comment("Al2O3")
  private TString al2o3;
  
  @Comment("SiO2+Al2O3")
  private TString sio2Al2o3;
  
  @Comment("P")
  private TString p;
  
  @Comment("S")
  private TString s;
  
  @Comment("粒度")
  private TString other;
  
  @Comment("定价模式")
  private TString price;
  
  @Comment("采购量")
  private TDecimal purchaseQuantity;
  
  @Comment("单位")
  private TString unit;
  
  @Comment("装港日期")
  private TDate portLoadDate;
  
  @Comment("装港名称")
  private TString portLoadName;
  
  @Comment("到港日期")
  private TDate portArrivedDate;
  
  @Comment("到港名称")
  private TString portArrivedName;
  
  @Comment("买方（最终用户）")
  private TString buyer;
  
  @Comment("卖方（矿山/供应商）")
  private TString seller;
  
  @Comment("资源位置")
  private TString resourceLocation;
  
  @Comment("审批状态")
  private TString auditState;
  
  @Comment("可见部门")
  private TString visibleDepartment;
  
  @Comment("B/L量")
  private TDecimal blAmount;
  
  @Comment("B/L日")
  private TDate blDate;
  
  @Comment("结算吨度价")
  private TDecimal settlementPrice;
  
  @Comment("结算吨度价币种")
  private TString settlementPriceUnit;
  
  @Comment("单船结算价")
  private TDecimal shipSettlementPrice;
  
  @Comment("单船结算价币种")
  private TString shipSettlementPriceUnit;
  
  @Comment("结算Fe")
  private TDecimal finalFe;
  
  @Comment("结算H2O")
  private TDecimal finalH2o;
  
  @Comment("结算开始日")
  private TDate settlementStartDate;
  
  @Comment("结算重量")
  private TDecimal settlementQuantity;
  
  @Comment("LC或托收首款（含息）")
  private TDecimal lcFirstFee;
  
  @Comment("LC或托收首款（含息）币种")
  private TString lcFirstFeeUnit;
  
  @Comment("首款汇率")
  private TDecimal companyFirstRate;
  
  @Comment("首款人民币")
  private TDecimal companyFirstRmb;
  
  @Comment("信用证利率")
  private TDecimal interestRate;
  
  @Comment("远期利息")
  private TDecimal futureAccrual;
  
  @Comment("远期利息币种")
  private TString futureAccrualUnit;
  
  @Comment("首款付款日")
  private TDate firstPayDate;
  
  @Comment("首款到单日")
  private TDate firstIssueDate;
  
  @Comment("首款干吨")
  private TDecimal firstDryQuantity;
  
  @Comment("矿山公司首款金额")
  private TDecimal companyFirstFee;
  
  @Comment("矿山公司首款金额币种")
  private TString companyFirstFeeUnit;
  
  @Comment("运费补偿")
  private TDecimal transportEqualize;
  
  @Comment("运费补偿币种")
  private TString transportEqualizeUnit;
  
  @Comment("最终运费")
  private TDecimal finalTransportFee;
  
  @Comment("最终运费币种")
  private TString finalTransportFeeUnit;
  
  @Comment("二次货款额")
  private TDecimal secondPay;
  
  @Comment("二次货款额币种")
  private TString secondPayUnit;
  
  @Comment("二次货款汇率")
  private TDecimal secondPayRate;
  
  @Comment("二次货款额人民币")
  private TDecimal secondPayRmb;
  
  @Comment("二次货款付款日")
  private TDate secondPayDate;
  
  @Comment("结算尾款（含滞期速遣费）")
  private TDecimal settlementTailFee;
  
  @Comment("结算尾款（含滞期速遣费）币种")
  private TString settlementTailFeeUnit;
  
  @Comment("尾款汇率")
  private TDecimal settlementTailRate;
  
  @Comment("尾款人民币")
  private TDecimal settlementTailRmb;
  
  @Comment("尾款付款日")
  private TDate tailFeeDate;
  
  @Comment("水尺优惠")
  private TDecimal gaugeDiscount;
  
  @Comment("水尺优惠币种")
  private TString gaugeDiscountUnit;
  
  @Comment("结算考核周期")
  private TDecimal settlementAssessmentCycle;
  
  @Comment("FOB排水运费补偿")
  private TDecimal drainEqualize;
  
  @Comment("FOB排水运费补偿币种")
  private TString drainEqualizeUnit;
  
  @Comment("海运费单价")
  private TDecimal oceanFreightPrice;
  
  @Comment("备注")
  private TString remarks;
  
  @Comment("归档")
  private TString ffb010t020pArchived;
  
  @Comment("保险公司")
  private TString insuranceCompany;
  
  @Comment("保险费")
  private TDecimal insuranceFee;
  
  @Comment("保险费币种")
  private TString insuranceFeeUnit;
  
  @Comment("归档")
  private TString ffb010t030pArchived;
  
  @Comment("L/C号码")
  private TString lcNumber;
  
  @Comment("押汇利息")
  private TDecimal documentaryBillsInterest;
  
  @Comment("押汇加息")
  private TDecimal documentaryBillsHike;
  
  @Comment("资金占用费")
  private TDecimal capitalOccupationFee;
  
  @Comment("开证费")
  private TDecimal openingCharge;
  
  @Comment("承兑费")
  private TDecimal acceptingCharge;
  
  @Comment("关税保函费")
  private TDecimal customsGuaranteeFee;
  
  @Comment("代理服务费")
  private TDecimal agentServiceFee;
  
  @Comment("展期期限/天")
  private TLong extensionPeriod;
  
  @Comment("展期到期日")
  private TDate extensionDate;
  
  @Comment("展期金额")
  private TDecimal extensionAmount;
  
  @Comment("展期利率")
  private TDecimal extensionRate;
  
  @Comment("展期利息")
  private TDecimal extensionInterest;
  
  @Comment("展期执行单位")
  private TString extensionExecuteUnit;
  
  @Comment("开证单价")
  private TDecimal issuePrice;
  
  @Comment("开证单价币种")
  private TString issuePriceUnit;
  
  @Comment("吨度价")
  private TString dryTonPrice;
  
  @Comment("TFe")
  private TString creditTfe;
  
  @Comment("FOB价")
  private TString pobPrice;
  
  @Comment("CFR价")
  private TString cfrPrice;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb010tFrame() {
  }

  
  public TString getContractNumber() {
    return this.contractNumber;
  }
  public void setContractNumber(TString contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public TString getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(TString shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public TString getPurchaseBatchId() {
    return this.purchaseBatchId;
  }
  public void setPurchaseBatchId(TString purchaseBatchId) {
    this.purchaseBatchId = purchaseBatchId;
  }
  
  public TString getTradeType() {
    return this.tradeType;
  }
  public void setTradeType(TString tradeType) {
    this.tradeType = tradeType;
  }
  
  public TString getOreArea() {
    return this.oreArea;
  }
  public void setOreArea(TString oreArea) {
    this.oreArea = oreArea;
  }
  
  public TString getMaterialCategory() {
    return this.materialCategory;
  }
  public void setMaterialCategory(TString materialCategory) {
    this.materialCategory = materialCategory;
  }
  
  public TString getMaterialId() {
    return this.materialId;
  }
  public void setMaterialId(TString materialId) {
    this.materialId = materialId;
  }
  
  public TString getTfe() {
    return this.tfe;
  }
  public void setTfe(TString tfe) {
    this.tfe = tfe;
  }
  
  public TString getH2o() {
    return this.h2o;
  }
  public void setH2o(TString h2o) {
    this.h2o = h2o;
  }
  
  public TString getSio2() {
    return this.sio2;
  }
  public void setSio2(TString sio2) {
    this.sio2 = sio2;
  }
  
  public TString getAl2o3() {
    return this.al2o3;
  }
  public void setAl2o3(TString al2o3) {
    this.al2o3 = al2o3;
  }
  
  public TString getSio2Al2o3() {
    return this.sio2Al2o3;
  }
  public void setSio2Al2o3(TString sio2Al2o3) {
    this.sio2Al2o3 = sio2Al2o3;
  }
  
  public TString getP() {
    return this.p;
  }
  public void setP(TString p) {
    this.p = p;
  }
  
  public TString getS() {
    return this.s;
  }
  public void setS(TString s) {
    this.s = s;
  }
  
  public TString getOther() {
    return this.other;
  }
  public void setOther(TString other) {
    this.other = other;
  }
  
  public TString getPrice() {
    return this.price;
  }
  public void setPrice(TString price) {
    this.price = price;
  }
  
  public TDecimal getPurchaseQuantity() {
    return this.purchaseQuantity;
  }
  public void setPurchaseQuantity(TDecimal purchaseQuantity) {
    this.purchaseQuantity = purchaseQuantity;
  }
  
  public TString getUnit() {
    return this.unit;
  }
  public void setUnit(TString unit) {
    this.unit = unit;
  }
  
  public TDate getPortLoadDate() {
    return this.portLoadDate;
  }
  public void setPortLoadDate(TDate portLoadDate) {
    this.portLoadDate = portLoadDate;
  }
  
  public TString getPortLoadName() {
    return this.portLoadName;
  }
  public void setPortLoadName(TString portLoadName) {
    this.portLoadName = portLoadName;
  }
  
  public TDate getPortArrivedDate() {
    return this.portArrivedDate;
  }
  public void setPortArrivedDate(TDate portArrivedDate) {
    this.portArrivedDate = portArrivedDate;
  }
  
  public TString getPortArrivedName() {
    return this.portArrivedName;
  }
  public void setPortArrivedName(TString portArrivedName) {
    this.portArrivedName = portArrivedName;
  }
  
  public TString getBuyer() {
    return this.buyer;
  }
  public void setBuyer(TString buyer) {
    this.buyer = buyer;
  }
  
  public TString getSeller() {
    return this.seller;
  }
  public void setSeller(TString seller) {
    this.seller = seller;
  }
  
  public TString getResourceLocation() {
    return this.resourceLocation;
  }
  public void setResourceLocation(TString resourceLocation) {
    this.resourceLocation = resourceLocation;
  }
  
  public TString getAuditState() {
    return this.auditState;
  }
  public void setAuditState(TString auditState) {
    this.auditState = auditState;
  }
  
  public TString getVisibleDepartment() {
    return this.visibleDepartment;
  }
  public void setVisibleDepartment(TString visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
  public TDecimal getBlAmount() {
    return this.blAmount;
  }
  public void setBlAmount(TDecimal blAmount) {
    this.blAmount = blAmount;
  }
  
  public TDate getBlDate() {
    return this.blDate;
  }
  public void setBlDate(TDate blDate) {
    this.blDate = blDate;
  }
  
  public TDecimal getSettlementPrice() {
    return this.settlementPrice;
  }
  public void setSettlementPrice(TDecimal settlementPrice) {
    this.settlementPrice = settlementPrice;
  }
  
  public TString getSettlementPriceUnit() {
    return this.settlementPriceUnit;
  }
  public void setSettlementPriceUnit(TString settlementPriceUnit) {
    this.settlementPriceUnit = settlementPriceUnit;
  }
  
  public TDecimal getShipSettlementPrice() {
    return this.shipSettlementPrice;
  }
  public void setShipSettlementPrice(TDecimal shipSettlementPrice) {
    this.shipSettlementPrice = shipSettlementPrice;
  }
  
  public TString getShipSettlementPriceUnit() {
    return this.shipSettlementPriceUnit;
  }
  public void setShipSettlementPriceUnit(TString shipSettlementPriceUnit) {
    this.shipSettlementPriceUnit = shipSettlementPriceUnit;
  }
  
  public TDecimal getFinalFe() {
    return this.finalFe;
  }
  public void setFinalFe(TDecimal finalFe) {
    this.finalFe = finalFe;
  }
  
  public TDecimal getFinalH2o() {
    return this.finalH2o;
  }
  public void setFinalH2o(TDecimal finalH2o) {
    this.finalH2o = finalH2o;
  }
  
  public TDate getSettlementStartDate() {
    return this.settlementStartDate;
  }
  public void setSettlementStartDate(TDate settlementStartDate) {
    this.settlementStartDate = settlementStartDate;
  }
  
  public TDecimal getSettlementQuantity() {
    return this.settlementQuantity;
  }
  public void setSettlementQuantity(TDecimal settlementQuantity) {
    this.settlementQuantity = settlementQuantity;
  }
  
  public TDecimal getLcFirstFee() {
    return this.lcFirstFee;
  }
  public void setLcFirstFee(TDecimal lcFirstFee) {
    this.lcFirstFee = lcFirstFee;
  }
  
  public TString getLcFirstFeeUnit() {
    return this.lcFirstFeeUnit;
  }
  public void setLcFirstFeeUnit(TString lcFirstFeeUnit) {
    this.lcFirstFeeUnit = lcFirstFeeUnit;
  }
  
  public TDecimal getCompanyFirstRate() {
    return this.companyFirstRate;
  }
  public void setCompanyFirstRate(TDecimal companyFirstRate) {
    this.companyFirstRate = companyFirstRate;
  }
  
  public TDecimal getCompanyFirstRmb() {
    return this.companyFirstRmb;
  }
  public void setCompanyFirstRmb(TDecimal companyFirstRmb) {
    this.companyFirstRmb = companyFirstRmb;
  }
  
  public TDecimal getInterestRate() {
    return this.interestRate;
  }
  public void setInterestRate(TDecimal interestRate) {
    this.interestRate = interestRate;
  }
  
  public TDecimal getFutureAccrual() {
    return this.futureAccrual;
  }
  public void setFutureAccrual(TDecimal futureAccrual) {
    this.futureAccrual = futureAccrual;
  }
  
  public TString getFutureAccrualUnit() {
    return this.futureAccrualUnit;
  }
  public void setFutureAccrualUnit(TString futureAccrualUnit) {
    this.futureAccrualUnit = futureAccrualUnit;
  }
  
  public TDate getFirstPayDate() {
    return this.firstPayDate;
  }
  public void setFirstPayDate(TDate firstPayDate) {
    this.firstPayDate = firstPayDate;
  }
  
  public TDate getFirstIssueDate() {
    return this.firstIssueDate;
  }
  public void setFirstIssueDate(TDate firstIssueDate) {
    this.firstIssueDate = firstIssueDate;
  }
  
  public TDecimal getFirstDryQuantity() {
    return this.firstDryQuantity;
  }
  public void setFirstDryQuantity(TDecimal firstDryQuantity) {
    this.firstDryQuantity = firstDryQuantity;
  }
  
  public TDecimal getCompanyFirstFee() {
    return this.companyFirstFee;
  }
  public void setCompanyFirstFee(TDecimal companyFirstFee) {
    this.companyFirstFee = companyFirstFee;
  }
  
  public TString getCompanyFirstFeeUnit() {
    return this.companyFirstFeeUnit;
  }
  public void setCompanyFirstFeeUnit(TString companyFirstFeeUnit) {
    this.companyFirstFeeUnit = companyFirstFeeUnit;
  }
  
  public TDecimal getTransportEqualize() {
    return this.transportEqualize;
  }
  public void setTransportEqualize(TDecimal transportEqualize) {
    this.transportEqualize = transportEqualize;
  }
  
  public TString getTransportEqualizeUnit() {
    return this.transportEqualizeUnit;
  }
  public void setTransportEqualizeUnit(TString transportEqualizeUnit) {
    this.transportEqualizeUnit = transportEqualizeUnit;
  }
  
  public TDecimal getFinalTransportFee() {
    return this.finalTransportFee;
  }
  public void setFinalTransportFee(TDecimal finalTransportFee) {
    this.finalTransportFee = finalTransportFee;
  }
  
  public TString getFinalTransportFeeUnit() {
    return this.finalTransportFeeUnit;
  }
  public void setFinalTransportFeeUnit(TString finalTransportFeeUnit) {
    this.finalTransportFeeUnit = finalTransportFeeUnit;
  }
  
  public TDecimal getSecondPay() {
    return this.secondPay;
  }
  public void setSecondPay(TDecimal secondPay) {
    this.secondPay = secondPay;
  }
  
  public TString getSecondPayUnit() {
    return this.secondPayUnit;
  }
  public void setSecondPayUnit(TString secondPayUnit) {
    this.secondPayUnit = secondPayUnit;
  }
  
  public TDecimal getSecondPayRate() {
    return this.secondPayRate;
  }
  public void setSecondPayRate(TDecimal secondPayRate) {
    this.secondPayRate = secondPayRate;
  }
  
  public TDecimal getSecondPayRmb() {
    return this.secondPayRmb;
  }
  public void setSecondPayRmb(TDecimal secondPayRmb) {
    this.secondPayRmb = secondPayRmb;
  }
  
  public TDate getSecondPayDate() {
    return this.secondPayDate;
  }
  public void setSecondPayDate(TDate secondPayDate) {
    this.secondPayDate = secondPayDate;
  }
  
  public TDecimal getSettlementTailFee() {
    return this.settlementTailFee;
  }
  public void setSettlementTailFee(TDecimal settlementTailFee) {
    this.settlementTailFee = settlementTailFee;
  }
  
  public TString getSettlementTailFeeUnit() {
    return this.settlementTailFeeUnit;
  }
  public void setSettlementTailFeeUnit(TString settlementTailFeeUnit) {
    this.settlementTailFeeUnit = settlementTailFeeUnit;
  }
  
  public TDecimal getSettlementTailRate() {
    return this.settlementTailRate;
  }
  public void setSettlementTailRate(TDecimal settlementTailRate) {
    this.settlementTailRate = settlementTailRate;
  }
  
  public TDecimal getSettlementTailRmb() {
    return this.settlementTailRmb;
  }
  public void setSettlementTailRmb(TDecimal settlementTailRmb) {
    this.settlementTailRmb = settlementTailRmb;
  }
  
  public TDate getTailFeeDate() {
    return this.tailFeeDate;
  }
  public void setTailFeeDate(TDate tailFeeDate) {
    this.tailFeeDate = tailFeeDate;
  }
  
  public TDecimal getGaugeDiscount() {
    return this.gaugeDiscount;
  }
  public void setGaugeDiscount(TDecimal gaugeDiscount) {
    this.gaugeDiscount = gaugeDiscount;
  }
  
  public TString getGaugeDiscountUnit() {
    return this.gaugeDiscountUnit;
  }
  public void setGaugeDiscountUnit(TString gaugeDiscountUnit) {
    this.gaugeDiscountUnit = gaugeDiscountUnit;
  }
  
  public TDecimal getSettlementAssessmentCycle() {
    return this.settlementAssessmentCycle;
  }
  public void setSettlementAssessmentCycle(TDecimal settlementAssessmentCycle) {
    this.settlementAssessmentCycle = settlementAssessmentCycle;
  }
  
  public TDecimal getDrainEqualize() {
    return this.drainEqualize;
  }
  public void setDrainEqualize(TDecimal drainEqualize) {
    this.drainEqualize = drainEqualize;
  }
  
  public TString getDrainEqualizeUnit() {
    return this.drainEqualizeUnit;
  }
  public void setDrainEqualizeUnit(TString drainEqualizeUnit) {
    this.drainEqualizeUnit = drainEqualizeUnit;
  }
  
  public TDecimal getOceanFreightPrice() {
    return this.oceanFreightPrice;
  }
  public void setOceanFreightPrice(TDecimal oceanFreightPrice) {
    this.oceanFreightPrice = oceanFreightPrice;
  }
  
  public TString getRemarks() {
    return this.remarks;
  }
  public void setRemarks(TString remarks) {
    this.remarks = remarks;
  }
  
  public TString getFfb010t020pArchived() {
    return this.ffb010t020pArchived;
  }
  public void setFfb010t020pArchived(TString ffb010t020pArchived) {
    this.ffb010t020pArchived = ffb010t020pArchived;
  }
  
  public TString getInsuranceCompany() {
    return this.insuranceCompany;
  }
  public void setInsuranceCompany(TString insuranceCompany) {
    this.insuranceCompany = insuranceCompany;
  }
  
  public TDecimal getInsuranceFee() {
    return this.insuranceFee;
  }
  public void setInsuranceFee(TDecimal insuranceFee) {
    this.insuranceFee = insuranceFee;
  }
  
  public TString getInsuranceFeeUnit() {
    return this.insuranceFeeUnit;
  }
  public void setInsuranceFeeUnit(TString insuranceFeeUnit) {
    this.insuranceFeeUnit = insuranceFeeUnit;
  }
  
  public TString getFfb010t030pArchived() {
    return this.ffb010t030pArchived;
  }
  public void setFfb010t030pArchived(TString ffb010t030pArchived) {
    this.ffb010t030pArchived = ffb010t030pArchived;
  }
  
  public TString getLcNumber() {
    return this.lcNumber;
  }
  public void setLcNumber(TString lcNumber) {
    this.lcNumber = lcNumber;
  }
  
  public TDecimal getDocumentaryBillsInterest() {
    return this.documentaryBillsInterest;
  }
  public void setDocumentaryBillsInterest(TDecimal documentaryBillsInterest) {
    this.documentaryBillsInterest = documentaryBillsInterest;
  }
  
  public TDecimal getDocumentaryBillsHike() {
    return this.documentaryBillsHike;
  }
  public void setDocumentaryBillsHike(TDecimal documentaryBillsHike) {
    this.documentaryBillsHike = documentaryBillsHike;
  }
  
  public TDecimal getCapitalOccupationFee() {
    return this.capitalOccupationFee;
  }
  public void setCapitalOccupationFee(TDecimal capitalOccupationFee) {
    this.capitalOccupationFee = capitalOccupationFee;
  }
  
  public TDecimal getOpeningCharge() {
    return this.openingCharge;
  }
  public void setOpeningCharge(TDecimal openingCharge) {
    this.openingCharge = openingCharge;
  }
  
  public TDecimal getAcceptingCharge() {
    return this.acceptingCharge;
  }
  public void setAcceptingCharge(TDecimal acceptingCharge) {
    this.acceptingCharge = acceptingCharge;
  }
  
  public TDecimal getCustomsGuaranteeFee() {
    return this.customsGuaranteeFee;
  }
  public void setCustomsGuaranteeFee(TDecimal customsGuaranteeFee) {
    this.customsGuaranteeFee = customsGuaranteeFee;
  }
  
  public TDecimal getAgentServiceFee() {
    return this.agentServiceFee;
  }
  public void setAgentServiceFee(TDecimal agentServiceFee) {
    this.agentServiceFee = agentServiceFee;
  }
  
  public TLong getExtensionPeriod() {
    return this.extensionPeriod;
  }
  public void setExtensionPeriod(TLong extensionPeriod) {
    this.extensionPeriod = extensionPeriod;
  }
  
  public TDate getExtensionDate() {
    return this.extensionDate;
  }
  public void setExtensionDate(TDate extensionDate) {
    this.extensionDate = extensionDate;
  }
  
  public TDecimal getExtensionAmount() {
    return this.extensionAmount;
  }
  public void setExtensionAmount(TDecimal extensionAmount) {
    this.extensionAmount = extensionAmount;
  }
  
  public TDecimal getExtensionRate() {
    return this.extensionRate;
  }
  public void setExtensionRate(TDecimal extensionRate) {
    this.extensionRate = extensionRate;
  }
  
  public TDecimal getExtensionInterest() {
    return this.extensionInterest;
  }
  public void setExtensionInterest(TDecimal extensionInterest) {
    this.extensionInterest = extensionInterest;
  }
  
  public TString getExtensionExecuteUnit() {
    return this.extensionExecuteUnit;
  }
  public void setExtensionExecuteUnit(TString extensionExecuteUnit) {
    this.extensionExecuteUnit = extensionExecuteUnit;
  }
  
  public TDecimal getIssuePrice() {
    return this.issuePrice;
  }
  public void setIssuePrice(TDecimal issuePrice) {
    this.issuePrice = issuePrice;
  }
  
  public TString getIssuePriceUnit() {
    return this.issuePriceUnit;
  }
  public void setIssuePriceUnit(TString issuePriceUnit) {
    this.issuePriceUnit = issuePriceUnit;
  }
  
  public TString getDryTonPrice() {
    return this.dryTonPrice;
  }
  public void setDryTonPrice(TString dryTonPrice) {
    this.dryTonPrice = dryTonPrice;
  }
  
  public TString getCreditTfe() {
    return this.creditTfe;
  }
  public void setCreditTfe(TString creditTfe) {
    this.creditTfe = creditTfe;
  }
  
  public TString getPobPrice() {
    return this.pobPrice;
  }
  public void setPobPrice(TString pobPrice) {
    this.pobPrice = pobPrice;
  }
  
  public TString getCfrPrice() {
    return this.cfrPrice;
  }
  public void setCfrPrice(TString cfrPrice) {
    this.cfrPrice = cfrPrice;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}