package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

 String msg=" ";
   String b1=request.getParameter("b1");
   if(b1!=null)
   {
       Class.forName("org.gjt.mm.mysql.Driver");
       
       Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/EFIR","root","");
       PreparedStatement stmt;
       ResultSet rs;
       String username=request.getParameter("t1");
       String password=request.getParameter("t2");
       stmt=con.prepareStatement("Select * from users where uname=? and upass=?");
       stmt.setString(1,username);
       stmt.setString(2,password);
       rs=stmt.executeQuery();
       if(rs.next())
       {
           session.setAttribute("user",username);
           response.sendRedirect("main.jsp");
       }
       else
       {
         msg="Invalid Login or Password";
       }
        
   }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        #t1[type=\"text\"] { color: black; } \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>Welcome</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      \n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/icomoon.css\">\n");
      out.write("\t<!-- Themify Icons-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/themify-icons.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/magnific-popup.css\">\n");
      out.write("   \n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-datetimepicker.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Owl Carousel  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"boostrap/css/owl.carousel.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("\t<!-- Theme style  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap/css/style.css\">\n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"bootstrap/js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <!-- jQuery -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("\t<!-- jQuery Easing -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Waypoints -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<!-- Carousel -->\n");
      out.write("\t<script src=\"bootstrap/js/owl.carousel.min.js\"></script>\n");
      out.write("\t<!-- countTo -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.countTo.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Stellar Parallax -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.stellar.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<script src=\"bootstrap/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/magnific-popup-options.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<script src=\"bootstrap/js/moment.min.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Main -->\n");
      out.write("\t<script src=\"bootstrap/js/main.js\"></script>\n");
      out.write("\t<header id=\"gtco-header\" class=\"gtco-cover gtco-cover-md\" role=\"banner\" style=\"background-image:url(banner.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("\t\t<div class=\"overlay\"></div>\n");
      out.write("\t\t<div class=\"gtco-container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 col-md-offset-0 text-left\">\n");
      out.write("\t\t\t\t\t<div class=\"row row-mt-15em\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7 mt-text animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("                                                    \n");
      out.write("\t\t\t\t\t\t\t<span class=\"intro-text-small\">Created by<a href=\"#\" target=\"_blank\">Mrityunjay</a></span>\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"cursive-font\">Welocome to EFIR </h1>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 col-md-push-1 animate-box\" data-animate-effect=\"fadeInRight\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-wrap\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"tab\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tab-content-inner active\" data-content=\"signup\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cursive-font\">Login First</h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("                                                                                                            <label for=\"t1\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"t1\" id=\"t1\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"t2\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" id=\"t2\" name='t2' class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"row form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary btn-block\" name=\"b1\" value=\"Login\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</form>\n");
      out.write("                                                                                         <h3 class=\"cursive-font\" style=\"color:white;\">");
      out.print(msg);
      out.write("</h3>\n");
      out.write("                                                                         \n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\t\t\t\t\t\n");
      out.write("  \n");
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
