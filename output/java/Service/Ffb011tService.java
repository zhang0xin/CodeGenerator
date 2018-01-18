package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb011tDAO;
import com.ysusoft.POJO.Ffb011t;
import com.ysusoft.service.BaseService;

public class Ffb011tService extends BaseService<Ffb011tDAO, Ffb011t>{
	@Autowired
	private Ffb011tDAO ffb011tDao;
	
	@Override
	public Ffb011tDAO getDefaultDao(){
		return getFfb011tDao();
	}
	
	public Ffb011tDAO getFfb011tDao() {
		return ffb011tDao;
	}

	public void setFfb011tDao(Ffb011tDAO ffb011tDao) {
		this.ffb011tDao = ffb011tDao;
	}
}
