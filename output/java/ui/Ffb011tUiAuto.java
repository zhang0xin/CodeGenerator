package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb011tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb011t", "entity", "query");
  protected FieldCodes bizId = new FieldCodes("bizId", "业务id", "ffb011t", "entity", "query");
  protected FieldCodes whereId = new FieldCodes("whereId", "审批条件id", "ffb011t", "entity", "query");
  protected FieldCodes prevState = new FieldCodes("prevState", "上级审批状态", "ffb011t", "entity", "query");
  protected FieldCodes nextOrder = new FieldCodes("nextOrder", "下级审批序号", "ffb011t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb011t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb011t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb011t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb011t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb011t", "entity", "query");
  
  public Ffb011tUiAuto(){
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
  
  // 业务id
  public FieldCodes bizId() {
    if (bizId.getInput() == null) bizId.setInput(createBizIdInput());
    if (bizId.getQueryInput() == null) bizId.setQueryInput(createBizIdQueryInput());
    if (bizId.getDataGridColumn() == null) bizId.setDataGridColumn(createBizIdDataGridColumn());
    return bizId;
  }
  public HtmlTag createBizIdInput(){
    return bizId.textInput(36);
  }
  public HtmlTag createBizIdQueryInput(){
    return bizId.textQueryInput();
  }
  public JsType createBizIdDataGridColumn(){
    return bizId.textColumn();
  }
  
  // 审批条件id
  public FieldCodes whereId() {
    if (whereId.getInput() == null) whereId.setInput(createWhereIdInput());
    if (whereId.getQueryInput() == null) whereId.setQueryInput(createWhereIdQueryInput());
    if (whereId.getDataGridColumn() == null) whereId.setDataGridColumn(createWhereIdDataGridColumn());
    return whereId;
  }
  public HtmlTag createWhereIdInput(){
    return whereId.textInput(100);
  }
  public HtmlTag createWhereIdQueryInput(){
    return whereId.textQueryInput();
  }
  public JsType createWhereIdDataGridColumn(){
    return whereId.textColumn();
  }
  
  // 上级审批状态
  public FieldCodes prevState() {
    if (prevState.getInput() == null) prevState.setInput(createPrevStateInput());
    if (prevState.getQueryInput() == null) prevState.setQueryInput(createPrevStateQueryInput());
    if (prevState.getDataGridColumn() == null) prevState.setDataGridColumn(createPrevStateDataGridColumn());
    return prevState;
  }
  public HtmlTag createPrevStateInput(){
    return prevState.textInput(10);
  }
  public HtmlTag createPrevStateQueryInput(){
    return prevState.textQueryInput();
  }
  public JsType createPrevStateDataGridColumn(){
    return prevState.textColumn();
  }
  
  // 下级审批序号
  public FieldCodes nextOrder() {
    if (nextOrder.getInput() == null) nextOrder.setInput(createNextOrderInput());
    if (nextOrder.getQueryInput() == null) nextOrder.setQueryInput(createNextOrderQueryInput());
    if (nextOrder.getDataGridColumn() == null) nextOrder.setDataGridColumn(createNextOrderDataGridColumn());
    return nextOrder;
  }
  public HtmlTag createNextOrderInput(){
    return nextOrder.textInput(10);
  }
  public HtmlTag createNextOrderQueryInput(){
    return nextOrder.textQueryInput();
  }
  public JsType createNextOrderDataGridColumn(){
    return nextOrder.textColumn();
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
