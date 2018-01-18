package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb030tDAO;
import com.ysusoft.POJO.Ffb030t;
import com.ysusoft.service.BaseService;

public class Ffb030tService extends BaseService<Ffb030tDAO, Ffb030t>{
	@Autowired
	private Ffb030tDAO ffb030tDao;
	
	@Override
	public Ffb030tDAO getDefaultDao(){
		return getFfb030tDao();
	}
	
	public Ffb030tDAO getFfb030tDao() {
		return ffb030tDao;
	}

	public void setFfb030tDao(Ffb030tDAO ffb030tDao) {
		this.ffb030tDao = ffb030tDao;
	}
}
