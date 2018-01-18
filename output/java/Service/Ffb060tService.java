package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb060tDAO;
import com.ysusoft.POJO.Ffb060t;
import com.ysusoft.service.BaseService;

public class Ffb060tService extends BaseService<Ffb060tDAO, Ffb060t>{
	@Autowired
	private Ffb060tDAO ffb060tDao;
	
	@Override
	public Ffb060tDAO getDefaultDao(){
		return getFfb060tDao();
	}
	
	public Ffb060tDAO getFfb060tDao() {
		return ffb060tDao;
	}

	public void setFfb060tDao(Ffb060tDAO ffb060tDao) {
		this.ffb060tDao = ffb060tDao;
	}
}
