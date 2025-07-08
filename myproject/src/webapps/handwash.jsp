<!DOCTYPE html>
<html>
<head>
    <title>Handwash Entry</title>
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

        input[type="text"],
        input[type="date"],
        input[type="number"],
        textarea {
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-top: 5px;
            font-size: 14px;
        }

        textarea {
            resize: vertical;
        }

        input[type="checkbox"] {
            margin-top: 10px;
        }

        input[type="submit"] {
            margin-top: 20px;
            padding: 10px;
            background-color: #007bff;
            color: white;
            font-size: 16px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
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
        <a href="handwashdetail.jsp">Find by ID</a>
        <a href="success.jsp">Success Page</a>
    </div>
</div>

<div class="container">
    <h2>Enter Handwash Details</h2>
    <form id="handwashForm" action="handwash" method="post" onsubmit="return validateHandwashForm()">
        <label>Date:</label>
        <input type="date" name="date" id="date" />
        <span class="error" id="dateError"></span>

        <label>Count:</label>
        <input type="number" name="count" id="count" />
        <span class="error" id="countError"></span>

        <label>Soap Used:</label>
        <input type="checkbox" name="soapUsed" id="soapUsed" />
        <span class="error" id="soapError"></span>

        <label>Location:</label>
        <input type="text" name="location" id="location" />
        <span class="error" id="locationError"></span>

        <label>Duration (min):</label>
        <input type="number" name="duration" id="duration" />
        <span class="error" id="durationError"></span>

        <label>Remarks:</label>
        <textarea name="remarks" id="remarks"></textarea>
        <span class="error" id="remarksError"></span>

        <input type="submit" value="Save" />
    </form>
</div>
</body>
</html>
