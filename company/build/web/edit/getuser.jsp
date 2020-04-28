<%@page import="runner.EditEmployee"%>
<%@page import="java.util.List"%>
<%@page import="entities.User"%>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.js"></script>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.min.js"></script>
        
    <table border="1" class="w3-table" width="100%">
        
    <%
        List<User> list=EditEmployee.getAllUser();
        for (User item : list) {%>
        <tr class="w3-white">
            <td><%= item.getFname() %></td>
            <td><%= item.getLname()  %></td>
      <td><%= item.getEmail() %></td>
       <td><%= item.getNic() %></td>
       <td><%= item.getUname() %></td>
       <td><%= item.getPword()%></td>   
       <td><%= item.getUser_category() %></td>       
      <td><%= item.getAddress_no()%></td>
      <td><%= item.getAddress1() %></td>
      <td><%= item.getAddress2()%></td>
       <td><%= item.getCity()%></td>
            <td><input type="button" value="Edit" style="margin:auto;display:block;" onclick="showDialog(<%= item.getUserId()%>,'<%= item.getFname()%>','<%= item.getLname()%>',<%= item.getEmail()%>','<%= item.getNic()%>','<%= item.getNic() %>','<%= item.getUname() %>','<%= item.getPword()%>','<%= item.getUser_category() %>','<%= item.getAddress_no()%>','<%= item.getAddress1() %>','<%= item.getAddress2()%>',<%= item.getCity()%>)"/></td>
            </tr>
    <%
        }
    %>
    </table> 
    
<div class="w3-padding w3-card w3-center" style="display:none;" id="popup">
    <form action="updateuser.jsp" method="post">
        <table class="w3-center" style="display:block;margin:auto;">    
            <tr style="display:none;"><td>Id</td><td><input type="number" id="id" name="userId" value=""/></td></tr>
            <tr><td>First Name</td><td><input type="text" id="fname" name="fname" value="fname"/></td></tr>
            <tr><td>Last Name</td><td><input type="text" id="lname" name="lname" value="lname"/></td></tr>
            <tr><td>Email</td><td><input type="text" id="por" name="email" value="email"/></td></tr>
            <tr><td>NIC</td><td><input type="text" id="price" name="nic" value="nic"/></td></tr>
            <tr><td>User Name</td><td><input type="text" id="price" name="uname" value="uname"/></td></tr>
            <tr><td>Password</td><td><input type="text" id="price" name="pword" value="pword"/></td></tr>
            <tr><td>User Category</td><td><input type="number" id="price" name="user_category" value="user_category"/></td></tr>
            <tr><td>Address No</td><td><input type="text" id="price" name="address_no" value="address_no"/></td></tr>
            <tr><td>Address1</td><td><input type="text" id="price" name="address1" value="address1"/></td></tr>
            <tr><td>Address2</td><td><input type="text" id="price" name="address2" value="address2"/></td></tr>
            <tr><td>City</td><td><input type="text" id="price" name="city" value="city"/></td></tr>
            <tr><td colspan="2"><input type="button" value="Update" id="button" onclick="myfunc()"/></td></tr>
        </table>
        </form>
    </div>
    

<script>
    gid=0;
   function myfunc(){
        fname=$("#fname").val();
        lname=$("#lname").val();
        email=$("#email").val();
        nic=$("#nic").val();
        uname=$("#uname").val();
        pword=$("#pword").val();
        user_category=$("#user_category").val();
        address_no=$("#address_no").val();
        address1=$("#address1").val();
        address2=$("#address2").val();
        city=$("#city").val();
        alert("hello");
        $.ajax({
            url: "edit/updateuser.jsp",
            data: { 
                "userId":gid,
                "fname": fname,
                "lname": lname,
               "email": email, 
                "nic": nic,
                "uname": uname,
                "pword": pword,
                "user_category": user_category,
                "address_no": address_no,
                "address1": address1,
                "address2":address2,
                "city": city
            },
            cache: false,
            type: "POST",
            success: function(response) {
                alert("Successfully Updated!");
                window.location="edituser.jsp";
            },
            error: function(xhr) {
                alert(xhr+"An error occured..");
            }
        });
    }
    
    
    function showDialog(id,fname,lname,email,nic,uname,pword,user_category,address_no,address1,address2,city){
        gid=id;
        document.getElementById("fname").value=fname;
        document.getElementById("lname").value=lname;
        document.getElementById("email").value=email;
        document.getElementById("nic").value=nic;
        document.getElementById("uname").value=uname;
        document.getElementById("pword").value=pword;
        document.getElementById("user_category").value=user_category;
        document.getElementById("address_no").value=address_no;
        document.getElementById("address1").value=address1;
        document.getElementById("address2").value=address2;
        document.getElementById("city").value=city;
        document.getElementById("popup").style="dispay:block";
        $("#id").val(gid);
    }
    
</script>