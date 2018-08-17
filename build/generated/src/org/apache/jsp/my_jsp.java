package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class my_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  Class.forName("org.gjt.mm.mysql.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/efir","root","");
  PreparedStatement stmt;
  ResultSet rs;
 String update=request.getParameter("update");  
  if(update!=null)
  {
      String loc=request.getParameter("loc");
      String desc=request.getParameter("desc");
      stmt=con.prepareStatement("update fir set loc=? , description=?");
      stmt.setString(1,loc);
      stmt.setString(2,desc);
      stmt.executeUpdate();
      response.sendRedirect("my.jsp");
  }
  else
  {
   con.close();
  }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("           <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("     \n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js\">\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>My Fir</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h4 class=\"text-center display-4\">Hello \n");
      out.write("            ");

             String name=session.getAttribute("cname").toString();
             out.write(name);
            
      out.write("\n");
      out.write("        </h4>\n");
      out.write("        <div class=\"col-md-6 m-auto\">\n");
      out.write("        <div class=\"alert alert-success\">We are Now Investigating Your Case</div>\n");
      out.write("        <div class=\"alert alert-dark\">you can check Your Case Status</div>\n");
      out.write("        <form>\n");
      out.write("        <div class=\"input-field\">\n");
      out.write("           Fir Id : <input type=\"text\" value=\"");

            out.write(""+session.getId());
            
      out.write("\"\n");
      out.write("            id=\"fir\"\n");
      out.write("            disabled\n");
      out.write("            >\n");
      out.write("        </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("           Crime Location :<input type=\"text\" value=\"");

            stmt=con.prepareStatement("select * from fir where fid=?");
                     stmt.setString(1,session.getId());
                     rs=stmt.executeQuery();
                     if(rs.next())
                     {
                     String location=rs.getString("loc");
                     out.write(location);
                     }
             
           
      out.write("\"\n");
      out.write("            style=\"color:black;\"\n");
      out.write("            id=\"loc\"\n");
      out.write("            name=\"loc\"\n");
      out.write("            >\n");
      out.write("        </div>\n");
      out.write("           <div class=\"input-field\">\n");
      out.write("           Crime Description :<input type=\"text\" value=\"");

             stmt=con.prepareStatement("select * from fir where fid=?");
                     stmt.setString(1,session.getId());
                     rs=stmt.executeQuery();
                     if(rs.next())
                     {
                     String desc=rs.getString("description");
                     out.write(desc);
                     }
             
           
      out.write("\"\n");
      out.write("            style=\"color:black;\"\n");
      out.write("            id=\"desc\"\n");
      out.write("            name=\"desc\"\n");
      out.write("            >\n");
      out.write("        </div>\n");
      out.write("           <div class=\"input-field\">\n");
      out.write("               status :<select name=\"status\">\n");
      out.write("                   <option>\n");
      out.write("                     ");

                     stmt=con.prepareStatement("select * from fir where fid=?");
                     stmt.setString(1,session.getId());
                     rs=stmt.executeQuery();
                     if(rs.next())
                     {
                     String status=rs.getString("status");
                     out.write(status);
                     }
                             
                     
      out.write("        \n");
      out.write("                   </option>\n");
      out.write("                   \n");
      out.write("               </select>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("              <input type=\"submit\" name=\"update\" id=\"update\" class=\"btn btn-outline-primary\">\n");
      out.write("    </form>\n");
      out.write("              </div>\n");
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
