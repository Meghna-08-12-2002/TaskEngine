<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Feedback Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" />
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
                    <a class="nav-link active" href="Feedback.jsp">Feedback</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <form action="feedbackAction" method="post" class="border p-4 shadow w-50 mx-auto">
        <h2 class="text-center mb-4">Feedback Form</h2>
        <div class="mb-3">
            <label class="form-label">Name:</label>
            <input type="text" class="form-control" name="name" placeholder="Enter your name" required />
        </div>
        <div class="mb-3">
            <label class="form-label">Email:</label>
            <input type="email" class="form-control" name="email" placeholder="Enter your email" required />
        </div>
        <div class="mb-3">
            <label class="form-label">Rating:</label>
            <select class="form-select" name="rating" required>
                <option value="">Select rating</option>
                <option value="1">1 - Very Poor</option>
                <option value="2">2 - Poor</option>
                <option value="3">3 - Average</option>
                <option value="4">4 - Good</option>
                <option value="5">5 - Excellent</option>
            </select>
        </div>
        <div class="mb-3">
            <label class="form-label">Comments:</label>
            <textarea class="form-control" name="comments" rows="4" placeholder="Enter your comments"></textarea>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Submit Feedback</button>
        </div>
    </form>
</div>

<nav class="navbar fixed-bottom bg-primary-subtle text-black">
    <div class="container-fluid justify-content-center">
        <span class="navbar-text">
            &copy; 2025 Form Management App. All rights reserved.
        </span>
    </div>
</nav>
</body>
</html>
