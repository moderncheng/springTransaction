package com.account;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public void transfer(String in, String out, double money) {
		// TODO Auto-generated method stub
		    accountDao.outMoney(out, money);
		    int i=2/0;
			accountDao.inMoney(in, money);
	}

}
