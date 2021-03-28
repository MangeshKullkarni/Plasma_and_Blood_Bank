
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="content-wrapper">
	<div class="container-fluid">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="#">Report</a></li>
			<li class="breadcrumb-item active">Add Doner</li>
			<li class="breadcrumb-item"><a class="btn btn-primary right"
				href='<spring:url value="/admin/admin_dashboard"/>'>Back</a></li>
		</ol>
		<div class="alert alert-primary text-center" role="alert">
			<h2>Add Doner</h2>
		</div>

		<h3
			style="color: red; background-color: white; margin-right: 150px; margin-left: 150px;">${requestScope.message}</h3>
		<div class="container mt-3">
			<form method="post">
				<fieldset>
					<div class="row">
						<div class="col-lg-4 panel">
							<h2>Doner Information</h2>
						</div>
					</div>
					<div class="row form-group">
						<label class="col-lg-3 control-label" for="mobile">
							Contact No: </label>
						<div class="col-lg-4">
							<div class="input-group">
								<input name="mobieNO" id="mobieNO" maxlength="10"
									name="mobile" placeholder="xxxxxxxxxxxx" class="form-control"
									type="number" />
							</div>
						</div>
					</div>
					<div class="row form-group">
						<label class="col-lg-2 control-label" for="email"> Name: </label>
						<div class="col">
							<div class="input-group">
								<input name="donerName" id="donerName" class="form-control"
									type="text" />
							</div>
						</div>

						<label class="col-lg-2 control-label" for="experience">
							Date Of Birth: </label>
						<div class="col">
							<div class="input-group">
								<input name="donerDOB" id="donerDOB" class="form-control"
									type="date" />
							</div>
						</div>

					</div>
					<div class="row form-group">
						<label class="col-md-2 control-label" for="registrationId">Group
							.</label>
						<div class="col-md-2">
							<div class="input-group">
								<select name="group" class="form-control">
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
						<label class="col-md-2 control-label" for="registrationId">type
							.</label>
						<div class="col-md-2">
							<div class="input-group">
								<select name="type" class="form-control">
									<option value="">----- Select -----</option>
									<option value="blood">Blood</option>
									<option value="plasma">Plasma</option>

								</select>
							</div>
						</div>
					</div>
					<div class="row form-group">
					<label class="col-md-2 control-label" for="registrationId">Quantity
							.</label>
						<div class="col-md-2">
							<div class="input-group">
								<input type="text" class="form-control" name="quantity" id="quantity"/>
							</div>
						</div>
						
						<label class="col-md-2 control-label" for="registrationId">Time
							.</label>
						<div class="col-md-2">
							<div class="input-group">
								<input type="time" class="form-control" name="time" id="time"/>
							</div>
						</div>
						<label class="col-md-2 control-label" for="registrationId">Date
							.</label>
						<div class="col-md-2">
							<div class="input-group">
								<input type="date" class="form-control" name="campDate" id="campDate"/>
							</div>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-md-8 text-center">
							<input type="submit" id="save" value="Save" name="save"
								class="btn btn-large btn-success">
							<button class="btn btn-large btn-danger" type="reset">Cancel</button>
						</div>
					</div>
				</fieldset>
			</form>
		</div>


	</div>
</div>