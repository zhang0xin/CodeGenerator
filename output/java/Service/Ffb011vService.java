package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb011vDAO;
import com.ysusoft.POJO.Ffb011v;
import com.ysusoft.service.BaseService;

public class Ffb011vService extends BaseService<Ffb011vDAO, Ffb011v>{
	@Autowired
	private Ffb011vDAO ffb011vDao;
	
	@Override
	public Ffb011vDAO getDefaultDao(){
		return getFfb011vDao();
	}
	
	public Ffb011vDAO getFfb011vDao() {
		return ffb011vDao;
	}

	public void setFfb011vDao(Ffb011vDAO ffb011vDao) {
		this.ffb011vDao = ffb011vDao;
	}
}
