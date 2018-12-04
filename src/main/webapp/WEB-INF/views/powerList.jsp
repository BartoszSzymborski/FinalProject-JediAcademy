<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Power list</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/main.css" rel="stylesheet">
    <script>
        function confirmDelete(id, text) {
            if (confirm("You don't be a jedi want to, hmm?   \"" + text+ "\"")) {
                window.location.href = "/power/delete/" + id;
            }
        }
    </script>
</head>
<body>
<div class="container">

    <h3 class="header">List of powers</h3>

    <div class="card">
        <div class="card-body">

            <table class="table table-hover">
                <tr>
                    <th>Power</th>
                    <th style="width:16%">Actions</th>

                </tr>
                <c:forEach var="power" items="${powers}">
                    <tr>
                        <td>${power.text}</td>
                        <td>
                            <a href="#" onclick="confirmDelete(${power.id})" class="btn btn-danger">Delete</a>
                            <a href="/power/update/${power.id}" class="btn btn-success">Edit and back</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-primary" href="/" role="button">Back to main site</a>
            <a class="btn btn-danger" href="/allChoose" role="button">Confirmation</a>
        </div>
    </div>
</div>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>