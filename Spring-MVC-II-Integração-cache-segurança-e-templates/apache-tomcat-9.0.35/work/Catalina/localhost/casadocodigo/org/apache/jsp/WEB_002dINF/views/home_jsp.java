/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-06-06 22:46:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("s:mvcUrl", org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.class, "fromMappingName", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308141370000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.0.RELEASE.jar", Long.valueOf(1591133957343L));
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/spring-webmvc-4.1.0.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1409822314000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1591133959935L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("<link rel=\"icon\" href=\"//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/favicon.ico?11981592617154272979\" type=\"image/ico\" />\n");
      out.write("<link href=\"https://plus.googlecom/108540024862647200608\" rel=\"publisher\" />\n");
      out.write("<title>Livros de Java, SOA, Android, iPhone, Ruby on Rails e muito mais - Casa do Código</title>\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/cssbase-min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fontello-ie7.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fontello-embedded.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fontello.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/layout-colors.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/responsive-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/guia-do-programador-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/produtos.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"canonical\" href=\"http://www.casadocodigo.com.br/\" />\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/book-collection.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<header id=\"layout-header\">\n");
      out.write("\t\t<div class=\"clearfix container\">\n");
      out.write("\t\t\t<a href=\"/\" id=\"logo\"> </a>\n");
      out.write("\t\t\t<div id=\"header-content\">\n");
      out.write("\t\t\t\t<nav id=\"main-nav\">\n");
      out.write("\t\t\t\t\t<ul class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('CCC#itens').build() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
      out.write("\" rel=\"nofollow\">Carrinho (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carrinhoCompras.quantidade }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/pages/sobre-a-casa-do-codigo\" rel=\"nofollow\">Sobre Nós</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/pages/perguntas-frequentes\" rel=\"nofollow\">Perguntas Frequentes</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<nav class=\"categories-nav\">\n");
      out.write("\t\t<ul class=\"container\">\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"http://www.casadocodigo.com.br\">Home</a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-agile\"> Agile </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-front-end\"> Front End </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-games\"> Games </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-java\"> Java </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-mobile\"> Mobile </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-desenvolvimento-web\"> Web </a></li>\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/outros\"> Outros </a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<section id=\"index-section\" class=\"container middle\">\n");
      out.write("\t\t<h1 class=\"cdc-call\">Últimos dias com os preços promocionais. Aproveite!</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"clearfix book-collection\">\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t<h2 class=\"cdc-call\">Diferenciais da Casa do Código</h2>\n");
      out.write("\n");
      out.write("\t\t<ul id=\"cdc-diferenciais\" class=\"clearfix\">\n");
      out.write("\t\t\t<li class=\"col-left\">\n");
      out.write("\t\t\t\t<h3>E-books sem DRM. Leia onde quiser</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-drm\"></span> Nossos e-books não possuem DRM, ou seja, você pode ler em qualquer computador, tablet e smartphone.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"col-right\">\n");
      out.write("\t\t\t\t<h3>Autores de renome na comunidade</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-renome\"></span> Autores que participam ativamente na comunidade com Open Source, listas de discussão, grupos e\n");
      out.write("\t\t\t\t\tmais.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"col-left\">\n");
      out.write("\t\t\t\t<h3>Receba atualizações dos e-books</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-atualizacoes\"></span> Quando você compra um e-book, automaticamente tem direito às atualizações e correções dele.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"col-right\">\n");
      out.write("\t\t\t\t<h3>Livros com curadoria da Caelum</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-caelum\"></span> Desenvolvedores experientes que avaliam e revisam os livros constantemente.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<footer id=\"layout-footer\">\n");
      out.write("\t\t<div class=\"clearfix container\">\n");
      out.write("\t\t\t<div id=\"collections-footer\">\n");
      out.write("\t\t\t\t<!-- cdc-footer -->\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Coleções de Programação</p>\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-java\">Java</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-desenvolvimento-web\">Desenvolvimento Web</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-mobile\">Mobile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/games\">Games</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-front-end\">Front End</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Outros Assuntos</p>\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-agile\">Agile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/outros\">e outros...</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"social-footer\">\n");
      out.write("\t\t\t\t<!-- books-footer -->\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Links da Casa do Código</p>\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\n");
      out.write("\t\t\t\t\t<li><a href=\"http://livros.casadocodigo.com.br\" rel=\"nofollow\">Meus E-books</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/pages/sobre-a-casa-do-codigo\">Sobre a Casa do Código</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"/pages/perguntas-frequentes\">Perguntas Frequentes</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.caelum.com.br\">Caelum - Ensino e Inovação</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.codecrushing.com/\" rel=\"nofollow\">Code Crushing</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.casadocodigo.com.br/pages/politica-de-privacidade\" rel=\"nofollow\">Política de Privacidade</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Redes Sociais</p>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"social-links\"><a href=\"http://www.twitter.com/casadocodigo\" target=\"_blank\" id=\"twitter\" rel=\"nofollow\">Facebook</a> <a\n");
      out.write("\t\t\t\t\t\thref=\"http://www.facebook.com/casadocodigo\" target=\"_blank\" id=\"facebook\" rel=\"nofollow\">Twitter</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"newsletter-footer\">\n");
      out.write("\t\t\t\t<!-- social-footer -->\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Receba as Novidades e Lançamentos</p>\n");
      out.write("\t\t\t\t<div id=\"form-newsletter\">\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"POST\" id=\"ss-form\" class=\"form-newsletter\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"hidden\" name=\"pageNumber\" value=\"0\" /><input type=\"hidden\" name=\"backupCache\" value=\"\" /><input type=\"email\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"entry.0.single\" value=\"\" class=\"ss-q-short\" id=\"entry_0\" placeholder=\"seu@email.com\" /></li>\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"submit\" name=\"submit\" value=\"Quero Receber!\" id=\"submit-newsletter\" /></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"ie8\"><a href=\"\" rel=\"nofollow\">Receba as Novidades e Lançamentos</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<ul class=\"footer-payments\">\n");
      out.write("\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t\t<li></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
      // /WEB-INF/views/home.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("contextPath");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
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
      // /WEB-INF/views/home.jsp(64,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(64,3) '${produtos }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${produtos }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/home.jsp(64,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("produto");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t<li>\n");
            out.write("\t\t\t\t\t<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('PC#detalhe').arg(0, produto.id).build() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("\" class=\"block clearfix\">\n");
            out.write("\t\t\t\t\t<h2 class=\"product-title\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.titulo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</h2> \n");
            out.write("\t\t\t\t\t<img width=\"143\" height=\"202\" src=\"https://cdn.shopify.com/s/files/1/0155/7645/products/java8-featured_large.png?v=1411490181\" alt=\"Java 8 Prático\" title=\"Java 8 Prático\" /> \n");
            out.write("\t\t\t\t\t<small class=\"buy-button\">Compre</small>\n");
            out.write("\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t</li>\n");
            out.write("\t\t\t");
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
}
