<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if ((session.getAttribute("adminDetails") == null) || (session.getAttribute("adminDetails") == "")) {
%>
 <c:redirect url="../"></c:redirect>
<%}else{%>

<%@include file="../admin_include/admin_template.jsp" %>
<%@include file="../admin_include/admin_cards.jsp" %>
<%@include file="../admin_include/admin_footer.jsp" %>
<%@include file="../admin_include/admin_logout_alert.jsp" %>
<%}%>