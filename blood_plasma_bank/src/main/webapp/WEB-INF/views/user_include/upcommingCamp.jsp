
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Blood Camp</a></li>
			<li class="breadcrumb-item active">Upcomming Camp</li>
			<li class="breadcrumb-item">
			<a class="btn btn-primary right" href='<spring:url value="/user/doner_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Upcomming Camp's List</h2>
		</div>

		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>
		<div class="container mt-3">
			

		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">Date</th>
							<th scope="col">Conduct by</th>
							<th scope="col">City</th>
							<th scope="col">Location</th>
							<th scope="col">Time</th>
						</tr>
					</thead>
					<tbody>
					
						<c:forEach var="camp" items="${sessionScope.campList}">
							<tr>
								<td scope="row">${camp.campDate}</td>
								<td>${camp.organiser}</td>
								<td>${camp.address.city}</td>
								<td>${camp.address.street}</td>
								<td>${camp.startTime} -${camp.endTime} </td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>