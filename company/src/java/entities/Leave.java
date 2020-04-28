/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Leave {
    private int id; 
   private String Employee_Name;
   private String Leave_Type;
   private String Reason;
   private Date Date;
 private User userId;
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public void setEmployee_Name(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }
    public String getLeave_Type() {
        return Leave_Type;
    }

    public void setLeave_Type(String Leave_Type) {
        this.Leave_Type = Leave_Type;
    }
    public String getReason() {
        return Employee_Name;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

      public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

   public Leave(){
   } 
 
   public Leave(String Employee_Name,String Leave_Type,String Reason, Date Date,User userId ){
       this.Employee_Name = Employee_Name;
       this.Leave_Type = Leave_Type;
       this.Reason = Reason;
       this.Date=Date;
       this.userId= userId;
    
   }   
   
    
}
