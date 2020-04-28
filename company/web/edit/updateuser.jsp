<%@page import="entities.User"%>
<%@page import="runner.EditEmployee"%>  

<jsp:useBean id="obj" class="entities.User">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%
EditEmployee.updateUser(obj);
out.print("Updated!");  
%>  
