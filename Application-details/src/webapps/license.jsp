<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>License details</title>
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
                    <a class="nav-link active" aria-current="page" href="index.html">License</a>
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
    <form action="app" method="post">
<h1>License Details</h1>
    License Number: <input type="text" name="licenseNo" placeholder="Enter license number" /><br><br>
      Issued Date: <input type="date" name="issuedDate" /><br><br>
      Expiry Date: <input type="date" name="expiryDate" /><br><br>
      License Type: <input type="text" name="licenseType" placeholder="Enter license type" /><br><br>
      <input type="submit" value="Submit License Details" />
</form>
    </div>
</div>
<h1>Thanks for donating, Please donate again next month! </h1>
</body>
</html>