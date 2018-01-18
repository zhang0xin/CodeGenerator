package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb050tDAO;
import com.ysusoft.POJO.Ffb050t;
import com.ysusoft.service.BaseService;

public class Ffb050tService extends BaseService<Ffb050tDAO, Ffb050t>{
	@Autowired
	private Ffb050tDAO ffb050tDao;
	
	@Override
	public Ffb050tDAO getDefaultDao(){
		return getFfb050tDao();
	}
	
	public Ffb050tDAO getFfb050tDao() {
		return ffb050tDao;
	}

	public void setFfb050tDao(Ffb050tDAO ffb050tDao) {
		this.ffb050tDao = ffb050tDao;
	}
}
