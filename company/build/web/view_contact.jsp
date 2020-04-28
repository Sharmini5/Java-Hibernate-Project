<%-- 
    Document   : view_contact
    Created on : Jul 12, 2019, 10:16:15 AM
    Author     : DELL
--%>

<%@page import="runner.ViewMessage"%>
<%@page import="java.util.List"%>
<%@page import="entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        			<%
    if(session.getAttribute("id")!=null)
    out.print("<a href='edit/logout.jsp' class='w3-bar-item w3-right w3-button'>LOGOUT</a>");
    else
    out.print("<a href='login.jsp' class='w3-bar-item w3-right w3-button'>LOGIN</a>");

    %>
			</div>
			
			<div class="col-1">
			</div>
	</div>
                        <div>
	   <table border="1" class="w3-table" width="100%">
               <th>Full Name</th>
                <th>Email</th>
                 <th>Country</th>
                  <th>Message</th>
                   
                                     
                   
        
    <%
        List<Message> list=ViewMessage. getMessage();
        for (Message item : list) {%>
        <tr class="w3-white">
        <td><%= item.getFullname() %></td>
           
      <td><%= item.getEmail() %></td>
       <td><%= item.getCountry() %></td>
       <td><%= item. getMessage() %></td>
       
        </tr>
     <%
        }
    %>
    </table> 
                        </div>
    </body>
</html>
