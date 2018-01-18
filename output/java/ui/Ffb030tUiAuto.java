package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb030tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb030t", "entity", "query");
  protected FieldCodes unloadPortId = new FieldCodes("unloadPortId", "卸港批次", "ffb030t", "entity", "query");
  protected FieldCodes unloadPort = new FieldCodes("unloadPort", "卸港", "ffb030t", "entity", "query");
  protected FieldCodes shipBatchId = new FieldCodes("shipBatchId", "船运批次", "ffb030t", "entity", "query");
  protected FieldCodes arrivedPortDate = new FieldCodes("arrivedPortDate", "NOR到港日", "ffb030t", "entity", "query");
  protected FieldCodes berthDate = new FieldCodes("berthDate", "靠泊日", "ffb030t", "entity", "query");
  protected FieldCodes unloadedDate = new FieldCodes("unloadedDate", "卸毕日", "ffb030t", "entity", "query");
  protected FieldCodes departPortDate = new FieldCodes("departPortDate", "离港日", "ffb030t", "entity", "query");
  protected FieldCodes finalReceiver = new FieldCodes("finalReceiver", "最终收货人", "ffb030t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb030t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb030t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb030t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb030t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb030t", "entity", "query");
  
  public Ffb030tUiAuto(){
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
  
  // 卸港批次
  public FieldCodes unloadPortId() {
    if (unloadPortId.getInput() == null) unloadPortId.setInput(createUnloadPortIdInput());
    if (unloadPortId.getQueryInput() == null) unloadPortId.setQueryInput(createUnloadPortIdQueryInput());
    if (unloadPortId.getDataGridColumn() == null) unloadPortId.setDataGridColumn(createUnloadPortIdDataGridColumn());
    return unloadPortId;
  }
  public HtmlTag createUnloadPortIdInput(){
    return unloadPortId.textInput(36);
  }
  public HtmlTag createUnloadPortIdQueryInput(){
    return unloadPortId.textQueryInput();
  }
  public JsType createUnloadPortIdDataGridColumn(){
    return unloadPortId.textColumn();
  }
  
  // 卸港
  public FieldCodes unloadPort() {
    if (unloadPort.getInput() == null) unloadPort.setInput(createUnloadPortInput());
    if (unloadPort.getQueryInput() == null) unloadPort.setQueryInput(createUnloadPortQueryInput());
    if (unloadPort.getDataGridColumn() == null) unloadPort.setDataGridColumn(createUnloadPortDataGridColumn());
    return unloadPort;
  }
  public HtmlTag createUnloadPortInput(){
    return unloadPort.comboboxInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2004");
  }
  public HtmlTag createUnloadPortQueryInput(){
    return unloadPort.comboboxQueryInputWithUrl("fcdNm", "fcdNm", "zaa010t.action?req.type=getListOnCategory&category=2004");
  }
  public JsType createUnloadPortDataGridColumn(){
    return unloadPort.textColumn();
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
  
  // NOR到港日
  public FieldCodes arrivedPortDate() {
    if (arrivedPortDate.getInput() == null) arrivedPortDate.setInput(createArrivedPortDateInput());
    if (arrivedPortDate.getQueryInput() == null) arrivedPortDate.setQueryInput(createArrivedPortDateQueryInput());
    if (arrivedPortDate.getDataGridColumn() == null) arrivedPortDate.setDataGridColumn(createArrivedPortDateDataGridColumn());
    return arrivedPortDate;
  }
  public HtmlTag createArrivedPortDateInput(){
    return arrivedPortDate.dateInput();
  }
  public HtmlTag createArrivedPortDateQueryInput(){
    return arrivedPortDate.dateQueryInput();
  }
  public JsType createArrivedPortDateDataGridColumn(){
    return arrivedPortDate.dateColumn();
  }
  
  // 靠泊日
  public FieldCodes berthDate() {
    if (berthDate.getInput() == null) berthDate.setInput(createBerthDateInput());
    if (berthDate.getQueryInput() == null) berthDate.setQueryInput(createBerthDateQueryInput());
    if (berthDate.getDataGridColumn() == null) berthDate.setDataGridColumn(createBerthDateDataGridColumn());
    return berthDate;
  }
  public HtmlTag createBerthDateInput(){
    return berthDate.dateInput();
  }
  public HtmlTag createBerthDateQueryInput(){
    return berthDate.dateQueryInput();
  }
  public JsType createBerthDateDataGridColumn(){
    return berthDate.dateColumn();
  }
  
  // 卸毕日
  public FieldCodes unloadedDate() {
    if (unloadedDate.getInput() == null) unloadedDate.setInput(createUnloadedDateInput());
    if (unloadedDate.getQueryInput() == null) unloadedDate.setQueryInput(createUnloadedDateQueryInput());
    if (unloadedDate.getDataGridColumn() == null) unloadedDate.setDataGridColumn(createUnloadedDateDataGridColumn());
    return unloadedDate;
  }
  public HtmlTag createUnloadedDateInput(){
    return unloadedDate.dateInput();
  }
  public HtmlTag createUnloadedDateQueryInput(){
    return unloadedDate.dateQueryInput();
  }
  public JsType createUnloadedDateDataGridColumn(){
    return unloadedDate.dateColumn();
  }
  
  // 离港日
  public FieldCodes departPortDate() {
    if (departPortDate.getInput() == null) departPortDate.setInput(createDepartPortDateInput());
    if (departPortDate.getQueryInput() == null) departPortDate.setQueryInput(createDepartPortDateQueryInput());
    if (departPortDate.getDataGridColumn() == null) departPortDate.setDataGridColumn(createDepartPortDateDataGridColumn());
    return departPortDate;
  }
  public HtmlTag createDepartPortDateInput(){
    return departPortDate.dateInput();
  }
  public HtmlTag createDepartPortDateQueryInput(){
    return departPortDate.dateQueryInput();
  }
  public JsType createDepartPortDateDataGridColumn(){
    return departPortDate.dateColumn();
  }
  
  // 最终收货人
  public FieldCodes finalReceiver() {
    if (finalReceiver.getInput() == null) finalReceiver.setInput(createFinalReceiverInput());
    if (finalReceiver.getQueryInput() == null) finalReceiver.setQueryInput(createFinalReceiverQueryInput());
    if (finalReceiver.getDataGridColumn() == null) finalReceiver.setDataGridColumn(createFinalReceiverDataGridColumn());
    return finalReceiver;
  }
  public HtmlTag createFinalReceiverInput(){
    return finalReceiver.textInput(10);
  }
  public HtmlTag createFinalReceiverQueryInput(){
    return finalReceiver.textQueryInput();
  }
  public JsType createFinalReceiverDataGridColumn(){
    return finalReceiver.textColumn();
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
