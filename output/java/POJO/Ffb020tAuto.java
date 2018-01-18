package com.ysusoft.POJO;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.ysusoft.annotations.Comment;

@SuppressWarnings("serial")
@MappedSuperclass
public class Ffb020tAuto extends BaseEntity {
  
  @Comment("船运批次")
  @Column(name="fship_batch_id", length=36)
  private java.lang.String shipBatchId;
  
  @Comment("船编号")
  @Column(name="fship_number", length=36)
  private java.lang.String shipNumber;
  
  @Comment("L/C号码")
  @Column(name="flc_number", length=30)
  private java.lang.String lcNumber;
  
  @Comment("装港名称")
  @Column(name="fport_load_name", length=30)
  private java.lang.String portLoadName;
  
  @Comment("装港船代")
  @Column(name="fport_load_ship_agent", length=30)
  private java.lang.String portLoadShipAgent;
  
  @Comment("装港对卖方滞期天数")
  @Column(name="fseller_delay_days", precision=10)
  private java.lang.Long sellerDelayDays;
  
  @Comment("装港对卖方滞期费")
  @Column(name="fseller_delay_fee")
  private java.lang.Double sellerDelayFee;
  
  @Comment("装港对卖方滞期费币种")
  @Column(name="fseller_delay_fee_unit", length=10)
  private java.lang.String sellerDelayFeeUnit;
  
  @Comment("装港对船东滞期费")
  @Column(name="fport_load_delay_fee")
  private java.lang.Double portLoadDelayFee;
  
  @Comment("装港对船东滞期费币种")
  @Column(name="fport_load_delay_fee_unit", length=10)
  private java.lang.String portLoadDelayFeeUnit;
  
  @Comment("装港开始时间")
  @Column(name="fport_load_start_date")
  private java.util.Date portLoadStartDate;
  
  @Comment("装港结束时间")
  @Column(name="fport_load_end_date")
  private java.util.Date portLoadEndDate;
  
  @Comment("首款海运费单价")
  @Column(name="fsea_first_single_fee")
  private java.lang.Double seaFirstSingleFee;
  
  @Comment("首款海运费单价币种")
  @Column(name="fsea_first_single_fee_unit", length=10)
  private java.lang.String seaFirstSingleFeeUnit;
  
  @Comment("尾款海运费单价")
  @Column(name="fsea_last_single_fee")
  private java.lang.Double seaLastSingleFee;
  
  @Comment("尾款海运费单价币种")
  @Column(name="fsea_last_single_fee_unit", length=10)
  private java.lang.String seaLastSingleFeeUnit;
  
  @Comment("油调单价")
  @Column(name="foil_adjust_single_fee")
  private java.lang.Double oilAdjustSingleFee;
  
  @Comment("油调单价币种")
  @Column(name="foil_adjust_single_fee_unit", length=10)
  private java.lang.String oilAdjustSingleFeeUnit;
  
  @Comment("基价")
  @Column(name="fbase_fee")
  private java.lang.Double baseFee;
  
  @Comment("基价币种")
  @Column(name="fbase_fee_unit", length=10)
  private java.lang.String baseFeeUnit;
  
  @Comment("港口调整")
  @Column(name="fport_adjust")
  private java.lang.Double portAdjust;
  
  @Comment("港口调整币种")
  @Column(name="fport_adjust_unit", length=10)
  private java.lang.String portAdjustUnit;
  
  @Comment("油价调整")
  @Column(name="foil_adjust_fee")
  private java.lang.Double oilAdjustFee;
  
  @Comment("油价调整币种")
  @Column(name="foil_adjust_fee_unit", length=10)
  private java.lang.String oilAdjustFeeUnit;
  
  @Comment("运费单价")
  @Column(name="ftransport_fee")
  private java.lang.Double transportFee;
  
  @Comment("运费单价币种")
  @Column(name="ftransport_fee_unit", length=10)
  private java.lang.String transportFeeUnit;
  
  @Comment("运费首款额")
  @Column(name="ftransport_first_fee")
  private java.lang.Double transportFirstFee;
  
