/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner;

import entities.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class EditEmployee {
    public static void updateUser(User u){
        Session session = new Configuration().configure().buildSessionFactory().openSession();

        session.beginTransaction();
        
        //session.update(f);
        User x=(User)session.merge(u);

        session.saveOrUpdate(x);
        
        session.getTransaction().commit();
        
        session.close();
    }
    
    public static List<User> getAllUser() {

        Session session = new Configuration().configure().buildSessionFactory().openSession();

        Query query = session.createQuery("from User");

        List<User> list = query.list();

        session.close();
        
        return list;
      
    }
    
}
