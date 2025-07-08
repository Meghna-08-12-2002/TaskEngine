<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Product Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <style>
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
    box-shadow: 0 4px 12px rgb(0 0 0 / 0.1);
  }

  h2.fs-1 {
    font-weight: 700;
    color: #212529;
    margin-bottom: 1.5rem;
  }

  p.text-danger {
    font-weight: 500;
    min-height: 1.5rem; /* keeps space even if no message */
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

    </style>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-primary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Products</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
<h1>${messageF}</h1>
<main class="container my-3 col-md-6">
    <h2 class="fs-1 text-center">Products Form</h2>
    <p class="fs-6 text-center text-danger">${message}</p>
    <form action="product" method="POST">
        <div class="container my-5 col-md-6">
                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" name="name" class="form-control" required />
                </div>

                <div class="mb-3">
                    <label class="form-label">Type</label>
                    <select name="type" class="form-select" required>
                        <option value="">-- Select Type --</option>
                        <option value="Electronics">Electronics</option>
                        <option value="Clothing">Clothing</option>
                        <option value="Furniture">Furniture</option>
                        <option value="Food">Food</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Incoming Price</label>
                    <input type="number" step="0.01" name="incomingprice" class="form-control" required />
                </div>

                <div class="mb-3">
                    <label class="form-label">Selling Price</label>
                    <input type="number" step="0.01" name="sellingprice" class="form-control" required />
                </div>

                <div class="mb-3">
                    <label class="form-label">MRP</label>
                    <input type="number" step="0.01" name="MRP" class="form-control" required />
                </div>

                <div class="mb-3">
                    <label class="form-label">Description</label>
                    <textarea name="description" rows="3" class="form-control"></textarea>
                </div>

                <div class="mb-3">
                    <label class="form-label">Brand</label>
                    <input type="text" name="brand" class="form-control" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Quantity</label>
                    <input type="text" name="quality" class="form-control"  />
                </div>

                <div class="mb-3">
                    <label class="form-label">Color</label>
                    <select name="color" class="form-select">
                        <option value="">-- Select Color --</option>
                        <option value="Red">Red</option>
                        <option value="Blue">Blue</option>
                        <option value="Green">Green</option>
                        <option value="Black">Black</option>
                        <option value="White">White</option>
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Weight (kg)</label>
                    <input type="number" step="0.01" name="weight" class="form-control" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Manufacture Date</label>
                    <input type="date" name="manufdate" class="form-control" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Warranty</label>
                    <select name="warranty" class="form-select">
                        <option value="">-- Select Warranty --</option>
                        <option value="No Warranty">No Warranty</option>
                        <option value="6 Months">6 Months</option>
                        <option value="1 Year">1 Year</option>
                        <option value="2 Years">2 Years</option>
                    </select>
                </div>

                <div class="mb-3 form-check">
                    <input type="checkbox" name="returnpolicy" value="Returnable" class="form-check-input" id="returnPolicyCheck" />
                    <label class="form-check-label" for="returnPolicyCheck">Return Policy</label>
                </div>

                <button type="submit" class="btn btn-primary">Submit Product</button>
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
<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"
></script>

</body>
</html>












