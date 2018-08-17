<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
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
    
%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
        #details
        {
            margin-top: 100px;
            
        }
        </style>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/style.css" rel='stylesheet'>
        <link href="fir.css" rel='stylesheet'>
        <script>
            var xml;
              var xml;
            function getCity()
            {
            state=document.getElementById("state").value;
            xml=new XMLHttpRequest();
            xml.onreadystatechange=showCity;
            xml.open("GET","city.jsp?id="+state,true);
            xml.send(null);
            }
            function showCity()
            {
                
                if(xml.readyState==4 && xml.status==200)
                {
                   
                    s3=document.getElementById("state");
                    s4=document.getElementById("city"); 
                    ans=xml.responseText.trim();       
                    arr=ans.split("<br>");
                    s4.length=0;
                    for(i=1;i<arr.length;i++)
                    {
                    opt=document.createElement("option");
                    opt.text=arr[i];
                    opt.value=arr[i];
                    s4.appendChild(opt);
                    }
        
                }
            }
        </script>   	
	
    </head>
       <body  style="background-image:url(banner.jpg);background: cover">
       	<script src="bootstrap/js/jquery.min.js"></script>
                <div class="container">
                    <h4 class="text-center display-4" style="color:white;">Register Fir</h4>
                    <div id="msg"></div>
                    <div class="row">
                        <div class="col-md-6 m-auto">
                        <form method="post" class="form-group m-auto">
                            <label for="cname" class="labels">Name</label>
                            <input type="text" class="form-control typing" name="cname" id="cname" required>
                  
                            <label for="fname" class="labels">father's Name</label>
                            <input type="text" class="form-control typing" name="fname" id="fname" required>
                  
                            <label for="cadd" class="labels">Address</label>
                            <input type="text" class="form-control typing" name="cadd" id="cadd" required>
                  
                            <label for="doc" class="labels">Date of Crime</label>
                            <input type="date" class="form-control typing" name="doc" id="cname" required>
                  
                            <label for="cemail" class="labels">Email</label>
                            <input type="email" class="form-control typing" name="cemail" id="cemail" required>
                  
                            <label for="state" class="labels">State</label>
                            <select name="state" id="state" onChange="getCity()" class="form-control typing">
                            <%
                               stmt=con.prepareStatement("Select distinct states from indianstates");
                               rs=stmt.executeQuery();
                               while(rs.next())
                               {
                                String state=rs.getString(1);
                                 out.write("<option>"+state+"</option>");
                               }                            
                    
                            %>    
                            </select>
                       
                            <label for="city" class="labels">City</label>
                            <select name="city" id="city" class="form-control typing" required>
                              
                            
                            </select>
                            
                            <label for="loc" class="labels">Location</label>
                            <textarea class="form-control typing" name="loc" id="loc" required></textarea>                       
                            
                            <label for="addhaar" class="labels">Aadhaar No</label>
                            <input type="text" class="form-control typing" name="addhaar" required id="addhaar">
                             
                             
                            <label for="desc" class="labels">Description</label>
                            <textarea class="form-control typing" name="desc" id="desc" required></textarea>                       
                           
                            <input type="submit" class="btn btn-success my-4" style="margin-left:180px;" value="submit" name="b1">
                        
                        </form>
                        </div>
                    </div>
                </div>
        
                        
    </body>
</html>
