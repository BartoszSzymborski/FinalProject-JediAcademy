<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Opinion</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <script>
        function confirmDelete(id, text) {
            if (confirm("You don't be a jedi want to, hmm?   \"" + text + "\"")) {
                window.location.href = "/opinion/delete/" + id;
            }
        }
    </script>
</head>
<body>
<div class="container">

    <h3 class="header">Opinion list</h3>
        Your opinion bas been added
    <div class="card">
        <div class="card-body">

            <table class="table table-hover">
                <tr>
                    <th>Text</th>
                    <th style="width:16%">Actions</th>

                </tr>
                <c:forEach var="opinion" items="${opinions}">
                    <tr>
                        <td>${opinion.text}</td>
                        <td>
                            <a href="#" onclick="confirmDelete(${opinion.id})" class="btn btn-danger">Delete</a>
                            <a href="/opinion/update/${opinion.id}" class="btn btn-success">Edit and back</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-primary" href="/" role="button">Back to main site</a>
        </div>
    </div>
</div>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>