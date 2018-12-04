<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Confirmation</title>
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

    <h3 class="header">Confirmation</h3>

    <div class="card">
        <div class="card-body">

            <div>
                Gratulations, all your chooices were good and proper, now you can prepare to your class.
                Soon you will become a Jedi!!!
            </div>

            </table>
            <a class="btn btn-primary" href="/" role="button"> Back to main site</a>

        </div>
    </div>
</div>
<footer class="container-fluid text-center">
    <p>Created by: Bartosz Szymborski - 2018</p>
</footer>
</body>
</html>