<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="_redirectUnregistered.jsp" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>History</title>
</head>
<%@ include file="_header.jsp"%>
<%@ include file="_redirectUnregistered.jsp"%>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-4">
            <ul class="list-group">
                <c:forEach var="operation" items="${requestScope.operations}">
                    <li class="list-group-item">
                        <div class="row justify-content-between">
                            <div class="col-sm-8">${operation}</div>
                            <div class="col-sm-4 pe-0 me-0"><fmt:formatDate pattern="MM-dd HH:mm:ss" value="${operation.date}"/></div>
                        </div>
                    </li>
                </c:forEach>

            </ul>
        </div>
    </div>
</div>



</body>
</html>
