package com.ysusoft.Action.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import com.ysusoft.Action.BaseAction;
import com.ysusoft.DAO.DepartmentDAO;
import com.ysusoft.POJO.Department;
import com.ysusoft.service.purchase.DepartmentService;

public class DepartmentAction extends BaseAction<DepartmentService, DepartmentDAO, Department, DepartmentParams>{
	@Autowired
	private DepartmentService departmentService;
	private DepartmentParams query = new DepartmentParams();
	private Department entity;
	
	@Override
	public DepartmentService getDefaultService(){
		return getDepartmentService();
	}
	@Override
	public Department getDefaultEntity(){
		return getEntity();
	}
	@Override
	public DepartmentParams getDefaultParams(){
		return getQuery();
	}
	
	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public DepartmentParams getQuery() {
		return query;
	}

	public void setQuery(DepartmentParams query) {
		this.query = query;
	}

	public Department getEntity() {
		return entity;
	}

	public void setEntity(Department entity) {
		this.entity = entity;
	}
}
