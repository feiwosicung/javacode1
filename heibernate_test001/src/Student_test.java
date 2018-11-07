

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import heibernate_model.Student;

public class Student_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("lihu",122,1222);
		
		//创建 SessionFactory
		Configuration cfg=new Configuration().configure();
		
		ServiceRegistryBuilder builder=new ServiceRegistryBuilder().applySettings(cfg.getProperties());
		SessionFactory sf = cfg.buildSessionFactory(builder.buildServiceRegistry());
		//创建session
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
