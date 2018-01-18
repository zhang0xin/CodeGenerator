package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb040tDAO;
import com.ysusoft.POJO.Ffb040t;
import com.ysusoft.service.BaseService;

public class Ffb040tService extends BaseService<Ffb040tDAO, Ffb040t>{
	@Autowired
	private Ffb040tDAO ffb040tDao;
	
	@Override
	public Ffb040tDAO getDefaultDao(){
		return getFfb040tDao();
	}
	
	public Ffb040tDAO getFfb040tDao() {
		return ffb040tDao;
	}

	public void setFfb040tDao(Ffb040tDAO ffb040tDao) {
		this.ffb040tDao = ffb040tDao;
	}
}
