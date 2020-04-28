package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import runner.EditEmployee;
import java.util.List;
import entities.User;

public final class edituser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/edit/getuser.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("        \n");
      out.write("    <h1 class=\"w3-center w3-jumbo\" style=\"margin-bottom:64px\">Edit Employee Details</h1>\n");
      out.write("    <div id=\"adduser\" style=\"display:none\">\n");
      out.write("            <form action=\"adduser.jsp\" method=\"post\">  \n");
      out.write("                First Name:<input type=\"text\" name=\"fname\"/><br><br/>\n");
      out.write("                Last Name:<input type=\"text\" name=\"lname\"/><br><br/>\n");
      out.write("                Email:<input type=\"text\" name=\"email\"/><br><br/>\n");
      out.write("                NIC:<input type=\"text\" name=\"nic\"/><br><br/>\n");
      out.write("                UserName:<input type=\"text\" name=\"uname\"/><br><br/>\n");
      out.write("                Password:<input type=\"text\" name=\"pword\"/><br><br/>\n");
      out.write("                User Category:<input type=\"int\" name=\"user_category\"/><br><br/>\n");
      out.write("                Address No:<input type=\"text\" name=\"address_no\"/><br><br/>\n");
      out.write("                Address 1:<input type=\"text\" name=\"address1\"/><br><br/>\n");
      out.write("                Address 2:<input type=\"text\" name=\"address2\"/><br><br/>\n");
      out.write("                City:<input type=\"text\" name=\"city\"/><br><br/>\n");
      out.write("            <input type=\"submit\" value=\"test\"/>  \n");
      out.write("            </form>  \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.9.0/jquery-ui.min.js\"></script>\n");
      out.write("        \n");
      out.write("    <table border=\"1\" class=\"w3-table\">\n");
      out.write("        \n");
      out.write("    ");

        List<User> list=EditEmployee.getAllUser();
        for (User item : list) {
      out.write("\n");
      out.write("        <tr class=\"w3-white\">\n");
      out.write("            <td>");
      out.print( item.getFname() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( item.getLname()  );
      out.write("</td>\n");
      out.write("      <td>");
      out.print( item.getEmail() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( item.getNic() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( item.getUname() );
      out.write("</td>\n");
      out.write("       <td>");
      out.print( item.getPword());
      out.write("</td>   \n");
      out.write("       <td>");
      out.print( item.getUser_category() );
      out.write("</td>       \n");
      out.write("      <td>");
      out.print( item.getAddress_no());
      out.write("</td>\n");
      out.write("      <td>");
      out.print( item.getAddress1() );
      out.write("</td>\n");
      out.write("      <td>");
      out.print( item.getAddress2());
      out.write("</td>\n");
      out.write("       <td>");
      out.print( item.getCity());
      out.write("</td>\n");
      out.write("            <td><input type=\"button\" value=\"Edit\" style=\"margin:auto;display:block;\" onclick=\"showDialog(");
      out.print( item.getFname()  );
      out.write(',');
      out.write('\'');
      out.print( item.getLname()  );
      out.write('\'');
      out.write(',');
      out.print( item.getEmail() );
      out.write("','");
      out.print( item.getNic() );
      out.write("','");
      out.print( item.getNic() );
      out.write("','");
      out.print( item.getUname() );
      out.write("','");
      out.print( item.getPword());
      out.write("','");
      out.print( item.getUser_category() );
      out.write("','");
      out.print( item.getAddress_no());
      out.write("','");
      out.print( item.getAddress1() );
      out.write("','");
      out.print( item.getAddress2());
      out.write('\'');
      out.write(',');
      out.print( item.getCity());
      out.write(")\"/></td>\n");
      out.write("        </tr>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("    </table> \n");
      out.write("    \n");
      out.write("<div class=\"w3-padding w3-card w3-center\" style=\"display:none;\" id=\"popup\"><form action=\"updateuser.jsp\" method=\"post\">\n");
      out.write("        <table class=\"w3-center\" style=\"display:block;margin:auto;\">    \n");
      out.write("            <tr style=\"display:none;\"><td>Id</td><td><input type=\"number\" id=\"id\" name=\"userId\" value=\"\"/></td></tr>\n");
      out.write("            <tr><td>First Name</td><td><input type=\"text\" id=\"fname\" name=\"fname\" value=\"fname\"/></td></tr>\n");
      out.write("            <tr><td>Last Name</td><td><input type=\"text\" id=\"lname\" name=\"lname\" value=\"lname\"/></td></tr>\n");
      out.write("            <tr><td>Email</td><td><input type=\"text\" id=\"por\" name=\"email\" value=\"email\"/></td></tr>\n");
      out.write("            <tr><td>NIC</td><td><input type=\"text\" id=\"price\" name=\"nic\" value=\"nic\"/></td></tr>\n");
      out.write("            <tr><td>User Name</td><td><input type=\"text\" id=\"price\" name=\"uname\" value=\"uname\"/></td></tr>\n");
      out.write("            <tr><td>Password</td><td><input type=\"text\" id=\"price\" name=\"pword\" value=\"pword\"/></td></tr>\n");
      out.write("            <tr><td>User Category</td><td><input type=\"number\" id=\"price\" name=\"user_category\" value=\"user_category\"/></td></tr>\n");
      out.write("            <tr><td>Address No</td><td><input type=\"text\" id=\"price\" name=\"address_no\" value=\"address_no\"/></td></tr>\n");
      out.write("            <tr><td>Address1</td><td><input type=\"text\" id=\"price\" name=\"address1\" value=\"address1\"/></td></tr>\n");
      out.write("            <tr><td>Address2</td><td><input type=\"text\" id=\"price\" name=\"address2\" value=\"address2\"/></td></tr>\n");
      out.write("            <tr><td>City</td><td><input type=\"text\" id=\"price\" name=\"city\" value=\"city\"/></td></tr>\n");
      out.write("            <tr><td colspan=\"2\"><input type=\"button\" value=\"Update\" id=\"button\" onclick=\"myfunc()\"/></td></tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    gid=0;\n");
      out.write("   function myfunc(){\n");
      out.write("        fname=$(\"#fname\").val();\n");
      out.write("        lname=$(\"#lname\").val();\n");
      out.write("        email=$(\"#email\").val();\n");
      out.write("        nic=$(\"#nic\").val();\n");
      out.write("        uname=$(\"#uname\").val();\n");
      out.write("        pword=$(\"#pword\").val();\n");
      out.write("        user_category=$(\"#user_category\").val();\n");
      out.write("        address_no=$(\"#address_no\").val();\n");
      out.write("        address1=$(\"#address1\").val();\n");
      out.write("        address2=$(\"#address2\").val();\n");
      out.write("        city=$(\"#city\").val();\n");
      out.write("        //alert(\"hello\");\n");
      out.write("        $.ajax({\n");
      out.write("            url: \"edit/updateuser.jsp\",\n");
      out.write("            data: { \n");
      out.write("                \"userId\":gid,\n");
      out.write("                \"fname\": fname,\n");
      out.write("                \"lname\": lname,\n");
      out.write("               \"email\": email, \n");
      out.write("                \"nic\": nic,\n");
      out.write("                \"uname\": uname,\n");
      out.write("                \"pword\": pword,\n");
      out.write("                \"user_category\": user_category,\n");
      out.write("                \"address_no\": address_no,\n");
      out.write("                \"address1\": address1,\n");
      out.write("                \"address2\":address2,\n");
      out.write("                \"city\": city\n");
      out.write("            },\n");
      out.write("            cache: false,\n");
      out.write("            type: \"POST\",\n");
      out.write("            success: function(response) {\n");
      out.write("                alert(\"Successfully Updated!\");\n");
      out.write("                window.location=\"edituser.jsp\";\n");
      out.write("            },\n");
      out.write("            error: function(xhr) {\n");
      out.write("                alert(xhr+\"An error occured..\");\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    function showDialog(id,fname,lname,email,nic,uname,pword,user_category,address_no,address1,address2,city){\n");
      out.write("        gid=id;\n");
      out.write("        document.getElementById(\"fname\").value=fname;\n");
      out.write("        document.getElementById(\"lname\").value=lname;\n");
      out.write("        document.getElementById(\"email\").value=email;\n");
      out.write("        document.getElementById(\"nic\").value=nic;\n");
      out.write("        document.getElementById(\"uname\").value=uname;\n");
      out.write("        document.getElementById(\"pword\").value=pword;\n");
      out.write("        document.getElementById(\"user_category\").value=user_category;\n");
      out.write("        document.getElementById(\"address_no\").value=address_no;\n");
      out.write("        document.getElementById(\"address1\").value=address1;\n");
      out.write("        document.getElementById(\"address2\").value=address2;\n");
      out.write("        document.getElementById(\"city\").value=city;\n");
      out.write("        document.getElementById(\"popup\").style=\"dispay:block\";\n");
      out.write("        $(\"#id\").val(gid);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
