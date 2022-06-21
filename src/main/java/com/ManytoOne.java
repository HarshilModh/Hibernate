package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.DepartmentBean;
import com.bean.EmployeeBean;

public class ManytoOne {

	
	
	public static void main(String[] args) {
		SessionFactory sf = null;
		Scanner scr = new Scanner(System.in);
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session=sf.openSession();
		Transaction tx = session.beginTransaction();

		EmployeeBean bean=new EmployeeBean();
		
		DepartmentBean bean2=new DepartmentBean();
		bean2.setDeptname("Java Devloper");
		
		
		bean.setCity("Ahmedabad");
		bean.setEmpname("Diya");
		bean.setDepartment(bean2);
		bean2.setEmployee(bean);
		
		session.persist(bean);//insert 

		tx.commit();
		
		
		session.close();

		
	}
}
