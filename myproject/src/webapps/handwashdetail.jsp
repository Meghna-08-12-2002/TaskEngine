<!DOCTYPE html>
<html>
<head>
    <title>Find Handwash by ID</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script><script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #007bff;
            padding: 15px;
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .navbar h1 {
            margin: 0;
            font-size: 20px;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            margin-left: 20px;
            font-weight: bold;
        }

        .navbar a:hover {
            text-decoration: underline;
        }

        .container {
            width: 400px;
            margin: 50px auto;
            background-color: #ffffff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            color: #333;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            margin-top: 15px;
            font-weight: bold;
        }

        input[type="number"] {
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-top: 5px;
            font-size: 14px;
        }

        input[type="submit"] {
            margin-top: 20px;
            padding: 10px;
            background-color: #28a745;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #218838;
        }

        .error {
            color: red;
            font-size: 12px;
            margin-top: 4px;
        }
    </style>
    <script src="script.js"></script>
</head>
<body>

<div class="navbar">
    <h1>Handwash Tracker</h1>
    <div>
        <a href="index.jsp">Home</a>
    </div>
</div>

<div class="container">
    <h2>Find Handwash Record by ID</h2>
    <form action="handwash" method="get" onsubmit="return validateIdForm()">
        <label>Enter ID:</label>
        <input type="number" name="handwashId" id="handwashId" />
        <span class="error" id="idError"></span>
        <input type="submit" value="Search" />
    </form>
</div>
</body>
</html>
