   <%@page import="entities.Feedback"%>
<%@page import="java.util.List"%>
<%@page import="runner.ViewFeedback"%>  

<jsp:useBean id="obj" class="entities.Feedback">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
<%-- 
    Document   : login
    Created on : Jul 4, 2019, 2:12:50 PM
    Author     : TEKNEL
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	
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

				a:link {
					color: black;
					background-color: transparent;
					text-decoration: none;
				}
				
				a:hover {
					color: black;
					background-color: transparent;
					text-decoration: none;
				}

				a:active {
					color: black;
					background-color: transparent;
					text-decoration: none;
				}
			
			input, select {
						width: 100%;
						padding: 12px 20px;
						margin: 8px 0;
						
						border: 1px solid #ccc;
						border-radius: 4px;
						box-sizing: border-box;
					}
				
					button {
						
						width: 25%;
						background-color: gray;
						color: white;
						padding: 14px 20px;
						margin: 8px 0;
						border: none;
						border-radius: 4px;
						cursor: pointer;
						 float: right;
					}

					button:hover {
						background-color: black;
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
                        
<div class="col-12">
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Feedback</h1>
</div>
 
 <div class="w3-container w3-gary w3-text-black" style="font-size: 15px">
  <table border="1" class="w3-table" width="100%">
    <tr class="w3-black">
      <th>Customer Name</th>
      <th>Email</th>
      <th>Feedback </th>
      <th>Date and Time</th>
    </tr>
    <%
        List<Feedback> list=ViewFeedback.getFeedback();
        for(Feedback item : list){ %>
    <tr class="w3-white">
      <td><%= item.getUserId().getFname()+" "+item.getUserId().getLname()  %></td>
      
      <td><%= item.getUserId().getEmail() %></td>
      
      <td><%= item.getFeedback() %></td>
      
      <td><%= item.getDate()%></td>
    </tr> 
    <% }
    %>
  </table>
</div>

	</body>
</html>


 
