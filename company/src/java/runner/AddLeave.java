/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import entities.Feedback;
import entities.Leave;
import java.sql.Timestamp;
import java.util.Calendar;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class AddLeave {
    
 public static int addLeave(Leave l){   
     
    int i=0;  
    
    long timeNow=Calendar.getInstance().getTimeInMillis();
    Timestamp ts=new Timestamp(timeNow);
    
    l.setDate(ts);
    
    Session session=new Configuration().  
     configure().buildSessionFactory().openSession();  

     Transaction t=session.beginTransaction();  

     i=(Integer)session.save(l);  

     t.commit();  
     session.close();  

     return i;  
 } 

    
}
