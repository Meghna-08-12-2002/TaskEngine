<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Hand Wash Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

    <style>
        body {
          font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
          background: linear-gradient(to right, #e6f9e6, #f0fff0);
          min-height: 100vh;
        }

        .navbar-custom {
          background-color: #7ed957;
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

        .form-container {
          max-width: 500px;
          margin: 50px auto;
          background: #fff;
          padding: 30px;
          border-radius: 12px;
          box-shadow: 0 0 15px rgba(0,0,0,0.1);
        }

        h3 {
          color: #2e5a2e;
          font-weight: 600;
          margin-bottom: 25px;
          text-align: center;
        }

        .btn-custom {
          background-color: #28a745;
          color: white;
          border: none;
        }

        .btn-custom:hover {
          background-color: #218838;
        }
    </style>
</head>
<body>

<!-- Navbar -->
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
                    <a class="nav-link" href="index.jsp">Back</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Handwash Form -->
<div class="container">
    <div class="form-container">
        <form action="welcome" method="post">
            <p class="text-center pt-3 text-danger">${message}</p>
            <h3>Hand Wash Entry</h3>

            <div class="mb-3">
                <label class="form-label">Handwash Material</label>
                <input type="text" name="handwashId" class="form-control" required placeholder="Enter Handwash Id"/>
            </div>

               <button type="submit" class="btn btn-custom w-100">Submit</button>
        </form>
    </div>
</div>

</body>
</html>
