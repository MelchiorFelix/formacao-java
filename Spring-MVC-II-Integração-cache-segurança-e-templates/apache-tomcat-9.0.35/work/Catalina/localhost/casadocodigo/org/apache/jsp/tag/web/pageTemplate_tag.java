/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-06-08 01:51:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageTemplate_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("/WEB-INF/views/cabecalho.jsp", Long.valueOf(1591581074675L));
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308141370000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.1.0.RELEASE.jar", Long.valueOf(1591133957343L));
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/spring-webmvc-4.1.0.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1409822314000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-4.0.0.RELEASE.jar", Long.valueOf(1591507964586L));
    _jspx_dependants.put("/WEB-INF/views/rodape.jsp", Long.valueOf(1591580175172L));
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1308141370000L));
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/spring-security-taglibs-4.0.0.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1427332880000L));
    _jspx_dependants.put("jar:file:/media/melchior/Backup/Desenvolvimento/Cursos/formacao-java/Spring-MVC-II-Integração-cache-segurança-e-templates/apache-tomcat-9.0.35/wtpwebapps/casadocodigo/WEB-INF/lib/spring-webmvc-4.1.0.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1409822314000L));
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

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String titulo;
  private java.lang.String bodyClass;
  private javax.servlet.jsp.tagext.JspFragment extraScripts;

  public java.lang.String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(java.lang.String titulo) {
    this.titulo = titulo;
    jspContext.setAttribute("titulo", titulo);
  }

  public java.lang.String getBodyClass() {
    return this.bodyClass;
  }

  public void setBodyClass(java.lang.String bodyClass) {
    this.bodyClass = bodyClass;
    jspContext.setAttribute("bodyClass", bodyClass);
  }

  public javax.servlet.jsp.tagext.JspFragment getExtraScripts() {
    return this.extraScripts;
  }

  public void setExtraScripts(javax.servlet.jsp.tagext.JspFragment extraScripts) {
    this.extraScripts = extraScripts;
    jspContext.setAttribute("extraScripts", extraScripts);
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getTitulo() != null ) 
      _jspx_page_context.setAttribute("titulo", getTitulo());
    if( getBodyClass() != null ) 
      _jspx_page_context.setAttribute("bodyClass", getBodyClass());
    if( getExtraScripts() != null ) 
      _jspx_page_context.setAttribute("extraScripts", getExtraScripts());

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <link rel=\"icon\"  href=\"//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/favicon.ico?11981592617154272979\" type=\"image/ico\" />\n");
      out.write("        <link href=\"https://plus.googlecom/108540024862647200608\" rel=\"publisher\" />\n");
      out.write("        <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titulo }", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write(" - Casa do Código</title>\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/cssbase-min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/fontello-ie7.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/fontello-embedded.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/fontello.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/layout-colors.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/responsive-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/guia-do-programador-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/produtos.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link rel=\"canonical\" href=\"http://www.casadocodigo.com.br/\" />\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("resources/css/book-collection.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bodyClass}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\">\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header id=\"layout-header\">\n");
      out.write("    <div class=\"clearfix container\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\" id=\"logo\"></a>\n");
      out.write("        <div id=\"header-content\">\n");
      out.write("            <nav id=\"main-nav\">\n");
      out.write("                <ul class=\"clearfix\">\n");
      out.write("                    ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('CCC#itens').build()}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
      out.write("\" \n");
      out.write("                                rel=\"nofollow\">\n");
      out.write("                            Seu carrinho (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carrinhoCompras.quantidade}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write(")\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/pages/sobre-a-casa-do-codigo\" rel=\"nofollow\">\n");
      out.write("                            Sobre nós \n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/pages/perguntas-frequentes\" rel=\"nofollow\">\n");
      out.write("                            Perguntas Frequentes\n");
      out.write("                        </a>\n");
      out.write("                    </li>        \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<nav class=\"categories-nav\">\n");
      out.write("    <ul class=\"container\">\n");
      out.write("        <li class=\"category\"><a href=\"http://www.casadocodigo.com.br\">Home</a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/livros-de-agile\"> Agile </a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/livros-de-front-end\"> Front End </a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/livros-de-games\"> Games </a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/livros-de-java\"> Java </a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/livros-de-mobile\"> Mobile </a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/livros-desenvolvimento-web\"> Web </a></li>\n");
      out.write("        <li class=\"category\"><a href=\"/collections/outros\"> Outros </a></li>\n");
      out.write("    </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getJspBody() != null)
        getJspBody().invoke(_jspx_sout);
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,getJspContext());
      out.write("\n");
      out.write("\n");
      out.write("    ");
      ((org.apache.jasper.runtime.JspContextWrapper) this.jspContext).syncBeforeInvoke();
      _jspx_sout = null;
      if (getExtraScripts() != null) {
        getExtraScripts().invoke(_jspx_sout);
      }
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("<footer id=\"layout-footer\">\n");
      out.write("    <div class=\"clearfix container\">\n");
      out.write("        <nav class=\"breadcrumbs\" itemprop=\"breadcrumb\"\n");
      out.write("            xmlns:v=\"http://rdf.data-vocabulary.org/#\"> \n");
      out.write("        </nav>\n");
      out.write("        <div id=\"collections-footer\">\n");
      out.write("            <p class=\"footer-title\">Coleções de Programação</p>\n");
      out.write("            <ul class=\"footer-text-links\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/livros-de-java\">\n");
      out.write("                        Java\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/livros-desenvolvimento-web\">\n");
      out.write("                        Desenvolvimento Web\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/livros-de-mobile\">\n");
      out.write("                        Mobile\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/games\">\n");
      out.write("                        Games\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/livros-de-front-end\">\n");
      out.write("                        Front End\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <p class=\"footer-title\">Outros Assuntos</p>\n");
      out.write("            <ul class=\"footer-text-links\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/livros-de-agile\">\n");
      out.write("                        Agile\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/collections/outros\">\n");
      out.write("                        e outros...\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"social-footer\">\n");
      out.write("            <p class=\"footer-title\">Links da Casa do Código</p>\n");
      out.write("            <ul class=\"footer-text-links\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://livros.casadocodigo.com.br\" \n");
      out.write("                            rel=\"nofollow\">\n");
      out.write("                        Meus E-books\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/pages/sobre-a-casa-do-codigo\">\n");
      out.write("                        Sobre a Casa do Código\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"/pages/perguntas-frequentes\">\n");
      out.write("                        Perguntas Frequentes\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"https://www.caelum.com.br\">\n");
      out.write("                        Caelum - Ensino e Inovação\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"http://www.codecrushing.com/\" \n");
      out.write("                            rel=\"nofollow\">\n");
      out.write("                        Code Crushing\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <p class=\"footer-title\">Redes Sociais</p>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"social-links\">\n");
      out.write("                    <a href=\"http://www.twitter.com/casadocodigo\" \n");
      out.write("                            target=\"_blank\" id=\"twitter\" \n");
      out.write("                                rel=\"nofollow\">\n");
      out.write("                        Facebook\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"http://www.facebook.com/casadocodigo\" \n");
      out.write("                            target=\"_blank\"    id=\"facebook\" \n");
      out.write("                                rel=\"nofollow\">\n");
      out.write("                        Twitter\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"newsletter-footer\">\n");
      out.write("            <p class=\"footer-title\">Receba as Novidades e Lançamentos</p>\n");
      out.write("            <div id=\"form-newsletter\">\n");
      out.write("                <form action=\"https://docs.google.com/spreadsheet/formResponse?formkey=dFhxZ2tDalFiclU4T2FLZVY4UXVUc2c6MQ&embedded=true&ifq\"\n");
      out.write("                        method=\"POST\" id=\"ss-form\" \n");
      out.write("                            class=\"form-newsletter\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <input type=\"hidden\" \n");
      out.write("                                name=\"pageNumber\" \n");
      out.write("                                    value=\"0\">\n");
      out.write("                            <input type=\"hidden\" \n");
      out.write("                                name=\"backupCache\" \n");
      out.write("                                    value=\"\">\n");
      out.write("                            <input type=\"email\" name=\"entry.0.single\" \n");
      out.write("                                value=\"\" class=\"ss-q-short\" id=\"entry_0\" \n");
      out.write("                                    placeholder=\"seu@email.com\">\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <input type=\"submit\" name=\"submit\" \n");
      out.write("                                value=\"Quero Receber!\" \n");
      out.write("                                    id=\"submit-newsletter\">\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </form>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"ie8\">\n");
      out.write("                        <a href=\"https://docs.google.com/spreadsheet/viewform?formkey=dFhxZ2tDalFiclU4T2FLZVY4UXVUc2c6MQ&ifq\"\n");
      out.write("                                rel=\"nofollow\">\n");
      out.write("                            Receba as Novidades e Lançamentos\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"footer-payments\">\n");
      out.write("                <li>\n");
      out.write("                    <img class=\"accepts-paypal\" \n");
      out.write("                        src=\"//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/accepts_paypal.png?58522\" \n");
      out.write("                            border=\"0\" alt=\"Paypal\" \n");
      out.write("                                width=\"130\" height=\"80\" />\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <img class=\"accepts-pagseguro\" \n");
      out.write("                        src=\"//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/logopagseguro.png?58522\" \n");
      out.write("                            border=\"0\" alt=\"PagSeguro\" \n");
      out.write("                                width=\"180\" height=\"26\" />\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/pageTemplate.tag(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
      // /WEB-INF/tags/pageTemplate.tag(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("contextPath");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_security_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_security_005fauthorize_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/views/cabecalho.jsp(13,20) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ROLE_ADMIN')");
      int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('PC#listar').build()}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
        out.write("\" \n");
        out.write("                                    rel=\"nofollow\">\n");
        out.write("                                Listagem de Produtos\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                        <li>\n");
        out.write("                            <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('PC#form').build()}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
        out.write("\" \n");
        out.write("                                    rel=\"nofollow\">\n");
        out.write("                                Cadastro de Produtos\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                    ");
      }
      if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      _jspx_th_security_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_security_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_security_005fauthorize_005f0_reused);
    }
    return false;
  }
}
