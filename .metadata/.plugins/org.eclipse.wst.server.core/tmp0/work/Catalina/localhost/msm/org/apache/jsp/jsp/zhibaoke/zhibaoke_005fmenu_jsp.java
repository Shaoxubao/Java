/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2015-06-17 13:44:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.zhibaoke;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class zhibaoke_005fmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>质保科管理人员</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/jquery.min.js\"></script>\r\n");
      out.write("<link href=\"../../css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"＃E8E8FF\">\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function () {\r\n");
      out.write("\t\t$(\".ny_zblb1 ul li\").click(function(){\r\n");
      out.write("\t\t\tvar thisSpan=$(this);\r\n");
      out.write("\t\t\t$(\".ny_zblb1 ul li ul\").prev(\"a\").removeClass(\"cur\");\r\n");
      out.write("\t\t\t$(\"ul\", this).prev(\"a\").addClass(\"cur\");\r\n");
      out.write("\t\t\t$(this).children(\"ul\").slideDown(\"fast\");\r\n");
      out.write("\t\t\t$(this).siblings().children(\"ul\").slideUp(\"fast\");\r\n");
      out.write("\t\t})\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"ny_zbbt\"><span>质保科管理人员</span></div>\r\n");
      out.write("    <div class=\"ny_zblb1\">\r\n");
      out.write("      <ul class=\"clearfix\">\r\n");
      out.write("        <li>\r\n");
      out.write("        \t<a class=\"cur\" href=\"javascript:void(0)\">检品信息管理</a>\r\n");
      out.write("\t        <ul style=\"display:block;\">\r\n");
      out.write("\t          <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/samplem/show\" target=\"main\">检品信息</a></li>\r\n");
      out.write("\t          <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/samplem/samples\" target=\"main\">检品列表</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<a class=\"cur\" href=\"javascript:void(0)\">检验流程管理</a>\r\n");
      out.write("\t\t\t<ul style=\"display:block;\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/samplem/sampleflow\" target=\"main\">检验流程查看</a></li>\r\n");
      out.write("\t            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/zhibaoke/zhibaokeflowcommit\" target=\"main\">检验流程提交</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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
