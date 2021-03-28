
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Report</a></li>
			<li class="breadcrumb-item active">Blood Request's</li>
			<li class="breadcrumb-item">
			<a class="btn btn-primary right" href='<spring:url value="/admin/admin_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Blood Request From Reciver</h2>
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
							<th scope="col">Hospital Name</th>
							<th scope="col">Fluid Type</th>
							<th scope="col">Group</th>
							<th scope="col">Quantity</th>
							<th scope="col">Remark</th>
							<th scope="col">Action</th>
							
							
						</tr>
					</thead>
					<tbody>
					
						<c:forEach var="requester" items="${sessionScope.bloodRequest}">
							<tr>
								<td scope="row">${requester.id}</td>
								<td>${requester.requesterName}</td>
								<td>${requester.type}</td>
								<td>${requester.group}</td>
								<td>${requester.quantity}</td>
								<td>${requester.requesterRemark}</td>
								<td> <a
									href='<spring:url value="/admin/bloodrequestUpdate?rid=${requester.id}"/>'><button
											type="button" class="btn btn-success">
											<i class="fas fa-edit"></i>
										</button></a> <a 
									href='<spring:url value="/admin/bloodrequestdelete?rid=${requester.id}"/>'><button
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