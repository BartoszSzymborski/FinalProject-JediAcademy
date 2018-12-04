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

</head>
<body>
<form:form method="post" modelAttribute="student">

    <div class="container">
        <div class="card-header">
            <div class="card-body">

                <h3 class="header">Add Jedi</h3>

                <div class="form-group">
                    <label for="firstNameId">First Name:</label>
                    <form:input type="text" path="firstName" id="firstNameId" class="form-control"/>
                    <form:errors path="firstName" element="div" cssClass="error"/>
                </div>
                <div class="form-group">
                    <label for="lastNameId">Last Name:</label>
                    <form:input type="text" path="lastName" id="lastNameId" class="form-control"/>
                    <form:errors path="lastName" element="div" cssClass="error"/>
                </div>
                <div class="radio-button">
                    <label for="genderId">Gender:</label><br>
                   Male: <form:radiobutton value="M" path="gender" id="genderId" class="radio-inline"/>
                    Female: <form:radiobutton value="F" path="gender" id="genderId" class="radio-inline"/>
                    <form:errors path="gender" element="div" cssClass="error"/>
                </div>
                <div class="form-group">
                    <label for="emailId">Email:</label>
                    <form:input type="email" path="email" id="emailId" class="form-control"/>
                    <form:errors path="email" element="div" cssClass="error"/>
                </div>
                <div class="radio-button">
                    <label for="forcePathId">Choose your side of the skills:</label><br>
                    Light Side <form:radiobutton value="Light Side" path="forcePath" id="forcePathId" class="radio-inline"/>
                    Dark Side  <form:radiobutton value="Dark Side" path="forcePath" id="forcePathId" class="radio-inline"/>
                    <form:errors path="forcePath" element="div" cssClass="error"/>
                </div>
                <div class="form-group">
                    <label for="textId">Say something you want, hmm?:</label>
                    <form:textarea path="text" rows="3" cols="20" id="textId" class="form-control"/>
                    <form:errors path="text" element="div" cssClass="error"/>
                </div>
                <form:hidden path="id" />

                <input type="submit" class="btn btn-danger" value="Save">
                <a class="btn btn-primary" href="/" role="button">Back to main site</a>


            </div>
        </div>
    </div>
</form:form>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>

</html>