  @Comment("运费首款额币种")
  @Column(name="ftransport_first_fee_unit", length=10)
  private java.lang.String transportFirstFeeUnit;
  
  @Comment("付船东首款日期")
  @Column(name="fshipowner_first_fee_date")
  private java.util.Date shipownerFirstFeeDate;
  
  @Comment("运费尾款额")
  @Column(name="ftransport_last_fee")
  private java.lang.Double transportLastFee;
  
  @Comment("运费尾款额币种")
  @Column(name="ftransport_last_fee_unit", length=10)
  private java.lang.String transportLastFeeUnit;
  
  @Comment("付船东尾款日期")
  @Column(name="fshipowner_last_fee_date")
  private java.util.Date shipownerLastFeeDate;
  
  @Comment("收租家首款运费/美元")
  @Column(name="frent_ship_first_fee")
  private java.lang.Double rentShipFirstFee;
  
  @Comment("首款收到运费日")
  @Column(name="ftransport_first_fee_date")
  private java.util.Date transportFirstFeeDate;
  
  @Comment("海运费尾款/美元")
  @Column(name="fsea_last_fee")
  private java.lang.Double seaLastFee;
  
  @Comment("尾款出票日")
  @Column(name="flast_issue_date")
  private java.util.Date lastIssueDate;
  
  @Comment("海运费单价/美元")
  @Column(name="funit_sea_fee")
  private java.lang.Double unitSeaFee;
  
  @Comment("装卸港调整/美元")
  @Column(name="fload_unload_adjust")
  private java.lang.Double loadUnloadAdjust;
  
  @Comment("油调单价/美元")
  @Column(name="fuint_oil_adjust_fee")
  private java.lang.Double uintOilAdjustFee;
  
  @Comment("付船东首款运费/美元")
  @Column(name="fsea_first_fee")
  private java.lang.Double seaFirstFee;
  
  @Comment("付船东尾款运费/美元")
  @Column(name="fvoyage_shipowner_fee")
  private java.lang.Double voyageShipownerFee;
  
  @Comment("收租家尾款运费/美元")
  @Column(name="fvoyage_rent_fee")
  private java.lang.Double voyageRentFee;
  
  @Comment("运费单价/美元")
  @Column(name="funit_transport_fee")
  private java.lang.Double unitTransportFee;
  
  @Comment("最终运费收付差额/美元")
  @Column(name="flast_transport_fee")
  private java.lang.Double lastTransportFee;
  
  @Comment("结算结束日")
  @Column(name="fsettlement_date")
  private java.util.Date settlementDate;
  
  @Comment("COA与外转运费差额/美元")
  @Column(name="fcoa_difference")
  private java.lang.Double coaDifference;
  
  @Comment("当时汇率")
  @Column(name="fexchange_rate")
  private java.lang.Double exchangeRate;
  
  @Comment("最终收货人")
  @Column(name="ffinal_receiver", length=30)
  private java.lang.String finalReceiver;
  
  @Comment("归档")
  @Column(name="fffb020t050p_archived", length=10)
  private java.lang.String ffb020t050pArchived;
  
  @Comment("当前位置")
  @Column(name="fcurrent_location", length=30)
  private java.lang.String currentLocation;
  
  @Comment("预计到新加坡日期")
  @Column(name="farrived_singapore_date")
  private java.util.Date arrivedSingaporeDate;
  
  @Comment("预计卸港日期")
  @Column(name="funload_date")
  private java.util.Date unloadDate;
  

