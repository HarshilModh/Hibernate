package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //session factory --> connection
        SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        System.out.println(sf);
        
        Session session = sf.openSession(); //session --query 
        
        //class ->map->users 
        
        UserBean bean=new UserBean();
        bean.setFirstName("Harshil");
        bean.setEmail("3123qwd");
        bean.setPassword("1233");
        
        Transaction tf=session.beginTransaction();
        session.save(bean);//insert 
        tf.commit();//save 
        
        
        
        session.close();//release 
        
        
        
        //table ->BeanClass -> map ->table 
        //Query
        //Criteria 
        
        //Configuration
        //SessionFactory
        //Session
        //Transaction 
        
        //Query
        //Criteria 
        
        
        //DS --> debit 
        //T --> credit 
        //commit 
        //rollback
        
        //1 add 
        //2 list
        //3 delete 
        //4 update 
        
    }
    
}
