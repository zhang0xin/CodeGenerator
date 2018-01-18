package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.StudentDAO;
import com.ysusoft.POJO.Student;
import com.ysusoft.service.BaseService;

public class StudentService extends BaseService<StudentDAO, Student>{
	@Autowired
	private StudentDAO studentDao;
	
	@Override
	public StudentDAO getDefaultDao(){
		return getStudentDao();
	}
	
	public StudentDAO getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
}
