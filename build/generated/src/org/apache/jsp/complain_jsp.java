package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class complain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Object a1=session.getAttribute("user");
    String b1=request.getParameter("b1");
    if(a1!=null)
    {
         response.sendRedirect("index.jsp");
         
    }
    else
    {
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
        stmt.setString(1,s9);
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

        response.sendRedirect("my.jsp"); 
       out.write("<div class='alert alert-danger'>Fir Submitted Successfully</div>");
    }
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
      out.write("        <link href=\"fir.css\" rel='stylesheet'>\n");
      out.write("        <script>\n");
      out.write("            var xml;\n");
      out.write("              var xml;\n");
      out.write("            function getCity()\n");
      out.write("            {\n");
      out.write("            state=document.getElementById(\"state\").value;\n");
      out.write("            xml=new XMLHttpRequest();\n");
      out.write("            xml.onreadystatechange=showCity;\n");
      out.write("            xml.open(\"GET\",\"city.jsp?id=\"+state,true);\n");
      out.write("            xml.send(null);\n");
      out.write("            }\n");
      out.write("            function showCity()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                if(xml.readyState==4 && xml.status==200)\n");
      out.write("                {\n");
      out.write("                   \n");
      out.write("                    s3=document.getElementById(\"state\");\n");
      out.write("                    s4=document.getElementById(\"city\"); \n");
      out.write("                    ans=xml.responseText.trim();       \n");
      out.write("                    arr=ans.split(\"<br>\");\n");
      out.write("                    s4.length=0;\n");
      out.write("                    for(i=1;i<arr.length;i++)\n");
      out.write("                    {\n");
      out.write("                    opt=document.createElement(\"option\");\n");
      out.write("                    opt.text=arr[i];\n");
      out.write("                    opt.value=arr[i];\n");
      out.write("                    s4.appendChild(opt);\n");
      out.write("                    }\n");
      out.write("        \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>   \t\n");
      out.write("\t\n");
      out.write("    </head>\n");
      out.write("       <body  style=\"background-image:url(banner.jpg);background: cover\">\n");
      out.write("       \t<script src=\"bootstrap/js/jquery.min.js\"></script>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4 class=\"text-center display-4\" style=\"color:white;\">Register Fir</h4>\n");
      out.write("                    <div id=\"msg\"></div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 m-auto\">\n");
      out.write("                        <form method=\"post\" class=\"form-group m-auto\">\n");
      out.write("                            <label for=\"cname\" class=\"labels\">Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"cname\" id=\"cname\" required>\n");
      out.write("                  \n");
      out.write("                            <label for=\"fname\" class=\"labels\">father's Name</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"fname\" id=\"fname\" required>\n");
      out.write("                  \n");
      out.write("                            <label for=\"cadd\" class=\"labels\">Address</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"cadd\" id=\"cadd\" required>\n");
      out.write("                  \n");
      out.write("                            <label for=\"doc\" class=\"labels\">Date of Crime</label>\n");
      out.write("                            <input type=\"date\" class=\"form-control typing\" name=\"doc\" id=\"cname\" required>\n");
      out.write("                  \n");
      out.write("                            <label for=\"cemail\" class=\"labels\">Email</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control typing\" name=\"cemail\" id=\"cemail\" required>\n");
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
      out.write("                            <select name=\"city\" id=\"city\" class=\"form-control typing\" required>\n");
      out.write("                              \n");
      out.write("                            \n");
      out.write("                            </select>\n");
      out.write("                            \n");
      out.write("                            <label for=\"loc\" class=\"labels\">Location</label>\n");
      out.write("                            <textarea class=\"form-control typing\" name=\"loc\" id=\"loc\" required></textarea>                       \n");
      out.write("                            \n");
      out.write("                            <label for=\"addhaar\" class=\"labels\">Aadhaar No</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control typing\" name=\"addhaar\" required id=\"addhaar\">\n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                            <label for=\"desc\" class=\"labels\">Description</label>\n");
      out.write("                            <textarea class=\"form-control typing\" name=\"desc\" id=\"desc\" required></textarea>                       \n");
      out.write("                           \n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success my-4\" style=\"margin-left:180px;\" value=\"submit\" name=\"b1\">\n");
      out.write("                        \n");
      out.write("                        </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("                        \n");
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
