
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Blood Bank</a></li>
			<li class="breadcrumb-item active">Add Stocks</li>
			<li class="breadcrumb-item">
			<a class="btn btn-primary right" href='<spring:url value="/admin/admin_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Add Stocks</h2>
		</div>

		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>
		<div class="container mt-3">
			<form method="post">
			<div class="form-group">
					<label for="type">Select Fluid Type  :</label> 
					<select name="type" class="form-control" >
					<option value="">----- Select -----</option>
									<option value="blood">Blood</option>
									<option value="plasma">Plasma</option>
									
					</select>
				</div>
				<div class="form-group">
					<label for="group">Select Blood Group :</label> 
					<select name="group" class="form-control" >
					<option value="">Select your Blood Group</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="O+">O+</option>
									<option value="O-">O-</option>
									<option value="B+">B+</option>
									<option value="B-">B-</option>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
					</select>
				</div>
				<div class="form-group">
					<label>Enter Quantity</label> 
					<input type="text" name="quantity" class="form-control" />	
				</div>
				<input type="submit" class="btn btn-primary" value="Release  " />
			</form>
		</div>

		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th scope="col">Sr No</th>						
							<th scope="col"> Type</th>
							<th scope="col">Group</th>
							<th scope="col">Available Stock</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="s" items="${sessionScope.stocksList}">
							<tr>
								<td scope="row">${s.id}</td>
								<td>${s.type}</td>
								<td>${s.group}</td>
								<td>${s.availableQuantity}</td>
							
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>