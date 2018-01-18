package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb012tDAO;
import com.ysusoft.POJO.Ffb012t;
import com.ysusoft.service.BaseService;

public class Ffb012tService extends BaseService<Ffb012tDAO, Ffb012t>{
	@Autowired
	private Ffb012tDAO ffb012tDao;
	
	@Override
	public Ffb012tDAO getDefaultDao(){
		return getFfb012tDao();
	}
	
	public Ffb012tDAO getFfb012tDao() {
		return ffb012tDao;
	}

	public void setFfb012tDao(Ffb012tDAO ffb012tDao) {
		this.ffb012tDao = ffb012tDao;
	}
}
