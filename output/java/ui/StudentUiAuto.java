package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class StudentUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "student", "entity", "query");
  protected FieldCodes departmentId = new FieldCodes("departmentId", "部门编码", "student", "entity", "query");
  protected FieldCodes name = new FieldCodes("name", "学生名称", "student", "entity", "query");
  protected FieldCodes inDate = new FieldCodes("inDate", "日期", "student", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "student", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "student", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "student", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "student", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "student", "entity", "query");
  
  public StudentUiAuto(){
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
  
  // 部门编码
  public FieldCodes departmentId() {
    if (departmentId.getInput() == null) departmentId.setInput(createDepartmentIdInput());
    if (departmentId.getQueryInput() == null) departmentId.setQueryInput(createDepartmentIdQueryInput());
    if (departmentId.getDataGridColumn() == null) departmentId.setDataGridColumn(createDepartmentIdDataGridColumn());
    return departmentId;
  }
  public HtmlTag createDepartmentIdInput(){
    return departmentId.textInput(30);
  }
  public HtmlTag createDepartmentIdQueryInput(){
    return departmentId.textQueryInput();
  }
  public JsType createDepartmentIdDataGridColumn(){
    return departmentId.textColumn();
  }
  
  // 学生名称
  public FieldCodes name() {
    if (name.getInput() == null) name.setInput(createNameInput());
    if (name.getQueryInput() == null) name.setQueryInput(createNameQueryInput());
    if (name.getDataGridColumn() == null) name.setDataGridColumn(createNameDataGridColumn());
    return name;
  }
  public HtmlTag createNameInput(){
    return name.textInput(36);
  }
  public HtmlTag createNameQueryInput(){
    return name.textQueryInput();
  }
  public JsType createNameDataGridColumn(){
    return name.textColumn();
  }
  
  // 日期
  public FieldCodes inDate() {
    if (inDate.getInput() == null) inDate.setInput(createInDateInput());
    if (inDate.getQueryInput() == null) inDate.setQueryInput(createInDateQueryInput());
    if (inDate.getDataGridColumn() == null) inDate.setDataGridColumn(createInDateDataGridColumn());
    return inDate;
  }
  public HtmlTag createInDateInput(){
    return inDate.dateInput();
  }
  public HtmlTag createInDateQueryInput(){
    return inDate.dateQueryInput();
  }
  public JsType createInDateDataGridColumn(){
    return inDate.dateColumn();
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
