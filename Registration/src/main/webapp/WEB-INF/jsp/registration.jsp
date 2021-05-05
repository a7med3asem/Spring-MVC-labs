<%@page contentType="text/html;charset=US-ASCII" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Register &#9997;</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous"/>
    <style>
        <%@include file="../assets/style.css" %>
    </style>
</head>
<body>
<div id="begin">
    <%--            <h1>Registration &#9997;</h1>--%>
    <h1><spring:message code="header.register"/> &#9997;</h1>
</div>

<form:form modelAttribute="registration">
<%--    Display all error messages --%>
    <form:errors path="*" cssClass="errorblock" element="div"/>

    <div class="mb-3">
        <label class="form-label">
            <spring:message code="name"/>
        </label>
        <form:input path="name" cssClass="form-control"/>
        <form:errors path="name" cssClass="error" element="div"/>
    </div>

    <div class="mb-3">
        <label class="form-label">
            <spring:message code="salary"/>
        </label>
        <form:input path="salary" cssClass="form-control"/>
        <form:errors path="salary" cssClass="error" element="div"/>
    </div>

    <input type="submit" id="submitBtn" class="btn btn-primary" value=<spring:message code="register"/>>

</form:form>

</body>
</html>
