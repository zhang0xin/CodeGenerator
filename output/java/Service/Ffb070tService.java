package com.ysusoft.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;

import com.ysusoft.DAO.Ffb070tDAO;
import com.ysusoft.POJO.Ffb070t;
import com.ysusoft.service.BaseService;

public class Ffb070tService extends BaseService<Ffb070tDAO, Ffb070t>{
	@Autowired
	private Ffb070tDAO ffb070tDao;
	
	@Override
	public Ffb070tDAO getDefaultDao(){
		return getFfb070tDao();
	}
	
	public Ffb070tDAO getFfb070tDao() {
		return ffb070tDao;
	}

	public void setFfb070tDao(Ffb070tDAO ffb070tDao) {
		this.ffb070tDao = ffb070tDao;
	}
}
