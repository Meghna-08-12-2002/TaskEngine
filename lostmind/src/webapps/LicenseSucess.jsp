<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>License Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-dark bg-primary mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">License Entry System</a>
        <a class="btn btn-outline-light" href="index.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">License Details Submitted!</h2>
    <table class="table table-bordered table-striped w-75 mx-auto">
        <thead class="table-primary">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Type</td>
            <td>${license.type}</td>
        </tr>
        <tr>
            <td>Holder Name</td>
            <td>${license.holderName}</td>
        </tr>
        <tr>
            <td>Issue Date</td>
            <td>${license.issueDate}</td>
        </tr>
        <tr>
            <td>Expiry Date</td>
            <td>${license.expiryDate}</td>
        </tr>
        </tbody>
    </table>
    <p class="text-center fs-5 mt-4">
        Your license information has been successfully saved.
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
