<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!doctype html>
<html class="no-js" lang="zxx">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Online Blood & Plasma Donation System</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.webmanifest">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
<!-- Font Awesome CSS -->
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<!-- jQuery -->
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<!-- Bootstrap JS -->
<script
	src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js'></script>
<link rel="stylesheet"
	href="<spring:url value='/css/about_us.css'/>" type="text/css" />
    <!-- CSS here -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="assets/css/slicknav.css">
    <link rel="stylesheet" href="assets/css/flaticon.css">
    <link rel="stylesheet" href="assets/css/gijgo.css">
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <link rel="stylesheet" href="assets/css/animated-headline.css">
    <link rel="stylesheet" href="assets/css/magnific-popup.css">
    <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/css/themify-icons.css">
    <link rel="stylesheet" href="assets/css/slick.css">
    <link rel="stylesheet" href="assets/css/nice-select.css">
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
<!-- Font Awesome CSS -->
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
<!-- jQuery -->
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<!-- Bootstrap JS -->
<script
	src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js'></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<spring:url value='/css/customer.css'/>"
	type="text/css" />
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value='/js/about.js'/>"></script>
<script
	src='//production-assets.codepen.io/assets/editor/live/console_runner-079c09a0e3b9ff743e39ee2d5637b9216b3545af0de366d4b9aad9dc87e26bfd.js'></script>
<script
	src='//production-assets.codepen.io/assets/editor/live/events_runner-73716630c22bbc8cff4bd0f07b135f00a0bdc5d14629260c3ec49e5606f98fdd.js'></script>
<script
	src='//production-assets.codepen.io/assets/editor/live/css_live_reload_init-2c0dc5167d60a5af3ee189d570b1835129687ea2a61bee3513dee3a50c115a77.js'></script>
<meta charset='UTF-8'>
<meta name="robots" content="noindex">
<link rel="shortcut icon" type="image/x-icon"
	href="//production-assets.codepen.io/assets/favicon/favicon-8ea04875e70c4b0bb41da869e81236e54394d63638a1ef12fa558a4a835f1164.ico" />
<link rel="mask-icon" type=""
	href="//production-assets.codepen.io/assets/favicon/logo-pin-f2d2b6d2c61838f7e76325261b7195c27224080bc099486ddd6dccb469b8e8e6.svg"
	color="#111" />
<link rel="canonical"
	href="https://codepen.io/dylanhobbs/pen/kXRVwr?depth=everything&order=popularity&page=55&q=product&show_forks=false" />
    
