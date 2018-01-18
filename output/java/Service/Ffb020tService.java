package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb020tDAO;
import com.ysusoft.POJO.Ffb020t;
import com.ysusoft.service.BaseService;

public class Ffb020tService extends BaseService<Ffb020tDAO, Ffb020t>{
	@Autowired
	private Ffb020tDAO ffb020tDao;
	
	@Override
	public Ffb020tDAO getDefaultDao(){
		return getFfb020tDao();
	}
	
	public Ffb020tDAO getFfb020tDao() {
		return ffb020tDao;
	}

	public void setFfb020tDao(Ffb020tDAO ffb020tDao) {
		this.ffb020tDao = ffb020tDao;
	}
}
