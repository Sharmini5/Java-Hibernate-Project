package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Feedback;
import java.util.List;
import runner.ViewFeedback;

public final class view_005ffeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("   \n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      entities.Feedback obj = null;
      synchronized (_jspx_page_context) {
        obj = (entities.Feedback) _jspx_page_context.getAttribute("obj", PageContext.PAGE_SCOPE);
        if (obj == null){
          obj = new entities.Feedback();
          _jspx_page_context.setAttribute("obj", obj, PageContext.PAGE_SCOPE);
          out.write("  \n");
        }
      }
      out.write("  \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("obj"), request);
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<style>\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t}\n");
      out.write("\t\t.row::after {\n");
      out.write("\t\t\tcontent: \"\";\n");
      out.write("\t\t\tclear: both;\n");
      out.write("\t\t\tdisplay: table;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t[class*=\"col-\"] {\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tpadding: 15px;\n");
      out.write("\t\t}\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\t\t\t\ta:link {\n");
      out.write("\t\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\ta:hover {\n");
      out.write("\t\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\ta:active {\n");
      out.write("\t\t\t\t\tcolor: black;\n");
      out.write("\t\t\t\t\tbackground-color: transparent;\n");
      out.write("\t\t\t\t\ttext-decoration: none;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tinput, select {\n");
      out.write("\t\t\t\t\t\twidth: 100%;\n");
      out.write("\t\t\t\t\t\tpadding: 12px 20px;\n");
      out.write("\t\t\t\t\t\tmargin: 8px 0;\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\tborder: 1px solid #ccc;\n");
      out.write("\t\t\t\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\t\t\t\tbox-sizing: border-box;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\tbutton {\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\twidth: 25%;\n");
      out.write("\t\t\t\t\t\tbackground-color: gray;\n");
      out.write("\t\t\t\t\t\tcolor: white;\n");
      out.write("\t\t\t\t\t\tpadding: 14px 20px;\n");
      out.write("\t\t\t\t\t\tmargin: 8px 0;\n");
      out.write("\t\t\t\t\t\tborder: none;\n");
      out.write("\t\t\t\t\t\tborder-radius: 4px;\n");
      out.write("\t\t\t\t\t\tcursor: pointer;\n");
      out.write("\t\t\t\t\t\t float: right;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\tbutton:hover {\n");
      out.write("\t\t\t\t\t\tbackground-color: black;\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t</head>\n");
      out.write("\t\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t<div class=\"header1\">\n");
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
      out.write("                        \n");
      out.write("<div class=\"col-12\">\n");
      out.write("    <h1 class=\"w3-center w3-jumbo\" style=\"margin-bottom:64px\">Feedback</h1>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" <div class=\"w3-container w3-gary w3-text-black\" style=\"font-size: 15px\">\n");
      out.write("  <table border=\"1\" class=\"w3-table\" width=\"100%\">\n");
      out.write("    <tr class=\"w3-black\">\n");
      out.write("      <th>Customer Name</th>\n");
      out.write("      <th>Email</th>\n");
      out.write("      <th>Feedback </th>\n");
      out.write("      <th>Date and Time</th>\n");
      out.write("    </tr>\n");
      out.write("    ");

        List<Feedback> list=ViewFeedback.getFeedback();
        for(Feedback item : list){ 
      out.write("\n");
      out.write("    <tr class=\"w3-white\">\n");
      out.write("      <td>");
      out.print( item.getUserId().getFname()+" "+item.getUserId().getLname()  );
      out.write("</td>\n");
      out.write("      \n");
      out.write("      <td>");
      out.print( item.getUserId().getEmail() );
      out.write("</td>\n");
      out.write("      \n");
      out.write("      <td>");
      out.print( item.getFeedback() );
      out.write("</td>\n");
      out.write("      \n");
      out.write("      <td>");
      out.print( item.getDate());
      out.write("</td>\n");
      out.write("    </tr> \n");
      out.write("    ");
 }
    
      out.write("\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
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
