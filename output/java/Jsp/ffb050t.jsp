<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>船舶管理</title>
  
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
      //getButtion("dynamic-buttons","ffb050t");
      $('#icon-add').bind("click",function(){newFfb050tEntity();});
      $('#icon-edit').bind("click",function(){editFfb050tEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb050tEntity();});
      $('#icon-search').bind("click",function(){queryFfb050tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb050tQuery();});
      $('#icon-export').bind("click",function(){exportFfb050tEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb050tEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb050tEntities();});
      
    });
    
    function newFfb050tEntity(){
      $('#dlgFfb050tEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb050tEntity').form('clear');
    }
    
    function editFfb050tEntity(){
      var r = $('#dgFfb050t').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb050tEntity(r);
      
      $('#dlgFfb050tEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb050tEntity(){
      if (!$("#frmFfb050tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb050t").datagrid("getSelected")
      if (($("dlgFfb050tEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb050tEntity", row)
      $.post("ffb050t.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb050tEntity").form("clear");
          $("#dlgFfb050tEntity").dialog("close");
          $("#dgFfb050t").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb050tEntity(){
      executeCommand("ffb050t", "delete", "dgFfb050t", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb050tEntities(){ 
      executeCommand("ffb050t", "archive", "dgFfb050t", "请选择要归档的行!")
    }
    
    function activeFfb050tEntities(){
      executeCommand("ffb050t", "active", "dgFfb050t", "请选择要激活的行!") 
    }
    
    function exportFfb050tEntities(){
      var queryParams = createFfb050tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb050t'));
      
      $.ajax({
        url: "ffb050t.action?reqtype=export",
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

    function onFfb050tDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb050tEntity();
    }
    
    function onFfb050tClickRow(rowIndex, rowData){
      var r = $('#dgFfb050t').datagrid('getSelected');
      loadFfb050tEntity(r);
      
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
      <jsp:include page="ffb050t_segments/ffb050t_query.jsp" >
        <jsp:param name="displayQueryFields" value="shipNumber, shipCompany, shipOwner, shipName, shipChineseName, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgFfb050t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="船舶" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb050t_segments/ffb050t_grid.jsp" >
        <jsp:param name="displayTableFields" value="shipNumber, shipCompany, shipOwner, shipName, shipChineseName, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb050tDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb050tClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb050t" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb050tEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb050t_segments/ffb050t_edit.jsp" >
        <jsp:param name="displayEditFields" value="shipNumber, shipCompany, shipOwner, shipName, shipChineseName, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb050tEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb050tEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
