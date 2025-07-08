<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Forms</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT"
            crossorigin="anonymous"
    />
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-primary-subtle text-success">
        <div class="container-fluid">
            <button
                    class="navbar-toggler"
                    type="button"
                    data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent"
                    aria-expanded="false"
                    aria-label="Toggle navigation"
            >
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index.jsp"
                        >Home</a
                        >
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Donation.jsp">Donation</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="FIR.jsp">FIR</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="License.jsp">License</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="FeedBack.jsp">FeedBack</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Laboratory.jsp">Laboratory</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input
                            class="form-control me-2"
                            type="search"
                            placeholder="Search"
                            aria-label="Search"
                    />
                    <button class="btn btn-outline-success" type="submit">
                        Search
                    </button>
                </form>
            </div>
        </div>
    </nav>
</header>

<main class="container my-5">
    <h1 class="fs-1 text-center">Welcome to Form Filling</h1>
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
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.min.js"
        integrity="sha384-RuyvpeZCxMJCqVUGFI0Do1mQrods/hhxYlcVfGPOfQtPJh0JCw12tUAZ/Mv10S7D"
        crossorigin="anonymous"
></script>
</body>
</html>