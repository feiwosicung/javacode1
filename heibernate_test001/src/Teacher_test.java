import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import heibernate_model.Teacher;

public class Teacher_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher s=new Teacher();
		s.setId(6);
		s.setTitle("WU");
		s.setName("lihua");
		//´´½¨ SessionFactory
		Configuration cfg=new Configuration().configure();
		
		ServiceRegistryBuilder builder=new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		SessionFactory sf = cfg.buildSessionFactory(builder.buildServiceRegistry());
		//´´½¨session
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
		//wwwww
	}

}
