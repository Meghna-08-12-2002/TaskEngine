<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>StampedeCase Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        body {
            background: #f8f9fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        header .navbar {
            background-color: #343a40 !important;
        }
        header .navbar-brand,
        header .nav-link {
            color: #ffffff !important;
            font-weight: 600;
        }
        header .nav-link.active {
            color: #ffc107 !important;
        }
        main.container {
            background: white;
            padding: 2rem;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        }
        h2.fs-1 {
            font-weight: 700;
            color: #212529;
            margin-bottom: 1.5rem;
        }
        p.text-danger {
            font-weight: 500;
            min-height: 1.5rem;
        }
        label.form-label {
            font-weight: 600;
            color: #495057;
        }
        .btn-primary {
            background-color: #0d6efd;
            border-color: #0d6efd;
            font-weight: 600;
            padding: 0.5rem 1.5rem;
            border-radius: 50px;
        }
        .btn-primary:hover {
            background-color: #0b5ed7;
            border-color: #0a58ca;
        }
        footer.navbar {
            font-size: 0.9rem;
            background-color: #e9ecef !important;
        }
    </style>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">StampedeCase</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<h1 class="text-center mt-3">${messageF}</h1>

<main class="container my-3 col-md-6">
    <h2 class="fs-1 text-center">Form</h2>
    <p class="fs-6 text-center text-danger">${message}</p>

    <form action="case" method="POST">
        <div class="container my-5 col-md-6">
            <div class="mb-3">
                <label class="form-label">Event</label>
                <input type="text" name="event" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">No of deaths</label>
                <input type="number" name="deaths" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">No of injuries</label>
                <input type="number" name="injuries" class="form-control" required />
            </div>
            <div class="mb-3">
                <label class="form-label">Location</label>
                <input type="text" name="location" class="form-control" required />
            </div>
            <button type="submit" class="btn btn-primary">File Case</button>
        </div>
    </form>
</main>

<nav class="navbar fixed-bottom bg-primary-subtle text-black">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">
            &copy; 2025 Form Management App. All rights reserved.
        </span>
    </div>
</nav>

</body>
</html>
