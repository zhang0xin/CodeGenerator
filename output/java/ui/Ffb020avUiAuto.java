package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb020avUiAuto extends EntityUiBase {
  
  protected FieldCodes shipBatchId = new FieldCodes("shipBatchId", "船运批次", "ffb020av", "entity", "query");
  protected FieldCodes visibleDepartment = new FieldCodes("visibleDepartment", "可见部门", "ffb020av", "entity", "query");
  
  public Ffb020avUiAuto(){
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
  
  // 可见部门
  public FieldCodes visibleDepartment() {
    if (visibleDepartment.getInput() == null) visibleDepartment.setInput(createVisibleDepartmentInput());
    if (visibleDepartment.getQueryInput() == null) visibleDepartment.setQueryInput(createVisibleDepartmentQueryInput());
    if (visibleDepartment.getDataGridColumn() == null) visibleDepartment.setDataGridColumn(createVisibleDepartmentDataGridColumn());
    return visibleDepartment;
  }
  public HtmlTag createVisibleDepartmentInput(){
    return visibleDepartment.textInput(30);
  }
  public HtmlTag createVisibleDepartmentQueryInput(){
    return visibleDepartment.textQueryInput();
  }
  public JsType createVisibleDepartmentDataGridColumn(){
    return visibleDepartment.textColumn();
  }
  
  
}
