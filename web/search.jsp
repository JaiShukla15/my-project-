<%-- 
    Document   : search
    Created on : Jul 21, 2018, 1:14:36 AM
    Author     : MrityunJay pc
--%>

<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<html>
<head>
     <Link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
</head>
<body>


<%
    String user=request.getParameter("user");
    Class.forName("org.gjt.mm.mysql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/efir","root","");
    PreparedStatement stmt;
    ResultSet rs;
   stmt=con.prepareStatement("select * from fir where cname=?");
   stmt.setString(1,user);
   rs=stmt.executeQuery();
   if(rs.next())
   {
     String name=rs.getString("cname");
     String fir_id=rs.getString("fid");
     String cloc=rs.getString("loc");
     String cdesc=rs.getString("description");
     out.write("<h1 class='text-center display-4'>Result Found</h1>");
    out.write("<h4>Fir ID :"+fir_id+"</h4>");
    out.write("<h4>Complainent's Name :"+name+"</h4>");
    out.write("<h4>Crime Location:"+cloc+"</h4>");
   out.write("<h4>Crime  Description :"+cdesc+"</h4>");
   }
   else
   {
   out.write("No Record Found");
   }
%>
</body>
</html>
