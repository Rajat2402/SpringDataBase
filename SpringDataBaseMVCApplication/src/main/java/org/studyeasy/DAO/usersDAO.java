package org.studyeasy.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.Model.Model;

public class usersDAO {

	
	SessionFactory factory=new Configuration()
			.configure("Hibernate.cfg.xml")			.addAnnotatedClass(Model.class)
			.buildSessionFactory();
	public List<Model> getUsersList()
	{
		 Session session = factory.getCurrentSession();
		 session.beginTransaction();
		 List<Model> list=session.createNativeQuery("Select * from users" , Model.class).getResultList();
		 session.getTransaction().commit();
		 session.close();
		 return list;
	}
}
