package com.java.hibernet;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
    	 System.out.println("Execution Statring");  
    	 
         EmployeeDetails e1=new EmployeeDetails();    
            //e1.setId(5);    
            e1.setFirstName("Arpit");    
            e1.setLastName("Awasthi");    

    	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
    	 Session session = sessionFactory.openSession();  
         Transaction t = session.beginTransaction();  
         session.save(e1);  
         t.commit();  
       System.out.println("successfully saved");    
       sessionFactory.close();  
       session.close();     
    }  
}  