<style class="cp-pen-styles">
@import
	url(https://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,700)
	;

body {
	padding: 0;
	margin: 0;
	background-color: #fefefe;
	font-size: 16px;
	text-rendering: optimizeLegibility;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	-moz-font-feature-settings: "liga" on;
}

.description {
	padding: 1em;
}

h3 {
	font-family: 'Lato';
	color: white;
	letter-spacing: 0.08rem;
	font-weight: 700;
}

h3 span {
	font-weight: 900;
}

.description p {
	margin-top: -0.75em;
	font-size: 0.85em;
	color: white;
	font-weight: 300;
	width: 22vw;
}

p {
	font-family: 'Roboto Condensed', sans-serif;
	font-weight: 700;
}

.card-container {
	z-index: 1;
	margin: 0 auto;
	width: 100%;
}

.object {
	position: relative;
	border-radius: 2%;
	margin: 12vh auto;
	width: 50%;
	height: 50vh;
	background-color: #ff0; /* Old browsers */
	background-image: -moz-linear-gradient(-45deg, #f96217 0%, #f2092a 100%);
	/* FF3.6-15 */
	background-image: -webkit-linear-gradient(-45deg, #f96217 0%, #f2092a 100%);
	/* Chrome10-25,Safari5.1-6 */
	background-image: linear-gradient(135deg, rgba(249, 98, 23, 0.75) 0%,
		rgba(249, 23, 23, 1) 100%);
	/* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
	background-blend-mode: multiply;
	transition: all 1s;
}

.object.expanded {
	background-color: #F91717;
	width: 90%;
}

.object .product.transition {
	transform: matrix(0.8, 0, 0, 0.8, 300, -220);
	will-change: transform;
	transition: all 1s ease-in-out;
}

.object .logo {
	width: 6vw;
	padding-top: 0.5em;
	padding-left: 1.5em;
}

.object .logo img {
	max-width: 100%;
}

.object .product {
	z-index: 10;
	position: absolute;
	width: 34vw;
	margin-left: -12vw;
	margin-top: 1vh;
	transition: all 1s ease-in-out;
}

.object .product img {
	max-width: 100%;
}

.hero p.title {
	position: absolute;
	font-size: 3em;
	top: 10.4%;
	font-size: 12em;
	z-index: 1;
	opacity: 0.12;
	transition: all 1s;
}

.button {
	z-index: 2;
	position: absolute;
	top: 55vh;
	left: 23vw;
	padding-top: 0.95em;
	padding-bottom: 0.75em;
	white-space: nowrap;
	background-image:
		url('https://s3-us-west-2.amazonaws.com/s.cdpn.io/477444/shopping-white.svg');
	background-repeat: no-repeat;
	background-size: 45%;
	background-position: center;
	background-color: rgb(0, 194, 235);
	height: 1.7em;
	width: 3.5em;
	border-radius: 50%;
	box-shadow: 0 1px 3px rgba(0, 194, 235, 0.12), 0 1px 2px
		rgba(0, 194, 235, 0.24);
	transition: all 0.5s;
}

.button:hover {
	box-shadow: 0 3px 6px rgba(0, 194, 235, 0.16), 0 3px 6px
		rgba(0, 194, 235, 0.23);
}

.button.expanded {
	width: 8em;
	height: 1.5em;
	left: 37vw;
	border-radius: 5px;
	text-align: center;
	padding-top: 0.95em;
	padding-bottom: 0.75em;
	transition: all 0.5s;
	background-image: none;
}

.button span {
	display: none;
	opacity: 0;
	white-space: nowrap;
}

.button.expanded span {
	display: initial;
	opacity: 1;
	color: white;
	font-family: 'Lato';
	font-weight: 600;
}

.button.expanded .bold {
	font-weight: 900;
}
</style>
</head>
<body class="black-bg">
    <!-- ? Preloader Start -->
    <div id="preloader-active">
        <div class="preloader d-flex align-items-center justify-content-center">
            <div class="preloader-inner position-relative">
                <div class="preloader-circle"></div>
                <div class="preloader-img pere-text">
                   
                </div>
            </div>
        </div>
    </div>
    <!-- Preloader Start -->
    <header>
        <!-- Header Start -->
        <div class="header-area header-transparent">
            <div class="main-header header-sticky">
                <div class="container-fluid">
                    <div class="menu-wrapper d-flex align-items-center justify-content-between">
                        <!-- Logo -->
                        <div class="logo">
                            <a href="#"><img src="assets/img/logo/logo.png" alt=""></a>
                        </div>
                        <!-- Main-menu -->
                        <div class="main-menu f-right d-none d-lg-block">
                            <nav>
                                <ul id="navigation">
                                    <li><a href='<spring:url value="/"/>'>Home</a></li>
                                    <li><a href='<spring:url value="./AboutUs"/>'>About</a></li>
                          
                                    <li></li>
                                    <li><a href="#">Login</a>
                                        <ul class="submenu">
                                            <li><a href='<spring:url value="/user/donerlogin"/>'>Doner Login</a></li>
                                             <li><a href='<spring:url value="/user/reciverLogin"/>'>Reciver Login</a></li>
                                            <li><a href='<spring:url value="/hospital/login"/>'>Hospital Login</a></li>
                                            <li><a href='<spring:url value="/admin/login"/>'>Admin Login</a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Registration</a>
                                        <ul class="submenu">
                                            <li><a href='<spring:url value="/user/donerregistration"/>'>Donner Registration</a></li>
                                            <li><a href='<spring:url value="/user/reciverregistration"/>'>Reciver Registration</a></li>
                                          
                                        </ul>
                                    </li>
                                    <li><a href='<spring:url value="./ContactUs"/>'>Contact</a></li>
                                </ul>
                            </nav>
                        </div>          
                        <!-- Header-btn -->
                        <div class="header-btns d-none d-lg-block f-right">
                           <a href="#" class="btn">Contact me</a>
                       </div>
                       <!-- Mobile Menu -->
                       <div class="col-12">
                        <div class="mobile_menu d-block d-lg-none"></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Header End -->
</header>
<main>
    <!--? slider Area Start-->
    <div class="slider-area position-relative">
        <div class="slider-active">
            <!-- Single Slider -->
            <div class="single-slider slider-height d-flex align-items-center">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-9 col-lg-9 col-md-10">
                          
                        </div>
                    </div>
                </div>          
            </div>
        </div>
    </div>

 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="row">
<div class="col col-lg-12">
<div class="jumbotron">
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3780.4047612538147!2d73.75566071420603!3d18.645824170199514!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2b9f04635518b%3A0xea525f504f61f2a4!2sIACSD%20(Institute%20for%20Advanced%20Computing%20and%20Software%20Development)!5e0!3m2!1sen!2sin!4v1616688603201!5m2!1sen!2sin" width=100% height="450" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
</div>
</div>
</div>

          <div class="col-lg-5 col-md-12 love-graphic">
                  <h3 style="margin-left: 50px;">Sector No. 29, Behind Akurdi Railway Station, Pradhikaran Nigdi, Akurdi, Pune 411044, Pune, Maharashtra 411044 </h3>
                 <h3 style="margin-left: 50px;">Akurdi, Pimpri-Chinchwad, Maharashtra</h3>
                 <h3 style="margin-left: 50px;">+912027659509</h3>
                <h3 style="margin-left: 50px;"> http:/www.iacsd.in</h3>
               </div>
            </div>
         </div>
      </section>
      
      
  <div id="back-top" >
    <a title="Go to Top" href="#"> <i class="fas fa-level-up-alt"></i></a>
</div>

<!-- JS here -->

<script src="./assets/js/vendor/modernizr-3.5.0.min.js"></script>
<!-- Jquery, Popper, Bootstrap -->
<script src="./assets/js/vendor/jquery-1.12.4.min.js"></script>
<script src="./assets/js/popper.min.js"></script>
<script src="./assets/js/bootstrap.min.js"></script>
<!-- Jquery Mobile Menu -->
<script src="./assets/js/jquery.slicknav.min.js"></script>

<!-- Jquery Slick , Owl-Carousel Plugins -->
<script src="./assets/js/owl.carousel.min.js"></script>
<script src="./assets/js/slick.min.js"></script>
<!-- One Page, Animated-HeadLin -->
<script src="./assets/js/wow.min.js"></script>
<script src="./assets/js/animated.headline.js"></script>
<script src="./assets/js/jquery.magnific-popup.js"></script>

<!-- Date Picker -->
<script src="./assets/js/gijgo.min.js"></script>
<!-- Nice-select, sticky -->
<script src="./assets/js/jquery.nice-select.min.js"></script>
<script src="./assets/js/jquery.sticky.js"></script>

<!-- counter , waypoint,Hover Direction -->
<script src="./assets/js/jquery.counterup.min.js"></script>
<script src="./assets/js/waypoints.min.js"></script>
<script src="./assets/js/jquery.countdown.min.js"></script>
<script src="./assets/js/hover-direction-snake.min.js"></script>

<!-- contact js -->
<script src="./assets/js/contact.js"></script>
<script src="./assets/js/jquery.form.js"></script>
<script src="./assets/js/jquery.validate.min.js"></script>
<script src="./assets/js/mail-script.js"></script>
<script src="./assets/js/jquery.ajaxchimp.min.js"></script>

<!-- Jquery Plugins, main Jquery -->	
<script src="./assets/js/plugins.js"></script>
<script src="./assets/js/main.js"></script>

</body>
</html>