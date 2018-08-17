<%@page contentType="text/html" import="java.sql.*" pageEncoding="UTF-8"%>
<%
  Class.forName("org.gjt.mm.mysql.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/efir","root","");
  PreparedStatement stmt;
  ResultSet rs;
 String update=request.getParameter("update");  
  if(update!=null)
  {
      String loc=request.getParameter("loc");
      String desc=request.getParameter("desc");
      stmt=con.prepareStatement("update fir set loc=? , Description=? where fid=?");
      stmt.setString(1,loc);
      stmt.setString(2,desc);
      stmt.setString(3,session.getId());
      stmt.executeUpdate();
      response.sendRedirect("index.jsp");
  }
  else
  {
  // con.close();
  }
%>
<!DOCTYPE html>
<html>
    <head>
           <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
     
        <link href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js">
        
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Fir</title>
    </head>
    <body>
        <h4 class="text-center display-4">Hello 
            <%
              stmt=con.prepareStatement("select cname from fir where fid=?");
              stmt.setString(1,session.getId());
              rs=stmt.executeQuery();
              if(rs.next())
              {
              String uname=rs.getString("cname");
              out.write(uname);
              }
            %>
        </h4>
        <div class="col-md-6 m-auto">
        <div class="alert alert-success">We are Now Investigating Your Case</div>
        <div class="alert alert-dark">you can check Your Case Status</div>
        <form>
        <div class="input-field">
           Fir Id : <input type="text" value="<%
            out.write(""+session.getId());
            %>"
            id="fir"
            disabled
            >
        </div>
            <div class="input-field">
           Crime Location :<input type="text" value="<%
            stmt=con.prepareStatement("select * from fir where fid=?");
                     stmt.setString(1,session.getId());
                     rs=stmt.executeQuery();
                     if(rs.next())
                     {
                     String location=rs.getString("loc");
                     out.write(location);
                     }
             
           %>"
            style="color:black;"
            id="loc"
            name="loc"
            >
        </div>
           <div class="input-field">
           Crime Description :<input type="text" value="<%
             stmt=con.prepareStatement("select * from fir where fid=?");
                     stmt.setString(1,session.getId());
                     rs=stmt.executeQuery();
                     if(rs.next())
                     {
                     String desc=rs.getString("description");
                     out.write(desc);
                     }
             
           %>"
            style="color:black;"
            id="desc"
            name="desc"
            >
        </div>
           <div class="input-field">
               status :<select name="status">
                   <option>
                     <%
                     stmt=con.prepareStatement("select * from fir where fid=?");
                     stmt.setString(1,session.getId());
                     rs=stmt.executeQuery();
                     if(rs.next())
                     {
                     String status=rs.getString("status");
                     out.write(status);
                     }
                             
                     %>        
                   </option>
                   
               </select>
        </div>
           
              <input type="submit" name="update" id="update" class="btn btn-outline-primary">
     
    </form>
                   
              </div>
    </body>
</html>
