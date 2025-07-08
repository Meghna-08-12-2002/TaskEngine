<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Welcome | Form Management App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
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
                <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="Donation.jsp">Donation</a></li>
                <li class="nav-item"><a class="nav-link" href="Laboratory.jsp">Laboratory</a></li>
                <li class="nav-item"><a class="nav-link" href="Feedback.jsp">Feedback</a></li>
                <li class="nav-item"><a class="nav-link" href="FIR.jsp">FIR</a></li>
                <li class="nav-item"><a class="nav-link" href="License.jsp">License</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container my-5">
    <h1 class="text-center mb-4">Welcome to Form Management App</h1>
    <p class="text-center lead mb-5">Select any form below to proceed.</p>

    <div class="row g-4 justify-content-center">
        <div class="col-12 col-md-6 col-lg-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">Donation</h5>
                    <p class="card-text">Add your generous donation details here.</p>
                    <a href="Donation.jsp" class="btn btn-primary">Go to Donation</a>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">Laboratory</h5>
                    <p class="card-text">Manage laboratory test details here.</p>
                    <a href="Laboratory.jsp" class="btn btn-primary">Go to Laboratory</a>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">Feedback</h5>
                    <p class="card-text">Submit your valuable feedback here.</p>
                    <a href="Feedback.jsp" class="btn btn-primary">Go to Feedback</a>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">FIR</h5>
                    <p class="card-text">File your First Information Report here.</p>
                    <a href="FIR.jsp" class="btn btn-primary">Go to FIR</a>
                </div>
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-4">
            <div class="card shadow-sm">
                <div class="card-body text-center">
                    <h5 class="card-title">License</h5>
                    <p class="card-text">Apply for and manage licenses here.</p>
                    <a href="License.jsp" class="btn btn-primary">Go to License</a>
                </div>
            </div>
        </div>
    </div>
</div>

<nav class="navbar fixed-bottom bg-primary-subtle text-black">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">&copy; 2025 Form Management App. All rights reserved.</span>
    </div>
</nav>
</body>
</html>
