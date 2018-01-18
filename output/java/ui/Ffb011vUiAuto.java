package com.ysusoft.ui.purchase;

import com.ysusoft.ui.codehelper.HtmlTag;
import com.ysusoft.ui.codehelper.JsCode;
import com.ysusoft.ui.codehelper.JsType;
import com.ysusoft.ui.FieldCodes;
import com.ysusoft.ui.EntityUiBase;

public class Ffb011vUiAuto extends EntityUiBase {
  
  protected FieldCodes f0 = new FieldCodes("f0", "主键", "ffb011v", "entity", "query");
  protected FieldCodes bizId = new FieldCodes("bizId", "业务id", "ffb011v", "entity", "query");
  protected FieldCodes whereId = new FieldCodes("whereId", "审批条件id", "ffb011v", "entity", "query");
  protected FieldCodes prevState = new FieldCodes("prevState", "上级审批状态", "ffb011v", "entity", "query");
  protected FieldCodes nextOrder = new FieldCodes("nextOrder", "下级审批序号", "ffb011v", "entity", "query");
  protected FieldCodes purchaseBatchId = new FieldCodes("purchaseBatchId", "采购批次", "ffb011v", "entity", "query");
  protected FieldCodes tradeType = new FieldCodes("tradeType", "贸易类型", "ffb011v", "entity", "query");
  protected FieldCodes oreArea = new FieldCodes("oreArea", "矿石产区", "ffb011v", "entity", "query");
  protected FieldCodes materialId = new FieldCodes("materialId", "物料名称", "ffb011v", "entity", "query");
  protected FieldCodes tfe = new FieldCodes("tfe", "TFe", "ffb011v", "entity", "query");
  protected FieldCodes h2o = new FieldCodes("h2o", "H2O", "ffb011v", "entity", "query");
  protected FieldCodes sio2 = new FieldCodes("sio2", "SiO2", "ffb011v", "entity", "query");
  protected FieldCodes al2o3 = new FieldCodes("al2o3", "Al2O3", "ffb011v", "entity", "query");
  protected FieldCodes p = new FieldCodes("p", "P", "ffb011v", "entity", "query");
  protected FieldCodes s = new FieldCodes("s", "S", "ffb011v", "entity", "query");
  protected FieldCodes other = new FieldCodes("other", "粒度", "ffb011v", "entity", "query");
  protected FieldCodes price = new FieldCodes("price", "价格", "ffb011v", "entity", "query");
  protected FieldCodes purchaseQuantity = new FieldCodes("purchaseQuantity", "采购量", "ffb011v", "entity", "query");
  protected FieldCodes unit = new FieldCodes("unit", "单位", "ffb011v", "entity", "query");
  protected FieldCodes portLoadDate = new FieldCodes("portLoadDate", "装港日期", "ffb011v", "entity", "query");
  protected FieldCodes portLoadName = new FieldCodes("portLoadName", "装港名称", "ffb011v", "entity", "query");
  protected FieldCodes portArrivedDate = new FieldCodes("portArrivedDate", "到港日期", "ffb011v", "entity", "query");
  protected FieldCodes portArrivedName = new FieldCodes("portArrivedName", "到港名称", "ffb011v", "entity", "query");
  protected FieldCodes buyer = new FieldCodes("buyer", "买方（最终用户）", "ffb011v", "entity", "query");
  protected FieldCodes seller = new FieldCodes("seller", "卖方（矿山/供应商）", "ffb011v", "entity", "query");
  protected FieldCodes resourceLocation = new FieldCodes("resourceLocation", "资源位置", "ffb011v", "entity", "query");
  protected FieldCodes auditState = new FieldCodes("auditState", "审批状态", "ffb011v", "entity", "query");
  protected FieldCodes visibleDepartment = new FieldCodes("visibleDepartment", "可见部门", "ffb011v", "entity", "query");
  protected FieldCodes createBy = new FieldCodes("createBy", "创建人", "ffb011v", "entity", "query");
  protected FieldCodes createDate = new FieldCodes("createDate", "创建日期", "ffb011v", "entity", "query");
  protected FieldCodes updateBy = new FieldCodes("updateBy", "更新人", "ffb011v", "entity", "query");
  protected FieldCodes updateDate = new FieldCodes("updateDate", "更新日期", "ffb011v", "entity", "query");
  protected FieldCodes flowcd = new FieldCodes("flowcd", "审批流程编码", "ffb011v", "entity", "query");
  protected FieldCodes endorder = new FieldCodes("endorder", "审批结束序号", "ffb011v", "entity", "query");
  protected FieldCodes checkpost = new FieldCodes("checkpost", "审批职务f0", "ffb011v", "entity", "query");
  protected FieldCodes cd_nm = new FieldCodes("cd_nm", "审批职务名称", "ffb011v", "entity", "query");
  protected FieldCodes checkuserid = new FieldCodes("checkuserid", "审批人f0", "ffb011v", "entity", "query");
  protected FieldCodes user_nm = new FieldCodes("user_nm", "审批人姓名", "ffb011v", "entity", "query");
  
