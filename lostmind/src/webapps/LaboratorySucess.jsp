<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Laboratory Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-dark bg-primary mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Laboratory Entry System</a>
        <a class="btn btn-outline-light" href="index.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">Laboratory Details Submitted!</h2>
    <table class="table table-bordered table-striped w-75 mx-auto">
        <thead class="table-primary">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Lab Name</td>
            <td>${lab.name}</td>
        </tr>
        <tr>
            <td>Location</td>
            <td>${lab.location}</td>
        </tr>
        <tr>
            <td>Technician</td>
            <td>${lab.technician}</td>
        </tr>
        <tr>
            <td>Type</td>
            <td>${lab.type}</td>
        </tr>
        </tbody>
    </table>
    <p class="text-center fs-5 mt-4">
        Your laboratory information has been successfully saved.
    </p>
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
