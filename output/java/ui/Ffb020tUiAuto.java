package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb020tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb020t", "entity", "query");
  protected FieldCodes shipBatchId = new FieldCodes("shipBatchId", "船运批次", "ffb020t", "entity", "query");
  protected FieldCodes shipNumber = new FieldCodes("shipNumber", "船编号", "ffb020t", "entity", "query");
  protected FieldCodes lcNumber = new FieldCodes("lcNumber", "L/C号码", "ffb020t", "entity", "query");
  protected FieldCodes portLoadName = new FieldCodes("portLoadName", "装港名称", "ffb020t", "entity", "query");
  protected FieldCodes portLoadShipAgent = new FieldCodes("portLoadShipAgent", "装港船代", "ffb020t", "entity", "query");
  protected FieldCodes sellerDelayDays = new FieldCodes("sellerDelayDays", "装港对卖方滞期天数", "ffb020t", "entity", "query");
  protected FieldCodes sellerDelayFee = new FieldCodes("sellerDelayFee", "装港对卖方滞期费", "ffb020t", "entity", "query");
  protected FieldCodes sellerDelayFeeWithUnit = new FieldCodes("sellerDelayFee", "装港对卖方滞期费", "ffb020t", "entity", "query");
  protected FieldCodes sellerDelayFeeUnit = new FieldCodes("sellerDelayFeeUnit", "装港对卖方滞期费币种", "ffb020t", "entity", "query");
  protected FieldCodes portLoadDelayFee = new FieldCodes("portLoadDelayFee", "装港对船东滞期费", "ffb020t", "entity", "query");
  protected FieldCodes portLoadDelayFeeWithUnit = new FieldCodes("portLoadDelayFee", "装港对船东滞期费", "ffb020t", "entity", "query");
  protected FieldCodes portLoadDelayFeeUnit = new FieldCodes("portLoadDelayFeeUnit", "装港对船东滞期费币种", "ffb020t", "entity", "query");
  protected FieldCodes portLoadStartDate = new FieldCodes("portLoadStartDate", "装港开始时间", "ffb020t", "entity", "query");
  protected FieldCodes portLoadEndDate = new FieldCodes("portLoadEndDate", "装港结束时间", "ffb020t", "entity", "query");
  protected FieldCodes seaFirstSingleFee = new FieldCodes("seaFirstSingleFee", "首款海运费单价", "ffb020t", "entity", "query");
  protected FieldCodes seaFirstSingleFeeWithUnit = new FieldCodes("seaFirstSingleFee", "首款海运费单价", "ffb020t", "entity", "query");
  protected FieldCodes seaFirstSingleFeeUnit = new FieldCodes("seaFirstSingleFeeUnit", "首款海运费单价币种", "ffb020t", "entity", "query");
  protected FieldCodes seaLastSingleFee = new FieldCodes("seaLastSingleFee", "尾款海运费单价", "ffb020t", "entity", "query");
  protected FieldCodes seaLastSingleFeeWithUnit = new FieldCodes("seaLastSingleFee", "尾款海运费单价", "ffb020t", "entity", "query");
  protected FieldCodes seaLastSingleFeeUnit = new FieldCodes("seaLastSingleFeeUnit", "尾款海运费单价币种", "ffb020t", "entity", "query");
  protected FieldCodes oilAdjustSingleFee = new FieldCodes("oilAdjustSingleFee", "油调单价", "ffb020t", "entity", "query");
  protected FieldCodes oilAdjustSingleFeeWithUnit = new FieldCodes("oilAdjustSingleFee", "油调单价", "ffb020t", "entity", "query");
  protected FieldCodes oilAdjustSingleFeeUnit = new FieldCodes("oilAdjustSingleFeeUnit", "油调单价币种", "ffb020t", "entity", "query");
  protected FieldCodes baseFee = new FieldCodes("baseFee", "基价", "ffb020t", "entity", "query");
  protected FieldCodes baseFeeWithUnit = new FieldCodes("baseFee", "基价", "ffb020t", "entity", "query");
  protected FieldCodes baseFeeUnit = new FieldCodes("baseFeeUnit", "基价币种", "ffb020t", "entity", "query");
  protected FieldCodes portAdjust = new FieldCodes("portAdjust", "港口调整", "ffb020t", "entity", "query");
  protected FieldCodes portAdjustWithUnit = new FieldCodes("portAdjust", "港口调整", "ffb020t", "entity", "query");
  protected FieldCodes portAdjustUnit = new FieldCodes("portAdjustUnit", "港口调整币种", "ffb020t", "entity", "query");
  protected FieldCodes oilAdjustFee = new FieldCodes("oilAdjustFee", "油价调整", "ffb020t", "entity", "query");
  protected FieldCodes oilAdjustFeeWithUnit = new FieldCodes("oilAdjustFee", "油价调整", "ffb020t", "entity", "query");
  protected FieldCodes oilAdjustFeeUnit = new FieldCodes("oilAdjustFeeUnit", "油价调整币种", "ffb020t", "entity", "query");
  protected FieldCodes transportFee = new FieldCodes("transportFee", "运费单价", "ffb020t", "entity", "query");
  protected FieldCodes transportFeeWithUnit = new FieldCodes("transportFee", "运费单价", "ffb020t", "entity", "query");
  protected FieldCodes transportFeeUnit = new FieldCodes("transportFeeUnit", "运费单价币种", "ffb020t", "entity", "query");
  protected FieldCodes transportFirstFee = new FieldCodes("transportFirstFee", "运费首款额", "ffb020t", "entity", "query");
  protected FieldCodes transportFirstFeeWithUnit = new FieldCodes("transportFirstFee", "运费首款额", "ffb020t", "entity", "query");
  protected FieldCodes transportFirstFeeUnit = new FieldCodes("transportFirstFeeUnit", "运费首款额币种", "ffb020t", "entity", "query");
  protected FieldCodes shipownerFirstFeeDate = new FieldCodes("shipownerFirstFeeDate", "付船东首款日期", "ffb020t", "entity", "query");
  protected FieldCodes transportLastFee = new FieldCodes("transportLastFee", "运费尾款额", "ffb020t", "entity", "query");
  protected FieldCodes transportLastFeeWithUnit = new FieldCodes("transportLastFee", "运费尾款额", "ffb020t", "entity", "query");
  protected FieldCodes transportLastFeeUnit = new FieldCodes("transportLastFeeUnit", "运费尾款额币种", "ffb020t", "entity", "query");
  protected FieldCodes shipownerLastFeeDate = new FieldCodes("shipownerLastFeeDate", "付船东尾款日期", "ffb020t", "entity", "query");
  protected FieldCodes rentShipFirstFee = new FieldCodes("rentShipFirstFee", "收租家首款运费/美元", "ffb020t", "entity", "query");
  protected FieldCodes transportFirstFeeDate = new FieldCodes("transportFirstFeeDate", "首款收到运费日", "ffb020t", "entity", "query");
  protected FieldCodes seaLastFee = new FieldCodes("seaLastFee", "海运费尾款/美元", "ffb020t", "entity", "query");
  protected FieldCodes lastIssueDate = new FieldCodes("lastIssueDate", "尾款出票日", "ffb020t", "entity", "query");
  protected FieldCodes unitSeaFee = new FieldCodes("unitSeaFee", "海运费单价/美元", "ffb020t", "entity", "query");
  protected FieldCodes loadUnloadAdjust = new FieldCodes("loadUnloadAdjust", "装卸港调整/美元", "ffb020t", "entity", "query");
  protected FieldCodes uintOilAdjustFee = new FieldCodes("uintOilAdjustFee", "油调单价/美元", "ffb020t", "entity", "query");
  protected FieldCodes seaFirstFee = new FieldCodes("seaFirstFee", "付船东首款运费/美元", "ffb020t", "entity", "query");
  protected FieldCodes voyageShipownerFee = new FieldCodes("voyageShipownerFee", "付船东尾款运费/美元", "ffb020t", "entity", "query");
  protected FieldCodes voyageRentFee = new FieldCodes("voyageRentFee", "收租家尾款运费/美元", "ffb020t", "entity", "query");
  protected FieldCodes unitTransportFee = new FieldCodes("unitTransportFee", "运费单价/美元", "ffb020t", "entity", "query");
  protected FieldCodes lastTransportFee = new FieldCodes("lastTransportFee", "最终运费收付差额/美元", "ffb020t", "entity", "query");
  protected FieldCodes settlementDate = new FieldCodes("settlementDate", "结算结束日", "ffb020t", "entity", "query");
  protected FieldCodes coaDifference = new FieldCodes("coaDifference", "COA与外转运费差额/美元", "ffb020t", "entity", "query");
  protected FieldCodes exchangeRate = new FieldCodes("exchangeRate", "当时汇率", "ffb020t", "entity", "query");
  protected FieldCodes finalReceiver = new FieldCodes("finalReceiver", "最终收货人", "ffb020t", "entity", "query");
  protected FieldCodes ffb020t050pArchived = new FieldCodes("ffb020t050pArchived", "归档", "ffb020t", "entity", "query");
  protected FieldCodes currentLocation = new FieldCodes("currentLocation", "当前位置", "ffb020t", "entity", "query");
  protected FieldCodes arrivedSingaporeDate = new FieldCodes("arrivedSingaporeDate", "预计到新加坡日期", "ffb020t", "entity", "query");
  protected FieldCodes unloadDate = new FieldCodes("unloadDate", "预计卸港日期", "ffb020t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb020t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb020t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb020t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb020t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb020t", "entity", "query");
  
  public Ffb020tUiAuto(){
  }

  // 主键
  public FieldCodes f0() {
    if (f0.getInput() == null) f0.setInput(createF0Input());
    if (f0.getQueryInput() == null) f0.setQueryInput(createF0QueryInput());
    if (f0.getDataGridColumn() == null) f0.setDataGridColumn(createF0DataGridColumn());
    return f0;
  }
  public HtmlTag createF0Input(){
    return f0.textInput(36);
  }
  public HtmlTag createF0QueryInput(){
    return f0.textQueryInput();
  }
  public JsType createF0DataGridColumn(){
    return f0.textColumn();
  }
  
  // 船运批次
  public FieldCodes shipBatchId() {
    if (shipBatchId.getInput() == null) shipBatchId.setInput(createShipBatchIdInput());
    if (shipBatchId.getQueryInput() == null) shipBatchId.setQueryInput(createShipBatchIdQueryInput());
    if (shipBatchId.getDataGridColumn() == null) shipBatchId.setDataGridColumn(createShipBatchIdDataGridColumn());
    return shipBatchId;
  }
  public HtmlTag createShipBatchIdInput(){
    return shipBatchId.textInput(36);
  }
  public HtmlTag createShipBatchIdQueryInput(){
    return shipBatchId.textQueryInput();
  }
  public JsType createShipBatchIdDataGridColumn(){
    return shipBatchId.textColumn();
  }
  
  // 船编号
  public FieldCodes shipNumber() {
    if (shipNumber.getInput() == null) shipNumber.setInput(createShipNumberInput());
    if (shipNumber.getQueryInput() == null) shipNumber.setQueryInput(createShipNumberQueryInput());
    if (shipNumber.getDataGridColumn() == null) shipNumber.setDataGridColumn(createShipNumberDataGridColumn());
    return shipNumber;
  }
  public HtmlTag createShipNumberInput(){
    return shipNumber.textInput(36);
  }
  public HtmlTag createShipNumberQueryInput(){
    return shipNumber.textQueryInput();
  }
  public JsType createShipNumberDataGridColumn(){
    return shipNumber.textColumn();
  }
  
  // L/C号码
  public FieldCodes lcNumber() {
    if (lcNumber.getInput() == null) lcNumber.setInput(createLcNumberInput());
    if (lcNumber.getQueryInput() == null) lcNumber.setQueryInput(createLcNumberQueryInput());
    if (lcNumber.getDataGridColumn() == null) lcNumber.setDataGridColumn(createLcNumberDataGridColumn());
    return lcNumber;
  }
  public HtmlTag createLcNumberInput(){
    return lcNumber.textInput(30);
  }
  public HtmlTag createLcNumberQueryInput(){
    return lcNumber.textQueryInput();
  }
  public JsType createLcNumberDataGridColumn(){
    return lcNumber.textColumn();
  }
  
  // 装港名称
  public FieldCodes portLoadName() {
    if (portLoadName.getInput() == null) portLoadName.setInput(createPortLoadNameInput());
    if (portLoadName.getQueryInput() == null) portLoadName.setQueryInput(createPortLoadNameQueryInput());
    if (portLoadName.getDataGridColumn() == null) portLoadName.setDataGridColumn(createPortLoadNameDataGridColumn());
    return portLoadName;
  }
  public HtmlTag createPortLoadNameInput(){
    return portLoadName.textInput(30);
  }
  public HtmlTag createPortLoadNameQueryInput(){
    return portLoadName.textQueryInput();
  }
  public JsType createPortLoadNameDataGridColumn(){
    return portLoadName.textColumn();
  }
  
  // 装港船代
  public FieldCodes portLoadShipAgent() {
    if (portLoadShipAgent.getInput() == null) portLoadShipAgent.setInput(createPortLoadShipAgentInput());
    if (portLoadShipAgent.getQueryInput() == null) portLoadShipAgent.setQueryInput(createPortLoadShipAgentQueryInput());
    if (portLoadShipAgent.getDataGridColumn() == null) portLoadShipAgent.setDataGridColumn(createPortLoadShipAgentDataGridColumn());
    return portLoadShipAgent;
  }
  public HtmlTag createPortLoadShipAgentInput(){
    return portLoadShipAgent.textInput(30);
  }
  public HtmlTag createPortLoadShipAgentQueryInput(){
    return portLoadShipAgent.textQueryInput();
  }
  public JsType createPortLoadShipAgentDataGridColumn(){
    return portLoadShipAgent.textColumn();
  }
  
  // 装港对卖方滞期天数
  public FieldCodes sellerDelayDays() {
    if (sellerDelayDays.getInput() == null) sellerDelayDays.setInput(createSellerDelayDaysInput());
    if (sellerDelayDays.getQueryInput() == null) sellerDelayDays.setQueryInput(createSellerDelayDaysQueryInput());
    if (sellerDelayDays.getDataGridColumn() == null) sellerDelayDays.setDataGridColumn(createSellerDelayDaysDataGridColumn());
    return sellerDelayDays;
  }
  public HtmlTag createSellerDelayDaysInput(){
    return sellerDelayDays.numberInput(0);
  }
  public HtmlTag createSellerDelayDaysQueryInput(){
    return sellerDelayDays.numberQueryInput();
  }
  public JsType createSellerDelayDaysDataGridColumn(){
    return sellerDelayDays.textColumn();
  }
  
  // 装港对卖方滞期费
  public FieldCodes sellerDelayFee() {
    if (sellerDelayFee.getInput() == null) sellerDelayFee.setInput(createSellerDelayFeeInput());
    if (sellerDelayFee.getQueryInput() == null) sellerDelayFee.setQueryInput(createSellerDelayFeeQueryInput());
    if (sellerDelayFee.getDataGridColumn() == null) sellerDelayFee.setDataGridColumn(createSellerDelayFeeDataGridColumn());
    return sellerDelayFee;
  }
  public HtmlTag createSellerDelayFeeInput(){
    return sellerDelayFee.numberInput(2);
  }
  public HtmlTag createSellerDelayFeeQueryInput(){
    return sellerDelayFee.numberQueryInput();
  }
  public JsType createSellerDelayFeeDataGridColumn(){
    return sellerDelayFee.textColumn();
  }
  
  // 装港对卖方滞期费（带单位）
  public FieldCodes sellerDelayFeeWithUnit() {
    if (sellerDelayFeeWithUnit.getInput() == null) sellerDelayFeeWithUnit.setInput(createSellerDelayFeeWithUnitInput());
    if (sellerDelayFeeWithUnit.getQueryInput() == null) sellerDelayFeeWithUnit.setQueryInput(createSellerDelayFeeWithUnitQueryInput());
    if (sellerDelayFeeWithUnit.getDataGridColumn() == null) sellerDelayFeeWithUnit.setDataGridColumn(createSellerDelayFeeWithUnitDataGridColumn());
    return sellerDelayFeeWithUnit;
  }
  public HtmlTag createSellerDelayFeeWithUnitInput(){
    return sellerDelayFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSellerDelayFeeWithUnitQueryInput(){
    return sellerDelayFee.numberQueryInput();
  }
  public JsType createSellerDelayFeeWithUnitDataGridColumn(){
    return sellerDelayFee.textColumn();
  }
  
  // 装港对卖方滞期费币种
  public FieldCodes sellerDelayFeeUnit() {
    if (sellerDelayFeeUnit.getInput() == null) sellerDelayFeeUnit.setInput(createSellerDelayFeeUnitInput());
    if (sellerDelayFeeUnit.getQueryInput() == null) sellerDelayFeeUnit.setQueryInput(createSellerDelayFeeUnitQueryInput());
    if (sellerDelayFeeUnit.getDataGridColumn() == null) sellerDelayFeeUnit.setDataGridColumn(createSellerDelayFeeUnitDataGridColumn());
    return sellerDelayFeeUnit;
  }
  public HtmlTag createSellerDelayFeeUnitInput(){
    return sellerDelayFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSellerDelayFeeUnitQueryInput(){
    return sellerDelayFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSellerDelayFeeUnitDataGridColumn(){
    return sellerDelayFeeUnit.textColumn();
  }
  
  // 装港对船东滞期费
  public FieldCodes portLoadDelayFee() {
    if (portLoadDelayFee.getInput() == null) portLoadDelayFee.setInput(createPortLoadDelayFeeInput());
    if (portLoadDelayFee.getQueryInput() == null) portLoadDelayFee.setQueryInput(createPortLoadDelayFeeQueryInput());
    if (portLoadDelayFee.getDataGridColumn() == null) portLoadDelayFee.setDataGridColumn(createPortLoadDelayFeeDataGridColumn());
    return portLoadDelayFee;
  }
  public HtmlTag createPortLoadDelayFeeInput(){
    return portLoadDelayFee.numberInput(2);
  }
  public HtmlTag createPortLoadDelayFeeQueryInput(){
    return portLoadDelayFee.numberQueryInput();
  }
  public JsType createPortLoadDelayFeeDataGridColumn(){
    return portLoadDelayFee.textColumn();
  }
  
  // 装港对船东滞期费（带单位）
  public FieldCodes portLoadDelayFeeWithUnit() {
    if (portLoadDelayFeeWithUnit.getInput() == null) portLoadDelayFeeWithUnit.setInput(createPortLoadDelayFeeWithUnitInput());
    if (portLoadDelayFeeWithUnit.getQueryInput() == null) portLoadDelayFeeWithUnit.setQueryInput(createPortLoadDelayFeeWithUnitQueryInput());
    if (portLoadDelayFeeWithUnit.getDataGridColumn() == null) portLoadDelayFeeWithUnit.setDataGridColumn(createPortLoadDelayFeeWithUnitDataGridColumn());
    return portLoadDelayFeeWithUnit;
  }
  public HtmlTag createPortLoadDelayFeeWithUnitInput(){
    return portLoadDelayFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createPortLoadDelayFeeWithUnitQueryInput(){
    return portLoadDelayFee.numberQueryInput();
  }
  public JsType createPortLoadDelayFeeWithUnitDataGridColumn(){
    return portLoadDelayFee.textColumn();
  }
  
  // 装港对船东滞期费币种
  public FieldCodes portLoadDelayFeeUnit() {
    if (portLoadDelayFeeUnit.getInput() == null) portLoadDelayFeeUnit.setInput(createPortLoadDelayFeeUnitInput());
    if (portLoadDelayFeeUnit.getQueryInput() == null) portLoadDelayFeeUnit.setQueryInput(createPortLoadDelayFeeUnitQueryInput());
    if (portLoadDelayFeeUnit.getDataGridColumn() == null) portLoadDelayFeeUnit.setDataGridColumn(createPortLoadDelayFeeUnitDataGridColumn());
    return portLoadDelayFeeUnit;
  }
  public HtmlTag createPortLoadDelayFeeUnitInput(){
    return portLoadDelayFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createPortLoadDelayFeeUnitQueryInput(){
    return portLoadDelayFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createPortLoadDelayFeeUnitDataGridColumn(){
    return portLoadDelayFeeUnit.textColumn();
  }
  
  // 装港开始时间
  public FieldCodes portLoadStartDate() {
    if (portLoadStartDate.getInput() == null) portLoadStartDate.setInput(createPortLoadStartDateInput());
    if (portLoadStartDate.getQueryInput() == null) portLoadStartDate.setQueryInput(createPortLoadStartDateQueryInput());
    if (portLoadStartDate.getDataGridColumn() == null) portLoadStartDate.setDataGridColumn(createPortLoadStartDateDataGridColumn());
    return portLoadStartDate;
  }
  public HtmlTag createPortLoadStartDateInput(){
    return portLoadStartDate.dateInput();
  }
  public HtmlTag createPortLoadStartDateQueryInput(){
    return portLoadStartDate.dateQueryInput();
  }
  public JsType createPortLoadStartDateDataGridColumn(){
    return portLoadStartDate.dateColumn();
  }
  
  // 装港结束时间
  public FieldCodes portLoadEndDate() {
    if (portLoadEndDate.getInput() == null) portLoadEndDate.setInput(createPortLoadEndDateInput());
    if (portLoadEndDate.getQueryInput() == null) portLoadEndDate.setQueryInput(createPortLoadEndDateQueryInput());
    if (portLoadEndDate.getDataGridColumn() == null) portLoadEndDate.setDataGridColumn(createPortLoadEndDateDataGridColumn());
    return portLoadEndDate;
  }
  public HtmlTag createPortLoadEndDateInput(){
    return portLoadEndDate.dateInput();
  }
  public HtmlTag createPortLoadEndDateQueryInput(){
    return portLoadEndDate.dateQueryInput();
  }
  public JsType createPortLoadEndDateDataGridColumn(){
    return portLoadEndDate.dateColumn();
  }
  
  // 首款海运费单价
  public FieldCodes seaFirstSingleFee() {
    if (seaFirstSingleFee.getInput() == null) seaFirstSingleFee.setInput(createSeaFirstSingleFeeInput());
    if (seaFirstSingleFee.getQueryInput() == null) seaFirstSingleFee.setQueryInput(createSeaFirstSingleFeeQueryInput());
    if (seaFirstSingleFee.getDataGridColumn() == null) seaFirstSingleFee.setDataGridColumn(createSeaFirstSingleFeeDataGridColumn());
    return seaFirstSingleFee;
  }
  public HtmlTag createSeaFirstSingleFeeInput(){
    return seaFirstSingleFee.numberInput(2);
  }
  public HtmlTag createSeaFirstSingleFeeQueryInput(){
    return seaFirstSingleFee.numberQueryInput();
  }
  public JsType createSeaFirstSingleFeeDataGridColumn(){
    return seaFirstSingleFee.textColumn();
  }
  
  // 首款海运费单价（带单位）
  public FieldCodes seaFirstSingleFeeWithUnit() {
    if (seaFirstSingleFeeWithUnit.getInput() == null) seaFirstSingleFeeWithUnit.setInput(createSeaFirstSingleFeeWithUnitInput());
    if (seaFirstSingleFeeWithUnit.getQueryInput() == null) seaFirstSingleFeeWithUnit.setQueryInput(createSeaFirstSingleFeeWithUnitQueryInput());
    if (seaFirstSingleFeeWithUnit.getDataGridColumn() == null) seaFirstSingleFeeWithUnit.setDataGridColumn(createSeaFirstSingleFeeWithUnitDataGridColumn());
    return seaFirstSingleFeeWithUnit;
  }
  public HtmlTag createSeaFirstSingleFeeWithUnitInput(){
    return seaFirstSingleFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSeaFirstSingleFeeWithUnitQueryInput(){
    return seaFirstSingleFee.numberQueryInput();
  }
  public JsType createSeaFirstSingleFeeWithUnitDataGridColumn(){
    return seaFirstSingleFee.textColumn();
  }
  
  // 首款海运费单价币种
  public FieldCodes seaFirstSingleFeeUnit() {
    if (seaFirstSingleFeeUnit.getInput() == null) seaFirstSingleFeeUnit.setInput(createSeaFirstSingleFeeUnitInput());
    if (seaFirstSingleFeeUnit.getQueryInput() == null) seaFirstSingleFeeUnit.setQueryInput(createSeaFirstSingleFeeUnitQueryInput());
    if (seaFirstSingleFeeUnit.getDataGridColumn() == null) seaFirstSingleFeeUnit.setDataGridColumn(createSeaFirstSingleFeeUnitDataGridColumn());
    return seaFirstSingleFeeUnit;
  }
  public HtmlTag createSeaFirstSingleFeeUnitInput(){
    return seaFirstSingleFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSeaFirstSingleFeeUnitQueryInput(){
    return seaFirstSingleFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSeaFirstSingleFeeUnitDataGridColumn(){
    return seaFirstSingleFeeUnit.textColumn();
  }
  
  // 尾款海运费单价
  public FieldCodes seaLastSingleFee() {
    if (seaLastSingleFee.getInput() == null) seaLastSingleFee.setInput(createSeaLastSingleFeeInput());
    if (seaLastSingleFee.getQueryInput() == null) seaLastSingleFee.setQueryInput(createSeaLastSingleFeeQueryInput());
    if (seaLastSingleFee.getDataGridColumn() == null) seaLastSingleFee.setDataGridColumn(createSeaLastSingleFeeDataGridColumn());
    return seaLastSingleFee;
  }
  public HtmlTag createSeaLastSingleFeeInput(){
    return seaLastSingleFee.numberInput(2);
  }
  public HtmlTag createSeaLastSingleFeeQueryInput(){
    return seaLastSingleFee.numberQueryInput();
  }
  public JsType createSeaLastSingleFeeDataGridColumn(){
    return seaLastSingleFee.textColumn();
  }
  
  // 尾款海运费单价（带单位）
  public FieldCodes seaLastSingleFeeWithUnit() {
    if (seaLastSingleFeeWithUnit.getInput() == null) seaLastSingleFeeWithUnit.setInput(createSeaLastSingleFeeWithUnitInput());
    if (seaLastSingleFeeWithUnit.getQueryInput() == null) seaLastSingleFeeWithUnit.setQueryInput(createSeaLastSingleFeeWithUnitQueryInput());
    if (seaLastSingleFeeWithUnit.getDataGridColumn() == null) seaLastSingleFeeWithUnit.setDataGridColumn(createSeaLastSingleFeeWithUnitDataGridColumn());
    return seaLastSingleFeeWithUnit;
  }
  public HtmlTag createSeaLastSingleFeeWithUnitInput(){
    return seaLastSingleFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createSeaLastSingleFeeWithUnitQueryInput(){
    return seaLastSingleFee.numberQueryInput();
  }
  public JsType createSeaLastSingleFeeWithUnitDataGridColumn(){
    return seaLastSingleFee.textColumn();
  }
  
  // 尾款海运费单价币种
  public FieldCodes seaLastSingleFeeUnit() {
    if (seaLastSingleFeeUnit.getInput() == null) seaLastSingleFeeUnit.setInput(createSeaLastSingleFeeUnitInput());
    if (seaLastSingleFeeUnit.getQueryInput() == null) seaLastSingleFeeUnit.setQueryInput(createSeaLastSingleFeeUnitQueryInput());
    if (seaLastSingleFeeUnit.getDataGridColumn() == null) seaLastSingleFeeUnit.setDataGridColumn(createSeaLastSingleFeeUnitDataGridColumn());
    return seaLastSingleFeeUnit;
  }
  public HtmlTag createSeaLastSingleFeeUnitInput(){
    return seaLastSingleFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createSeaLastSingleFeeUnitQueryInput(){
    return seaLastSingleFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createSeaLastSingleFeeUnitDataGridColumn(){
    return seaLastSingleFeeUnit.textColumn();
  }
  
  // 油调单价
  public FieldCodes oilAdjustSingleFee() {
    if (oilAdjustSingleFee.getInput() == null) oilAdjustSingleFee.setInput(createOilAdjustSingleFeeInput());
    if (oilAdjustSingleFee.getQueryInput() == null) oilAdjustSingleFee.setQueryInput(createOilAdjustSingleFeeQueryInput());
    if (oilAdjustSingleFee.getDataGridColumn() == null) oilAdjustSingleFee.setDataGridColumn(createOilAdjustSingleFeeDataGridColumn());
    return oilAdjustSingleFee;
  }
  public HtmlTag createOilAdjustSingleFeeInput(){
    return oilAdjustSingleFee.numberInput(2);
  }
  public HtmlTag createOilAdjustSingleFeeQueryInput(){
    return oilAdjustSingleFee.numberQueryInput();
  }
  public JsType createOilAdjustSingleFeeDataGridColumn(){
    return oilAdjustSingleFee.textColumn();
  }
  
  // 油调单价（带单位）
  public FieldCodes oilAdjustSingleFeeWithUnit() {
    if (oilAdjustSingleFeeWithUnit.getInput() == null) oilAdjustSingleFeeWithUnit.setInput(createOilAdjustSingleFeeWithUnitInput());
    if (oilAdjustSingleFeeWithUnit.getQueryInput() == null) oilAdjustSingleFeeWithUnit.setQueryInput(createOilAdjustSingleFeeWithUnitQueryInput());
    if (oilAdjustSingleFeeWithUnit.getDataGridColumn() == null) oilAdjustSingleFeeWithUnit.setDataGridColumn(createOilAdjustSingleFeeWithUnitDataGridColumn());
    return oilAdjustSingleFeeWithUnit;
  }
  public HtmlTag createOilAdjustSingleFeeWithUnitInput(){
    return oilAdjustSingleFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createOilAdjustSingleFeeWithUnitQueryInput(){
    return oilAdjustSingleFee.numberQueryInput();
  }
  public JsType createOilAdjustSingleFeeWithUnitDataGridColumn(){
    return oilAdjustSingleFee.textColumn();
  }
  
  // 油调单价币种
  public FieldCodes oilAdjustSingleFeeUnit() {
    if (oilAdjustSingleFeeUnit.getInput() == null) oilAdjustSingleFeeUnit.setInput(createOilAdjustSingleFeeUnitInput());
    if (oilAdjustSingleFeeUnit.getQueryInput() == null) oilAdjustSingleFeeUnit.setQueryInput(createOilAdjustSingleFeeUnitQueryInput());
    if (oilAdjustSingleFeeUnit.getDataGridColumn() == null) oilAdjustSingleFeeUnit.setDataGridColumn(createOilAdjustSingleFeeUnitDataGridColumn());
    return oilAdjustSingleFeeUnit;
  }
  public HtmlTag createOilAdjustSingleFeeUnitInput(){
    return oilAdjustSingleFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createOilAdjustSingleFeeUnitQueryInput(){
    return oilAdjustSingleFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createOilAdjustSingleFeeUnitDataGridColumn(){
    return oilAdjustSingleFeeUnit.textColumn();
  }
  
  // 基价
  public FieldCodes baseFee() {
    if (baseFee.getInput() == null) baseFee.setInput(createBaseFeeInput());
    if (baseFee.getQueryInput() == null) baseFee.setQueryInput(createBaseFeeQueryInput());
    if (baseFee.getDataGridColumn() == null) baseFee.setDataGridColumn(createBaseFeeDataGridColumn());
    return baseFee;
  }
  public HtmlTag createBaseFeeInput(){
    return baseFee.numberInput(2);
  }
  public HtmlTag createBaseFeeQueryInput(){
    return baseFee.numberQueryInput();
  }
  public JsType createBaseFeeDataGridColumn(){
    return baseFee.textColumn();
  }
  
  // 基价（带单位）
  public FieldCodes baseFeeWithUnit() {
    if (baseFeeWithUnit.getInput() == null) baseFeeWithUnit.setInput(createBaseFeeWithUnitInput());
    if (baseFeeWithUnit.getQueryInput() == null) baseFeeWithUnit.setQueryInput(createBaseFeeWithUnitQueryInput());
    if (baseFeeWithUnit.getDataGridColumn() == null) baseFeeWithUnit.setDataGridColumn(createBaseFeeWithUnitDataGridColumn());
    return baseFeeWithUnit;
  }
  public HtmlTag createBaseFeeWithUnitInput(){
    return baseFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createBaseFeeWithUnitQueryInput(){
    return baseFee.numberQueryInput();
  }
  public JsType createBaseFeeWithUnitDataGridColumn(){
    return baseFee.textColumn();
  }
  
  // 基价币种
  public FieldCodes baseFeeUnit() {
    if (baseFeeUnit.getInput() == null) baseFeeUnit.setInput(createBaseFeeUnitInput());
    if (baseFeeUnit.getQueryInput() == null) baseFeeUnit.setQueryInput(createBaseFeeUnitQueryInput());
    if (baseFeeUnit.getDataGridColumn() == null) baseFeeUnit.setDataGridColumn(createBaseFeeUnitDataGridColumn());
    return baseFeeUnit;
  }
  public HtmlTag createBaseFeeUnitInput(){
    return baseFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createBaseFeeUnitQueryInput(){
    return baseFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createBaseFeeUnitDataGridColumn(){
    return baseFeeUnit.textColumn();
  }
  
  // 港口调整
  public FieldCodes portAdjust() {
    if (portAdjust.getInput() == null) portAdjust.setInput(createPortAdjustInput());
    if (portAdjust.getQueryInput() == null) portAdjust.setQueryInput(createPortAdjustQueryInput());
    if (portAdjust.getDataGridColumn() == null) portAdjust.setDataGridColumn(createPortAdjustDataGridColumn());
    return portAdjust;
  }
  public HtmlTag createPortAdjustInput(){
    return portAdjust.numberInput(2);
  }
  public HtmlTag createPortAdjustQueryInput(){
    return portAdjust.numberQueryInput();
  }
  public JsType createPortAdjustDataGridColumn(){
    return portAdjust.textColumn();
  }
  
  // 港口调整（带单位）
  public FieldCodes portAdjustWithUnit() {
    if (portAdjustWithUnit.getInput() == null) portAdjustWithUnit.setInput(createPortAdjustWithUnitInput());
    if (portAdjustWithUnit.getQueryInput() == null) portAdjustWithUnit.setQueryInput(createPortAdjustWithUnitQueryInput());
    if (portAdjustWithUnit.getDataGridColumn() == null) portAdjustWithUnit.setDataGridColumn(createPortAdjustWithUnitDataGridColumn());
    return portAdjustWithUnit;
  }
  public HtmlTag createPortAdjustWithUnitInput(){
    return portAdjustWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createPortAdjustWithUnitQueryInput(){
    return portAdjust.numberQueryInput();
  }
  public JsType createPortAdjustWithUnitDataGridColumn(){
    return portAdjust.textColumn();
  }
  
  // 港口调整币种
  public FieldCodes portAdjustUnit() {
    if (portAdjustUnit.getInput() == null) portAdjustUnit.setInput(createPortAdjustUnitInput());
    if (portAdjustUnit.getQueryInput() == null) portAdjustUnit.setQueryInput(createPortAdjustUnitQueryInput());
    if (portAdjustUnit.getDataGridColumn() == null) portAdjustUnit.setDataGridColumn(createPortAdjustUnitDataGridColumn());
    return portAdjustUnit;
  }
  public HtmlTag createPortAdjustUnitInput(){
    return portAdjustUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createPortAdjustUnitQueryInput(){
    return portAdjustUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createPortAdjustUnitDataGridColumn(){
    return portAdjustUnit.textColumn();
  }
  
  // 油价调整
  public FieldCodes oilAdjustFee() {
    if (oilAdjustFee.getInput() == null) oilAdjustFee.setInput(createOilAdjustFeeInput());
    if (oilAdjustFee.getQueryInput() == null) oilAdjustFee.setQueryInput(createOilAdjustFeeQueryInput());
    if (oilAdjustFee.getDataGridColumn() == null) oilAdjustFee.setDataGridColumn(createOilAdjustFeeDataGridColumn());
    return oilAdjustFee;
  }
  public HtmlTag createOilAdjustFeeInput(){
    return oilAdjustFee.numberInput(2);
  }
  public HtmlTag createOilAdjustFeeQueryInput(){
    return oilAdjustFee.numberQueryInput();
  }
  public JsType createOilAdjustFeeDataGridColumn(){
    return oilAdjustFee.textColumn();
  }
  
  // 油价调整（带单位）
  public FieldCodes oilAdjustFeeWithUnit() {
    if (oilAdjustFeeWithUnit.getInput() == null) oilAdjustFeeWithUnit.setInput(createOilAdjustFeeWithUnitInput());
    if (oilAdjustFeeWithUnit.getQueryInput() == null) oilAdjustFeeWithUnit.setQueryInput(createOilAdjustFeeWithUnitQueryInput());
    if (oilAdjustFeeWithUnit.getDataGridColumn() == null) oilAdjustFeeWithUnit.setDataGridColumn(createOilAdjustFeeWithUnitDataGridColumn());
    return oilAdjustFeeWithUnit;
  }
  public HtmlTag createOilAdjustFeeWithUnitInput(){
    return oilAdjustFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createOilAdjustFeeWithUnitQueryInput(){
    return oilAdjustFee.numberQueryInput();
  }
  public JsType createOilAdjustFeeWithUnitDataGridColumn(){
    return oilAdjustFee.textColumn();
  }
  
  // 油价调整币种
  public FieldCodes oilAdjustFeeUnit() {
    if (oilAdjustFeeUnit.getInput() == null) oilAdjustFeeUnit.setInput(createOilAdjustFeeUnitInput());
    if (oilAdjustFeeUnit.getQueryInput() == null) oilAdjustFeeUnit.setQueryInput(createOilAdjustFeeUnitQueryInput());
    if (oilAdjustFeeUnit.getDataGridColumn() == null) oilAdjustFeeUnit.setDataGridColumn(createOilAdjustFeeUnitDataGridColumn());
    return oilAdjustFeeUnit;
  }
  public HtmlTag createOilAdjustFeeUnitInput(){
    return oilAdjustFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createOilAdjustFeeUnitQueryInput(){
    return oilAdjustFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createOilAdjustFeeUnitDataGridColumn(){
    return oilAdjustFeeUnit.textColumn();
  }
  
  // 运费单价
  public FieldCodes transportFee() {
    if (transportFee.getInput() == null) transportFee.setInput(createTransportFeeInput());
    if (transportFee.getQueryInput() == null) transportFee.setQueryInput(createTransportFeeQueryInput());
    if (transportFee.getDataGridColumn() == null) transportFee.setDataGridColumn(createTransportFeeDataGridColumn());
    return transportFee;
  }
  public HtmlTag createTransportFeeInput(){
    return transportFee.numberInput(2);
  }
  public HtmlTag createTransportFeeQueryInput(){
    return transportFee.numberQueryInput();
  }
  public JsType createTransportFeeDataGridColumn(){
    return transportFee.textColumn();
  }
  
  // 运费单价（带单位）
  public FieldCodes transportFeeWithUnit() {
    if (transportFeeWithUnit.getInput() == null) transportFeeWithUnit.setInput(createTransportFeeWithUnitInput());
    if (transportFeeWithUnit.getQueryInput() == null) transportFeeWithUnit.setQueryInput(createTransportFeeWithUnitQueryInput());
    if (transportFeeWithUnit.getDataGridColumn() == null) transportFeeWithUnit.setDataGridColumn(createTransportFeeWithUnitDataGridColumn());
    return transportFeeWithUnit;
  }
  public HtmlTag createTransportFeeWithUnitInput(){
    return transportFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createTransportFeeWithUnitQueryInput(){
    return transportFee.numberQueryInput();
  }
  public JsType createTransportFeeWithUnitDataGridColumn(){
    return transportFee.textColumn();
  }
  
  // 运费单价币种
  public FieldCodes transportFeeUnit() {
    if (transportFeeUnit.getInput() == null) transportFeeUnit.setInput(createTransportFeeUnitInput());
    if (transportFeeUnit.getQueryInput() == null) transportFeeUnit.setQueryInput(createTransportFeeUnitQueryInput());
    if (transportFeeUnit.getDataGridColumn() == null) transportFeeUnit.setDataGridColumn(createTransportFeeUnitDataGridColumn());
    return transportFeeUnit;
  }
  public HtmlTag createTransportFeeUnitInput(){
    return transportFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createTransportFeeUnitQueryInput(){
    return transportFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createTransportFeeUnitDataGridColumn(){
    return transportFeeUnit.textColumn();
  }
  
  // 运费首款额
  public FieldCodes transportFirstFee() {
    if (transportFirstFee.getInput() == null) transportFirstFee.setInput(createTransportFirstFeeInput());
    if (transportFirstFee.getQueryInput() == null) transportFirstFee.setQueryInput(createTransportFirstFeeQueryInput());
    if (transportFirstFee.getDataGridColumn() == null) transportFirstFee.setDataGridColumn(createTransportFirstFeeDataGridColumn());
    return transportFirstFee;
  }
  public HtmlTag createTransportFirstFeeInput(){
    return transportFirstFee.numberInput(2);
  }
  public HtmlTag createTransportFirstFeeQueryInput(){
    return transportFirstFee.numberQueryInput();
  }
  public JsType createTransportFirstFeeDataGridColumn(){
    return transportFirstFee.textColumn();
  }
  
  // 运费首款额（带单位）
  public FieldCodes transportFirstFeeWithUnit() {
    if (transportFirstFeeWithUnit.getInput() == null) transportFirstFeeWithUnit.setInput(createTransportFirstFeeWithUnitInput());
    if (transportFirstFeeWithUnit.getQueryInput() == null) transportFirstFeeWithUnit.setQueryInput(createTransportFirstFeeWithUnitQueryInput());
    if (transportFirstFeeWithUnit.getDataGridColumn() == null) transportFirstFeeWithUnit.setDataGridColumn(createTransportFirstFeeWithUnitDataGridColumn());
    return transportFirstFeeWithUnit;
  }
  public HtmlTag createTransportFirstFeeWithUnitInput(){
    return transportFirstFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createTransportFirstFeeWithUnitQueryInput(){
    return transportFirstFee.numberQueryInput();
  }
  public JsType createTransportFirstFeeWithUnitDataGridColumn(){
    return transportFirstFee.textColumn();
  }
  
  // 运费首款额币种
  public FieldCodes transportFirstFeeUnit() {
    if (transportFirstFeeUnit.getInput() == null) transportFirstFeeUnit.setInput(createTransportFirstFeeUnitInput());
    if (transportFirstFeeUnit.getQueryInput() == null) transportFirstFeeUnit.setQueryInput(createTransportFirstFeeUnitQueryInput());
    if (transportFirstFeeUnit.getDataGridColumn() == null) transportFirstFeeUnit.setDataGridColumn(createTransportFirstFeeUnitDataGridColumn());
    return transportFirstFeeUnit;
  }
  public HtmlTag createTransportFirstFeeUnitInput(){
    return transportFirstFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createTransportFirstFeeUnitQueryInput(){
    return transportFirstFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createTransportFirstFeeUnitDataGridColumn(){
    return transportFirstFeeUnit.textColumn();
  }
  
  // 付船东首款日期
  public FieldCodes shipownerFirstFeeDate() {
    if (shipownerFirstFeeDate.getInput() == null) shipownerFirstFeeDate.setInput(createShipownerFirstFeeDateInput());
    if (shipownerFirstFeeDate.getQueryInput() == null) shipownerFirstFeeDate.setQueryInput(createShipownerFirstFeeDateQueryInput());
    if (shipownerFirstFeeDate.getDataGridColumn() == null) shipownerFirstFeeDate.setDataGridColumn(createShipownerFirstFeeDateDataGridColumn());
    return shipownerFirstFeeDate;
  }
  public HtmlTag createShipownerFirstFeeDateInput(){
    return shipownerFirstFeeDate.dateInput();
  }
  public HtmlTag createShipownerFirstFeeDateQueryInput(){
    return shipownerFirstFeeDate.dateQueryInput();
  }
  public JsType createShipownerFirstFeeDateDataGridColumn(){
    return shipownerFirstFeeDate.dateColumn();
  }
  
  // 运费尾款额
  public FieldCodes transportLastFee() {
    if (transportLastFee.getInput() == null) transportLastFee.setInput(createTransportLastFeeInput());
    if (transportLastFee.getQueryInput() == null) transportLastFee.setQueryInput(createTransportLastFeeQueryInput());
    if (transportLastFee.getDataGridColumn() == null) transportLastFee.setDataGridColumn(createTransportLastFeeDataGridColumn());
    return transportLastFee;
  }
  public HtmlTag createTransportLastFeeInput(){
    return transportLastFee.numberInput(2);
  }
  public HtmlTag createTransportLastFeeQueryInput(){
    return transportLastFee.numberQueryInput();
  }
  public JsType createTransportLastFeeDataGridColumn(){
    return transportLastFee.textColumn();
  }
  
  // 运费尾款额（带单位）
  public FieldCodes transportLastFeeWithUnit() {
    if (transportLastFeeWithUnit.getInput() == null) transportLastFeeWithUnit.setInput(createTransportLastFeeWithUnitInput());
    if (transportLastFeeWithUnit.getQueryInput() == null) transportLastFeeWithUnit.setQueryInput(createTransportLastFeeWithUnitQueryInput());
    if (transportLastFeeWithUnit.getDataGridColumn() == null) transportLastFeeWithUnit.setDataGridColumn(createTransportLastFeeWithUnitDataGridColumn());
    return transportLastFeeWithUnit;
  }
  public HtmlTag createTransportLastFeeWithUnitInput(){
    return transportLastFeeWithUnit.quantityWithUnitInput(2, "2003"); 
  }
  public HtmlTag createTransportLastFeeWithUnitQueryInput(){
    return transportLastFee.numberQueryInput();
  }
  public JsType createTransportLastFeeWithUnitDataGridColumn(){
    return transportLastFee.textColumn();
  }
  
  // 运费尾款额币种
  public FieldCodes transportLastFeeUnit() {
    if (transportLastFeeUnit.getInput() == null) transportLastFeeUnit.setInput(createTransportLastFeeUnitInput());
    if (transportLastFeeUnit.getQueryInput() == null) transportLastFeeUnit.setQueryInput(createTransportLastFeeUnitQueryInput());
    if (transportLastFeeUnit.getDataGridColumn() == null) transportLastFeeUnit.setDataGridColumn(createTransportLastFeeUnitDataGridColumn());
    return transportLastFeeUnit;
  }
  public HtmlTag createTransportLastFeeUnitInput(){
    return transportLastFeeUnit.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public HtmlTag createTransportLastFeeUnitQueryInput(){
    return transportLastFeeUnit.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2003");
  }
  public JsType createTransportLastFeeUnitDataGridColumn(){
    return transportLastFeeUnit.textColumn();
  }
  
  // 付船东尾款日期
  public FieldCodes shipownerLastFeeDate() {
    if (shipownerLastFeeDate.getInput() == null) shipownerLastFeeDate.setInput(createShipownerLastFeeDateInput());
    if (shipownerLastFeeDate.getQueryInput() == null) shipownerLastFeeDate.setQueryInput(createShipownerLastFeeDateQueryInput());
    if (shipownerLastFeeDate.getDataGridColumn() == null) shipownerLastFeeDate.setDataGridColumn(createShipownerLastFeeDateDataGridColumn());
    return shipownerLastFeeDate;
  }
  public HtmlTag createShipownerLastFeeDateInput(){
    return shipownerLastFeeDate.dateInput();
  }
  public HtmlTag createShipownerLastFeeDateQueryInput(){
    return shipownerLastFeeDate.dateQueryInput();
  }
  public JsType createShipownerLastFeeDateDataGridColumn(){
    return shipownerLastFeeDate.dateColumn();
  }
  
  // 收租家首款运费/美元
  public FieldCodes rentShipFirstFee() {
    if (rentShipFirstFee.getInput() == null) rentShipFirstFee.setInput(createRentShipFirstFeeInput());
    if (rentShipFirstFee.getQueryInput() == null) rentShipFirstFee.setQueryInput(createRentShipFirstFeeQueryInput());
    if (rentShipFirstFee.getDataGridColumn() == null) rentShipFirstFee.setDataGridColumn(createRentShipFirstFeeDataGridColumn());
    return rentShipFirstFee;
  }
  public HtmlTag createRentShipFirstFeeInput(){
    return rentShipFirstFee.numberInput(2);
  }
  public HtmlTag createRentShipFirstFeeQueryInput(){
    return rentShipFirstFee.numberQueryInput();
  }
  public JsType createRentShipFirstFeeDataGridColumn(){
    return rentShipFirstFee.textColumn();
  }
  
  // 首款收到运费日
  public FieldCodes transportFirstFeeDate() {
    if (transportFirstFeeDate.getInput() == null) transportFirstFeeDate.setInput(createTransportFirstFeeDateInput());
    if (transportFirstFeeDate.getQueryInput() == null) transportFirstFeeDate.setQueryInput(createTransportFirstFeeDateQueryInput());
    if (transportFirstFeeDate.getDataGridColumn() == null) transportFirstFeeDate.setDataGridColumn(createTransportFirstFeeDateDataGridColumn());
    return transportFirstFeeDate;
  }
  public HtmlTag createTransportFirstFeeDateInput(){
    return transportFirstFeeDate.dateInput();
  }
  public HtmlTag createTransportFirstFeeDateQueryInput(){
    return transportFirstFeeDate.dateQueryInput();
  }
  public JsType createTransportFirstFeeDateDataGridColumn(){
    return transportFirstFeeDate.dateColumn();
  }
  
  // 海运费尾款/美元
  public FieldCodes seaLastFee() {
    if (seaLastFee.getInput() == null) seaLastFee.setInput(createSeaLastFeeInput());
    if (seaLastFee.getQueryInput() == null) seaLastFee.setQueryInput(createSeaLastFeeQueryInput());
    if (seaLastFee.getDataGridColumn() == null) seaLastFee.setDataGridColumn(createSeaLastFeeDataGridColumn());
    return seaLastFee;
  }
  public HtmlTag createSeaLastFeeInput(){
    return seaLastFee.numberInput(2);
  }
  public HtmlTag createSeaLastFeeQueryInput(){
    return seaLastFee.numberQueryInput();
  }
  public JsType createSeaLastFeeDataGridColumn(){
    return seaLastFee.textColumn();
  }
  
  // 尾款出票日
  public FieldCodes lastIssueDate() {
    if (lastIssueDate.getInput() == null) lastIssueDate.setInput(createLastIssueDateInput());
    if (lastIssueDate.getQueryInput() == null) lastIssueDate.setQueryInput(createLastIssueDateQueryInput());
    if (lastIssueDate.getDataGridColumn() == null) lastIssueDate.setDataGridColumn(createLastIssueDateDataGridColumn());
    return lastIssueDate;
  }
  public HtmlTag createLastIssueDateInput(){
    return lastIssueDate.dateInput();
  }
  public HtmlTag createLastIssueDateQueryInput(){
    return lastIssueDate.dateQueryInput();
  }
  public JsType createLastIssueDateDataGridColumn(){
    return lastIssueDate.dateColumn();
  }
  
  // 海运费单价/美元
  public FieldCodes unitSeaFee() {
    if (unitSeaFee.getInput() == null) unitSeaFee.setInput(createUnitSeaFeeInput());
    if (unitSeaFee.getQueryInput() == null) unitSeaFee.setQueryInput(createUnitSeaFeeQueryInput());
    if (unitSeaFee.getDataGridColumn() == null) unitSeaFee.setDataGridColumn(createUnitSeaFeeDataGridColumn());
    return unitSeaFee;
  }
  public HtmlTag createUnitSeaFeeInput(){
    return unitSeaFee.numberInput(2);
  }
  public HtmlTag createUnitSeaFeeQueryInput(){
    return unitSeaFee.numberQueryInput();
  }
  public JsType createUnitSeaFeeDataGridColumn(){
    return unitSeaFee.textColumn();
  }
  
  // 装卸港调整/美元
  public FieldCodes loadUnloadAdjust() {
    if (loadUnloadAdjust.getInput() == null) loadUnloadAdjust.setInput(createLoadUnloadAdjustInput());
    if (loadUnloadAdjust.getQueryInput() == null) loadUnloadAdjust.setQueryInput(createLoadUnloadAdjustQueryInput());
    if (loadUnloadAdjust.getDataGridColumn() == null) loadUnloadAdjust.setDataGridColumn(createLoadUnloadAdjustDataGridColumn());
    return loadUnloadAdjust;
  }
  public HtmlTag createLoadUnloadAdjustInput(){
    return loadUnloadAdjust.numberInput(2);
  }
  public HtmlTag createLoadUnloadAdjustQueryInput(){
    return loadUnloadAdjust.numberQueryInput();
  }
  public JsType createLoadUnloadAdjustDataGridColumn(){
    return loadUnloadAdjust.textColumn();
  }
  
  // 油调单价/美元
  public FieldCodes uintOilAdjustFee() {
    if (uintOilAdjustFee.getInput() == null) uintOilAdjustFee.setInput(createUintOilAdjustFeeInput());
    if (uintOilAdjustFee.getQueryInput() == null) uintOilAdjustFee.setQueryInput(createUintOilAdjustFeeQueryInput());
    if (uintOilAdjustFee.getDataGridColumn() == null) uintOilAdjustFee.setDataGridColumn(createUintOilAdjustFeeDataGridColumn());
    return uintOilAdjustFee;
  }
  public HtmlTag createUintOilAdjustFeeInput(){
    return uintOilAdjustFee.numberInput(2);
  }
  public HtmlTag createUintOilAdjustFeeQueryInput(){
    return uintOilAdjustFee.numberQueryInput();
  }
  public JsType createUintOilAdjustFeeDataGridColumn(){
    return uintOilAdjustFee.textColumn();
  }
  
  // 付船东首款运费/美元
  public FieldCodes seaFirstFee() {
    if (seaFirstFee.getInput() == null) seaFirstFee.setInput(createSeaFirstFeeInput());
    if (seaFirstFee.getQueryInput() == null) seaFirstFee.setQueryInput(createSeaFirstFeeQueryInput());
    if (seaFirstFee.getDataGridColumn() == null) seaFirstFee.setDataGridColumn(createSeaFirstFeeDataGridColumn());
    return seaFirstFee;
  }
  public HtmlTag createSeaFirstFeeInput(){
    return seaFirstFee.numberInput(2);
  }
  public HtmlTag createSeaFirstFeeQueryInput(){
    return seaFirstFee.numberQueryInput();
  }
  public JsType createSeaFirstFeeDataGridColumn(){
    return seaFirstFee.textColumn();
  }
  
  // 付船东尾款运费/美元
  public FieldCodes voyageShipownerFee() {
    if (voyageShipownerFee.getInput() == null) voyageShipownerFee.setInput(createVoyageShipownerFeeInput());
    if (voyageShipownerFee.getQueryInput() == null) voyageShipownerFee.setQueryInput(createVoyageShipownerFeeQueryInput());
    if (voyageShipownerFee.getDataGridColumn() == null) voyageShipownerFee.setDataGridColumn(createVoyageShipownerFeeDataGridColumn());
    return voyageShipownerFee;
  }
  public HtmlTag createVoyageShipownerFeeInput(){
    return voyageShipownerFee.numberInput(2);
  }
  public HtmlTag createVoyageShipownerFeeQueryInput(){
    return voyageShipownerFee.numberQueryInput();
  }
  public JsType createVoyageShipownerFeeDataGridColumn(){
    return voyageShipownerFee.textColumn();
  }
  
  // 收租家尾款运费/美元
  public FieldCodes voyageRentFee() {
    if (voyageRentFee.getInput() == null) voyageRentFee.setInput(createVoyageRentFeeInput());
    if (voyageRentFee.getQueryInput() == null) voyageRentFee.setQueryInput(createVoyageRentFeeQueryInput());
    if (voyageRentFee.getDataGridColumn() == null) voyageRentFee.setDataGridColumn(createVoyageRentFeeDataGridColumn());
    return voyageRentFee;
  }
  public HtmlTag createVoyageRentFeeInput(){
    return voyageRentFee.numberInput(2);
  }
  public HtmlTag createVoyageRentFeeQueryInput(){
    return voyageRentFee.numberQueryInput();
  }
  public JsType createVoyageRentFeeDataGridColumn(){
    return voyageRentFee.textColumn();
  }
  
  // 运费单价/美元
  public FieldCodes unitTransportFee() {
    if (unitTransportFee.getInput() == null) unitTransportFee.setInput(createUnitTransportFeeInput());
    if (unitTransportFee.getQueryInput() == null) unitTransportFee.setQueryInput(createUnitTransportFeeQueryInput());
    if (unitTransportFee.getDataGridColumn() == null) unitTransportFee.setDataGridColumn(createUnitTransportFeeDataGridColumn());
    return unitTransportFee;
  }
  public HtmlTag createUnitTransportFeeInput(){
    return unitTransportFee.numberInput(2);
  }
  public HtmlTag createUnitTransportFeeQueryInput(){
    return unitTransportFee.numberQueryInput();
  }
  public JsType createUnitTransportFeeDataGridColumn(){
    return unitTransportFee.textColumn();
  }
  
  // 最终运费收付差额/美元
  public FieldCodes lastTransportFee() {
    if (lastTransportFee.getInput() == null) lastTransportFee.setInput(createLastTransportFeeInput());
    if (lastTransportFee.getQueryInput() == null) lastTransportFee.setQueryInput(createLastTransportFeeQueryInput());
    if (lastTransportFee.getDataGridColumn() == null) lastTransportFee.setDataGridColumn(createLastTransportFeeDataGridColumn());
    return lastTransportFee;
  }
  public HtmlTag createLastTransportFeeInput(){
    return lastTransportFee.numberInput(2);
  }
  public HtmlTag createLastTransportFeeQueryInput(){
    return lastTransportFee.numberQueryInput();
  }
  public JsType createLastTransportFeeDataGridColumn(){
    return lastTransportFee.textColumn();
  }
  
  // 结算结束日
  public FieldCodes settlementDate() {
    if (settlementDate.getInput() == null) settlementDate.setInput(createSettlementDateInput());
    if (settlementDate.getQueryInput() == null) settlementDate.setQueryInput(createSettlementDateQueryInput());
    if (settlementDate.getDataGridColumn() == null) settlementDate.setDataGridColumn(createSettlementDateDataGridColumn());
    return settlementDate;
  }
  public HtmlTag createSettlementDateInput(){
    return settlementDate.dateInput();
  }
  public HtmlTag createSettlementDateQueryInput(){
    return settlementDate.dateQueryInput();
  }
  public JsType createSettlementDateDataGridColumn(){
    return settlementDate.dateColumn();
  }
  
  // COA与外转运费差额/美元
  public FieldCodes coaDifference() {
    if (coaDifference.getInput() == null) coaDifference.setInput(createCoaDifferenceInput());
    if (coaDifference.getQueryInput() == null) coaDifference.setQueryInput(createCoaDifferenceQueryInput());
    if (coaDifference.getDataGridColumn() == null) coaDifference.setDataGridColumn(createCoaDifferenceDataGridColumn());
    return coaDifference;
  }
  public HtmlTag createCoaDifferenceInput(){
    return coaDifference.numberInput(2);
  }
  public HtmlTag createCoaDifferenceQueryInput(){
    return coaDifference.numberQueryInput();
  }
  public JsType createCoaDifferenceDataGridColumn(){
    return coaDifference.textColumn();
  }
  
  // 当时汇率
  public FieldCodes exchangeRate() {
    if (exchangeRate.getInput() == null) exchangeRate.setInput(createExchangeRateInput());
    if (exchangeRate.getQueryInput() == null) exchangeRate.setQueryInput(createExchangeRateQueryInput());
    if (exchangeRate.getDataGridColumn() == null) exchangeRate.setDataGridColumn(createExchangeRateDataGridColumn());
    return exchangeRate;
  }
  public HtmlTag createExchangeRateInput(){
    return exchangeRate.numberInput(5);
  }
  public HtmlTag createExchangeRateQueryInput(){
    return exchangeRate.numberQueryInput();
  }
  public JsType createExchangeRateDataGridColumn(){
    return exchangeRate.textColumn();
  }
  
  // 最终收货人
  public FieldCodes finalReceiver() {
    if (finalReceiver.getInput() == null) finalReceiver.setInput(createFinalReceiverInput());
    if (finalReceiver.getQueryInput() == null) finalReceiver.setQueryInput(createFinalReceiverQueryInput());
    if (finalReceiver.getDataGridColumn() == null) finalReceiver.setDataGridColumn(createFinalReceiverDataGridColumn());
    return finalReceiver;
  }
  public HtmlTag createFinalReceiverInput(){
    return finalReceiver.textInput(30);
  }
  public HtmlTag createFinalReceiverQueryInput(){
    return finalReceiver.textQueryInput();
  }
  public JsType createFinalReceiverDataGridColumn(){
    return finalReceiver.textColumn();
  }
  
  // 归档
  public FieldCodes ffb020t050pArchived() {
    if (ffb020t050pArchived.getInput() == null) ffb020t050pArchived.setInput(createFfb020t050pArchivedInput());
    if (ffb020t050pArchived.getQueryInput() == null) ffb020t050pArchived.setQueryInput(createFfb020t050pArchivedQueryInput());
    if (ffb020t050pArchived.getDataGridColumn() == null) ffb020t050pArchived.setDataGridColumn(createFfb020t050pArchivedDataGridColumn());
    return ffb020t050pArchived;
  }
  public HtmlTag createFfb020t050pArchivedInput(){
    return ffb020t050pArchived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createFfb020t050pArchivedQueryInput(){
    return ffb020t050pArchived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createFfb020t050pArchivedDataGridColumn(){
    return ffb020t050pArchived.textColumn();
  }
  
  // 当前位置
  public FieldCodes currentLocation() {
    if (currentLocation.getInput() == null) currentLocation.setInput(createCurrentLocationInput());
    if (currentLocation.getQueryInput() == null) currentLocation.setQueryInput(createCurrentLocationQueryInput());
    if (currentLocation.getDataGridColumn() == null) currentLocation.setDataGridColumn(createCurrentLocationDataGridColumn());
    return currentLocation;
  }
  public HtmlTag createCurrentLocationInput(){
    return currentLocation.textInput(30);
  }
  public HtmlTag createCurrentLocationQueryInput(){
    return currentLocation.textQueryInput();
  }
  public JsType createCurrentLocationDataGridColumn(){
    return currentLocation.textColumn();
  }
  
  // 预计到新加坡日期
  public FieldCodes arrivedSingaporeDate() {
    if (arrivedSingaporeDate.getInput() == null) arrivedSingaporeDate.setInput(createArrivedSingaporeDateInput());
    if (arrivedSingaporeDate.getQueryInput() == null) arrivedSingaporeDate.setQueryInput(createArrivedSingaporeDateQueryInput());
    if (arrivedSingaporeDate.getDataGridColumn() == null) arrivedSingaporeDate.setDataGridColumn(createArrivedSingaporeDateDataGridColumn());
    return arrivedSingaporeDate;
  }
  public HtmlTag createArrivedSingaporeDateInput(){
    return arrivedSingaporeDate.dateInput();
  }
  public HtmlTag createArrivedSingaporeDateQueryInput(){
    return arrivedSingaporeDate.dateQueryInput();
  }
  public JsType createArrivedSingaporeDateDataGridColumn(){
    return arrivedSingaporeDate.dateColumn();
  }
  
  // 预计卸港日期
  public FieldCodes unloadDate() {
    if (unloadDate.getInput() == null) unloadDate.setInput(createUnloadDateInput());
    if (unloadDate.getQueryInput() == null) unloadDate.setQueryInput(createUnloadDateQueryInput());
    if (unloadDate.getDataGridColumn() == null) unloadDate.setDataGridColumn(createUnloadDateDataGridColumn());
    return unloadDate;
  }
  public HtmlTag createUnloadDateInput(){
    return unloadDate.dateInput();
  }
  public HtmlTag createUnloadDateQueryInput(){
    return unloadDate.dateQueryInput();
  }
  public JsType createUnloadDateDataGridColumn(){
    return unloadDate.dateColumn();
  }
  
  // 创建人
  public FieldCodes createBy() {
    if (createBy.getInput() == null) createBy.setInput(createCreateByInput());
    if (createBy.getQueryInput() == null) createBy.setQueryInput(createCreateByQueryInput());
    if (createBy.getDataGridColumn() == null) createBy.setDataGridColumn(createCreateByDataGridColumn());
    return createBy;
  }
  public HtmlTag createCreateByInput(){
    return createBy.textInput(30);
  }
  public HtmlTag createCreateByQueryInput(){
    return createBy.textQueryInput();
  }
  public JsType createCreateByDataGridColumn(){
    return createBy.textColumn();
  }
  
  // 创建日期
  public FieldCodes createDate() {
    if (createDate.getInput() == null) createDate.setInput(createCreateDateInput());
    if (createDate.getQueryInput() == null) createDate.setQueryInput(createCreateDateQueryInput());
    if (createDate.getDataGridColumn() == null) createDate.setDataGridColumn(createCreateDateDataGridColumn());
    return createDate;
  }
  public HtmlTag createCreateDateInput(){
    return createDate.datetimeInput();
  }
  public HtmlTag createCreateDateQueryInput(){
    return createDate.datetimeQueryInput();
  }
  public JsType createCreateDateDataGridColumn(){
    return createDate.datetimeColumn();
  }
  
  // 更新人
  public FieldCodes updateBy() {
    if (updateBy.getInput() == null) updateBy.setInput(createUpdateByInput());
    if (updateBy.getQueryInput() == null) updateBy.setQueryInput(createUpdateByQueryInput());
    if (updateBy.getDataGridColumn() == null) updateBy.setDataGridColumn(createUpdateByDataGridColumn());
    return updateBy;
  }
  public HtmlTag createUpdateByInput(){
    return updateBy.textInput(30);
  }
  public HtmlTag createUpdateByQueryInput(){
    return updateBy.textQueryInput();
  }
  public JsType createUpdateByDataGridColumn(){
    return updateBy.textColumn();
  }
  
  // 更新日期
  public FieldCodes updateDate() {
    if (updateDate.getInput() == null) updateDate.setInput(createUpdateDateInput());
    if (updateDate.getQueryInput() == null) updateDate.setQueryInput(createUpdateDateQueryInput());
    if (updateDate.getDataGridColumn() == null) updateDate.setDataGridColumn(createUpdateDateDataGridColumn());
    return updateDate;
  }
  public HtmlTag createUpdateDateInput(){
    return updateDate.datetimeInput();
  }
  public HtmlTag createUpdateDateQueryInput(){
    return updateDate.datetimeQueryInput();
  }
  public JsType createUpdateDateDataGridColumn(){
    return updateDate.datetimeColumn();
  }
  
  // 归档
  public FieldCodes archived() {
    if (archived.getInput() == null) archived.setInput(createArchivedInput());
    if (archived.getQueryInput() == null) archived.setQueryInput(createArchivedQueryInput());
    if (archived.getDataGridColumn() == null) archived.setDataGridColumn(createArchivedDataGridColumn());
    return archived;
  }
  public HtmlTag createArchivedInput(){
    return archived.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public HtmlTag createArchivedQueryInput(){
    return archived.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '已归档', value: '已归档'}, {label: '未归档', value: '未归档'}]");
  }
  public JsType createArchivedDataGridColumn(){
    return archived.textColumn();
  }
  
  
}
