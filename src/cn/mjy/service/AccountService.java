package cn.mjy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.mjy.dao.AccountDao;

@Service
public class AccountService extends ServiceImpl {
	@Override
	public Object queryObject(Object obj) {
		return accountDao.queryObject(obj);
	}
    

	@Autowired
	private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
