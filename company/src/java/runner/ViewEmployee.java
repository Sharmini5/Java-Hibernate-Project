/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import entities.Feedback;
import entities.User;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class ViewEmployee {
    public static List<User> getUser(){
         int i=0;  
 Session session=new Configuration().  
  configure().buildSessionFactory().openSession();  
          
  //Transaction t=session.beginTransaction();  
  //t.begin();  
    Query query = session.createQuery("from User");
  //i=(Integer)session.save(v);  
      List<User> list = query.list();
  //t.commit();  
  session.close();  
    
  return list;  
    }
    
}


