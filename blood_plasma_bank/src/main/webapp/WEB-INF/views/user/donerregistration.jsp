<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="manifest" href="site.webmanifest">
<link rel="shortcut icon" type="image/x-icon"
	href="assets/img/favicon.ico">

<!-- CSS here -->
<link rel="stylesheet" href="../assets/css/bootstrap.min.css">
<link rel="stylesheet" href="../assets/css/owl.carousel.min.css">
<link rel="stylesheet" href="../assets/css/slicknav.css">
<link rel="stylesheet" href="../assets/css/flaticon.css">
<link rel="stylesheet" href="../assets/css/gijgo.css">
<link rel="stylesheet" href="../assets/css/animate.min.css">
<link rel="stylesheet" href="../assets/css/animated-headline.css">
<link rel="stylesheet" href="../assets/css/magnific-popup.css">
<link rel="stylesheet" href="../assets/css/fontawesome-all.min.css">
<link rel="stylesheet" href="../assets/css/themify-icons.css">
<link rel="stylesheet" href="../assets/css/slick.css">
<link rel="stylesheet" href="../assets/css/nice-select.css">
<link rel="stylesheet" href="../assets/css/style.css">

<style>
body {
	color: white;
	font-size: 30px;
	font-family: arial, Helvetica, sans-serif;
}

.box {
	box-sizing: border-box;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%
}

.input-container {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	width: 100%;
	margin-bottom: 10px;
}

.icon {
	padding: 15px;
	background: #2ECC71;
	color: white;
	min-width: 100px;
	text-align: center;
}

.input-field {
	font-size: 20px;
	padding: 10px;
	outline: none;
	opacity: 0.8;
	box-shadow: 8px 8px 5px black;
}

.input-field:focus {
	border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
	background-color: #ff5c3a;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.8;
}

.btn:hover {
	opacity: 5;
}

.box1 {
	background-color: white;
	border: 2px solid white;
	width: 50%;
	height: auto;
	box-shadow: 2px, 3px, 4px white;
}
</style>
</head>


<body class="black-bg">
	<div class="header-area header-transparent">
		<div class="main-header header-sticky">
			<div class="container-fluid">
				<div
					class="menu-wrapper d-flex align-items-center justify-content-between">
					<!-- Logo -->
					<div class="logo">
						<a href="#"><img src="assets/img/logo/logo.png" alt=""></a>
					</div>
					<!-- Main-menu -->
					<div class="main-menu f-right d-none d-lg-block">
						<nav>
							<ul id="navigation">
								<li><a href="#">Home</a></li>
								<li><a href="#">About</a></li>

								<li><a href="#">Gallery</a></li>
								<li><a href="#">Login</a>
									<ul class="submenu">
										<li><a href='<spring:url value="/user/donerlogin"/>'>Doner
												Login</a></li>
										<li><a href='<spring:url value="/user/login"/>'>User
												Login</a></li>
										<li><a href='<spring:url value="/hospital/login"/>'>Hospital
												Login</a></li>
										<li><a href='<spring:url value="/admin/login"/>'>Admin
												Login</a></li>
									</ul></li>
								<li><a href="#">Registration</a>
									<ul class="submenu">
										<li><a
											href='<spring:url value="/user/donerregistration"/>'>Donner
												Registration</a></li>
										<li><a href='<spring:url value="/hospital/login"/>'>Hospital
												Login</a></li>
										<li><a href='<spring:url value="/admin/login"/>'>Admin
												Login</a></li>
									</ul></li>
								<li><a href="#">Contact</a></li>
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

	<div style="margin-top: 10%; margin-left: 10%;" class="box1">
		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>

		<form method="POST">
			<div class="row text-center">
				<div class="col-sm-6" style="color: pink">
					<h2 style="color: black;">Donor Registration Form</h2>
					<div class="input-container col-sm-9">
						<i class="fa fa-user icon"></i> <input class="input-field"
							type="text" placeholder="Full Name" name="name" required>
					</div>

					<div class="input-container col-sm-9">
						<i class="fa fa-envelope icon"></i> <input class="input-field"
							type="email" placeholder="Email" name="email" required>
					</div>


					<div class="input-container col-sm-9">
						<i class="far fa-calendar icon"></i> <input class="input-field"
							type="date" placeholder="Date of birth" name="dateOfBirth"
							required>
					</div>


					<div class="input-container col-sm-9 " required>

						<i class="far fa-genederless icon"></i> <select
							class="input-field" name="gender" required>
							<option value="">Gender</option>
							<option value=" male">male</option>
							<option value="female">female</option>
						</select>
					</div>

					<div class="input-container col-sm-9 " required>
						<i class="fa fa-plus-square icon"></i> <select class="input-field"
							name="fluidType" required>
							<option value="">Donation</option>
							<option value=" blood">blood</option>
							<option value="plasma">plasma</option>
							<option value="both">both</option>
						</select>
					</div>



					<div class="input-container col-sm-9 " required>
						<i class="fa fa-plus-square icon"></i> <select class="input-field"
							name="group" required>
							<option value="">Select your Blood Group</option>
							<option value=" A+">A+</option>
							<option value="A-">A-</option>
							<option value="O+">O+</option>
							<option value="O-">O-</option>
							<option value="B+">B+</option>
							<option value="B-">B-</option>
							<option value="AB+">AB+</option>
							<option value="AB-">AB-</option>

						</select>
					</div>


					<div class="input-container col-sm-9">
						<i class="fa fa-mobile icon"></i> <input class="input-field"
							type="tel" placeholder="Mobile Number" name="mobileNo"
							maxlength="10" required>
					</div>


					<div class="input-container col-sm-9">
						<i class="fa fa-key icon"></i> <input class="input-field"
							type="password" placeholder="Password" name="password" required>
					</div>

					<div class="input-container col-sm-9">
						<i class="fa fa-key icon"></i> <input class="input-field"
							type="password" placeholder=" Confirm Password"
							name="confirmPassword" required>
					</div>
					<br>

					<div class="col-sm-9">
						<input style="float: light;" type="submit" class="btn btn-primary"
							value="Register" /> <input type="reset" class="btn btn-dander"
							value="cancel" />
					</div>
				</div>
			</div>
		</form>
	</div>

</body>
</html>