/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2020-01-13 06:19:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cos.service.CategoryService;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;

public final class adminContact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Lecture/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1578275085824L));
    _jspx_dependants.put("/WEB-INF/views/admin/../include/footer.jsp", Long.valueOf(1535992296000L));
    _jspx_dependants.put("/WEB-INF/views/admin/../include/header.jsp", Long.valueOf(1535992296000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.inject.Inject");
    _jspx_imports_classes.add("com.cos.service.CategoryService");
    _jspx_imports_classes.add("org.apache.ibatis.session.SqlSession");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("<!-- Title -->\r\n");
      out.write("<title>Foode - Food Blog HTML5 Template</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Core Stylesheet -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- ##### Preloader ##### -->\r\n");
      out.write("\t<div class=\"preloader d-flex align-items-center justify-content-center\">\r\n");
      out.write("\t\t<div class=\"circle-preloader\">\r\n");
      out.write("\t\t\t<img src=\"resources/img/core-img/loding.png\" alt=\"\">\r\n");
      out.write("\t\t\t<div class=\"foode-preloader\">\r\n");
      out.write("\t\t\t\t<span></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ##### Header Area Start ##### -->\r\n");
      out.write("\t<header class=\"header-area\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Top Header Area -->\r\n");
      out.write("\t\t<div class=\"top-header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"top-header-content d-flex align-items-center justify-content-between\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Search Form -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search-form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"search\" name=\"search\" class=\"form-control\" placeholder=\"Search and hit enter...\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Social Button -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"top-social-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"categoryWriteForm\">강의만들기</a><a href=\"userJoinForm\">회원가입</a> <a href=\"userLoginForm\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Logo Area -->\r\n");
      out.write("\t\t<div class=\"logo-area text-center\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Nav brand -->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index\" class=\"nav-brand\"><img src=\"resources/img/core-img/logo.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navbar Area -->\r\n");
      out.write("\t\t<div class=\"foode-main-menu\">\r\n");
      out.write("\t\t\t<div class=\"classy-nav-container breakpoint-off\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<!-- Menu -->\r\n");
      out.write("\t\t\t\t\t<nav class=\"classy-navbar\" id=\"foodeNav\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Navbar Toggler -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"classy-navbar-toggler\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"navbarToggler\"><span></span><span></span><span></span></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Menu -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"classy-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- close btn -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"classycloseIcon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cross-wrap\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"top\"></span><span class=\"bottom\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Nav Start -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"classynav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"index\">홈</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">프로그래밍 강의</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"megamenu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"single-mega cn-col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">웹언어</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"single-mega cn-col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">언어</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"single-mega cn-col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">사물인터넷</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"single-mega cn-col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">API기술</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"videoView\">프로젝트 영상</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"adminContact\">문의하기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Nav End -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- ##### Breadcrumb Area Start ##### -->\r\n");
      out.write("\t<div class=\"breadcrumb-area\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t<img src=\"resources/img/core-img/breadcrumb-line.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- ##### Breadcrumb Area End ##### -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<!-- ##### Contact Area Start ##### -->\r\n");
      out.write("<section class=\"contact-area\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t<div class=\"contact-content-area\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-12 col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Get In Touch</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Contact Form Area -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"contact-form-area\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"contact-name\" placeholder=\"Name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12 col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"contact-email\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea class=\"form-control\" name=\"message\" id=\"message\" cols=\"30\" rows=\"10\" placeholder=\"Message\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn foode-btn\">Send</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-12 col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"contact-content contact-information\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Information</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Single Contact Info -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-contact-info d-flex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>3919 New Cut Rd, Mary land, United State.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Single Contact Info -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-contact-info d-flex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-phone\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>(12)-100-100-100</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Single Contact Info -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-contact-info d-flex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-print\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>(12)-112-123-123</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Single Contact Info -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single-contact-info d-flex\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>deercreative@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Contact Social Info -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"contact-social-info mt-50\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a> <a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"Twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a> <a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Instagram\"><i class=\"fa fa-instagram\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-hidden=\"true\"></i></a> <a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Google Plus\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a> <a href=\"#\" data-toggle=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-placement=\"top\" title=\"Pinterest\"><i class=\"fa fa-pinterest\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- ##### Contact Area End ##### -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ##### Footer Area Start ##### -->\r\n");
      out.write("<footer class=\"footer-area\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-12\">\r\n");
      out.write("\t\t\t\t<!-- Footer Curve Line -->\r\n");
      out.write("\t\t\t\t<img class=\"footer-curve\" src=\"resources/img/core-img/foo-curve.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t<!-- Footer Social Info -->\r\n");
      out.write("\t\t\t\t<div class=\"footer-social-info d-flex align-items-center justify-content-between\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i><span>Facebook</span></a> <a href=\"#\"><i class=\"fa fa-twitter\"></i><span>Twitter</span></a> <a href=\"#\"><i class=\"fa fa-google-plus\"></i><span>Google\r\n");
      out.write("\t\t\t\t\t\t\t+</span></a> <a href=\"#\"><i class=\"fa fa-linkedin\"></i><span>linkedin</span></a> <a href=\"#\"><i class=\"fa fa-instagram\"></i><span>Instagram</span></a> <a href=\"#\"><i class=\"fa fa-vimeo\"></i><span>Vimeo</span></a>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-youtube\"></i><span>Youtube</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Footer Curve Line -->\r\n");
      out.write("\t\t\t\t<img class=\"footer-curve\" src=\"resources/img/core-img/foo-curve.png\" alt=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- ##### Footer Area Start ##### -->\r\n");
      out.write("<!-- jQuery-2.2.4 js -->\r\n");
      out.write("<script src=\"resources/js/jquery/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("<!-- Popper js -->\r\n");
      out.write("<script src=\"resources/js/bootstrap/popper.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap js -->\r\n");
      out.write("<script src=\"resources/js/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- All Plugins js -->\r\n");
      out.write("<script src=\"resources/js/plugins/plugins.js\"></script>\r\n");
      out.write("<!-- Active js -->\r\n");
      out.write("<script src=\"resources/js/active.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/admin/../include/header.jsp(105,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/views/admin/../include/header.jsp(105,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/../include/header.jsp(105,12) '${ctg1}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ctg1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"lectureView?ctNum=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">- ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctGubun2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/views/admin/../include/header.jsp(111,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("item");
      // /WEB-INF/views/admin/../include/header.jsp(111,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/../include/header.jsp(111,13) '${ctg2}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ctg2}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"lectureView?ctNum=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">- ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctGubun2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f2_reused = false;
    try {
      _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f2.setParent(null);
      // /WEB-INF/views/admin/../include/header.jsp(117,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setVar("item");
      // /WEB-INF/views/admin/../include/header.jsp(117,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/../include/header.jsp(117,13) '${ctg3}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ctg3}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
        if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"lectureView?ctNum=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">- ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctGubun2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f2.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
      _jspx_th_c_005fforEach_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f3_reused = false;
    try {
      _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f3.setParent(null);
      // /WEB-INF/views/admin/../include/header.jsp(123,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setVar("item");
      // /WEB-INF/views/admin/../include/header.jsp(123,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/../include/header.jsp(123,13) '${ctg4}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${ctg4}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
        if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"lectureView?ctNum=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">- ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.ctGubun2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f3.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
      _jspx_th_c_005fforEach_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f3_reused);
    }
    return false;
  }
}
