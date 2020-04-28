<%-- 
    Document   : addleave
    Created on : Jul 12, 2019, 10:39:16 AM
    Author     : DELL
--%>

<%@page import="entities.User"%>
<%@page import="runner.AddLeave"%>  

<jsp:useBean id="obj" class="entities.Leave">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
User u=new User();
String id=session.getAttribute("id").toString();
u.setUserId(Integer.parseInt(id));
obj.setUserId(u);
int i=AddLeave.addLeave(obj);  
if(i>0)  
out.print("<script>alert('Leave Is Applyed!');window.location='../employee.jsp';</script>");  
%>  
