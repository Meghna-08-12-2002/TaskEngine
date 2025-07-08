<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>FIR Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-primary navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Xworkz</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="FIR.jsp">FIR</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <form action="fir" method="post" class="border p-4 shadow w-50 mx-auto">
        <h2 class="text-center mb-4">FIR Details</h2>

        <div class="mb-3">
            <label class="form-label">Complainant Name:</label>
            <input type="text" class="form-control" name="complainantName" placeholder="Enter your name" required />
        </div>

        <div class="mb-3">
            <label class="form-label">Crime Type:</label>
            <input type="text" class="form-control" name="crimeType" placeholder="e.g., Theft, Assault" required />
        </div>

        <div class="mb-3">
            <label class="form-label">Date of Incident:</label>
            <input type="date" class="form-control" name="date" required />
        </div>

        <div class="mb-3">
            <label class="form-label">Location:</label>
            <input type="text" class="form-control" name="location" placeholder="Enter incident location" required />
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-primary">Submit FIR</button>
        </div>
    </form>
</div>

<nav class="navbar fixed-bottom bg-primary-subtle text-black">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">
            &copy; 2025 FIR Management App. All rights reserved.
        </span>
    </div>
</nav>

</body>
</html>
