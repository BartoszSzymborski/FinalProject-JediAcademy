<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your opinion</title>

    <link href='<c:url value="../css/bootstrap.min.css"/>' rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
</head>
<body>
<form:form method="post" modelAttribute="opinion">

<div class="container">
    <div class="card-header">
        <div class="card-body">

            <div class="form-group">
                <label for="studentId">Student:</label>
                <form:select path="student.id" items="${students}" itemLabel="fullName" itemValue="id" id="studentId" class="form-control"/>
                <form:errors path="student" element="div" cssClass="error"/>
            </div>

            <div class="form-group">
                <label for="textId">Your opinion is important, share it with us:</label>
                <form:textarea path="text" rows="5" cols="40" id="textId" class="form-control"/>
                <form:errors path="text" element="div" cssClass="error"/>
            </div>
            <input type="submit" class="btn btn-danger" value="Save">
        </div>
    </div>
</div>

</form:form>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>
