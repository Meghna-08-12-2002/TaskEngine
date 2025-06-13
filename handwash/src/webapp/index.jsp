<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Handwash Report</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

    <style>
        body {
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
          background: linear-gradient(to right, #e6f9e6, #f0fff0); /* Light green gradient */
          min-height: 100vh;
          margin: 0;
        }

        .navbar-custom {
          background-color: #7ed957; /* Fresh green */
          box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }

        .navbar-custom .navbar-brand,
        .navbar-custom .nav-link {
          color: #212529 !important;
          font-weight: 500;
        }

        .navbar-custom .nav-link:hover {
          text-decoration: underline;
        }

        h1 {
          margin-top: 40px;
          font-weight: 600;
          color: #2e5a2e;
          text-shadow: 1px 1px #d6f5d6;
        }

        .center-button {
          margin-top: 30px;
        }

        .btn-custom {
          background-color: #28a745;
          border: none;
          padding: 12px 30px;
          font-size: 16px;
          border-radius: 8px;
        }

        .btn-custom:hover {
          background-color: #218838;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container">
        <a class="navbar-brand" href="#">Handwash Report</a>
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
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Handwash Form</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="container text-center">
    <h1>Welcome to the handwash Report Web Application</h1>
    <div class="center-button">
        <a class="btn btn-custom" href="Handwash.jsp" role="button">Handwash Details</a>
    </div>
</div>

</body>
</html>
