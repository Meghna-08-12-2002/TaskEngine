<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Feedback Confirmation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-dark bg-primary mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Feedback Entry System</a>
        <a class="btn btn-outline-light" href="index.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">Feedback Submitted!</h2>

    <table class="table table-bordered table-striped w-75 mx-auto">
        <thead class="table-primary">
        <tr>
            <th scope="col">Field</th>
            <th scope="col">Value</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Name</td>
            <td>${feedback.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${feedback.email}</td>
        </tr>
        <tr>
            <td>Rating</td>
            <td>${feedback.rating}</td>
        </tr>
        <tr>
            <td>Comments</td>
            <td>${feedback.comments}</td>
        </tr>
        </tbody>
    </table>

    <p class="text-center fs-5 mt-4">
        Thank you for your feedback. We appreciate your input!
    </p>

    <div class="text-center mt-3">
        <a href="Feedback.jsp" class="btn btn-success">Submit Another Feedback</a>
    </div>
</div>

<footer class="navbar fixed-bottom bg-light text-center">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">
            &copy; 2025 Form Management App. All rights reserved.
        </span>
    </div>
</footer>
</body>
</html>
