<%-- 
    Document   : vew_Employee
    Created on : Jul 8, 2019, 11:21:30 AM
    Author     : DELL
--%>

<%@page import="runner.ViewEmployee"%>
<%@page import="runner.EditEmployee"%>
<%@page import="java.util.List"%>
<%@page import="entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<style>
		

		* {
			box-sizing: border-box;
		}
		.row::after {
			content: "";
			clear: both;
			display: table;
			}
		[class*="col-"] {
			float: left;
			padding: 15px;
		}
		
		.col-1 {width: 8.33%;}
		.col-2 {width: 16.66%;}
		.col-3 {width: 25%;}
		.col-4 {width: 33.33%;}
		.col-5 {width: 41.66%;}
		.col-6 {width: 50%;}
		.col-7 {width: 58.33%;}
		.col-8 {width: 66.66%;}
		.col-9 {width: 75%;}
		.col-10 {width: 83.33%;}
		.col-11 {width: 91.66%;}
		.col-12 {width: 100%;}
	
		.header {
			color: #ffffff;
			padding: 15px;
			font-size:25px;
		}
		
		a:link {
			color: black;
			background-color: transparent;
			text-decoration: none;
		}
		
		a:visited {
			color: black;
			background-color: transparent;
			text-decoration: none;
		}
		
		a:hover {
			color:black;
			background-color: transparent;
			text-decoration: none;
		}

		a:active {
			color: black;
			background-color: transparent;
			text-decoration: none;
		}
		
		
		.Activity ul {
			list-style-type: none;
			margin: 0;
			padding: 0;
		}

		.Activity li {
			padding: 8px;
			margin-bottom: 7px;
			font-size:25px;
			background-color:#bbbb77;
			color:#f2f2f2;
			box-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);
		}
		
		.para{
			font-size:5px;
			color: #000000;
			font-weight:bold;
			font-size:15px;
			text-align:center;
			background-color:#cccc99;
			border-radius: 0px 0px 0px 0px;
		}
		.footer{
			background-color:#aaaa55;
		}
		
		.div2{
			background-color:#aaaa55;
			font-style: italic;
			font-size: 14px;
			color:black;
			font-weight:bold;
		}

		button{
						width: 70%;
						/*padding: 12px 20px;
						/*margin: 8px 0;
						/*display: block;
						/*border: 1px solid #ccc;*/
						border-radius: 4px;
						/*box-sizing: border-box;*/
					}

					.cancelbtn{
		background-color: white;
		border: none;
		border-radius: none;
	}
		
	</style>
</head>

<body>

	<div class="header1">

			<div class="col-1">
			</div>

			<div class="col-2" align="center" >
			<a href="view_Employee.jsp">STAFF DETAILS</a>
			</div>
			<div class="col-2" align="center">
			<a href="edituser.jsp">EDIT EMPLOYEE</a>
			</div>
			<div class="col-2" align="center">
			<a href="index.html"><img src="Header _ Footer/Camera.png" style="height:25%;width:25%"></a>
			</div>
			<div class="col-1">
                            <a href="view_feedback.jsp">FEEDBACK</a>
			</div>
			<div class="col-2" align="center">
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
               <th>Employee Name</th>
                <th>Email</th>
                 <th>Nic</th>
                  <th>User Name</th>
                   <th>Password</th>
                    <th>Address</th>
                     <th>City</th>
                                     
                   
        
    <%
        List<User> list=ViewEmployee.getUser();
        for (User item : list) {%>
        <tr class="w3-white">
        <td><%= item.getFname()  +" "+ item.getLname() %></td>
           
      <td><%= item.getEmail() %></td>
       <td><%= item.getNic() %></td>
       <td><%= item.getUname() %></td>
       <td><%= item.getPword()%></td>   
          
      <td><%= item.getAddress_no()+" "+item.getAddress1()+" "+item.getAddress2()%></td>   
       <td><%= item.getCity()%></td>
        </tr>
     <%
        }
    %>
    </table> 
                        </div>
	
</body>
</html>