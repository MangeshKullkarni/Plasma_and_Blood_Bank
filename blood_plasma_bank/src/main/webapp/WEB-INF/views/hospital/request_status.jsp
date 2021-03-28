<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if ((session.getAttribute("hospitalDetails") == null) || (session.getAttribute("hospitalDetails") == "")) {
%>
 <c:redirect url="../"></c:redirect>
<%}else{%>

<%@include file="../hospital_include/hospital_template.jsp" %>
<%@include file="../hospital_include/request_status.jsp" %>
<%@include file="../hospital_include/hospital_footer.jsp" %>
<%@include file="../hospital_include/hospital_logout_alert.jsp" %>
<%}%>