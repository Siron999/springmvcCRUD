<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
    <title>Students</title>
</head>
<body>
<div class="container">
    <h4 class="my-3 text-center">Students</h4>
    <div class="mb-3"><a href='<c:url value='/student/add'></c:url>'>Add Students</a></div>
    <c:if test="${students.size() != 0 }">
        <c:forEach items="${students}" var="s">
            <div class="card mb-1">
                <div class="card-body d-flex flex-row justify-content-between align-items-center">
                    <div><h4><c:out value="${s.name}"></c:out>, <c:out value="${s.address}"></c:out></h4>
                        <p><c:out value="${s.semester}"></c:out></p></div>
                    <div>
                        <a href='<c:url value='/student/edit/${s.id}'></c:url>'>Edit</a>
                        <a href='<c:url value='/student/delete/${s.id}'></c:url>'>Delete</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </c:if>
</div>
</body>
</html>