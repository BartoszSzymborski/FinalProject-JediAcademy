<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Teacher list</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <script>
        function confirmDelete(id, fullName) {
            if (confirm("You don't be a jedi want to, hmm?   \"" + fullName+ "\"")) {
                window.location.href = "/teacher/delete/" + id;
            }
        }
    </script>
</head>
<body>
<div class="container">

    <h3 class="header">Teacher list</h3>

    <div class="card">
        <div class="card-body">

            <table class="table table-hover">
                <tr>
                    <th>Teacher</th>
                    <th style="width:16%">Actions</th>

                </tr>
                <c:forEach var="teacher" items="${teachers}">
                    <tr>
                        <td>${teacher.fullName}</td>
                        <td>
                            <a href="#" onclick="confirmDelete(${teacher.id})" class="btn btn-danger">Delete</a>
                            <a href="/teacher/update/${teacher.id}" class="btn btn-success">Edit and back</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-primary" href="/" role="button">Back to main site</a>
            <a class="btn btn-danger" href="/power/add" role="button">Force skills choose</a>
        </div>
    </div>
</div>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>