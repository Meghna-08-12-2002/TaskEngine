<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Furniture details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.html">Furniture</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<div style="display: flex; justify-content: center; align-items: center; height: 100vh;">
    <div align="center" style="border: 2px solid #000; padding: 20px; width: 400px; border-radius: 10px;">
    <form method="post">
<h1>Furniture details</h1>
    Brand: <input type="text" placeholder="Enter the brand" name="brand"/><br><br>
        Size:<select class="custom-select" id="size" name="size">
            <option value="">open to select option</option>
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
            <option value="4">Four</option>
        </select><br><br>
        Material  : <input type="text" name="material" placeholder="Enter materials" required /><br><br>
       Model Name : <input type="text" name="modelname" placeholder="Enter model name" required /><br><br>
         Product Benefits : <input type="text" name="productbenefits" placeholder="Enter the product benefits" required /><br><br>

        <button type="Submit" class="btn btn-primary">Save</button>
</form>
    </div>
</div>
</body>
</html>