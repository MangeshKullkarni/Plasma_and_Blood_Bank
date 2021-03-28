
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Blood Bank</a></li>
			<li class="breadcrumb-item active">Request Status</li>
			<li class="breadcrumb-item">
			<a class="btn btn-primary right" href='<spring:url value="/hospital/hospital_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Request Status</h2>
		</div>

		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>
		<div class="container mt-3">
			

		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">Sr No</th>
							<th scope="col">Type </th>
							<th scope="col">Requested Date</th>
							<th scope="col">Available Date</th>
							<th scope="col">Status</th>
							
						</tr>
					</thead>
					<tbody>
					
						<c:forEach var="hospital" items="${sessionScope.requestDetails}">
							<tr>
								<td scope="row">${hospital.id}</td>
								<td>${hospital.type}</td>
								<td>${hospital.requestDate}</td>
								<td>${hospital.avaliblityDate}</td>
								<td>${hospital.status}</td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>