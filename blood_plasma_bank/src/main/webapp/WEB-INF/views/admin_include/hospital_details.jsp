
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Hospital's</a></li>
			<li class="breadcrumb-item active">Hospital's Details</li>
			<li class="breadcrumb-item">
			<a class="btn btn-primary right" href='<spring:url value="/admin/admin_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Registered Hospital List</h2>
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
							<th scope="col">Name</th>
							<th scope="col">Mobile No</th>
							<th scope="col">City</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
					
						<c:forEach var="hospital" items="${sessionScope.hospitalList}">
							<tr>
								<td scope="row">${hospital.id}</td>
								<td>${hospital.name}</td>
								<td>${hospital.mobileNo}</td>
								<td>${hospital.address.city}</td>
								<td> <a
									href='<spring:url value="/admin/hospitalUpdate?hid=${hospital.id}"/>'><button
											type="button" class="btn btn-success">
											<i class="fas fa-edit"></i>
										</button></a> <a 
									href='<spring:url value="/admin/hospital_delete?hid=${hospital.id}"/>'><button
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