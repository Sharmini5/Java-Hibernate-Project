/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import entities.Feedback;
import entities.Message;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class ViewMessage {
    public static List<Message> getMessage(){  
    
 int i=0;  
 Session session=new Configuration().  
  configure().buildSessionFactory().openSession();  
          
  //Transaction t=session.beginTransaction();  
  //t.begin();  
    Query query = session.createQuery("from Message");
  //i=(Integer)session.save(v);  
      List<Message> list = query.list();
  //t.commit();  
  session.close();  
    
  return list;  
 } 

}
