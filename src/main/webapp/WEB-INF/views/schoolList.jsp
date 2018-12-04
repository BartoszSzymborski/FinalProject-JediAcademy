<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
    <link href='<c:url value="../css/bootstrap.min.css"/>' rel="stylesheet">
    <link href='<c:url value="../css/main.css"/>' rel="stylesheet">


    <script>
        function confirmDelete(id, fullInformation) {
            if (confirm("You don't be a jedi want to, hmm? "+ fullInformation+ "\"")) {
                window.location.href = "/school/delete/" + id;
            }
        }
    </script>
</head>
<body>
<div class="container">

    <h3 class="header">Jedi treening list</h3>

    <div class="card">
        <div class="card-body">

            <table class="table table-hover">
                <tr>
                    <th>Day</th>
                    <th>Time[hours]</th>
                    <th>lightSaber</th>
                    <th style="width:16%">Actions</th>

                </tr>
                <c:forEach var="school" items="${schools}">
                    <tr>
                        <td>${school.day}</td>
                        <td>${school.hour}</td>
                        <td>${school.lightSaber}</td>
                        <td>${school.id}</td>


                        <td>
                            <a href="#" onclick="confirmDelete(${school.id})" class="btn btn-danger">Delete</a>
                            <a href="/school/update/${school.id}" class="btn btn-success">Edit and back</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-primary" href="/" role="button">To main site you go</a>
            <a class="btn btn-secondary" href="/teacher/add" role="button">Fight form choose you must</a>


        </div>
    </div>
</div>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>