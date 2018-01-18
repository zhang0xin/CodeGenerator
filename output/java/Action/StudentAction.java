package com.ysusoft.Action.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import com.ysusoft.Action.BaseAction;
import com.ysusoft.DAO.StudentDAO;
import com.ysusoft.POJO.Student;
import com.ysusoft.service.purchase.StudentService;

public class StudentAction extends BaseAction<StudentService, StudentDAO, Student, StudentParams>{
	@Autowired
	private StudentService studentService;
	private StudentParams query = new StudentParams();
	private Student entity;
	
	@Override
	public StudentService getDefaultService(){
		return getStudentService();
	}
	@Override
	public Student getDefaultEntity(){
		return getEntity();
	}
	@Override
	public StudentParams getDefaultParams(){
		return getQuery();
	}
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public StudentParams getQuery() {
		return query;
	}

	public void setQuery(StudentParams query) {
		this.query = query;
	}

	public Student getEntity() {
		return entity;
	}

	public void setEntity(Student entity) {
		this.entity = entity;
	}
}
