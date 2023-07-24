<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
    <title>Add Students</title>
</head>
<body>
<div class="container">
    <h4 class="my-3 text-center">Edit Student</h4>
    <form:form action="/practice/student/edit" method="post" modelAttribute="student">
        <div class="form-group mb-3" style="display: none">
            <label for="name" class="form-label">Full Name</label>
            <form:input type="number" cssClass="form-control" path="id" id="id"/>
        </div>
        <div class="form-group mb-3">
            <label for="name" class="form-label">Full Name</label>
            <form:input type="text" cssClass="form-control" path="name" id="name"/>
        </div>
        <div class="form-group mb-3">
            <label for="address" class="form-label">Address</label>
            <form:input type="text" cssClass="form-control" path="address" id="address"/>
        </div>
        <div class="form-group mb-3">
            <label for="semester" class="form-label">Semester</label>
            <form:input type="text" cssClass="form-control" path="semester" id="semester"/>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>

    </form:form>
</div>

</body>
</html>