  public Ffb011vUiAuto(){
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
  
  // 采购批次
  public FieldCodes purchaseBatchId() {
    if (purchaseBatchId.getInput() == null) purchaseBatchId.setInput(createPurchaseBatchIdInput());
    if (purchaseBatchId.getQueryInput() == null) purchaseBatchId.setQueryInput(createPurchaseBatchIdQueryInput());
    if (purchaseBatchId.getDataGridColumn() == null) purchaseBatchId.setDataGridColumn(createPurchaseBatchIdDataGridColumn());
    return purchaseBatchId;
  }
  public HtmlTag createPurchaseBatchIdInput(){
    return purchaseBatchId.textInput(36);
  }
  public HtmlTag createPurchaseBatchIdQueryInput(){
    return purchaseBatchId.textQueryInput();
  }
  public JsType createPurchaseBatchIdDataGridColumn(){
    return purchaseBatchId.textColumn();
  }
  
  // 贸易类型
  public FieldCodes tradeType() {
    if (tradeType.getInput() == null) tradeType.setInput(createTradeTypeInput());
    if (tradeType.getQueryInput() == null) tradeType.setQueryInput(createTradeTypeQueryInput());
    if (tradeType.getDataGridColumn() == null) tradeType.setDataGridColumn(createTradeTypeDataGridColumn());
    return tradeType;
  }
  public HtmlTag createTradeTypeInput(){
    return tradeType.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '长期协议矿', value: '长期协议矿'}, {label: '远期现货矿', value: '远期现货矿'}, {label: '即期现货矿', value: '即期现货矿'}]");
  }
  public HtmlTag createTradeTypeQueryInput(){
    return tradeType.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '长期协议矿', value: '长期协议矿'}, {label: '远期现货矿', value: '远期现货矿'}, {label: '即期现货矿', value: '即期现货矿'}]");
  }
  public JsType createTradeTypeDataGridColumn(){
    return tradeType.textColumn();
  }
  
  // 矿石产区
  public FieldCodes oreArea() {
    if (oreArea.getInput() == null) oreArea.setInput(createOreAreaInput());
    if (oreArea.getQueryInput() == null) oreArea.setQueryInput(createOreAreaQueryInput());
    if (oreArea.getDataGridColumn() == null) oreArea.setDataGridColumn(createOreAreaDataGridColumn());
    return oreArea;
  }
  public HtmlTag createOreAreaInput(){
    return oreArea.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '澳洲', value: '澳洲'}, {label: '巴西', value: '巴西'}, {label: '非洲', value: '非洲'}, {label: '亚洲', value: '亚洲'}, {label: '其他', value: '其他'}]");
  }
  public HtmlTag createOreAreaQueryInput(){
    return oreArea.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '澳洲', value: '澳洲'}, {label: '巴西', value: '巴西'}, {label: '非洲', value: '非洲'}, {label: '亚洲', value: '亚洲'}, {label: '其他', value: '其他'}]");
  }
  public JsType createOreAreaDataGridColumn(){
    return oreArea.textColumn();
  }
  
  // 物料名称
  public FieldCodes materialId() {
    if (materialId.getInput() == null) materialId.setInput(createMaterialIdInput());
    if (materialId.getQueryInput() == null) materialId.setQueryInput(createMaterialIdQueryInput());
    if (materialId.getDataGridColumn() == null) materialId.setDataGridColumn(createMaterialIdDataGridColumn());
    return materialId;
  }
  public HtmlTag createMaterialIdInput(){
    return materialId.textInput(36);
  }
  public HtmlTag createMaterialIdQueryInput(){
    return materialId.textQueryInput();
  }
  public JsType createMaterialIdDataGridColumn(){
    return materialId.textColumn();
  }
  
  // TFe
  public FieldCodes tfe() {
    if (tfe.getInput() == null) tfe.setInput(createTfeInput());
    if (tfe.getQueryInput() == null) tfe.setQueryInput(createTfeQueryInput());
    if (tfe.getDataGridColumn() == null) tfe.setDataGridColumn(createTfeDataGridColumn());
    return tfe;
  }
  public HtmlTag createTfeInput(){
    return tfe.textInput(20);
  }
  public HtmlTag createTfeQueryInput(){
    return tfe.textQueryInput();
  }
  public JsType createTfeDataGridColumn(){
    return tfe.textColumn();
  }
  
  // H2O
  public FieldCodes h2o() {
    if (h2o.getInput() == null) h2o.setInput(createH2oInput());
    if (h2o.getQueryInput() == null) h2o.setQueryInput(createH2oQueryInput());
    if (h2o.getDataGridColumn() == null) h2o.setDataGridColumn(createH2oDataGridColumn());
    return h2o;
  }
  public HtmlTag createH2oInput(){
    return h2o.textInput(20);
  }
  public HtmlTag createH2oQueryInput(){
    return h2o.textQueryInput();
  }
  public JsType createH2oDataGridColumn(){
    return h2o.textColumn();
  }
  
  // SiO2
  public FieldCodes sio2() {
    if (sio2.getInput() == null) sio2.setInput(createSio2Input());
    if (sio2.getQueryInput() == null) sio2.setQueryInput(createSio2QueryInput());
    if (sio2.getDataGridColumn() == null) sio2.setDataGridColumn(createSio2DataGridColumn());
    return sio2;
  }
  public HtmlTag createSio2Input(){
    return sio2.textInput(20);
  }
  public HtmlTag createSio2QueryInput(){
    return sio2.textQueryInput();
  }
  public JsType createSio2DataGridColumn(){
    return sio2.textColumn();
  }
  
  // Al2O3
  public FieldCodes al2o3() {
    if (al2o3.getInput() == null) al2o3.setInput(createAl2o3Input());
    if (al2o3.getQueryInput() == null) al2o3.setQueryInput(createAl2o3QueryInput());
    if (al2o3.getDataGridColumn() == null) al2o3.setDataGridColumn(createAl2o3DataGridColumn());
    return al2o3;
  }
  public HtmlTag createAl2o3Input(){
    return al2o3.textInput(20);
  }
  public HtmlTag createAl2o3QueryInput(){
    return al2o3.textQueryInput();
  }
  public JsType createAl2o3DataGridColumn(){
    return al2o3.textColumn();
  }
  
  // P
  public FieldCodes p() {
    if (p.getInput() == null) p.setInput(createPInput());
    if (p.getQueryInput() == null) p.setQueryInput(createPQueryInput());
    if (p.getDataGridColumn() == null) p.setDataGridColumn(createPDataGridColumn());
    return p;
  }
  public HtmlTag createPInput(){
    return p.textInput(20);
  }
  public HtmlTag createPQueryInput(){
    return p.textQueryInput();
  }
  public JsType createPDataGridColumn(){
    return p.textColumn();
  }
  
  // S
  public FieldCodes s() {
    if (s.getInput() == null) s.setInput(createSInput());
    if (s.getQueryInput() == null) s.setQueryInput(createSQueryInput());
    if (s.getDataGridColumn() == null) s.setDataGridColumn(createSDataGridColumn());
    return s;
  }
  public HtmlTag createSInput(){
    return s.textInput(20);
  }
  public HtmlTag createSQueryInput(){
    return s.textQueryInput();
  }
  public JsType createSDataGridColumn(){
    return s.textColumn();
  }
  
  // 粒度
  public FieldCodes other() {
    if (other.getInput() == null) other.setInput(createOtherInput());
    if (other.getQueryInput() == null) other.setQueryInput(createOtherQueryInput());
    if (other.getDataGridColumn() == null) other.setDataGridColumn(createOtherDataGridColumn());
    return other;
  }
  public HtmlTag createOtherInput(){
    return other.textInput(200);
  }
  public HtmlTag createOtherQueryInput(){
    return other.textQueryInput();
  }
  public JsType createOtherDataGridColumn(){
    return other.textColumn();
  }
  
  // 价格
  public FieldCodes price() {
    if (price.getInput() == null) price.setInput(createPriceInput());
    if (price.getQueryInput() == null) price.setQueryInput(createPriceQueryInput());
    if (price.getDataGridColumn() == null) price.setDataGridColumn(createPriceDataGridColumn());
    return price;
  }
  public HtmlTag createPriceInput(){
    return price.textInput(50);
  }
  public HtmlTag createPriceQueryInput(){
    return price.textQueryInput();
  }
  public JsType createPriceDataGridColumn(){
    return price.textColumn();
  }
  
  // 采购量
  public FieldCodes purchaseQuantity() {
    if (purchaseQuantity.getInput() == null) purchaseQuantity.setInput(createPurchaseQuantityInput());
    if (purchaseQuantity.getQueryInput() == null) purchaseQuantity.setQueryInput(createPurchaseQuantityQueryInput());
    if (purchaseQuantity.getDataGridColumn() == null) purchaseQuantity.setDataGridColumn(createPurchaseQuantityDataGridColumn());
    return purchaseQuantity;
  }
  public HtmlTag createPurchaseQuantityInput(){
    return purchaseQuantity.numberInput(5);
  }
  public HtmlTag createPurchaseQuantityQueryInput(){
    return purchaseQuantity.numberQueryInput();
  }
  public JsType createPurchaseQuantityDataGridColumn(){
    return purchaseQuantity.textColumn();
  }
  
  // 单位
  public FieldCodes unit() {
    if (unit.getInput() == null) unit.setInput(createUnitInput());
    if (unit.getQueryInput() == null) unit.setQueryInput(createUnitQueryInput());
    if (unit.getDataGridColumn() == null) unit.setDataGridColumn(createUnitDataGridColumn());
    return unit;
  }
  public HtmlTag createUnitInput(){
    return unit.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '干吨', value: '干吨'}, {label: '湿吨', value: '湿吨'}]");
  }
  public HtmlTag createUnitQueryInput(){
    return unit.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '干吨', value: '干吨'}, {label: '湿吨', value: '湿吨'}]");
  }
  public JsType createUnitDataGridColumn(){
    return unit.textColumn();
  }
  
  // 装港日期
  public FieldCodes portLoadDate() {
    if (portLoadDate.getInput() == null) portLoadDate.setInput(createPortLoadDateInput());
    if (portLoadDate.getQueryInput() == null) portLoadDate.setQueryInput(createPortLoadDateQueryInput());
    if (portLoadDate.getDataGridColumn() == null) portLoadDate.setDataGridColumn(createPortLoadDateDataGridColumn());
    return portLoadDate;
  }
  public HtmlTag createPortLoadDateInput(){
    return portLoadDate.dateInput();
  }
  public HtmlTag createPortLoadDateQueryInput(){
    return portLoadDate.dateQueryInput();
  }
  public JsType createPortLoadDateDataGridColumn(){
    return portLoadDate.dateColumn();
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
  
  // 到港日期
  public FieldCodes portArrivedDate() {
    if (portArrivedDate.getInput() == null) portArrivedDate.setInput(createPortArrivedDateInput());
    if (portArrivedDate.getQueryInput() == null) portArrivedDate.setQueryInput(createPortArrivedDateQueryInput());
    if (portArrivedDate.getDataGridColumn() == null) portArrivedDate.setDataGridColumn(createPortArrivedDateDataGridColumn());
    return portArrivedDate;
  }
  public HtmlTag createPortArrivedDateInput(){
    return portArrivedDate.dateInput();
  }
  public HtmlTag createPortArrivedDateQueryInput(){
    return portArrivedDate.dateQueryInput();
  }
  public JsType createPortArrivedDateDataGridColumn(){
    return portArrivedDate.dateColumn();
  }
  
  // 到港名称
  public FieldCodes portArrivedName() {
    if (portArrivedName.getInput() == null) portArrivedName.setInput(createPortArrivedNameInput());
    if (portArrivedName.getQueryInput() == null) portArrivedName.setQueryInput(createPortArrivedNameQueryInput());
    if (portArrivedName.getDataGridColumn() == null) portArrivedName.setDataGridColumn(createPortArrivedNameDataGridColumn());
    return portArrivedName;
  }
  public HtmlTag createPortArrivedNameInput(){
    return portArrivedName.textInput(30);
  }
  public HtmlTag createPortArrivedNameQueryInput(){
    return portArrivedName.textQueryInput();
  }
  public JsType createPortArrivedNameDataGridColumn(){
    return portArrivedName.textColumn();
  }
  
  // 买方（最终用户）
  public FieldCodes buyer() {
    if (buyer.getInput() == null) buyer.setInput(createBuyerInput());
    if (buyer.getQueryInput() == null) buyer.setQueryInput(createBuyerQueryInput());
    if (buyer.getDataGridColumn() == null) buyer.setDataGridColumn(createBuyerDataGridColumn());
    return buyer;
  }
  public HtmlTag createBuyerInput(){
    return buyer.textInput(30);
  }
  public HtmlTag createBuyerQueryInput(){
    return buyer.textQueryInput();
  }
  public JsType createBuyerDataGridColumn(){
    return buyer.textColumn();
  }
  
  // 卖方（矿山/供应商）
  public FieldCodes seller() {
    if (seller.getInput() == null) seller.setInput(createSellerInput());
    if (seller.getQueryInput() == null) seller.setQueryInput(createSellerQueryInput());
    if (seller.getDataGridColumn() == null) seller.setDataGridColumn(createSellerDataGridColumn());
    return seller;
  }
  public HtmlTag createSellerInput(){
    return seller.textInput(30);
  }
  public HtmlTag createSellerQueryInput(){
    return seller.textQueryInput();
  }
  public JsType createSellerDataGridColumn(){
    return seller.textColumn();
  }
  
  // 资源位置
  public FieldCodes resourceLocation() {
    if (resourceLocation.getInput() == null) resourceLocation.setInput(createResourceLocationInput());
    if (resourceLocation.getQueryInput() == null) resourceLocation.setQueryInput(createResourceLocationQueryInput());
    if (resourceLocation.getDataGridColumn() == null) resourceLocation.setDataGridColumn(createResourceLocationDataGridColumn());
    return resourceLocation;
  }
  public HtmlTag createResourceLocationInput(){
    return resourceLocation.textInput(30);
  }
  public HtmlTag createResourceLocationQueryInput(){
    return resourceLocation.textQueryInput();
  }
  public JsType createResourceLocationDataGridColumn(){
    return resourceLocation.textColumn();
  }
  
  // 审批状态
  public FieldCodes auditState() {
    if (auditState.getInput() == null) auditState.setInput(createAuditStateInput());
    if (auditState.getQueryInput() == null) auditState.setQueryInput(createAuditStateQueryInput());
    if (auditState.getDataGridColumn() == null) auditState.setDataGridColumn(createAuditStateDataGridColumn());
    return auditState;
  }
  public HtmlTag createAuditStateInput(){
    return auditState.comboboxInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '未提交', value: '未提交'}, {label: '提交', value: '提交'}, {label: '通过', value: '通过'}, {label: '未通过', value: '未通过'}]");
  }
  public HtmlTag createAuditStateQueryInput(){
    return auditState.comboboxQueryInput("value", "label", "[{label: '&nbsp;',value: ''}, {label: '未提交', value: '未提交'}, {label: '提交', value: '提交'}, {label: '通过', value: '通过'}, {label: '未通过', value: '未通过'}]");
  }
  public JsType createAuditStateDataGridColumn(){
    return auditState.textColumn();
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
    return createDate.dateInput();
  }
  public HtmlTag createCreateDateQueryInput(){
    return createDate.dateQueryInput();
  }
  public JsType createCreateDateDataGridColumn(){
    return createDate.dateColumn();
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
    return updateDate.dateInput();
  }
  public HtmlTag createUpdateDateQueryInput(){
    return updateDate.dateQueryInput();
  }
  public JsType createUpdateDateDataGridColumn(){
    return updateDate.dateColumn();
  }
  
  // 审批流程编码
  public FieldCodes flowcd() {
    if (flowcd.getInput() == null) flowcd.setInput(createFlowcdInput());
    if (flowcd.getQueryInput() == null) flowcd.setQueryInput(createFlowcdQueryInput());
    if (flowcd.getDataGridColumn() == null) flowcd.setDataGridColumn(createFlowcdDataGridColumn());
    return flowcd;
  }
  public HtmlTag createFlowcdInput(){
    return flowcd.textInput(36);
  }
  public HtmlTag createFlowcdQueryInput(){
    return flowcd.textQueryInput();
  }
  public JsType createFlowcdDataGridColumn(){
    return flowcd.textColumn();
  }
  
  // 审批结束序号
  public FieldCodes endorder() {
    if (endorder.getInput() == null) endorder.setInput(createEndorderInput());
    if (endorder.getQueryInput() == null) endorder.setQueryInput(createEndorderQueryInput());
    if (endorder.getDataGridColumn() == null) endorder.setDataGridColumn(createEndorderDataGridColumn());
    return endorder;
  }
  public HtmlTag createEndorderInput(){
    return endorder.textInput(10);
  }
  public HtmlTag createEndorderQueryInput(){
    return endorder.textQueryInput();
  }
  public JsType createEndorderDataGridColumn(){
    return endorder.textColumn();
  }
  
  // 审批职务f0
  public FieldCodes checkpost() {
    if (checkpost.getInput() == null) checkpost.setInput(createCheckpostInput());
    if (checkpost.getQueryInput() == null) checkpost.setQueryInput(createCheckpostQueryInput());
    if (checkpost.getDataGridColumn() == null) checkpost.setDataGridColumn(createCheckpostDataGridColumn());
    return checkpost;
  }
  public HtmlTag createCheckpostInput(){
    return checkpost.textInput(36);
  }
  public HtmlTag createCheckpostQueryInput(){
    return checkpost.textQueryInput();
  }
  public JsType createCheckpostDataGridColumn(){
    return checkpost.textColumn();
  }
  
  // 审批职务名称
  public FieldCodes cd_nm() {
    if (cd_nm.getInput() == null) cd_nm.setInput(createCd_nmInput());
    if (cd_nm.getQueryInput() == null) cd_nm.setQueryInput(createCd_nmQueryInput());
    if (cd_nm.getDataGridColumn() == null) cd_nm.setDataGridColumn(createCd_nmDataGridColumn());
    return cd_nm;
  }
  public HtmlTag createCd_nmInput(){
    return cd_nm.textInput(80);
  }
  public HtmlTag createCd_nmQueryInput(){
    return cd_nm.textQueryInput();
  }
  public JsType createCd_nmDataGridColumn(){
    return cd_nm.textColumn();
  }
  
  // 审批人f0
  public FieldCodes checkuserid() {
    if (checkuserid.getInput() == null) checkuserid.setInput(createCheckuseridInput());
    if (checkuserid.getQueryInput() == null) checkuserid.setQueryInput(createCheckuseridQueryInput());
    if (checkuserid.getDataGridColumn() == null) checkuserid.setDataGridColumn(createCheckuseridDataGridColumn());
    return checkuserid;
  }
  public HtmlTag createCheckuseridInput(){
    return checkuserid.textInput(36);
  }
  public HtmlTag createCheckuseridQueryInput(){
    return checkuserid.textQueryInput();
  }
  public JsType createCheckuseridDataGridColumn(){
    return checkuserid.textColumn();
  }
  
  // 审批人姓名
  public FieldCodes user_nm() {
    if (user_nm.getInput() == null) user_nm.setInput(createUser_nmInput());
    if (user_nm.getQueryInput() == null) user_nm.setQueryInput(createUser_nmQueryInput());
    if (user_nm.getDataGridColumn() == null) user_nm.setDataGridColumn(createUser_nmDataGridColumn());
    return user_nm;
  }
  public HtmlTag createUser_nmInput(){
    return user_nm.textInput(50);
  }
  public HtmlTag createUser_nmQueryInput(){
    return user_nm.textQueryInput();
  }
  public JsType createUser_nmDataGridColumn(){
    return user_nm.textColumn();
  }
  
  
}
