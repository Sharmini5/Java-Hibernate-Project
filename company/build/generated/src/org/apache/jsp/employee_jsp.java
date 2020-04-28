package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title> Employee </title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("\t\r\n");
      out.write("\t<style>\r\n");
      out.write("\r\n");
      out.write("\t\t* {\r\n");
      out.write("\t\t\tbox-sizing: border-box;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.row::after {\r\n");
      out.write("\t\t\tcontent: \"\";\r\n");
      out.write("\t\t\tclear: both;\r\n");
      out.write("\t\t\tdisplay: table;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t[class*=\"col-\"] {\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t\tpadding: 15px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.col-1 {width: 8.33%;}\r\n");
      out.write("\t\t.col-2 {width: 16.66%;}\r\n");
      out.write("\t\t.col-3 {width: 25%;}\r\n");
      out.write("\t\t.col-4 {width: 33.33%;}\r\n");
      out.write("\t\t.col-5 {width: 41.66%;}\r\n");
      out.write("\t\t.col-6 {width: 50%;}\r\n");
      out.write("\t\t.col-7 {width: 58.33%;}\r\n");
      out.write("\t\t.col-8 {width: 66.66%;}\r\n");
      out.write("\t\t.col-9 {width: 75%;}\r\n");
      out.write("\t\t.col-10 {width: 83.33%;}\r\n");
      out.write("\t\t.col-11 {width: 91.66%;}\r\n");
      out.write("\t\t.col-12 {width: 100%;}\r\n");
      out.write("\t\r\n");
      out.write("\t\t.header {\r\n");
      out.write("\t\t\tcolor: #ffffff;\r\n");
      out.write("\t\t\tpadding: 15px;\r\n");
      out.write("\t\t\tfont-size:25px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ta:link {\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t\tbackground-color: transparent;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ta:visited {\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t\tbackground-color: transparent;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ta:hover {\r\n");
      out.write("\t\t\tcolor:black;\r\n");
      out.write("\t\t\tbackground-color: transparent;\r\n");
      out.write("\t\t\ttext-decoration: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\ta:active {\r\n");
      out.write("\t\t\tcolor: black;\r\n");
      out.write("\t\t\tbackground-color: transparent;\r\n");
      out.write("\t\t\ttext-decoration: underline;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.Activity ul {\r\n");
      out.write("\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\tmargin: 0;\r\n");
      out.write("\t\t\tpadding: 0;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.Activity li {\r\n");
      out.write("\t\t\tpadding: 8px;\r\n");
      out.write("\t\t\tmargin-bottom: 7px;\r\n");
      out.write("\t\t\tfont-size:25px;\r\n");
      out.write("\t\t\tbackground-color:#adad85;\r\n");
      out.write("\t\t\tcolor:#f2f2f2;\r\n");
      out.write("\t\t\tbox-shadow: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.para{\r\n");
      out.write("\t\t\tfont-size:5px;\r\n");
      out.write("\t\t\tcolor: #000000;\r\n");
      out.write("\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t\tfont-size:15px;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tbackground-color:#c2c2a3;\r\n");
      out.write("\t\t\tborder-radius: 0px 0px 0px 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.footer{\r\n");
      out.write("\t\t\tbackground-color:#7a7a52;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t.footer ul {\r\n");
      out.write("\t\t\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\t\t\tmargin: 0;\r\n");
      out.write("\t\t\t\t\tpadding: 0;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t.footer li {\r\n");
      out.write("\t\t\t\t\tpadding: 8px;\r\n");
      out.write("\t\t\t\t\tmargin-bottom: 7px;\r\n");
      out.write("\t\t\t\t\tcolor: black;\r\n");
      out.write("\t\t\t\t\talign:right;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t.div2{\r\n");
      out.write("\t\t\tbackground-color:#999966;\r\n");
      out.write("\t\t\tfont-style: italic;\r\n");
      out.write("\t\t\tfont-size: 14px;\r\n");
      out.write("\t\t\tcolor:black;\r\n");
      out.write("\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t\topacity:0.7;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t.cancelbtn{\r\n");
      out.write("\t\tbackground-color: #cecdce;\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t\tborder-radius: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"header1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-1\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\" >\r\n");
      out.write("\t\t\t<a href=\"mydetail.php\">MY DETAILS </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\r\n");
      out.write("\t\t\t<a href=\"leaveApply.jsp\">LEAVE APPLICATION</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\r\n");
      out.write("\t\t\t<a href=\"CompanyMaintenanceSystem.php\"><img src=\"Header _ Footer/Camera.png\" style=\"height:25%;width:25%\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\r\n");
      out.write("\t\t\t<a href=\"http://example.com\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">NOTIFICATIONS</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-2\" align=\"center\">\r\n");
      out.write("\t\t\t");

    if(session.getAttribute("id")!=null)
    out.print("<a href='edit/logout.jsp' class='w3-bar-item w3-right w3-button'>LOGOUT</a>");
    else
    out.print("<a href='login.jsp' class='w3-bar-item w3-right w3-button'>LOGIN</a>");

    
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-1\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"Image \">\r\n");
      out.write("\t\t<img src=\"Employee/rawpixel-659474-unsplash.jpg\" style=\"width:100%;height:500px;border-radius: 25px 25px 0px 0px;\"> <br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"para col-12\">\r\n");
      out.write("\t<h1> GET IN TOUCH</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"Activity col-3\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li> <a href=\"submission.php\" class=\"a2\"> Submission </a> </li>\r\n");
      out.write("\t\t\t<li> <a href=\"task.php\" class=\"a2\">Task</a> </li>\r\n");
      out.write("\t\t\t<li> <img src=\"Employee/images.jpg\" style=\"width:100%\"> </li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class =\"img col-4\">\r\n");
      out.write("\t\t<img src=\"Employee/People-at-Work.jpg\" style=\"width:100%;height:340px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class =\"galender col-5\">\r\n");
      out.write("\t\t<img src=\"Employee/shutterstock_267308147.png\" style=\"width:100%;height:340px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"div2 col-12 \">\r\n");
      out.write("\t\t<h1>LIFE IS NOT A PROBLEM TO BE SOLVED BUT A REALITY TO BE EXPERIENCED </h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"footer col-12\">\r\n");
      out.write("\t\t<div class=\"col-4 footer\" align=\"center\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr style=\"height:50px\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<img src=\"Header _ Footer/62516.png\" style=\"height:5%;width:5%\">\r\n");
      out.write("\t\t\t\tNo 12, Ridgeway place Colombo 04\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr style=\"height:70px\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<img src=\"Header _ Footer/img_286083.png\" style=\"height:5%;width:5%\">\r\n");
      out.write("\t\t\t\t011-2547658\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<img src=\"Header _ Footer/email.png\" style=\"height:5%;width:5%\">\r\n");
      out.write("\t\t\t\twww.cameraxis@gmail.com\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class=\"col-4 footer\" align=\"center-left\">\r\n");
      out.write("\t\t\t<a href=\"https://www.facebook.com/cameraxis/\"><img src=\"Header _ Footer/facebook-4dd1631e86173638d2c9aaa051dd7f8f.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\r\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/cameraxisapp/?hl=en\"><img src=\"Header _ Footer/md_5a98273a4e62e.png\" style=\"height:10%;width:10%\"></a>&nbsp &nbsp &nbsp\r\n");
      out.write("\t\t\t<a href=\"https://plus.google.com/+Cameraxis\"><img src=\"Header _ Footer/md_5a98273aeeb5a.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\r\n");
      out.write("\t\t\t<a href=\"https://twitter.com/cameraxis\"><img src=\"Header _ Footer/md_5a98273bb9a60.png\" style=\"height:9%;width:9%\"></a>&nbsp &nbsp &nbsp\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class=\"col-4 footer\" align=\"center\" style=\"height:200px\">\r\n");
      out.write("\t\t\t<a href=\"https://www.google.com/maps/place/Ridgeway+Pl,+Colombo/@6.8798504,79.8554955,17z/data=!3m1!4b1!4m5!3m4!1s0x3ae25bc6d5e20acd:0xd0eb67a7aefc8ff1!8m2!3d6.8798504!4d79.8576842\"><img src=\"Header _ Footer/map.png\" style=\"height:100%;width:80%\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
