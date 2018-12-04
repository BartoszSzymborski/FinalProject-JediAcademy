<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="forr" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Teacher Choose</title>
    <link href='<c:url value="../css/bootstrap.min.css"/>' rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>

</head>
<body>
<form:form method="post" modelAttribute="teacher">

    <div class="container">
        <div class="card-header">
            <div class="card-body">

                <h3 class="header">Teacher and style you choose must</h3>

                <div class="form-group">
                    <label for="fullNameId">Your teachers with style fight:</label>
                    <form:select path="fullName" id="fullNameId" class="form-control" required="">
                        <form:option value="" label=""/>
                        <form:options items="${teachers}"/>
                    </form:select>
                    <form:errors path="fullName" element="div" cssClass="error"/>
                </div>

                <div class="form-group">
                    <label for="studentId">Student:</label>
                    <form:select path="student.id" items="${students}" itemLabel="fullName" itemValue="id" id="studentId" class="form-control"/>
                    <form:errors path="student" element="div" cssClass="error"/>
                </div>

                <input type="submit" class="btn btn-danger" value="Save">
                <a class="btn btn-primary" href="/" role="button">Back to main site</a>
                <a class="btn btn-success" href="/teacherDesc" role="button">Information about your teacher you need</a>
                <a class="btn btn-success" href="/fight" role="button">Information style you need</a>

            </div>
        </div>
    </div>
</form:form>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>

</html>

