<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if ((session.getAttribute("reciverDetails") == null) || (session.getAttribute("reciverDetails") == "")) {
%>
 <c:redirect url="../"></c:redirect>
<%}else{%>

<%@include file="../user_include/reciver_template.jsp" %>
<%@include file="../user_include/requestStatus.jsp" %>
<%@include file="../user_include/reciver_footer.jsp" %>
<%@include file="../user_include/reciver_logout_alert.jsp" %>
<%}%>