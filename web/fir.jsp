<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
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
   
%>





<html>
    <head>
     
        <title>Regitration</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      
	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="bootstrap/css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="bootstrap/css/icomoon.css">
	<!-- Themify Icons-->
	<link rel="stylesheet" href="bootstrap/css/themify-icons.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
        
        
	

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="bootstrap/css/magnific-popup.css">
   
	<link rel="stylesheet" href="bootstrap/css/bootstrap-datetimepicker.min.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="boostrap/css/owl.carousel.min.css">
	<link rel="stylesheet" href="bootstrap/css/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="bootstrap/css/style.css">

	<!-- Modernizr JS -->
	<script src="bootstrap/js/modernizr-2.6.2.min.js"></script>
        <style type="text/css">
           
        </style>
    </head>
    <body>
   <!-- jQuery -->
	<script src="bootstrap/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="bootstrap/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="bootstrap/js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="bootstrap/js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="bootstrap/js/jquery.countTo.js"></script>

	<!-- Stellar Parallax -->
	<script src="bootstrap/js/jquery.stellar.min.js"></script>

	<!-- Magnific Popup -->
	<script src="bootstrap/js/jquery.magnific-popup.min.js"></script>
	<script src="bootstrap/js/magnific-popup-options.js"></script>
	
	<script src="bootstrap/js/moment.min.js"></script>
	<script src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>


	<!-- Main -->
	<script src="bootstrap/js/main.js"></script>
	<header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image:url(banner.jpg)" data-stellar-background-ratio="0.5">
		<div class="tab-content">                                      <div class="container">
                                                                             <div class="row">
                                                                                <div class="col-md-8 m-auto"> 
										<div class="tab-content-inner active" data-content="signup">
											<h3 class="cursive-font text-center display-3"  style="color:white">Registration</h3>
                                              <form method="post" class="form-group m-auto">
                            <label for="cname" class="labels">Name</label>
                            <input type="text" class="form-control typing" name="cname" id="cname">
                  
                            <label for="fname" class="labels">father's Name</label>
                            <input type="text" class="form-control typing" name="fname" id="fname">
                  
                            <label for="cadd" class="labels">Address</label>
                            <input type="text" class="form-control typing" name="cadd" id="cadd">
                  
                            <label for="doc" class="labels">Date of Crime</label>
                            <input type="date" class="form-control typing" name="doc" id="cname">
                  
                            <label for="cemail" class="labels">Email</label>
                            <input type="email" class="form-control typing" name="cemail" id="cemail">
                  
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
                            <select name="city" id="city" class="form-control typing">
                              
                            
                            </select>
                            
                            <label for="loc" class="labels">Location</label>
                            <textarea class="form-control typing" name="loc" id="loc"></textarea>                       
                            
                            <label for="addhaar" class="labels">Aadhaar No</label>
                            <input type="text" class="form-control typing" name="addhaar" id="addhaar">
                             
                             
                            <label for="desc" class="labels">Description</label>
                            <textarea class="form-control typing" name="desc" id="desc"></textarea>                       
                           
                            <input type="submit" class="btn btn-danger" value="submit" name="b1">
                        
                        </form>                                          
                                                                                        
                                                                                        
                                                                                        
										</div>
                                                                                </div>
                                                                             </div>
                                                                           </div>

										
									</div>
								
        </header>
        
    </body>
</html>
