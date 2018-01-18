package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb050tUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb050t", "entity", "query");
  protected FieldCodes shipNumber = new FieldCodes("shipNumber", "船编号", "ffb050t", "entity", "query");
  protected FieldCodes shipCompany = new FieldCodes("shipCompany", "船运公司", "ffb050t", "entity", "query");
  protected FieldCodes shipOwner = new FieldCodes("shipOwner", "船舶所属", "ffb050t", "entity", "query");
  protected FieldCodes shipName = new FieldCodes("shipName", "英文船名", "ffb050t", "entity", "query");
  protected FieldCodes shipChineseName = new FieldCodes("shipChineseName", "中文船名", "ffb050t", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb050t", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb050t", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb050t", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb050t", "entity", "query");
  protected FieldCodes archived = new FieldCodes("archived", "归档", "ffb050t", "entity", "query");
  
  public Ffb050tUiAuto(){
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
  
  // 船运公司
  public FieldCodes shipCompany() {
    if (shipCompany.getInput() == null) shipCompany.setInput(createShipCompanyInput());
    if (shipCompany.getQueryInput() == null) shipCompany.setQueryInput(createShipCompanyQueryInput());
    if (shipCompany.getDataGridColumn() == null) shipCompany.setDataGridColumn(createShipCompanyDataGridColumn());
    return shipCompany;
  }
  public HtmlTag createShipCompanyInput(){
    return shipCompany.textInput(30);
  }
  public HtmlTag createShipCompanyQueryInput(){
    return shipCompany.textQueryInput();
  }
  public JsType createShipCompanyDataGridColumn(){
    return shipCompany.textColumn();
  }
  
  // 船舶所属
  public FieldCodes shipOwner() {
    if (shipOwner.getInput() == null) shipOwner.setInput(createShipOwnerInput());
    if (shipOwner.getQueryInput() == null) shipOwner.setQueryInput(createShipOwnerQueryInput());
    if (shipOwner.getDataGridColumn() == null) shipOwner.setDataGridColumn(createShipOwnerDataGridColumn());
    return shipOwner;
  }
  public HtmlTag createShipOwnerInput(){
    return shipOwner.textInput(30);
  }
  public HtmlTag createShipOwnerQueryInput(){
    return shipOwner.textQueryInput();
  }
  public JsType createShipOwnerDataGridColumn(){
    return shipOwner.textColumn();
  }
  
  // 英文船名
  public FieldCodes shipName() {
    if (shipName.getInput() == null) shipName.setInput(createShipNameInput());
    if (shipName.getQueryInput() == null) shipName.setQueryInput(createShipNameQueryInput());
    if (shipName.getDataGridColumn() == null) shipName.setDataGridColumn(createShipNameDataGridColumn());
    return shipName;
  }
  public HtmlTag createShipNameInput(){
    return shipName.textInput(30);
  }
  public HtmlTag createShipNameQueryInput(){
    return shipName.textQueryInput();
  }
  public JsType createShipNameDataGridColumn(){
    return shipName.textColumn();
  }
  
  // 中文船名
  public FieldCodes shipChineseName() {
    if (shipChineseName.getInput() == null) shipChineseName.setInput(createShipChineseNameInput());
    if (shipChineseName.getQueryInput() == null) shipChineseName.setQueryInput(createShipChineseNameQueryInput());
    if (shipChineseName.getDataGridColumn() == null) shipChineseName.setDataGridColumn(createShipChineseNameDataGridColumn());
    return shipChineseName;
  }
  public HtmlTag createShipChineseNameInput(){
    return shipChineseName.textInput(30);
  }
  public HtmlTag createShipChineseNameQueryInput(){
    return shipChineseName.textQueryInput();
  }
  public JsType createShipChineseNameDataGridColumn(){
    return shipChineseName.textColumn();
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
