package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.DepartmentDAO;
import com.ysusoft.POJO.Department;
import com.ysusoft.service.BaseService;

public class DepartmentService extends BaseService<DepartmentDAO, Department>{
	@Autowired
	private DepartmentDAO departmentDao;
	
	@Override
	public DepartmentDAO getDefaultDao(){
		return getDepartmentDao();
	}
	
	public DepartmentDAO getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDAO departmentDao) {
		this.departmentDao = departmentDao;
	}
}
