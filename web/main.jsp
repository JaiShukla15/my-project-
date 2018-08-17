<%@page  import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
      Object a1=session.getAttribute("user");
   if(a1!=null)
    {
       String uname=a1.toString();
       String email=session.getAttribute("user").toString();
       Connection  con=(Connection)session.getAttribute("Con");
       out.write("your session ID is "+session.getId());
    }
    else
    {
         response.sendRedirect("index.jsp");
       
    }

%>




<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <Link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

	<!-- Theme style  -->
	<link rel="stylesheet" href="bootstrap/css/style.css">

	<!-- Modernizr JS -->
	<script src="bootstrap/js/modernizr-2.6.2.min.js"></script>
       
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


	<script src="bootstrap/js/jquery.magnific-popup.min.js">
 
        
        </script>
	<script src="bootstrap/js/magnific-popup-options.js"></script>
	
	<script src="bootstrap/js/moment.min.js"></script>
	<script src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>


        
        <script src="bootstrap/js/bootstrap"></script>
        
       <header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image: url(banner.jpg)" data-stellar-background-ratio="0.5">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
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
        <a class="nav-link" href="chkstatus.jsp">Check Fir Status</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          about Creator
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="#">Contact Creator</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">about Us</a>
        
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0" action="search.jsp">
      <input class="form-control mr-sm-2" type="search" placeholder="Search Fir" name="user" aria-label="Search">
      <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
       </header>
    </body>
</html>
