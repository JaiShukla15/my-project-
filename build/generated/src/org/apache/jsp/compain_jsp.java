package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class compain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Class.forName("org.gjt.mm.mysql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/efir","root","");
    PreparedStatement stmt;
    ResultSet rs;
    String b1=request.getParameter("b1");
    if(b1!=null)
    {
        String firno=request.getParameter("fno");
        String cname=request.getParameter("cname");
        String fname=request.getParameter("fname");
        String caddress=request.getParameter("caddress");
        String dof=request.getParameter("dof");
        String cemail=request.getParameter("cemail");
        String state=request.getParameter("state");
        String city=request.getParameter("city");
        String loc=request.getParameter("loc");
        String addhaar=request.getParameter("addhaar");
        String description=request.getParameter("description");
        
        stmt=con.prepareStatement("Insert into fir values(?,?,?,?,?,?,?,?,?,?,?)");
        stmt.setString(1,firno);
        stmt.setString(2,cname);
        stmt.setString(3,fname);
        stmt.setString(4,caddress);
        stmt.setString(5,dof);
        stmt.setString(6,cemail);
        stmt.setString(7,state);
        stmt.setString(8,city);
        stmt.setString(9,loc);
        stmt.setString(10,addhaar);
        stmt.setString(11,description);
        stmt.executeUpdate();
        
        response.sendRedirect("complain.jsp");
  
    }


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        #details\n");
      out.write("        {\n");
      out.write("            margin-top: 100px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Feedback</title>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"bootstrap/css/style.css\" rel='stylesheet'>\n");
      out.write("      \t\n");
      out.write("\t\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        </script>\n");
      out.write("\t<script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("            <div id=\"gtco-header\" class=\"gtco-cover gtco-cover-md\" role=\"banner\" style=\"background-image:url(complain.jpg)\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("                <form method=\"post\" class=\"form-group\" id=\"details\">\n");
      out.write("         \n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr><td>Fir ID:</td><td><input type=\"text\" name=\"fno\" id=\"fno\" class=\"form-control\" placeholder=\"enter roll-no\"></td><td></td></tr>  \n");
      out.write("              <tr><td>Complainent's Name:</td><td><input type=\"text\" name=\"cname\" id=\"cname\" class=\"form-control\" placeholder=\"enter name\"></td><td></td></tr>  \n");
      out.write("              <tr><td>Father's Name</td><td><input type='text' name=\"fname\" id='fname' class=\"form-control\"></td><td></td></tr>  \n");
      out.write("              <tr><td>Address:</td><td><textarea name='caddress' id=\"caddress\" class='form-control'></textarea></td><td></td></tr>  \n");
      out.write("              <tr><td>Date of Crime:</td><td>\n");
      out.write("                      <input type=\"date\" name=\"dof\" id=\"dof\" class=\"form-control\">\n");
      out.write("                  </td><td></td></tr>  \n");
      out.write("                  <tr><td>Email:</td><td>\n");
      out.write("                          <input type=\"email\" name=\"cemail\" id=\"cemail\" class=\"form-control\">\n");
      out.write("                  </td><td></td></tr>  \n");
      out.write("              <tr><td>State:</td><td>\n");
      out.write("                      <select name=\"state\" id=\"state\">\n");
      out.write("                          <option>\n");
      out.write("                              uttar pradesh\n");
      out.write("                          </option>\n");
      out.write("                      </select>\n");
      out.write("                  \n");
      out.write("                  </td><td></td></tr>  \n");
      out.write("              <tr><td>City:</td><td>\n");
      out.write("                      <select name=\"city\" id=\"city\">\n");
      out.write("                          <option>\n");
      out.write("                              Meerut\n");
      out.write("                          </option>\n");
      out.write("                      </select>\n");
      out.write("                  \n");
      out.write("                  </td><td></td></tr>  \n");
      out.write("              \n");
      out.write("              <tr><td>Location of Crime:</td><td>\n");
      out.write("                      <textarea name=\"loc\" id=\"loc\">\n");
      out.write("                          \n");
      out.write("                      </textarea>\n");
      out.write("                      \n");
      out.write("                  </td><td></td></tr>  \n");
      out.write("              <tr><td>Addhaar No:</td><td>\n");
      out.write("                      <input type=\"text\" name=\"addhaar\" id=\"addhaar\" class=\"form-control\">\n");
      out.write("                  </td><td></td></tr>  \n");
      out.write("              <tr><td>Tell me What Happened ?:</td><td><textarea  name='description' id=\"description\" class=\"form-control\"></textarea></td><td></td></tr>  \n");
      out.write("              <tr><td></td><td><input type=\"submit\" name=\"b1\" id=\"b1\" class=\"btn btn-outline-primary\" value=\"submit\"></td><td></td></tr>  \n");
      out.write("            </table>\n");
      out.write("                  \n");
      out.write("        </form>\n");
      out.write("       </div>               \n");
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
