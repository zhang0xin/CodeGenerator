package com.ysusoft.frame.purchase;

import com.ysusoft.annotations.Comment;

@Comment("船运批次")
public class Ffb020tFrame<TLong, TDecimal, TString, TDate> extends BaseFrame {
  
  @Comment("船运批次")
  private TString shipBatchId;
  
  @Comment("船编号")
  private TString shipNumber;
  
  @Comment("L/C号码")
  private TString lcNumber;
  
  @Comment("装港名称")
  private TString portLoadName;
  
  @Comment("装港船代")
  private TString portLoadShipAgent;
  
  @Comment("装港对卖方滞期天数")
  private TLong sellerDelayDays;
  
  @Comment("装港对卖方滞期费")
  private TDecimal sellerDelayFee;
  
  @Comment("装港对卖方滞期费币种")
  private TString sellerDelayFeeUnit;
  
  @Comment("装港对船东滞期费")
  private TDecimal portLoadDelayFee;
  
  @Comment("装港对船东滞期费币种")
  private TString portLoadDelayFeeUnit;
  
  @Comment("装港开始时间")
  private TDate portLoadStartDate;
  
  @Comment("装港结束时间")
  private TDate portLoadEndDate;
  
  @Comment("首款海运费单价")
  private TDecimal seaFirstSingleFee;
  
  @Comment("首款海运费单价币种")
  private TString seaFirstSingleFeeUnit;
  
  @Comment("尾款海运费单价")
  private TDecimal seaLastSingleFee;
  
  @Comment("尾款海运费单价币种")
  private TString seaLastSingleFeeUnit;
  
  @Comment("油调单价")
  private TDecimal oilAdjustSingleFee;
  
  @Comment("油调单价币种")
  private TString oilAdjustSingleFeeUnit;
  
  @Comment("基价")
  private TDecimal baseFee;
  
  @Comment("基价币种")
  private TString baseFeeUnit;
  
  @Comment("港口调整")
  private TDecimal portAdjust;
  
  @Comment("港口调整币种")
  private TString portAdjustUnit;
  
  @Comment("油价调整")
  private TDecimal oilAdjustFee;
  
  @Comment("油价调整币种")
  private TString oilAdjustFeeUnit;
  
  @Comment("运费单价")
  private TDecimal transportFee;
  
  @Comment("运费单价币种")
  private TString transportFeeUnit;
  
  @Comment("运费首款额")
  private TDecimal transportFirstFee;
  
  @Comment("运费首款额币种")
  private TString transportFirstFeeUnit;
  
  @Comment("付船东首款日期")
  private TDate shipownerFirstFeeDate;
  
  @Comment("运费尾款额")
  private TDecimal transportLastFee;
  
  @Comment("运费尾款额币种")
  private TString transportLastFeeUnit;
  
  @Comment("付船东尾款日期")
  private TDate shipownerLastFeeDate;
  
  @Comment("收租家首款运费/美元")
  private TDecimal rentShipFirstFee;
  
  @Comment("首款收到运费日")
  private TDate transportFirstFeeDate;
  
  @Comment("海运费尾款/美元")
  private TDecimal seaLastFee;
  
  @Comment("尾款出票日")
  private TDate lastIssueDate;
  
  @Comment("海运费单价/美元")
  private TDecimal unitSeaFee;
  
  @Comment("装卸港调整/美元")
  private TDecimal loadUnloadAdjust;
  
  @Comment("油调单价/美元")
  private TDecimal uintOilAdjustFee;
  
  @Comment("付船东首款运费/美元")
  private TDecimal seaFirstFee;
  
  @Comment("付船东尾款运费/美元")
  private TDecimal voyageShipownerFee;
  
  @Comment("收租家尾款运费/美元")
  private TDecimal voyageRentFee;
  
  @Comment("运费单价/美元")
  private TDecimal unitTransportFee;
  
  @Comment("最终运费收付差额/美元")
  private TDecimal lastTransportFee;
  
  @Comment("结算结束日")
  private TDate settlementDate;
  
  @Comment("COA与外转运费差额/美元")
  private TDecimal coaDifference;
  
  @Comment("当时汇率")
  private TDecimal exchangeRate;
  
