package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb010tDAO;
import com.ysusoft.POJO.Ffb010t;
import com.ysusoft.service.BaseService;

public class Ffb010tService extends BaseService<Ffb010tDAO, Ffb010t>{
	@Autowired
	private Ffb010tDAO ffb010tDao;
	
	@Override
	public Ffb010tDAO getDefaultDao(){
		return getFfb010tDao();
	}
	
	public Ffb010tDAO getFfb010tDao() {
		return ffb010tDao;
	}

	public void setFfb010tDao(Ffb010tDAO ffb010tDao) {
		this.ffb010tDao = ffb010tDao;
	}
}
