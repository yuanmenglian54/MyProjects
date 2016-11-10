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
	 * 1��sql���õ��Ǿ�����ֶΣ�û����*��list.get(i).get("comCode")��get("comCode")��
	 *   ����Ϊ�ֶ���,��ΪqueryForList(sql)���ؽ������Map�еģ��������Լ�ֵ�Եķ�ʽ���ڣ�����
	 *   Ĭ�ϵ�key��Ϊ���ݿ��ѯ�������ֶ���һ����
	 * 2�����������õ�����ע�룬���������property 
	 *       <bean id="accountDao" class="cn.mjy.dao.AccountDao">
      	         <property name="jdbcTemplete" ref="jdbcTemplate"/>
              </bean>
                      ���Ծͱ���д�����ApplicationContext�����ܻ�ȡ�õ�JdbcTemplete���󣬷���ͻᱨ
	 *   ��ָ���쳣��
	 * 3����ʱ�Ҿ��ҵ����ַ������Ȼ�������������������������Զ�ע�룬��ҳ�ȵ���Щ��
	 *   ���Լ��ѻ�ȡ�������ݷŵ�ǰ̨ҳ��ȥ�ɡ�
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