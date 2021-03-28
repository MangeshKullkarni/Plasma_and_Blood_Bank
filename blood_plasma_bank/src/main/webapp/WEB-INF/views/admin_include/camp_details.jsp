
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Blood Bank</a></li>
			<li class="breadcrumb-item active">Camp Details</li>
			<li class="breadcrumb-item">
			<a class="btn btn-primary right" href='<spring:url value="/admin/admin_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Camp Details</h2>
		</div>

		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>
		

		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">Sr No</th>						
							<th scope="col"> Camp date</th>
							<th scope="col">City</th>
							<th scope="col">Street</th>
							<th scope="col">Time</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="c" items="${sessionScope.campList}">
							<tr>
								<td scope="row">${c.id}</td>
								<td>${c.campDate}</td>
								<td>${c.address.city}</td>
								<td>${c.address.street}</td>
								<td>${c.startTime} - ${c.endTime}</td>
								<td><a 
									href='<spring:url value="/admin/camp_delete?cid=${c.id}"/>'><button
											type="button" class="btn btn-danger">
											<i class="far fa-trash-alt"></i>
										</button></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>