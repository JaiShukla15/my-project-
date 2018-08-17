package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class fir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");

 Class.forName("org.gjt.mm.mysql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/efir","root","");
    PreparedStatement stmt;
    ResultSet rs;
    Object a1=session.getAttribute("user");
    String b1=request.getParameter("b1");
   
        if(b1!=null)
    {
        String s1=request.getParameter("cname");
        String s2=request.getParameter("fname");
        String s3=request.getParameter("cadd");
        String s4=request.getParameter("doc");
        String s5=request.getParameter("cemail");
        String s6=request.getParameter("state");
        String s7=request.getParameter("city");
        String s8=request.getParameter("loc");
        String s9=request.getParameter("addhaar");
        String s10=request.getParameter("desc");
        
        stmt=con.prepareStatement("Insert into fir values(?,?,?,?,?,?,?,?,?,?,?,?)");
        stmt.setString(1,session.getId());
        stmt.setString(2,s1);
        stmt.setString(3,s2);
        stmt.setString(4,s3);
        stmt.setString(5,s4);
        stmt.setString(6,s5);
        stmt.setString(7,s6);
        stmt.setString(8,s7);
        stmt.setString(9,s8);
        stmt.setString(10,s9);
        stmt.setString(11,s10);
        stmt.setString(12,"Investigating");
        stmt.executeUpdate();
        session.setAttribute("cname",s1);
        session.setAttribute("fir",session.getId());
        session.setAttribute("loc",s8);
        session.setAttribute("desc",s10);
        session.setAttribute("status","investigating");
        session.setAttribute("aadhar",s9);
        session.setAttribute("fir",session.getId());
        out.write("<div class='alert alert-dark'>Fir Submitted Successfully</div>");
        response.sendRedirect("main.jsp"); 
    }
   

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("     \n");
      out.write("        <title>Regitration</title>\n");
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
      out.write("\t\t<div class=\"tab-content\">                                      <div class=\"container\">\n");
      out.write("                                                                             <div class=\"row\">\n");
      out.write("                                                                                <div class=\"col-md-8 m-auto\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"tab-content-inner active\" data-content=\"signup\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"cursive-font text-center display-3\"  style=\"color:white\">Registration</h3>\n");
      out.write("                                              <form method=\"post\" class=\"form-group m-auto\">\n");
      out.write("                            <label for=\"cname\" class=\"labels\">Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"cname\" id=\"cname\">\n");
      out.write("                  \n");
      out.write("                            <label for=\"fname\" class=\"labels\">father's Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"fname\" id=\"fname\">\n");
      out.write("                  \n");
      out.write("                            <label for=\"cadd\" class=\"labels\">Address</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"cadd\" id=\"cadd\">\n");
      out.write("                  \n");
      out.write("                            <label for=\"doc\" class=\"labels\">Date of Crime</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control typing\" name=\"doc\" id=\"cname\">\n");
      out.write("                  \n");
      out.write("                            <label for=\"cemail\" class=\"labels\">Email</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control typing\" name=\"cemail\" id=\"cemail\">\n");
      out.write("                  \n");
      out.write("                            <label for=\"state\" class=\"labels\">State</label>\n");
      out.write("                            <select name=\"state\" id=\"state\" onChange=\"getCity()\" class=\"form-control typing\">\n");
      out.write("                            ");

                               stmt=con.prepareStatement("Select distinct states from indianstates");
                               rs=stmt.executeQuery();
                               while(rs.next())
                               {
                                String state=rs.getString(1);
                                 out.write("<option>"+state+"</option>");
                               }                            
                    
                            
      out.write("    \n");
      out.write("                            </select>\n");
      out.write("                       \n");
      out.write("                            <label for=\"city\" class=\"labels\">City</label>\n");
      out.write("                            <select name=\"city\" id=\"city\" class=\"form-control typing\">\n");
      out.write("                              \n");
      out.write("                            \n");
      out.write("                            </select>\n");
      out.write("                            \n");
      out.write("                            <label for=\"loc\" class=\"labels\">Location</label>\n");
      out.write("                            <textarea class=\"form-control typing\" name=\"loc\" id=\"loc\"></textarea>                       \n");
      out.write("                            \n");
      out.write("                            <label for=\"addhaar\" class=\"labels\">Aadhaar No</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"addhaar\" id=\"addhaar\">\n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                            <label for=\"desc\" class=\"labels\">Description</label>\n");
      out.write("                            <textarea class=\"form-control typing\" name=\"desc\" id=\"desc\"></textarea>                       \n");
      out.write("                           \n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"submit\" name=\"b1\">\n");
      out.write("                        \n");
      out.write("                        </form>                                          \n");
      out.write("                                                                                        \n");
      out.write("                                                                                        \n");
      out.write("                                                                                        \n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                             </div>\n");
      out.write("                                                                           </div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("        </header>\n");
      out.write("        \n");
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
