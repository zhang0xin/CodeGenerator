<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>审核记录管理</title>
  
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
      //getButtion("dynamic-buttons","ffb012t");
      $('#icon-add').bind("click",function(){newFfb012tEntity();});
      $('#icon-edit').bind("click",function(){editFfb012tEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb012tEntity();});
      $('#icon-search').bind("click",function(){queryFfb012tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb012tQuery();});
      $('#icon-export').bind("click",function(){exportFfb012tEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb012tEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb012tEntities();});
      
    });
    
    function newFfb012tEntity(){
      $('#dlgFfb012tEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb012tEntity').form('clear');
    }
    
    function editFfb012tEntity(){
      var r = $('#dgFfb012t').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb012tEntity(r);
      
      $('#dlgFfb012tEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb012tEntity(){
      if (!$("#frmFfb012tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb012t").datagrid("getSelected")
      if (($("dlgFfb012tEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb012tEntity", row)
      $.post("ffb012t.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb012tEntity").form("clear");
          $("#dlgFfb012tEntity").dialog("close");
          $("#dgFfb012t").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb012tEntity(){
      executeCommand("ffb012t", "delete", "dgFfb012t", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb012tEntities(){ 
      executeCommand("ffb012t", "archive", "dgFfb012t", "请选择要归档的行!")
    }
    
    function activeFfb012tEntities(){
      executeCommand("ffb012t", "active", "dgFfb012t", "请选择要激活的行!") 
    }
    
    function exportFfb012tEntities(){
      var queryParams = createFfb012tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb012t'));
      
      $.ajax({
        url: "ffb012t.action?reqtype=export",
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

    function onFfb012tDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb012tEntity();
    }
    
    function onFfb012tClickRow(rowIndex, rowData){
      var r = $('#dgFfb012t').datagrid('getSelected');
      loadFfb012tEntity(r);
      
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
      <jsp:include page="ffb012t_segments/ffb012t_query.jsp" >
        <jsp:param name="displayQueryFields" value="bizId, auditOrder, auditSuggestion, auditDuty, flowId, auditPass, auditMan, auditDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgFfb012t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="审核记录" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb012t_segments/ffb012t_grid.jsp" >
        <jsp:param name="displayTableFields" value="bizId, auditOrder, auditSuggestion, auditDuty, flowId, auditPass, auditMan, auditDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb012tDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb012tClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb012t" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb012tEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb012t_segments/ffb012t_edit.jsp" >
        <jsp:param name="displayEditFields" value="bizId, auditOrder, auditSuggestion, auditDuty, flowId, auditPass, auditMan, auditDate, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb012tEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb012tEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