  @Comment("最终收货人")
  private TString finalReceiver;
  
  @Comment("归档")
  private TString ffb020t050pArchived;
  
  @Comment("当前位置")
  private TString currentLocation;
  
  @Comment("预计到新加坡日期")
  private TDate arrivedSingaporeDate;
  
  @Comment("预计卸港日期")
  private TDate unloadDate;
  
  @Comment("归档")
  private TString archived;
  

  public Ffb020tFrame() {
  }

  
  public TString getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(TString shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public TString getShipNumber() {
    return this.shipNumber;
  }
  public void setShipNumber(TString shipNumber) {
    this.shipNumber = shipNumber;
  }
  
  public TString getLcNumber() {
    return this.lcNumber;
  }
  public void setLcNumber(TString lcNumber) {
    this.lcNumber = lcNumber;
  }
  
  public TString getPortLoadName() {
    return this.portLoadName;
  }
  public void setPortLoadName(TString portLoadName) {
    this.portLoadName = portLoadName;
  }
  
  public TString getPortLoadShipAgent() {
    return this.portLoadShipAgent;
  }
  public void setPortLoadShipAgent(TString portLoadShipAgent) {
    this.portLoadShipAgent = portLoadShipAgent;
  }
  
  public TLong getSellerDelayDays() {
    return this.sellerDelayDays;
  }
  public void setSellerDelayDays(TLong sellerDelayDays) {
    this.sellerDelayDays = sellerDelayDays;
  }
  
  public TDecimal getSellerDelayFee() {
    return this.sellerDelayFee;
  }
  public void setSellerDelayFee(TDecimal sellerDelayFee) {
    this.sellerDelayFee = sellerDelayFee;
  }
  
  public TString getSellerDelayFeeUnit() {
    return this.sellerDelayFeeUnit;
  }
  public void setSellerDelayFeeUnit(TString sellerDelayFeeUnit) {
    this.sellerDelayFeeUnit = sellerDelayFeeUnit;
  }
  
  public TDecimal getPortLoadDelayFee() {
    return this.portLoadDelayFee;
  }
  public void setPortLoadDelayFee(TDecimal portLoadDelayFee) {
    this.portLoadDelayFee = portLoadDelayFee;
  }
  
  public TString getPortLoadDelayFeeUnit() {
    return this.portLoadDelayFeeUnit;
  }
  public void setPortLoadDelayFeeUnit(TString portLoadDelayFeeUnit) {
    this.portLoadDelayFeeUnit = portLoadDelayFeeUnit;
  }
  
  public TDate getPortLoadStartDate() {
    return this.portLoadStartDate;
  }
  public void setPortLoadStartDate(TDate portLoadStartDate) {
    this.portLoadStartDate = portLoadStartDate;
  }
  
  public TDate getPortLoadEndDate() {
    return this.portLoadEndDate;
  }
  public void setPortLoadEndDate(TDate portLoadEndDate) {
    this.portLoadEndDate = portLoadEndDate;
  }
  
  public TDecimal getSeaFirstSingleFee() {
    return this.seaFirstSingleFee;
  }
  public void setSeaFirstSingleFee(TDecimal seaFirstSingleFee) {
    this.seaFirstSingleFee = seaFirstSingleFee;
  }
  
  public TString getSeaFirstSingleFeeUnit() {
    return this.seaFirstSingleFeeUnit;
  }
  public void setSeaFirstSingleFeeUnit(TString seaFirstSingleFeeUnit) {
    this.seaFirstSingleFeeUnit = seaFirstSingleFeeUnit;
  }
  
  public TDecimal getSeaLastSingleFee() {
    return this.seaLastSingleFee;
  }
  public void setSeaLastSingleFee(TDecimal seaLastSingleFee) {
    this.seaLastSingleFee = seaLastSingleFee;
  }
  
  public TString getSeaLastSingleFeeUnit() {
    return this.seaLastSingleFeeUnit;
  }
  public void setSeaLastSingleFeeUnit(TString seaLastSingleFeeUnit) {
    this.seaLastSingleFeeUnit = seaLastSingleFeeUnit;
  }
  
  public TDecimal getOilAdjustSingleFee() {
    return this.oilAdjustSingleFee;
  }
  public void setOilAdjustSingleFee(TDecimal oilAdjustSingleFee) {
    this.oilAdjustSingleFee = oilAdjustSingleFee;
  }
  
  public TString getOilAdjustSingleFeeUnit() {
    return this.oilAdjustSingleFeeUnit;
  }
  public void setOilAdjustSingleFeeUnit(TString oilAdjustSingleFeeUnit) {
    this.oilAdjustSingleFeeUnit = oilAdjustSingleFeeUnit;
  }
  
  public TDecimal getBaseFee() {
    return this.baseFee;
  }
  public void setBaseFee(TDecimal baseFee) {
    this.baseFee = baseFee;
  }
  
  public TString getBaseFeeUnit() {
    return this.baseFeeUnit;
  }
  public void setBaseFeeUnit(TString baseFeeUnit) {
    this.baseFeeUnit = baseFeeUnit;
  }
  
  public TDecimal getPortAdjust() {
    return this.portAdjust;
  }
  public void setPortAdjust(TDecimal portAdjust) {
    this.portAdjust = portAdjust;
  }
  
  public TString getPortAdjustUnit() {
    return this.portAdjustUnit;
  }
  public void setPortAdjustUnit(TString portAdjustUnit) {
    this.portAdjustUnit = portAdjustUnit;
  }
  
  public TDecimal getOilAdjustFee() {
    return this.oilAdjustFee;
  }
  public void setOilAdjustFee(TDecimal oilAdjustFee) {
    this.oilAdjustFee = oilAdjustFee;
  }
  
  public TString getOilAdjustFeeUnit() {
    return this.oilAdjustFeeUnit;
  }
  public void setOilAdjustFeeUnit(TString oilAdjustFeeUnit) {
    this.oilAdjustFeeUnit = oilAdjustFeeUnit;
  }
  
  public TDecimal getTransportFee() {
    return this.transportFee;
  }
  public void setTransportFee(TDecimal transportFee) {
    this.transportFee = transportFee;
  }
  
  public TString getTransportFeeUnit() {
    return this.transportFeeUnit;
  }
  public void setTransportFeeUnit(TString transportFeeUnit) {
    this.transportFeeUnit = transportFeeUnit;
  }
  
  public TDecimal getTransportFirstFee() {
    return this.transportFirstFee;
  }
  public void setTransportFirstFee(TDecimal transportFirstFee) {
    this.transportFirstFee = transportFirstFee;
  }
  
  public TString getTransportFirstFeeUnit() {
    return this.transportFirstFeeUnit;
  }
  public void setTransportFirstFeeUnit(TString transportFirstFeeUnit) {
    this.transportFirstFeeUnit = transportFirstFeeUnit;
  }
  
  public TDate getShipownerFirstFeeDate() {
    return this.shipownerFirstFeeDate;
  }
  public void setShipownerFirstFeeDate(TDate shipownerFirstFeeDate) {
    this.shipownerFirstFeeDate = shipownerFirstFeeDate;
  }
  
  public TDecimal getTransportLastFee() {
    return this.transportLastFee;
  }
  public void setTransportLastFee(TDecimal transportLastFee) {
    this.transportLastFee = transportLastFee;
  }
  
  public TString getTransportLastFeeUnit() {
    return this.transportLastFeeUnit;
  }
  public void setTransportLastFeeUnit(TString transportLastFeeUnit) {
    this.transportLastFeeUnit = transportLastFeeUnit;
  }
  
  public TDate getShipownerLastFeeDate() {
    return this.shipownerLastFeeDate;
  }
  public void setShipownerLastFeeDate(TDate shipownerLastFeeDate) {
    this.shipownerLastFeeDate = shipownerLastFeeDate;
  }
  
  public TDecimal getRentShipFirstFee() {
    return this.rentShipFirstFee;
  }
  public void setRentShipFirstFee(TDecimal rentShipFirstFee) {
    this.rentShipFirstFee = rentShipFirstFee;
  }
  
  public TDate getTransportFirstFeeDate() {
    return this.transportFirstFeeDate;
  }
  public void setTransportFirstFeeDate(TDate transportFirstFeeDate) {
    this.transportFirstFeeDate = transportFirstFeeDate;
  }
  
  public TDecimal getSeaLastFee() {
    return this.seaLastFee;
  }
  public void setSeaLastFee(TDecimal seaLastFee) {
    this.seaLastFee = seaLastFee;
  }
  
  public TDate getLastIssueDate() {
    return this.lastIssueDate;
  }
  public void setLastIssueDate(TDate lastIssueDate) {
    this.lastIssueDate = lastIssueDate;
  }
  
  public TDecimal getUnitSeaFee() {
    return this.unitSeaFee;
  }
  public void setUnitSeaFee(TDecimal unitSeaFee) {
    this.unitSeaFee = unitSeaFee;
  }
  
  public TDecimal getLoadUnloadAdjust() {
    return this.loadUnloadAdjust;
  }
  public void setLoadUnloadAdjust(TDecimal loadUnloadAdjust) {
    this.loadUnloadAdjust = loadUnloadAdjust;
  }
  
  public TDecimal getUintOilAdjustFee() {
    return this.uintOilAdjustFee;
  }
  public void setUintOilAdjustFee(TDecimal uintOilAdjustFee) {
    this.uintOilAdjustFee = uintOilAdjustFee;
  }
  
  public TDecimal getSeaFirstFee() {
    return this.seaFirstFee;
  }
  public void setSeaFirstFee(TDecimal seaFirstFee) {
    this.seaFirstFee = seaFirstFee;
  }
  
  public TDecimal getVoyageShipownerFee() {
    return this.voyageShipownerFee;
  }
  public void setVoyageShipownerFee(TDecimal voyageShipownerFee) {
    this.voyageShipownerFee = voyageShipownerFee;
  }
  
  public TDecimal getVoyageRentFee() {
    return this.voyageRentFee;
  }
  public void setVoyageRentFee(TDecimal voyageRentFee) {
    this.voyageRentFee = voyageRentFee;
  }
  
  public TDecimal getUnitTransportFee() {
    return this.unitTransportFee;
  }
  public void setUnitTransportFee(TDecimal unitTransportFee) {
    this.unitTransportFee = unitTransportFee;
  }
  
  public TDecimal getLastTransportFee() {
    return this.lastTransportFee;
  }
  public void setLastTransportFee(TDecimal lastTransportFee) {
    this.lastTransportFee = lastTransportFee;
  }
  
  public TDate getSettlementDate() {
    return this.settlementDate;
  }
  public void setSettlementDate(TDate settlementDate) {
    this.settlementDate = settlementDate;
  }
  
  public TDecimal getCoaDifference() {
    return this.coaDifference;
  }
  public void setCoaDifference(TDecimal coaDifference) {
    this.coaDifference = coaDifference;
  }
  
  public TDecimal getExchangeRate() {
    return this.exchangeRate;
  }
  public void setExchangeRate(TDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }
  
  public TString getFinalReceiver() {
    return this.finalReceiver;
  }
  public void setFinalReceiver(TString finalReceiver) {
    this.finalReceiver = finalReceiver;
  }
  
  public TString getFfb020t050pArchived() {
    return this.ffb020t050pArchived;
  }
  public void setFfb020t050pArchived(TString ffb020t050pArchived) {
    this.ffb020t050pArchived = ffb020t050pArchived;
  }
  
  public TString getCurrentLocation() {
    return this.currentLocation;
  }
  public void setCurrentLocation(TString currentLocation) {
    this.currentLocation = currentLocation;
  }
  
  public TDate getArrivedSingaporeDate() {
    return this.arrivedSingaporeDate;
  }
  public void setArrivedSingaporeDate(TDate arrivedSingaporeDate) {
    this.arrivedSingaporeDate = arrivedSingaporeDate;
  }
  
  public TDate getUnloadDate() {
    return this.unloadDate;
  }
  public void setUnloadDate(TDate unloadDate) {
    this.unloadDate = unloadDate;
  }
  
  public TString getArchived() {
    return this.archived;
  }
  public void setArchived(TString archived) {
    this.archived = archived;
  }
  
}