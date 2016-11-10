package cn.mjy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.mjy.dao.AccountDao;
import cn.mjy.pojo.Account;


public  class AccountServiceImpl {//implements AccountService{
    @Autowired
    private AccountDao accountDao;
 /* 
	public List<Account> findAccountList(Account account) throws Exception {
		return accountDao.findAllAccount();
	}
    */


}
