package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb012tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb012t", "entity", "query");
  protected FieldCodes bizId = new FieldCodes("bizId", "业务id", "ffb012t", "entity", "query");
  protected FieldCodes auditOrder = new FieldCodes("auditOrder", "审批序号", "ffb012t", "entity", "query");
  protected FieldCodes auditSuggestion = new FieldCodes("auditSuggestion", "审批意见", "ffb012t", "entity", "query");
  protected FieldCodes auditDuty = new FieldCodes("auditDuty", "审批职务", "ffb012t", "entity", "query");
  protected FieldCodes flowId = new FieldCodes("flowId", "审批流程id", "ffb012t", "entity", "query");
  protected FieldCodes auditPass = new FieldCodes("auditPass", "审批状态", "ffb012t", "entity", "query");
  protected FieldCodes auditMan = new FieldCodes("auditMan", "审批人", "ffb012t", "entity", "query");
  protected FieldCodes auditDate = new FieldCodes("auditDate", "审批时间", "ffb012t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb012t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb012t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb012t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb012t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb012t", "entity", "query");
  
  public Ffb012tUiAuto(){
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
  
  // 审批序号
  public FieldCodes auditOrder() {
    if (auditOrder.getInput() == null) auditOrder.setInput(createAuditOrderInput());
    if (auditOrder.getQueryInput() == null) auditOrder.setQueryInput(createAuditOrderQueryInput());
    if (auditOrder.getDataGridColumn() == null) auditOrder.setDataGridColumn(createAuditOrderDataGridColumn());
    return auditOrder;
  }
  public HtmlTag createAuditOrderInput(){
    return auditOrder.textInput(2);
  }
  public HtmlTag createAuditOrderQueryInput(){
    return auditOrder.textQueryInput();
  }
  public JsType createAuditOrderDataGridColumn(){
    return auditOrder.textColumn();
  }
  
  // 审批意见
  public FieldCodes auditSuggestion() {
    if (auditSuggestion.getInput() == null) auditSuggestion.setInput(createAuditSuggestionInput());
    if (auditSuggestion.getQueryInput() == null) auditSuggestion.setQueryInput(createAuditSuggestionQueryInput());
    if (auditSuggestion.getDataGridColumn() == null) auditSuggestion.setDataGridColumn(createAuditSuggestionDataGridColumn());
    return auditSuggestion;
  }
  public HtmlTag createAuditSuggestionInput(){
    return auditSuggestion.textInput(500);
  }
  public HtmlTag createAuditSuggestionQueryInput(){
    return auditSuggestion.textQueryInput();
  }
  public JsType createAuditSuggestionDataGridColumn(){
    return auditSuggestion.textColumn();
  }
  
  // 审批职务
  public FieldCodes auditDuty() {
    if (auditDuty.getInput() == null) auditDuty.setInput(createAuditDutyInput());
    if (auditDuty.getQueryInput() == null) auditDuty.setQueryInput(createAuditDutyQueryInput());
    if (auditDuty.getDataGridColumn() == null) auditDuty.setDataGridColumn(createAuditDutyDataGridColumn());
    return auditDuty;
  }
  public HtmlTag createAuditDutyInput(){
    return auditDuty.textInput(36);
  }
  public HtmlTag createAuditDutyQueryInput(){
    return auditDuty.textQueryInput();
  }
  public JsType createAuditDutyDataGridColumn(){
    return auditDuty.textColumn();
  }
  
  // 审批流程id
  public FieldCodes flowId() {
    if (flowId.getInput() == null) flowId.setInput(createFlowIdInput());
    if (flowId.getQueryInput() == null) flowId.setQueryInput(createFlowIdQueryInput());
    if (flowId.getDataGridColumn() == null) flowId.setDataGridColumn(createFlowIdDataGridColumn());
    return flowId;
  }
  public HtmlTag createFlowIdInput(){
    return flowId.textInput(36);
  }
  public HtmlTag createFlowIdQueryInput(){
    return flowId.textQueryInput();
  }
  public JsType createFlowIdDataGridColumn(){
    return flowId.textColumn();
  }
  
  // 审批状态
  public FieldCodes auditPass() {
    if (auditPass.getInput() == null) auditPass.setInput(createAuditPassInput());
    if (auditPass.getQueryInput() == null) auditPass.setQueryInput(createAuditPassQueryInput());
    if (auditPass.getDataGridColumn() == null) auditPass.setDataGridColumn(createAuditPassDataGridColumn());
    return auditPass;
  }
  public HtmlTag createAuditPassInput(){
    return auditPass.textInput(10);
  }
  public HtmlTag createAuditPassQueryInput(){
    return auditPass.textQueryInput();
  }
  public JsType createAuditPassDataGridColumn(){
    return auditPass.textColumn();
  }
  
  // 审批人
  public FieldCodes auditMan() {
    if (auditMan.getInput() == null) auditMan.setInput(createAuditManInput());
    if (auditMan.getQueryInput() == null) auditMan.setQueryInput(createAuditManQueryInput());
    if (auditMan.getDataGridColumn() == null) auditMan.setDataGridColumn(createAuditManDataGridColumn());
    return auditMan;
  }
  public HtmlTag createAuditManInput(){
    return auditMan.textInput(36);
  }
  public HtmlTag createAuditManQueryInput(){
    return auditMan.textQueryInput();
  }
  public JsType createAuditManDataGridColumn(){
    return auditMan.textColumn();
  }
  
  // 审批时间
  public FieldCodes auditDate() {
    if (auditDate.getInput() == null) auditDate.setInput(createAuditDateInput());
    if (auditDate.getQueryInput() == null) auditDate.setQueryInput(createAuditDateQueryInput());
    if (auditDate.getDataGridColumn() == null) auditDate.setDataGridColumn(createAuditDateDataGridColumn());
    return auditDate;
  }
  public HtmlTag createAuditDateInput(){
    return auditDate.datetimeInput();
  }
  public HtmlTag createAuditDateQueryInput(){
    return auditDate.datetimeQueryInput();
  }
  public JsType createAuditDateDataGridColumn(){
    return auditDate.datetimeColumn();
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
