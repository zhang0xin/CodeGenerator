<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>审核关系管理</title>
  
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
      //getButtion("dynamic-buttons","ffb011t");
      $('#icon-add').bind("click",function(){newFfb011tEntity();});
      $('#icon-edit').bind("click",function(){editFfb011tEntity();});
      $('#icon-remove').bind("click",function(){deleteFfb011tEntity();});
      $('#icon-search').bind("click",function(){queryFfb011tEntity();});
      $('#icon-cancel').bind("click",function(){resetFfb011tQuery();});
      $('#icon-export').bind("click",function(){exportFfb011tEntities();});
      $('#icon-file-lock').bind("click",function(){archiveFfb011tEntities();});
      $('#icon-file-unlock').bind("click",function(){activeFfb011tEntities();});
      
    });
    
    function newFfb011tEntity(){
      $('#dlgFfb011tEntity').dialog('open').dialog('setTitle', '新建');
      $('#frmFfb011tEntity').form('clear');
    }
    
    function editFfb011tEntity(){
      var r = $('#dgFfb011t').datagrid('getSelected');
      if(r==null){
        $.messager.alert('系统提示', '请选中要编辑的行!', 'warning');
        return;
      }
      loadFfb011tEntity(r);
      
      $('#dlgFfb011tEntity').dialog('open').dialog('setTitle', '编辑');
    }
    
    function saveFfb011tEntity(){
      if (!$("#frmFfb011tEntity").form("validate")){
        $.messager.alert("系统提示", "请确保录入字段都符合正确的格式或录入了所有的必填字段，查找表单中红色部分并修改。")
        return;
      }
      var row = $("#dgFfb011t").datagrid("getSelected")
      if (($("dlgFfb011tEntity input[name='entity.f0']").val() == "")) row = {};
      var entity = createEntityData("frmFfb011tEntity", row)
      $.post("ffb011t.action?reqtype=save", entity, function(data){
        if (data.success){
          $("#frmFfb011tEntity").form("clear");
          $("#dlgFfb011tEntity").dialog("close");
          $("#dgFfb011t").datagrid("reload");
        }else{
          $.messager.alert("系统提示", data.message);
        }
      }, "JSON");
    }
    
    function deleteFfb011tEntity(){
      executeCommand("ffb011t", "delete", "dgFfb011t", "请选择要删除的行!", true, "确认删除吗？")
    }
    
    function archiveFfb011tEntities(){ 
      executeCommand("ffb011t", "archive", "dgFfb011t", "请选择要归档的行!")
    }
    
    function activeFfb011tEntities(){
      executeCommand("ffb011t", "active", "dgFfb011t", "请选择要激活的行!") 
    }
    
    function exportFfb011tEntities(){
      var queryParams = createFfb011tQueryParams();
      queryParams.selectedColumns = getColumnDescriptions($('#dgFfb011t'));
      
      $.ajax({
        url: "ffb011t.action?reqtype=export",
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

    function onFfb011tDblClickRow(rowIndex, rowData){
      if ($('#icon-edit').length == 0) return;
      editFfb011tEntity();
    }
    
    function onFfb011tClickRow(rowIndex, rowData){
      var r = $('#dgFfb011t').datagrid('getSelected');
      loadFfb011tEntity(r);
      
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
      <jsp:include page="ffb011t_segments/ffb011t_query.jsp" >
        <jsp:param name="displayQueryFields" value="bizId, whereId, prevState, nextOrder, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="targetDataGridId" value="dgFfb011t" />
      </jsp:include>
    </div>
    <div class="easyui-panel" title="审核关系" data-options="iconCls:'icon-edit',collapsible:true">
      <jsp:include page="ffb011t_segments/ffb011t_grid.jsp" >
        <jsp:param name="displayTableFields" value="bizId, whereId, prevState, nextOrder, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="onDblClickRow" value="function(rowIndex, rowData){ onFfb011tDblClickRow(rowIndex, rowData); }" />
        <jsp:param name="onClickRow" value="function(rowIndex, rowData){ onFfb011tClickRow(rowIndex, rowData); }" />
        <jsp:param name="dataGridId" value="dgFfb011t" />
        <jsp:param name="hiddenCheckboxColumn" value="false" />
      </jsp:include> 
    </div>

    <div id="dlgFfb011tEntity" class="easyui-dialog edit-dialog" buttons="#dlg-buttons" title="新建" closed="true" >
      <jsp:include page="ffb011t_segments/ffb011t_edit.jsp" >
        <jsp:param name="displayEditFields" value="bizId, whereId, prevState, nextOrder, createBy, createDate, updateBy, updateDate, archived" />
        <jsp:param name="formId" value="frmEntity" />
      </jsp:include> 
      <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFfb011tEntity()">保存</a> 
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlgFfb011tEntity').dialog('close')">取消</a>
      </div>
    </div>
    
    
  </body>
</html>
