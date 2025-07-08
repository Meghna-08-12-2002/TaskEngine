<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Submission Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
    <div class="container">
        <a class="navbar-brand" href="#">StampedeCase</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavSuccess" aria-controls="navbarNavSuccess" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavSuccess">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="StampedeCase.jsp">Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<a href="StampedeCase.jsp" class="btn btn-outline-primary position-absolute top-0 start-0 m-2">Back to Form</a>

<div class="container text-center mt-5 pt-5">
    <div class="card shadow p-4 border-success">
        <h2 class="text-success mb-3">Submitted Successfully!</h2>
        <table class="table table-hover table-bordered border-primary">
            <thead>
            <tr class="table-primary">
                <th>Event</th>
                <th>No of deaths</th>
                <th>No of injuries</th>
                <th>Location</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${stampedeCaseDto.event}</td>
                <td>${stampedeCaseDto.deaths}</td>
                <td>${stampedeCaseDto.injuries}</td>
                <td>${stampedeCaseDto.location}</td>
            </tr>
            </tbody>
        </table>
        <p class="fs-5">Your details have been successfully submitted.</p>
    </div>
</div>

<nav class="navbar fixed-bottom bg-primary-subtle text-black">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">&copy; 2025 Form Management App. All rights reserved.</span>
    </div>
</nav>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>
