package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import runner.ViewEmployee;
import runner.EditEmployee;
import java.util.List;
import entities.User;

public final class view_005fEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\n");
      out.write("\t<style>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t}\n");
      out.write("\t\t.row::after {\n");
      out.write("\t\t\tcontent: \"\";\n");
      out.write("\t\t\tclear: both;\n");
      out.write("\t\t\tdisplay: table;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t[class*=\"col-\"] {\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tpadding: 15px;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.col-1 {width: 8.33%;}\n");
      out.write("\t\t.col-2 {width: 16.66%;}\n");
      out.write("\t\t.col-3 {width: 25%;}\n");
      out.write("\t\t.col-4 {width: 33.33%;}\n");
      out.write("\t\t.col-5 {width: 41.66%;}\n");
      out.write("\t\t.col-6 {width: 50%;}\n");
      out.write("\t\t.col-7 {width: 58.33%;}\n");
      out.write("\t\t.col-8 {width: 66.66%;}\n");
      out.write("\t\t.col-9 {width: 75%;}\n");
      out.write("\t\t.col-10 {width: 83.33%;}\n");
      out.write("\t\t.col-11 {width: 91.66%;}\n");
      out.write("\t\t.col-12 {width: 100%;}\n");
      out.write("\t\n");
      out.write("\t\t.header {\n");
      out.write("\t\t\tcolor: #ffffff;\n");
      out.write("\t\t\tpadding: 15px;\n");
      out.write("\t\t\tfont-size:25px;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\ta:link {\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\ta:visited {\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\ta:hover {\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\ta:active {\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t.Activity ul {\n");
      out.write("\t\t\tlist-style-type: none;\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.Activity li {\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tmargin-bottom: 7px;\n");
      out.write("\t\t\tfont-size:25px;\n");
      out.write("\t\t\tbackground-color:#bbbb77;\n");
      out.write("\t\t\tcolor:#f2f2f2;\n");
      out.write("\t\t\tbox-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.para{\n");
      out.write("\t\t\tfont-size:5px;\n");
      out.write("\t\t\tcolor: #000000;\n");
      out.write("\t\t\tfont-weight:bold;\n");
      out.write("\t\t\tfont-size:15px;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("\t\t\tbackground-color:#cccc99;\n");
      out.write("\t\t\tborder-radius: 0px 0px 0px 0px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.footer{\n");
      out.write("\t\t\tbackground-color:#aaaa55;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t.div2{\n");
      out.write("\t\t\tbackground-color:#aaaa55;\n");
      out.write("\t\t\tfont-style: italic;\n");
      out.write("\t\t\tfont-size: 14px;\n");
      out.write("\t\t\tcolor:black;\n");
      out.write("\t\t\tfont-weight:bold;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tbutton{\n");
      out.write("\t\t\t\t\t\twidth: 70%;\n");
      out.write("\t\t\t\t\t\t/*padding: 12px 20px;\n");
      out.write("\t\t\t\t\t\t/*margin: 8px 0;\n");
      out.write("\t\t\t\t\t\t/*display: block;\n");
      out.write("\t\t\t\t\t\t/*border: 1px solid #ccc;*/\n");
      out.write("\t\t\t\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\t\t\t\t/*box-sizing: border-box;*/\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t.cancelbtn{\n");
      out.write("\t\tbackground-color: white;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t\tborder-radius: none;\n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"header1\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\" >\n");
      out.write("\t\t\t<a href=\"view_Employee.jsp\">STAFF DETAILS</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"leavedetails.php\">LEAVE DETAILS</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"index.html\"><img src=\"Header _ Footer/Camera.png\" style=\"height:25%;width:25%\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"edituser.jsp\">EDIT EMPLOYEE</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t");

    if(session.getAttribute("id")!=null)
    out.print("<a href='edit/logout.jsp' class='w3-bar-item w3-right w3-button'>LOGOUT</a>");
    else
    out.print("<a href='login.jsp' class='w3-bar-item w3-right w3-button'>LOGIN</a>");

    
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("                        <div>\n");
      out.write("\t   <table border=\"1\" class=\"w3-table\" width=\"100%\">\n");
      out.write("               <th>Employee Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                 <th>Nic</th>\n");
      out.write("                  <th>User Name</th>\n");
      out.write("                   <th>Password</th>\n");
      out.write("                    <th>Address</th>\n");
      out.write("                     <th>City</th>\n");
      out.write("                                     \n");
      out.write("                   \n");
      out.write("        \n");
      out.write("    ");

        List<User> list=ViewEmployee.getUser();
        for (User item : list) {
      out.write("\n");
      out.write("        <tr class=\"w3-white\">\n");
      out.write("        <td>");
      out.print( item.getFname()  +" "+ item.getLname() );
      out.write("</td>\n");
      out.write("           \n");
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
      out.write("          \n");
      out.write("      <td>");
      out.print( item.getAddress_no()+" "+item.getAddress1()+" "+item.getAddress2());
      out.write("</td>   \n");
      out.write("       <td>");
      out.print( item.getCity());
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("     ");

        }
    
      out.write("\n");
      out.write("    </table> \n");
      out.write("                        </div>\n");
      out.write("\t\n");
      out.write("</body>\n");
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
