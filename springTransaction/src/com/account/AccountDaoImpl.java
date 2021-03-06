package com.account;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String out, double money) {
		// TODO Auto-generated method stub
		String sql="update account set money=money-? where name=?";
		this.getJdbcTemplate().update(sql,money,out);
	}

	@Override
	public void inMoney(String in, double money) {
		// TODO Auto-generated method stub
		String sql="update account set money=money+? where name=?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
