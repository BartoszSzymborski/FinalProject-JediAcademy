<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="forr" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>Student Registry</title>
    <link href='<c:url value="../css/bootstrap.min.css"/>' rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery.min.js"></script>

    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css.datepicker.min.js"/>
    <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css.datepicker3.min.js"/>
    <script src="//cdnjs.cloudflare.com/ajax/libs/bootsrap-datepciker/1.3.0/js/bootstrap-datepicker.min.js"></script>


</head>
<body>
<form:form method="post" modelAttribute="school">
    <div class="container">
        <div class="card-header">
            <div class="card-body">

                <h3 class="header">Treening</h3>

                    <label for="dayId">Day:</label>
                    <form:select path="day" id="dayId" class="form-control">
                        <form:option value="" label=""/>
                        <form:option value="Monday" label="Monday"/>
                        <form:option value="Tuesday" label="Tuesday"/>
                        <form:option value="Wendsday" label="Wendsday"/>
                        <form:option value="Thursday" label="Thursday"/>
                        <form:option value="Friday" label="Friday"/>
                        <form:option value="Saturday" label="Saturday"/>
                        <form:option value="Sunday" label="Sunday"/>
                    </form:select>
                <form:errors path="day" element="div" cssClass="error"/>
                </div>

            <div class="form-group">
                <label for="lightSaberId">Color of light saber:</label>
                <form:select path="lightSaber" id="lightSaberId" class="form-control" required="">
                    <form:option value="" label=""/>
                    <form:options items="${schools}"/>
                </form:select>
                <form:errors path="lightSaber" element="div" cssClass="error"/>
            </div>
            <div class="form-group">
                <label for="hourId">Many time need you?:</label>
                <form:input type="text" path="hour" id="hourId" class="form-control"/>
                <form:errors path="hour" element="div" cssClass="error"/>
            </div>

            <div class="form-group">
                <label for="studentId">Student:</label>
                <form:select path="student.id" items="${students}" itemLabel="fullName" itemValue="id" id="studentId" class="form-control"/>
                <form:errors path="student" element="div" cssClass="error"/>
            </div>



                <input type="submit" class="btn btn-danger" value="Save">
                <a class="btn btn-primary" href="/" role="button">Back to main site</a>
            <a class="btn btn-success" href="/saber" role="button">Coolor not sure you are?</a>

            </div>
        </div>
    </div>
</form:form>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>

</html>

