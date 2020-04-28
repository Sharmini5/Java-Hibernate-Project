<%-- 
    Document   : leaveApply
    Created on : Jul 12, 2019, 10:36:35 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="form col-6">
	<h1> Leave Application Form </h1>	
		
<form action="edit/addleave.jsp" class="w3-center" method="post">  
	
	Employee Name :<br>
	 <input type="text" name="Employee_Name" placeholder="Employee Name" required="required" ><br><br>
	
	Leave Type(Tick for appropriate box) <br>
	 <input type="radio" name="Leave_Type" value="sick"> Sick <br>
	 <input type="radio" name="Leave_Type" value="Persernal Leave"> Persernal Leave <br>
	 <input type="radio" name="Leave_Type" value="NoPay"> NoPay <br>
	 <input type="radio" name="Leave_Type" value="Casual"> Casual <br>
	 <input type="radio" name="Leave_Type" value="Others"> Others <br><br>

	Reason:<br>
	 <textarea rows="4" cols="50" name=Reason placeholder="Reason for the leave" required="required"></textarea><br><br>
	
	
	 &nbsp &nbsp&nbsp &nbsp <input type="submit" name="submit" value="submit"/> &nbsp &nbsp&nbsp &nbsp <input type="reset" name="reset" value="reset" />
	 
	</form> 
	</div>
    </body>
</html>
