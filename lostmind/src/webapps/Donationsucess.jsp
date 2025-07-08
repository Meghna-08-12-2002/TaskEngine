<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Donation Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
<nav class="navbar navbar-dark bg-primary mb-4">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Donation Entry System</a>
        <a class="btn btn-outline-light" href="index.jsp">Home</a>
    </div>
</nav>

<div class="container">
    <h2 class="text-center text-success mb-4">Donation Submitted Successfully!</h2>
    <table class="table table-bordered table-striped w-75 mx-auto">
        <thead class="table-primary">
        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Donor Name</td>
            <td>${donation.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${donation.email}</td>
        </tr>
        <tr>
            <td>Amount</td>
            <td>${donation.amount}</td>
        </tr>
        <tr>
            <td>Message</td>
            <td>${donation.message}</td>
        </tr>
        </tbody>
    </table>
    <p class="text-center fs-5 mt-4">
        Thank you for your generous donation.
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
