package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb060avDAO;
import com.ysusoft.POJO.Ffb060av;
import com.ysusoft.service.BaseService;

public class Ffb060avService extends BaseService<Ffb060avDAO, Ffb060av>{
	@Autowired
	private Ffb060avDAO ffb060avDao;
	
	@Override
	public Ffb060avDAO getDefaultDao(){
		return getFfb060avDao();
	}
	
	public Ffb060avDAO getFfb060avDao() {
		return ffb060avDao;
	}

	public void setFfb060avDao(Ffb060avDAO ffb060avDao) {
		this.ffb060avDao = ffb060avDao;
	}
}
