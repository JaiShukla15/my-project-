<%@page import="java.sql.*"%>
<%-- 
    Document   : city
    Created on : Jul 20, 2018, 7:46:12 PM
    Author     : MrityunJay pc
--%>
<%
   String state=request.getParameter("id");
   Class.forName("org.gjt.mm.mysql.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/efir","root","");
   PreparedStatement stmt;
   ResultSet rs;
    if(state!=null)
    {  
   stmt=con.prepareStatement("Select * from indianStates where states=? and city is not null");
   stmt.setString(1,state);
   rs=stmt.executeQuery();
   String ans="";
   while(rs.next())
   {
    ans=ans+"<br>"+rs.getString("city");
   }
   out.write(ans);
   }
    else
    {
       out.write("No City Found check the Values");
       con.close();
    }
%>
