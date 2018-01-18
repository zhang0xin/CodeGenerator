package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb020avDAO;
import com.ysusoft.POJO.Ffb020av;
import com.ysusoft.service.BaseService;

public class Ffb020avService extends BaseService<Ffb020avDAO, Ffb020av>{
	@Autowired
	private Ffb020avDAO ffb020avDao;
	
	@Override
	public Ffb020avDAO getDefaultDao(){
		return getFfb020avDao();
	}
	
	public Ffb020avDAO getFfb020avDao() {
		return ffb020avDao;
	}

	public void setFfb020avDao(Ffb020avDAO ffb020avDao) {
		this.ffb020avDao = ffb020avDao;
	}
}
