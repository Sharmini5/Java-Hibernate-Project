package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leaveApply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"form col-6\">\n");
      out.write("\t<h1> Leave Application Form </h1>\t\n");
      out.write("\t\t\n");
      out.write("<form action=\"edit/addleave.jsp\" class=\"w3-center\" method=\"post\">  \n");
      out.write("\t\n");
      out.write("\tEmployee Name :<br>\n");
      out.write("\t <input type=\"text\" name=\"Employee_Name\" placeholder=\"Employee Name\" required=\"required\" ><br><br>\n");
      out.write("\t\n");
      out.write("\tLeave Type(Tick for appropriate box) <br>\n");
      out.write("\t <input type=\"radio\" name=\"Leave_Type\" value=\"sick\"> Sick <br>\n");
      out.write("\t <input type=\"radio\" name=\"Leave_Type\" value=\"Persernal Leave\"> Persernal Leave <br>\n");
      out.write("\t <input type=\"radio\" name=\"Leave_Type\" value=\"NoPay\"> NoPay <br>\n");
      out.write("\t <input type=\"radio\" name=\"Leave_Type\" value=\"Casual\"> Casual <br>\n");
      out.write("\t <input type=\"radio\" name=\"Leave_Type\" value=\"Others\"> Others <br><br>\n");
      out.write("\n");
      out.write("\tReason:<br>\n");
      out.write("\t <textarea rows=\"4\" cols=\"50\" name=Reason placeholder=\"Reason for the leave\" required=\"required\"></textarea><br><br>\n");
      out.write("\t\n");
      out.write("\tLeave  Date:  <input type=\"date\" name=\"Date\" placeholder=\"12.02.2018\" required=\"required\"><br><br>\n");
      out.write("\t\n");
      out.write("\t &nbsp &nbsp&nbsp &nbsp <input type=\"submit\" name=\"submit\" value=\"submit\"/> &nbsp &nbsp&nbsp &nbsp <input type=\"reset\" name=\"reset\" value=\"reset\" />\n");
      out.write("\t \n");
      out.write("\t</form> \n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
