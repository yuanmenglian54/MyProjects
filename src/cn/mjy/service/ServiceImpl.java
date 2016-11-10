package cn.mjy.service;

import cn.mjy.dao.IDao;

public class ServiceImpl implements IService {

 
	@Override
	public Object insertObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object updateObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object deleteObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object queryObject(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	protected IDao dao;
	
}
