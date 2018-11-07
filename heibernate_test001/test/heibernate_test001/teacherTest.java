package heibernate_test001;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import heibernate_model.Teacher;

public class teacherTest {
	private Configuration cfg;
	private ServiceRegistryBuilder builder;
	private SessionFactory sf;
	private Session session;
	@Before
	public void setUpBeforeClass() throws Exception {
		//创建 SessionFactory
		 cfg=new Configuration().configure();
		
		 builder=new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		 sf = cfg.buildSessionFactory(builder.buildServiceRegistry());
		//创建session
		 session=sf.openSession();
		 //开启事务
		 session.beginTransaction();
	}

	@After
	public  void tearDownAfterClass() throws Exception {
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

	@Test
	public void test() {
		Teacher teacher=new Teacher(1222,"张三","教师");
		session.save(teacher);
	}

}
