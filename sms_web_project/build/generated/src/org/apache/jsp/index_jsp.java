package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(9);
    _jspx_dependants.add("/components/header/headerindex.jsp");
    _jspx_dependants.add("/components/header/navbar.jsp");
    _jspx_dependants.add("/components/body/bodyindex.jsp");
    _jspx_dependants.add("/components/body/slider.jsp");
    _jspx_dependants.add("/components/body/who-we-are.jsp");
    _jspx_dependants.add("/components/body/message.jsp");
    _jspx_dependants.add("/components/body/ouraim.jsp");
    _jspx_dependants.add("/components/body/news.jsp");
    _jspx_dependants.add("/components/footer/footer.jsp");
  }

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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Navbar</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/components/header/header.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Home</li>\n");
      out.write("                <li><a href=\"#\">About Us</li>\n");
      out.write("                <li><a href=\"#\">Academics</li>\n");
      out.write("                <li><a href=\"#\">News</li>\n");
      out.write("                <li><a href=\"#\">Events</li>\n");
      out.write("                <li><a href=\"#\">Blog</li>\n");
      out.write("                <li><a href=\"#\">Contact</li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Page Slider</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/sanothimi 1.jpg\" alt=\"First slide\" height=\"512px\" width=\"auto\" > \n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/sanothimi2.jpg\" alt=\"Second slide\" height=\"512px\" width=\"auto\" > \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block w-100\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/sanothimi3.jpg\" alt=\"Third slide\" height=\"512px\" width=\"auto\" > \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/components/body/body.css\" />\n");
      out.write("        <title>About  Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"article\">\n");
      out.write("        <div class=\"col-md-6 col-sm-6 col-xs-12 about-column article-left\">\n");
      out.write("            <div class=\"about-title\">\n");
      out.write("                <div class=\"title-head\"><h1>Welcome To Our <br><span>Sanothimi Family </span></h1></div><hr>\n");
      out.write("                <div class=\"section-title\"><h2><small>Dedicated to Excellence</small></h2></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"about-content\">\n");
      out.write("                <div class=\"text-justify\">\n");
      out.write("                    <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis natus error sit voluptatem accusantium doloremque laudantium totam rem aperiam eaque ipsa quae ab illo inventore veritatis et quasi archite Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("                        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("                        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("                        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod<br>\n");
      out.write("                        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("                        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("                        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("                        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("                        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"button-about\">\n");
      out.write("                    <button type=\"button\" class=\"button-readmore\">Read More</button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"article-right\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/student1.jpg\" alt=\"Student Gallery\" height=\"auto\" width=\"512px\">\n");
      out.write("\n");
      out.write("        </div>    \n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/components/body/body.css\" />\n");
      out.write("        <title>Message from Subject Teacher</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"message-container\">\n");
      out.write("\n");
      out.write("            <div class=\"cta-title white content-main\">\n");
      out.write("                <div class=\"title-head text-center mt-8\"><h1>Message From The <span>Subject Teacher </span></h1></div>\n");
      out.write("                <div class=\"text-justify message-content\">\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo<br>\n");
      out.write("            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("            tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("            quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("            consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("            cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("            proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                </div>\n");
      out.write("            </h3><a href=\"https://www.linkedin.com/in/vijaya-malla-0bb6288a/\" target=\"_blank\">\n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"sir_photo thumnail\">\n");
      out.write("                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/vijayasir.jpg\" style=\"max-width: 30%; height: auto;\"></a>\n");
      out.write("                        </div>                        \n");
      out.write("                    </center>\n");
      out.write("                    <h5 style=\"line-height: 1.5\" class=\"text-primary\"><center>Vijaya Malla<br>ICT Department</center></h5>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/components/body/body.css\" />\n");
      out.write("        <title>Our Aim</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container-aim\">\n");
      out.write("            <div class=\"service-title\">\n");
      out.write("                <div class=\"title-head\">What do we <span>AIM</span> for?</div>\n");
      out.write("                <div class=\"section-title\"><h2>Our mission vision &amp; objectives</h2></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row row-aim\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6 col-xs-12 service-column\">\n");
      out.write("                    <div class=\"single-item\">\n");
      out.write("                        <div class=\"img-box\"><a href=\"#\"><figure><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/aim/1.jpg\" alt=\"\"></figure></a></div>\n");
      out.write("                        <div class=\"lower-content\">\n");
      out.write("\n");
      out.write("                            <h3 class=\"aim-title\"><a href=\"service-details.html\">We work hard to improve student <span style=\"color:  #337ab7;\">ACHIEVEMENT</span></a></h3>\n");
      out.write("                            <div class=\"text\"><p>Excepteur sint occaecat cupidatat non proi\n");
      out.write("                                    dent sunt in culpa qui officia deserunt \n");
      out.write("                                    mollit anim id est.</p></div>\n");
      out.write("                            <div class=\"button\"><a href=\"#\" class=\"btn-two\">Read more</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 col-xs-12 service-column\">\n");
      out.write("                    <div class=\"single-item\">\n");
      out.write("                        <div class=\"img-box\"><a href=\"#\"><figure><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/aim/2.jpg\" alt=\"\"></figure></a></div>\n");
      out.write("                        <div class=\"lower-content\">\n");
      out.write("\n");
      out.write("                            <h3 class=\"aim-title\"><a href=\"#\">Preparing students for successful <span style=\"color:  #337ab7;\">FUTURE</span></a></h3>\n");
      out.write("                            <div class=\"text\"><p>Excepteur sint occaecat cupidatat non proi\n");
      out.write("                                    dent sunt in culpa qui officia deserunt \n");
      out.write("                                    mollit anim id est.</p></div>\n");
      out.write("                            <div class=\"button\"><a href=\"#\" class=\"btn-two\">Read more</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-6 col-xs-12 service-column\">\n");
      out.write("                    <div class=\"single-item\">\n");
      out.write("                        <div class=\"img-box\"><a href=\"#\"><figure><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/images/aim/3.jpg\" alt=\"\"></figure></a></div>\n");
      out.write("                        <div class=\"lower-content\">\n");
      out.write("\n");
      out.write("                            <h3 class=\"aim-title\"><a href=\"#\">Providing healthy learning <span style=\"color: #337ab7;\">ENVIRONMENT</span></a></h3>\n");
      out.write("                            <div class=\"text\"><p>Excepteur sint occaecat cupidatat non proi\n");
      out.write("                                    dent sunt in culpa qui officia deserunt \n");
      out.write("                                    mollit anim id est.</p></div>\n");
      out.write("                            <div class=\"button\"><a href=\"#\" class=\"btn-two\">Read more</a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/components/body/body.css\" />\n");
      out.write("        <title>News</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"newsletter-section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-12 newsletter-column\">\n");
      out.write("                        <div class=\"text\">Sign up for Newsletter</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-sm-6 col-xs-12 newsletter-column\">\n");
      out.write("                        <div class=\"subscribe-form\">\n");
      out.write("                            <form action=\"javascript:void(0)\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Enter your email\">\n");
      out.write("                                <button type=\"submit\" class=\"btn-two\">Subscribe</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/components/footer/footer.css\" />\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"footer-bottom text-center mt-1 \">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"copyright\"><p>Copyright ?? <a href=\"https://github.com/nawarajbhandary\" target=\"_blank\">Nawaraj Bhandari</a> 2022 All Rights Reserved</p></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