  public Ffb020tAuto() {
  }

  
  public java.lang.String getShipBatchId() {
    return this.shipBatchId;
  }
  public void setShipBatchId(java.lang.String shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public java.lang.String getShipNumber() {
    return this.shipNumber;
  }
  public void setShipNumber(java.lang.String shipNumber) {
    this.shipNumber = shipNumber;
  }
  
  public java.lang.String getLcNumber() {
    return this.lcNumber;
  }
  public void setLcNumber(java.lang.String lcNumber) {
    this.lcNumber = lcNumber;
  }
  
  public java.lang.String getPortLoadName() {
    return this.portLoadName;
  }
  public void setPortLoadName(java.lang.String portLoadName) {
    this.portLoadName = portLoadName;
  }
  
  public java.lang.String getPortLoadShipAgent() {
    return this.portLoadShipAgent;
  }
  public void setPortLoadShipAgent(java.lang.String portLoadShipAgent) {
    this.portLoadShipAgent = portLoadShipAgent;
  }
  
  public java.lang.Long getSellerDelayDays() {
    return this.sellerDelayDays;
  }
  public void setSellerDelayDays(java.lang.Long sellerDelayDays) {
    this.sellerDelayDays = sellerDelayDays;
  }
  
  public java.lang.Double getSellerDelayFee() {
    return this.sellerDelayFee;
  }
  public void setSellerDelayFee(java.lang.Double sellerDelayFee) {
    this.sellerDelayFee = sellerDelayFee;
  }
  
  public java.lang.String getSellerDelayFeeUnit() {
    return this.sellerDelayFeeUnit;
  }
  public void setSellerDelayFeeUnit(java.lang.String sellerDelayFeeUnit) {
    this.sellerDelayFeeUnit = sellerDelayFeeUnit;
  }
  
  public java.lang.Double getPortLoadDelayFee() {
    return this.portLoadDelayFee;
  }
  public void setPortLoadDelayFee(java.lang.Double portLoadDelayFee) {
    this.portLoadDelayFee = portLoadDelayFee;
  }
  
  public java.lang.String getPortLoadDelayFeeUnit() {
    return this.portLoadDelayFeeUnit;
  }
  public void setPortLoadDelayFeeUnit(java.lang.String portLoadDelayFeeUnit) {
    this.portLoadDelayFeeUnit = portLoadDelayFeeUnit;
  }
  
  public java.util.Date getPortLoadStartDate() {
    return this.portLoadStartDate;
  }
  public void setPortLoadStartDate(java.util.Date portLoadStartDate) {
    this.portLoadStartDate = portLoadStartDate;
  }
  
  public java.util.Date getPortLoadEndDate() {
    return this.portLoadEndDate;
  }
  public void setPortLoadEndDate(java.util.Date portLoadEndDate) {
    this.portLoadEndDate = portLoadEndDate;
  }
  
  public java.lang.Double getSeaFirstSingleFee() {
    return this.seaFirstSingleFee;
  }
  public void setSeaFirstSingleFee(java.lang.Double seaFirstSingleFee) {
    this.seaFirstSingleFee = seaFirstSingleFee;
  }
  
  public java.lang.String getSeaFirstSingleFeeUnit() {
    return this.seaFirstSingleFeeUnit;
  }
  public void setSeaFirstSingleFeeUnit(java.lang.String seaFirstSingleFeeUnit) {
    this.seaFirstSingleFeeUnit = seaFirstSingleFeeUnit;
  }
  
  public java.lang.Double getSeaLastSingleFee() {
    return this.seaLastSingleFee;
  }
  public void setSeaLastSingleFee(java.lang.Double seaLastSingleFee) {
    this.seaLastSingleFee = seaLastSingleFee;
  }
  
  public java.lang.String getSeaLastSingleFeeUnit() {
    return this.seaLastSingleFeeUnit;
  }
  public void setSeaLastSingleFeeUnit(java.lang.String seaLastSingleFeeUnit) {
    this.seaLastSingleFeeUnit = seaLastSingleFeeUnit;
  }
  
  public java.lang.Double getOilAdjustSingleFee() {
    return this.oilAdjustSingleFee;
  }
  public void setOilAdjustSingleFee(java.lang.Double oilAdjustSingleFee) {
    this.oilAdjustSingleFee = oilAdjustSingleFee;
  }
  
  public java.lang.String getOilAdjustSingleFeeUnit() {
    return this.oilAdjustSingleFeeUnit;
  }
  public void setOilAdjustSingleFeeUnit(java.lang.String oilAdjustSingleFeeUnit) {
    this.oilAdjustSingleFeeUnit = oilAdjustSingleFeeUnit;
  }
  
  public java.lang.Double getBaseFee() {
    return this.baseFee;
  }
  public void setBaseFee(java.lang.Double baseFee) {
    this.baseFee = baseFee;
  }
  
  public java.lang.String getBaseFeeUnit() {
    return this.baseFeeUnit;
  }
  public void setBaseFeeUnit(java.lang.String baseFeeUnit) {
    this.baseFeeUnit = baseFeeUnit;
  }
  
  public java.lang.Double getPortAdjust() {
    return this.portAdjust;
  }
  public void setPortAdjust(java.lang.Double portAdjust) {
    this.portAdjust = portAdjust;
  }
  
  public java.lang.String getPortAdjustUnit() {
    return this.portAdjustUnit;
  }
  public void setPortAdjustUnit(java.lang.String portAdjustUnit) {
    this.portAdjustUnit = portAdjustUnit;
  }
  
  public java.lang.Double getOilAdjustFee() {
    return this.oilAdjustFee;
  }
  public void setOilAdjustFee(java.lang.Double oilAdjustFee) {
    this.oilAdjustFee = oilAdjustFee;
  }
  
  public java.lang.String getOilAdjustFeeUnit() {
    return this.oilAdjustFeeUnit;
  }
  public void setOilAdjustFeeUnit(java.lang.String oilAdjustFeeUnit) {
    this.oilAdjustFeeUnit = oilAdjustFeeUnit;
  }
  
  public java.lang.Double getTransportFee() {
    return this.transportFee;
  }
  public void setTransportFee(java.lang.Double transportFee) {
    this.transportFee = transportFee;
  }
  
  public java.lang.String getTransportFeeUnit() {
    return this.transportFeeUnit;
  }
  public void setTransportFeeUnit(java.lang.String transportFeeUnit) {
    this.transportFeeUnit = transportFeeUnit;
  }
  
  public java.lang.Double getTransportFirstFee() {
    return this.transportFirstFee;
  }
  public void setTransportFirstFee(java.lang.Double transportFirstFee) {
    this.transportFirstFee = transportFirstFee;
  }
  
  public java.lang.String getTransportFirstFeeUnit() {
    return this.transportFirstFeeUnit;
  }
  public void setTransportFirstFeeUnit(java.lang.String transportFirstFeeUnit) {
    this.transportFirstFeeUnit = transportFirstFeeUnit;
  }
  
  public java.util.Date getShipownerFirstFeeDate() {
    return this.shipownerFirstFeeDate;
  }
  public void setShipownerFirstFeeDate(java.util.Date shipownerFirstFeeDate) {
    this.shipownerFirstFeeDate = shipownerFirstFeeDate;
  }
  
  public java.lang.Double getTransportLastFee() {
    return this.transportLastFee;
  }
  public void setTransportLastFee(java.lang.Double transportLastFee) {
    this.transportLastFee = transportLastFee;
  }
  
  public java.lang.String getTransportLastFeeUnit() {
    return this.transportLastFeeUnit;
  }
  public void setTransportLastFeeUnit(java.lang.String transportLastFeeUnit) {
    this.transportLastFeeUnit = transportLastFeeUnit;
  }
  
  public java.util.Date getShipownerLastFeeDate() {
    return this.shipownerLastFeeDate;
  }
  public void setShipownerLastFeeDate(java.util.Date shipownerLastFeeDate) {
    this.shipownerLastFeeDate = shipownerLastFeeDate;
  }
  
  public java.lang.Double getRentShipFirstFee() {
    return this.rentShipFirstFee;
  }
  public void setRentShipFirstFee(java.lang.Double rentShipFirstFee) {
    this.rentShipFirstFee = rentShipFirstFee;
  }
  
  public java.util.Date getTransportFirstFeeDate() {
    return this.transportFirstFeeDate;
  }
  public void setTransportFirstFeeDate(java.util.Date transportFirstFeeDate) {
    this.transportFirstFeeDate = transportFirstFeeDate;
  }
  
  public java.lang.Double getSeaLastFee() {
    return this.seaLastFee;
  }
  public void setSeaLastFee(java.lang.Double seaLastFee) {
    this.seaLastFee = seaLastFee;
  }
  
  public java.util.Date getLastIssueDate() {
    return this.lastIssueDate;
  }
  public void setLastIssueDate(java.util.Date lastIssueDate) {
    this.lastIssueDate = lastIssueDate;
  }
  
  public java.lang.Double getUnitSeaFee() {
    return this.unitSeaFee;
  }
  public void setUnitSeaFee(java.lang.Double unitSeaFee) {
    this.unitSeaFee = unitSeaFee;
  }
  
  public java.lang.Double getLoadUnloadAdjust() {
    return this.loadUnloadAdjust;
  }
  public void setLoadUnloadAdjust(java.lang.Double loadUnloadAdjust) {
    this.loadUnloadAdjust = loadUnloadAdjust;
  }
  
  public java.lang.Double getUintOilAdjustFee() {
    return this.uintOilAdjustFee;
  }
  public void setUintOilAdjustFee(java.lang.Double uintOilAdjustFee) {
    this.uintOilAdjustFee = uintOilAdjustFee;
  }
  
  public java.lang.Double getSeaFirstFee() {
    return this.seaFirstFee;
  }
  public void setSeaFirstFee(java.lang.Double seaFirstFee) {
    this.seaFirstFee = seaFirstFee;
  }
  
  public java.lang.Double getVoyageShipownerFee() {
    return this.voyageShipownerFee;
  }
  public void setVoyageShipownerFee(java.lang.Double voyageShipownerFee) {
    this.voyageShipownerFee = voyageShipownerFee;
  }
  
  public java.lang.Double getVoyageRentFee() {
    return this.voyageRentFee;
  }
  public void setVoyageRentFee(java.lang.Double voyageRentFee) {
    this.voyageRentFee = voyageRentFee;
  }
  
  public java.lang.Double getUnitTransportFee() {
    return this.unitTransportFee;
  }
  public void setUnitTransportFee(java.lang.Double unitTransportFee) {
    this.unitTransportFee = unitTransportFee;
  }
  
  public java.lang.Double getLastTransportFee() {
    return this.lastTransportFee;
  }
  public void setLastTransportFee(java.lang.Double lastTransportFee) {
    this.lastTransportFee = lastTransportFee;
  }
  
  public java.util.Date getSettlementDate() {
    return this.settlementDate;
  }
  public void setSettlementDate(java.util.Date settlementDate) {
    this.settlementDate = settlementDate;
  }
  
  public java.lang.Double getCoaDifference() {
    return this.coaDifference;
  }
  public void setCoaDifference(java.lang.Double coaDifference) {
    this.coaDifference = coaDifference;
  }
  
  public java.lang.Double getExchangeRate() {
    return this.exchangeRate;
  }
  public void setExchangeRate(java.lang.Double exchangeRate) {
    this.exchangeRate = exchangeRate;
  }
  
  public java.lang.String getFinalReceiver() {
    return this.finalReceiver;
  }
  public void setFinalReceiver(java.lang.String finalReceiver) {
    this.finalReceiver = finalReceiver;
  }
  
  public java.lang.String getFfb020t050pArchived() {
    return this.ffb020t050pArchived;
  }
  public void setFfb020t050pArchived(java.lang.String ffb020t050pArchived) {
    this.ffb020t050pArchived = ffb020t050pArchived;
  }
  
  public java.lang.String getCurrentLocation() {
    return this.currentLocation;
  }
  public void setCurrentLocation(java.lang.String currentLocation) {
    this.currentLocation = currentLocation;
  }
  
  public java.util.Date getArrivedSingaporeDate() {
    return this.arrivedSingaporeDate;
  }
  public void setArrivedSingaporeDate(java.util.Date arrivedSingaporeDate) {
    this.arrivedSingaporeDate = arrivedSingaporeDate;
  }
  
  public java.util.Date getUnloadDate() {
    return this.unloadDate;
  }
  public void setUnloadDate(java.util.Date unloadDate) {
    this.unloadDate = unloadDate;
  }
  
}