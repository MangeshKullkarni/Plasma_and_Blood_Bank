   
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
  <div class="content-wrapper">
    <div class="container-fluid">
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">Dashboard</a>
        </li>
        <li class="breadcrumb-item active">My Dashboard</li>
      </ol>
     <div class="row">
        <div class="col-xl-6 col-sm-6 mb-3">
          <div class="card text-white bg-primary o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
              <i class="fa fa-rss" aria-hidden="true"></i>
              </div>
              <div class="mr-5">Upcomming Camp Counts (${sessionScope.upcommingCount})</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href='<spring:url value="/user/upcommingCamp"/>'>
              <span class="float-left">View Details</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
        <div class="col-xl-6 col-sm-6 mb-3">
          <div class="card text-white bg-warning o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
              <i class="fa fa-eye" aria-hidden="true"></i>
              </div>
              <div class="mr-5">Attended Camp Count (${sessionScope.attendedCount})</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href='<spring:url value="/user/attendedCamp"/>'>
              <span class="float-left">View Details</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
       
       
      </div>
   </div>
</div>
   