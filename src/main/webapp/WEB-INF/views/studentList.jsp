<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student list</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <script>
        function confirmDelete(id, fullName) {
            if (confirm("You don't be a jedi want to, hmm?   \"" + fullName + "\"")) {
                    window.location.href = "/student/delete/" + id;
                }
        }
    </script>
</head>
<body>
<div class="container">

    <h3 class="header">Jedi Padawans List</h3>

    <div class="card">
        <div class="card-body">

            <table class="table table-hover">
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Gender</th>
                    <th>Email</th>
                    <th>Force Path</th>
                    <th>Talk, you words have.</th>
                    <th style="width:16%">Actions</th>

                </tr>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.firstName}</td>
                        <td>${student.lastName}</td>
                        <td>${student.gender}</td>
                        <td>${student.email}</td>
                        <td>${student.forcePath}</td>
                        <td>${student.text}</td>
                        <td>
                            <a href="#" onclick="confirmDelete(${student.id})" class="btn btn-danger">Delete</a>
                            <a href="/student/update/${student.id}" class="btn btn-success">Edit and back</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-primary" href="/" role="button">Back to main site</a>
            <a class="btn btn-secondary" href="/school/add" role="button">Go to school you must</a>
        </div>
    </div>
</div>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>