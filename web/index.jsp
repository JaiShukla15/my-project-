<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
 String msg=" ";
   String b1=request.getParameter("b1");
   if(b1!=null)
   {
       try{
       Class.forName("org.gjt.mm.mysql.Driver");
       
       Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/EFIR","root","");
       PreparedStatement stmt;
       ResultSet rs;
       String username=request.getParameter("t1");
       String password=request.getParameter("t2");
       stmt=con.prepareStatement("Select * from users where uname=? and upass=?");
       stmt.setString(1,username);
       stmt.setString(2,password);
       rs=stmt.executeQuery();
       if(rs.next())
       {
           session.setAttribute("user",username);
           response.sendRedirect("main.jsp");
       }
       else
       {
         msg="Invalid Login or Password";
       }
        
   }catch(Exception e){System.out.println(e);}
   }
   else
   {
   
   }
%>
<!DOCTYPE html>

<!DOCTYPE html>

<html>
    <head>
        <style type="text/css">
        #t1[type="text"] { color: black; } 
        </style>
        
        
        <title>Welcome</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/style.css" rel='stylesheet'>
        <link href="fir.css" rel='stylesheet'>
       
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
	  <nav class="navbar navbar-expand-lg navbar-inverse bg-dark">
  <a class="navbar-brand" href="#">E-Fir</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" >
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="complain.jsp"> Register Complain</a>
      </li>
      <li class="nav-item dropdown">
      <li class="nav-item">
        <a class="nav-link" href="my.jsp">Check Fir Status</a>
      </li>
     <form class="form-inline my-2 my-lg-0" action="search.jsp">
      <input class="form-control mr-sm-2" type="search" placeholder="Search Fir" name="user" aria-label="Search">
      <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    </ul>
      </div>
           </nav>
        
        
        <header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image:url(banner.jpg)" data-stellar-background-ratio="0.5">
         
            <div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					<div class="row row-mt-15em">
						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
                                                    
                                                    <span class="intro-text-small">Created by<a href="#" target="_blank">Jai Shukla</a></span>
							<h1 class="cursive-font">Welocome to EFIR</h1>	
						</div>
						<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
							<div class="form-wrap">
								<div class="tab">
									
									<div class="tab-content">
										<div class="tab-content-inner active" data-content="signup">
											<h3 class="cursive-font">Login First</h3>
											<form action="#">
												<div class="row form-group">
													<div class="col-md-12">
                                                                                                            <label for="t1">Username</label>
														<input type="text" name="t1" id="t1" class="form-control">
													</div>
												</div>
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="t2">Password</label>
														<input type="password" id="t2" name='t2' class="form-control">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<input type="submit" class="btn btn-primary btn-block" name="b1" value="Login">
													</div>
												</div>
											</form>
                                                                                         <h3 class="cursive-font" style="color:white;"><%=msg%></h3>
                                                                         
										</div>

										
									</div>
								</div>
							</div>
						</div>
					</div>
							
					
				</div>
			</div>
                </div>
        </header>
        
    </body>
</html>
