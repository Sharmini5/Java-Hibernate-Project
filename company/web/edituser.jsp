<!DOCTYPE html>
<html>
        
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Edit Employee Details</h1>
    <div id="adduser" style="display:none">
            <form action="adduser.jsp" method="post">  
                First Name:<input type="text" name="fname"/><br><br/>
                Last Name:<input type="text" name="lname"/><br><br/>
                Email:<input type="text" name="email"/><br><br/>
                NIC:<input type="text" name="nic"/><br><br/>
                UserName:<input type="text" name="uname"/><br><br/>
                Password:<input type="text" name="pword"/><br><br/>
                User Category:<input type="int" name="user_category"/><br><br/>
                Address No:<input type="text" name="address_no"/><br><br/>
                Address 1:<input type="text" name="address1"/><br><br/>
                Address 2:<input type="text" name="address2"/><br><br/>
                City:<input type="text" name="city"/><br><br/>
            <input type="submit" value="test"/>  
            </form>  
    </div>
    
    <%@include file="edit/getuser.jsp"%>

	</body>
</html>