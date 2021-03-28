
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Blood Bank</a></li>
			<li class="breadcrumb-item active">Send Request</li>
			<li class="breadcrumb-item"><a class="btn btn-primary right"
				href='<spring:url value="/hospital/hospital_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Request For Blood / Plasma</h2>
		</div>
		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>

		<div class="container mt-3">
			<div class="container" style="margin-top: 50px;">
				<form method="post">
					<fieldset>
					
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="hospitalName">Requester Name  </label>
							<div class="col-lg-4">
								<div class="input-group">
									<input name="requesterName" id="requesterName" class="form-control" type="text" value="${reciverDetails.name}" readonly="true" />
								</div>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-lg-12">
								<select name="type" id="type" class="form-control">
									<option value="">---- SELECT ----</option>
									<option value="Blood">Blood</option>
									<option value="Plasma">Plasma</option>
									<option value="both">Both</option>
								</select>
							</div>
						</div>

						<div class="row form-group">
							<div class="col-lg-12">
								<select name="group" id="group" class="form-control">
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
						</div>
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="quantity">Quantity In Bags / Bottles  </label>
							<div class="col-lg-4">
								<div class="input-group">
									<input name="quantity" id="quantity" class="form-control" type="number" />
								</div>
							</div>
						</div>
						
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="date">Last Date   </label>
							<div class="col-lg-4">
								<div class="input-group">
									<input name="lastDate" id="lastDate" class="form-control" type="date" />
								</div>
							</div>
						</div>
						
					
						
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="requesterRemark">Requester Remark  </label>
							<div class="col-lg-4">
								<div class="input-group">
									<textarea name="requesterRemark" id="requesterRemark" class="form-control" rows=4 cols=200></textarea>
								</div>
							</div>
						</div>
						
						
						<div class="form-group row">
							<div class="col-md-8 text-center">
								<input type="submit" id="save" value="Send Request" name="save"
									class="btn btn-large btn-success">

								<button class="btn btn-large btn-danger" type="reset">Cancel</button>
							</div>
						</div>
					</fieldset>
				</form>
			</div>
		</div>


	</div>
</div>
