package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t\n");
      out.write("\t<title> Administrator </title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("                        <div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"edituser.jsp\">EDIT EMPLOYEE</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\n");
      out.write("\t\t\t<a href=\"index.html\"><img src=\"Header _ Footer/Camera.png\" style=\"height:25%;width:25%\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-1\">\n");
      out.write("                            <a href=\"view_feedback.jsp\">FEEDBACK</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("            <div class=\"col-1\">\n");
      out.write("                            <a href=\"view_contact.jsp\">MESSAGE</a>\n");
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
      out.write("\t\n");
      out.write("\t<div class=\"Image \">\n");
      out.write("\t\t<img src=\"Administrator/admin1.jpeg\" style=\"width:100%;height:500px;border-radius: 25px 25px 0px 0px;\"> <br>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"para col-12\">\n");
      out.write("\t<h1> WORK HARD DREAM BIG.</h1>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"row\">\t\n");
      out.write("\t\t\n");
      out.write("\t\t<div class =\"img col-6\">\n");
      out.write("\t\t<img src=\"Administrator/admin2.png\" style=\"width:100%;height:350px;\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class =\"col-6\">\n");
      out.write("\t\t<img src=\"Administrator/images (1).jpg\" style=\"width:100%;height:340px;\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"footer col-12\">\n");
      out.write("\t\t<div class=\"col-4 footer\" align=\"center\">\n");
      out.write("\t\t\t<table>\n");
      out.write("\t\t\t\t<tr style=\"height:50px\">\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t<img src=\"Header _ Footer/62516.png\" style=\"height:5%;width:5%\">\n");
      out.write("\t\t\t\tNo 12, Ridgeway place Colombo 04\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<tr style=\"height:70px\">\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t<img src=\"Header _ Footer/img_286083.png\" style=\"height:5%;width:5%\">\n");
      out.write("\t\t\t\t011-2547658\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>\n");
      out.write("\t\t\t\t<img src=\"Header _ Footer/email.png\" style=\"height:5%;width:5%\">\n");
      out.write("\t\t\t\twww.cameraxis@gmail.com\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div class=\"col-4 footer\" align=\"center-left\">\n");
      out.write("\t\t\t<a href=\"https://www.facebook.com/cameraxis/\"><img src=\"Header _ Footer/facebook-4dd1631e86173638d2c9aaa051dd7f8f.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/cameraxisapp/?hl=en\"><img src=\"Header _ Footer/md_5a98273a4e62e.png\" style=\"height:10%;width:10%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t<a href=\"https://plus.google.com/+Cameraxis\"><img src=\"Header _ Footer/md_5a98273aeeb5a.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t\t<a href=\"https://twitter.com/cameraxis\"><img src=\"Header _ Footer/md_5a98273bb9a60.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div class=\"col-4 footer\" align=\"center\" style=\"height:200px\">\n");
      out.write("\t\t\t<a href=\"https://www.google.com/maps/place/Ridgeway+Pl,+Colombo/@6.8798504,79.8554955,17z/data=!3m1!4b1!4m5!3m4!1s0x3ae25bc6d5e20acd:0xd0eb67a7aefc8ff1!8m2!3d6.8798504!4d79.8576842\"><img src=\"Header _ Footer/map.png\" style=\"height:100%;width:80%\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
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
