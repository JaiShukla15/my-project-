<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
    String fir="";
    String name="";
    String loc="";
    String cdesc="";
    String status="";
 String id=request.getParameter("id");
 Class.forName("org.gjt.mm.mysql.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/efir","root","");
 PreparedStatement stmt;
 ResultSet rs;
 stmt=con.prepareStatement("select * from fir where fid=?");
 stmt.setString(1,id);
 rs=stmt.executeQuery();
 if(rs.next())
 {
    fir=rs.getString("fid");
   name=rs.getString("cname");
   loc=rs.getString("loc");
   cdesc=rs.getString("description");
   status=rs.getString("status");
 }


%>
<!DOCTYPE html>
<html>
    <head>
        <Link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Complainent's Profile</title>
    </head>
    <body>
        <h1 class='text-center display-4'>Complainent's Profile </h1>
        <div class='container'>
        <div class='col-md-6 m-auto'>
            <form method="post">
            <label for="fir">Fir ID :</label>  <input type="text" name="fir" id="fir" class="form-control" value="<%=fir%>" disabled>
           <label for="name">Complainent 's Name :</label>  <input type="text" name="name" id="name" class="form-control" value="<%=name%>" >
           <label for="loc">Crime Location :</label>  <input type="text" name="loc" id="loc" class="form-control" value="<%=loc%>" >
        <label for="description">Crime Description :</label>     <input type="text" name="description" id="description" class="form-control" value="<%=cdesc%>" >
      <% 
       String update=request.getParameter("sub");
       String change=request.getParameter("statusof");
      if(update!=null)
{
    
   stmt=con.prepareStatement("update fir Set status=? where fid=?");
   stmt.setString(1,change);
   stmt.setString(2,fir);
   stmt.executeUpdate();
   out.write("<div class='alert alert-success'>Updated Successfully</div>");

}
    %> 
        
        <label for="status"> Complain Status :</label>   <select name="statusof" id="status" class='form-control'>
                <option>
                   <%=status%>
                </option>
                <option>
                   Suspect Found
                </option>
                <option>
                   Documents Missing
                </option>
            </select>
                <br>
                <textarea name="suspect" class="form-control"></textarea>
        </div>
               <input type="submit" name="sub" class="btn btn-primary my-4" value="Update" style="margin-left:500px;">   
        </div>
    </body>
</html>
