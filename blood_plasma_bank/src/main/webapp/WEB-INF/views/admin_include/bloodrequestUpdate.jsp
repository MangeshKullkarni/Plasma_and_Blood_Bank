
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Blood Bank</a></li>
			<li class="breadcrumb-item active">Update Request</li>
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
					<input type="hidden" name="rid" value="${sessionScope.requestDetails.id}"/>
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="hospitalName">Requester Name  </label>
							<div class="col-lg-4">
								<div class="input-group">
									<input name="hospitalName" id="hospitalName" class="form-control" type="text" value="${sessionScope.requestDetails.requesterName}" readonly="true" />
								</div>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-lg-12">
								
								<input type="text" name="type" value="Fluid type : ${sessionScope.requestDetails.type}" class="form-control text-center" readonly="true">
							</div>
						</div>

						<div class="row form-group">
							<div class="col-lg-12">
								<input type="text" name="type" value="Blood Group: ${sessionScope.requestDetails.group}" class="form-control text-center" readonly="true">
							</div>
						</div>
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="quantity">Quantity In Bags / Bottles  </label>
							<div class="col-lg-4">
								<div class="input-group">
									<input name="quantity" id="quantity" class="form-control" type="number" value="${sessionScope.requestDetails.quantity}"/>
								</div>
							</div>
						</div>
						
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="date">Availablity Date   </label>
							<div class="col-lg-4">
								<div class="input-group">
									<input name="avaliblityDate" id="avaliblityDate" class="form-control" type="date" />
								</div>
							</div>
						</div>
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="date">Responce Status   </label>
							<div class="col-lg-4">
								<div class="input-group">
									<select name="status" class="form-control">
									<option value="requested"> -- Stauts --</option>
									<option value="available"> Available</option>
									<option value="waiting"> Waiting</option>
									<option value="rejected"> rejected</option>
									</select>
								</div>
							</div>
						</div>
						
						
						<div class="row form-group">
							<label style="font-size: 25px; margin: 2px" class="col-lg-4 control-label" for="requesterRemark">Bank Remark  </label>
							<div class="col-lg-4">
								<div class="input-group">
									<textarea name="bankRemark" id="bankRemark" class="form-control" rows=4 cols=200></textarea>
								</div>
							</div>
						</div>
						
						
						<div class="form-group row">
							<div class="col-md-8 text-center">
								<input type="submit" id="save" value="Send Response" name="save"
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
