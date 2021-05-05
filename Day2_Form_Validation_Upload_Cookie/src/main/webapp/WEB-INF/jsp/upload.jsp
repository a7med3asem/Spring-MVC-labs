<%@page contentType="text/html;charset=US-ASCII" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous"/>
    <style>
        <%@include file="../assets/upload.css" %>
    </style>
</head>
<body>
<%@include file="nav.jsp" %>

<div id="begin">
    <h1>Upload</h1>
</div>

<%--  form for uploading files  --%>
<form:form enctype="multipart/form-data">

    <%--  file input to browse  --%>
    <div class="mb-3">
        <label class="form-label">File to Upload</label>
        <input class="form-control" type="file" name="file">
    </div>

    <%--  Upload button  --%>
    <input type="submit" id="submitBtn" class="btn btn-primary" value="Upload"/>

    <%--  to show uploaded file name  --%>
    <br>
    <div class="mb-3">
        <h3>${uploded}</h3>
    </div>
</form:form>

</body>
</html>
