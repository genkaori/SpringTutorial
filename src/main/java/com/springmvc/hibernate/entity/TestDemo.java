package com.springmvc.hibernate.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDemo {
/*	public static void main(String []args){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Department department = new Department();
		department.setDeptId(0003);
		department.setDeptName("Minh Phuong");
		department.setDeptNo("B5");
		department.setLocation("Dong Da");
		
		session.save(department);
		session.getTransaction().commit();
		session.close();
		
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
         
        List<Department> departments = session.createQuery("from Department").list();
         
        session.close();
         
        for (Department st : departments) {
        	 System.out.println(st.getDeptId()+". "+st.getDeptName()+" "+st.getDeptNo()+" "+st.getLocation());
        }
		
	}*/

}
