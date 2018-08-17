<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%-- 
    Document   : chkstatus
    Created on : Jul 23, 2018, 12:13:57 PM
    Author     : MrityunJay pc
--%>


<!DOCTYPE html>
<html>
    <head>
         <Link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Records :</title>
    </head>
    <body>
        <table align="center" class="table">
            <tr><th>Fir No :</th><th>Name :</th><th>Crime Location :</th><th>Description :</th></tr>
<%
  Class.forName("org.gjt.mm.mysql.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/efir","root","");
  PreparedStatement stmt;
  ResultSet rs;
  stmt=con.prepareStatement("select * from fir;");
  rs=stmt.executeQuery();
  while(rs.next())
  {   
      String fid=rs.getString("fid");
     out.write("<tr><td>"+fid+"</td><td>"+rs.getString("cname")+"</td><td>"+rs.getString("loc")+"</td><td>"+rs.getString("description")+"</td><td><a href=profile.jsp?id="+fid+">Check Profile</a></td></tr>");
  
  }

%>
        </table>   
        <a href="main.jsp" class="btn btn-danger" style="margin-left:400px;">Back</a>
    </body>
</html>
