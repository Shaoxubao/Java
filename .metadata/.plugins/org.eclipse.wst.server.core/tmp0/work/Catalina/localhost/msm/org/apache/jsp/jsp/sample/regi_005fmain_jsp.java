/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2015-05-28 10:25:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.sample;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regi_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("         <?xml version=\"1.0\" encoding=\"UTF-8\" ?> \n");
      out.write("    ");
      out.write("\n");
      out.write("         <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"> \n");
      out.write("    ");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
      out.write("<head>");
      out.write("<meta content=\"text/html; charset=UTF-8\" http-equiv=\"Content-Type\"/>");
      out.write("<title>");
      out.write('管');
      out.write('理');
      out.write('员');
      out.write("</title>");
      out.write("<frameset marginheight=\"0\" marginwidth=\"0\" framespacing=\"0\" frameborder=\"0\" border=\"0\" rows=\"90px,*,60px\">");
      out.write("<frame scrolling=\"no\" src=\"jsp/header.jsp\" name=\"header\"/>");
      out.write("<frameset framespacing=\"0\" frameborder=\"0\" border=\"0\" cols=\"270px,*\">");
      out.write("<frame scrolling=\"auto\" src=\"jsp/sample/regi_menu.jsp\" name=\"menu\"/>");
      out.write("<frame scrolling=\"auto\" src=\"jsp/user/home.jsp\" name=\"main\"/>");
      out.write("</frameset>");
      out.write("<frame scrolling=\"no\" src=\"html/footer.html\" name=\"footer\"/>");
      out.write("</frameset>");
      out.write("</head>");
      out.write("<body/>");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
