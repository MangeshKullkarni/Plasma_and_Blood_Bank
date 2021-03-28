<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if ((session.getAttribute("donerDetails") == null) || (session.getAttribute("donerDetails") == "")) {
%>
 <c:redirect url="../"></c:redirect>
<%}else{%>

<%@include file="../user_include/doner_template.jsp" %>
<%@include file="../user_include/doner_cards.jsp" %>
<%@include file="../user_include/doner_footer.jsp" %>
<%@include file="../user_include/doner_logout_alert.jsp" %>
<%}%>