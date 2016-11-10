package cn.mjy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import cn.mjy.pojo.Account;

@Repository
public class AccountDao extends DaoImpl{

	@Override
	public Object queryObject(Object obj) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext-dao.xml");
		AccountDao ad = (AccountDao) context.getBean("accountDao");

		String sql = "SELECT id,comCode,cname,createTime,lastLoginTime,"
				+ "   accountType,state,remark FROM account";
		return ad.jdbcTemp.queryForList(sql);
	}

	/**
	 * 1、sql中用的是具体的字段，没有用*，list.get(i).get("comCode")中get("comCode")的
	 *   参数为字段名,因为queryForList(sql)返回结果是在Map中的，而且是以键值对的方式存在，所以
	 *   默认的key就为数据库查询出来的字段名一样。
	 * 2、由于你是用的属性注入，即：下面的property 
	 *       <bean id="accountDao" class="cn.mjy.dao.AccountDao">
      	         <property name="jdbcTemplete" ref="jdbcTemplate"/>
              </bean>
                      所以就必须写上这个ApplicationContext，才能获取得到JdbcTemplete对象，否则就会报
	 *   空指针异常。
	 * 3、暂时我就找到这种方法，等会儿我再试试其他方法，比如自动注入，分页等等这些，
	 *   你自己把获取到的数据放到前台页面去吧。
	 */
//	@Test
//	public void testQuery(){
//		String sql = "SELECT comCode,cname FROM account";
//		List<Map<String, Object>> list = jdbcTemp.queryForList(sql);
//		for (int i = 0; i < list.size(); i++)
//			System.out.println("comCode:" + list.get(i).get("comCode") + "\t"
//					+ "cname:" + list.get(i).get("cname"));
//	}
//	
//	public static void main(String args[]){
//		new AccountDao().testQuery();
//	}
//	
//	@Test
//	public void testQuery2(){
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"applicationContext-dao.xml");
//		AccountDao ad = (AccountDao) context.getBean("accountDao");
//
//		String sql = "SELECT comCode,cname FROM account";
//		List<Map<String, Object>> list = ad.jdbcTemp.queryForList(sql);
//		for (int i = 0; i < list.size(); i++)
//			System.out.println("comCode:" + list.get(i).get("comCode") + "\t"
//					+ "cname:" + list.get(i).get("cname"));
//	}
//	
//	@Test
//	public void testQuery3(){
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"applicationContext-dao.xml");
//		AccountDao ad = (AccountDao) context.getBean("accountDao");
//
//		String sql = "SELECT id,comCode,cname,createTime,lastLoginTime,"
//				+ "   accountType,state,remark FROM account";
//		List<Map<String, Object>> list = ad.jdbcTemp.queryForList(sql);
//	/*	Map<String,Account> map=new HashMap<String,Account>();
//		ad.jdbcTemp.queryForList(sql,account);*/
//		for (int i = 0; i < list.size(); i++)
//			System.out.println("comCode:" + list.get(i).get("comCode") + "\t"
//					+ "cname:" + list.get(i).get("cname"));
//			/*System.out.println(account.toString());*/
//	}
	@Autowired 
	private Account account;
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}