package cn.mjy.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class DaoImpl implements IDao {

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
	
	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public JdbcTemplate getJdbcTemp() {
		return jdbcTemp;
	}
	public void setJdbcTemp(JdbcTemplate jdbcTemp) {
		this.jdbcTemp = jdbcTemp;
	}


	protected DataSource ds;
	protected JdbcTemplate jdbcTemp; 
}
