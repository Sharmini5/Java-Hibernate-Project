<%@page import="entities.Message"%>
<%@page import="runner.AddMessage"%>

<jsp:useBean id="obj1" class="entities.Message">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj1"/>  
  
<%  
int i=AddMessage.addMessage(obj1);  
if(i>0)  
out.print("<script> alert('Successfully Recorded!');window.location='../index.html';</script>");  
%>  

