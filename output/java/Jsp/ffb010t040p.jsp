<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>信用证（财）管理</title>
  
    <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.1/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../jquery-easyui-1.4.1/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="../../css/common.css">
    <script type="text/javascript" src="../../jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../../jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../../js/common-purchase.js"></script>
  
  <script type="text/javascript">
    
    var currencyTypeDict = 
    <s:action name="zaa010t" executeResult="true">
      <s:param name="req.type">getDictOnCategory</s:param>
      <s:param name="category">2003</s:param>
    </s:action>;
    
    
    $(function(){
      //getButtion("dynamic-buttons","ffb010t");
      $('#icon-add').bind("click",function(){newFfb010t040pEntity();});
      $('#icon-edit').bind("click",function(){editFfb010t040pEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb010t040pEntity();});
      $('#icon-search').bind("click",function(){queryFfb010tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb010tQuery();});
      $('#icon-export').bind("click",function(){exportFfb010t040pEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb010t040pEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb010t040pEntities();});
      
    });
    
    function newFfb010t040pEntity(){
      $('#dlgFfb010t040pEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb010tEntity').form('clear');
    }
    
    function editFfb010t040pEntity(){
      var r = $('#dgFfb010t040p').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb010tEntity(r);
      
      $('#dlgFfb010t040pEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb010t040pEntity(){
      if (!$("#frmFfb010tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb010t040p").datagrid("getSelected")
      if (($("dlgFfb010t040pEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb010tEntity", row)
      $.post("ffb010t040p.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb010tEntity").form("clear");
          $("#dlgFfb010t040pEntity").dialog("close");
          $("#dgFfb010t040p").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb010t040pEntity(){
      executeCommand("ffb010t", "delete", "dgFfb010t040p", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb010t040pEntities(){ 
      executeCommand("ffb010t040p", "archive", "dgFfb010t040p", "请选择要归档的行!")
    }
    
    function activeFfb010t040pEntities(){
      executeCommand("ffb010t040p", "active", "dgFfb010t040p", "请选择要激活的行!") 
    }
    
    function exportFfb010t040pEntities(){
      var queryParams = createFfb010tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb010t040p'));
      
      $.ajax({
        url: "ffb010t.action?reqtype=export",
        type: "POST",
        beforeSend:$.ajaxLoading,
        dataType: 'json',
        data: queryParams,
        success: function(data) {
          $.ajaxLoadEnd();
          if (data.success == true) {
            download('download.xlsx', data.serverFileName);
          }else{
            $.messager.alert('系统提示', '导出失败!', 'error');
          }
        }
      });
    }

    function onFfb010t040pDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb010t040pEntity();
    }
    
    function onFfb010t040pClickRow(rowIndex, rowData){
      var r = $('#dgFfb010t040p').datagrid('getSelected');
      loadFfb010tEntity(r);
      
    }
  </script>
  </head>
  
  <body style="margin:0;padding:0px;">
    <div id="dynamic-buttons"></div>
    <div>
      <a id="icon-add" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" >新建</a>
      <a id="icon-edit" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" >编辑</a>
      <a id="icon-remove" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" >删除</a>
      <a id="icon-export" href="javascript:void(0)"  class="easyui-linkbutton"  iconCls="icon-export" plain="true">导出</a>
      
      <a id="icon-file-lock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-lock" plain="true" >归档</a>
      <a id="icon-file-unlock" href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-file-unlock" plain="true" >激活</a>
    </div>
    <div class="easyui-panel" title="查询选项" data-options="iconCls:'icon-search',collapsible:true,collapsed:true">
      <jsp:include page="ffb010t_segments/ffb010t_query.jsp" >
        <jsp:param name="displayQueryFields" value="purchaseBatchId, lcNumber" />
        <jsp:param name="targetDataGridId" value="dgFfb010t040p" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="信用证（财）" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb010t_segments/ffb010t_grid.jsp" >
        <jsp:param name="displayTableFields" value="purchaseBatchId, lcNumber, documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb010t040pDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb010t040pClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb010t040p" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb010t040pEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb010t_segments/ffb010t_edit.jsp" >
        <jsp:param name="displayEditFields" value="documentaryBillsInterest, documentaryBillsHike, capitalOccupationFee, openingCharge, acceptingCharge, customsGuaranteeFee, agentServiceFee" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb010t040pEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb010t040pEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
