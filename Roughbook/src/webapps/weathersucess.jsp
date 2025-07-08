<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Weather Submission Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        .navbar-success {
          background-color: #90ee90 !important; /* Light green */
        }
        .navbar-success .navbar-brand,
        .navbar-success .nav-link {
          color: #000 !important;
        }
        .success-box {
          margin-top: 5rem;
          padding: 2rem;
          background-color: #f0fff0;
          border: 1px solid #cce5cc;
          border-radius: 1rem;
          box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
          text-align: center;
        }
        .btn-custom {
          background-color: #28a745;
          color: white;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-success">
    <div class="container">
        <a class="navbar-brand" href="#">weather report</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="weather.jsp">Add Another</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="success-box">
                <h2> Weather Data Submitted Successfully!</h2>
                <p class="lead">Thank you for submitting the weather report.</p>
                <a href="weather.jsp" class="btn btn-custom mt-3">Submit Another Report</a>
                <a href="index.jsp" class="btn btn-secondary mt-3 ms-2">Back to Home</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>