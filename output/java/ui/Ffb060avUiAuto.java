package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb060avUiAuto extends EntityUiBase {
  
  protected FieldCodes contractNumber = new FieldCodes("contractNumber", "合同号", "ffb060av", "entity", "query");
  protected FieldCodes visibleDepartment = new FieldCodes("visibleDepartment", "可见部门", "ffb060av", "entity", "query");
  
  public Ffb060avUiAuto(){
  }

  // 合同号
  public FieldCodes contractNumber() {
    if (contractNumber.getInput() == null) contractNumber.setInput(createContractNumberInput());
    if (contractNumber.getQueryInput() == null) contractNumber.setQueryInput(createContractNumberQueryInput());
    if (contractNumber.getDataGridColumn() == null) contractNumber.setDataGridColumn(createContractNumberDataGridColumn());
    return contractNumber;
  }
  public HtmlTag createContractNumberInput(){
    return contractNumber.textInput(36);
  }
  public HtmlTag createContractNumberQueryInput(){
    return contractNumber.textQueryInput();
  }
  public JsType createContractNumberDataGridColumn(){
    return contractNumber.textColumn();
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
