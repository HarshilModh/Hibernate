package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.UserBean;

public class UserCaller {

	SessionFactory sf = null;
	Scanner scr = new Scanner(System.in);

	public UserCaller() {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	}

	void addUser() {
		//fn em ps 
		UserBean user = new UserBean();
		System.out.println("Enter Firstname email and Password");
		user.setFirstName(scr.next());
		user.setEmail(scr.next());
		user.setPassword(scr.next());
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		session.save(user);//insert 
		
		tx.commit();
		
		
		session.close();

	}

	void deleteUser() {
			System.out.println("enter id ");
			int userId = scr.nextInt();
			Session session = sf.openSession();
			
			UserBean user = session.get(UserBean.class, userId);//search userid 
			
			session.delete(user);
			
			session.close();
	}

	void listUser() {
		Session session = sf.openSession();
		//SQL 
		List<UserBean>  allUsers = session.createQuery("FROM UserBean").getResultList();
		for(UserBean bean:allUsers) {
			System.out.println(bean.getEmail());
			System.out.println(bean.getFirstName());
			System.out.println(bean.getPassword());
		}
		
		session.close();
		//HQL
		
	}

	public static void main(String[] args) {

		UserCaller caller = new UserCaller();// sf

		Scanner scr = new Scanner(System.in);

		while (true) {
			System.out.println("\n0 For Exit\n1 For Add\n2 For List\n3 For delete\nEnter your choice");
			int ch = scr.nextInt();

			switch (ch) {
			case 0:
				System.exit(0);
			case 1:
				caller.addUser();
				break;
			case 2:
				caller.listUser();
				break;
			case 3:
				break;

			}
		}

	}
}
