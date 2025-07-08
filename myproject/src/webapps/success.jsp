
<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
    <style>
        body {
            font-family: Arial;
            background: #e6ffe6;
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
            text-align: center;
            padding: 30px;
        }
        table {
            margin: auto;
            border-collapse: collapse;
            background-color: #ffffff;
            box-shadow: 0 0 8px rgba(0, 0, 0, 0.1);
        }
        td {
            padding: 10px 20px;
            border: 1px solid #ccc;
            font-size: 14px;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            padding: 10px 20px;
            border-radius: 4px;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="navbar">
    <h1>Handwash Tracker</h1>
    <div>
        <a href="index.jsp">Home</a>
        <a href="handwash.jsp">Add Record</a>
        <a href="handwashdetail.jsp">Find Record</a>
    </div>
</div>
<div class="container">
    <h2>Handwash Record Saved Successfully</h2>
    <table>
        <tr><td>Date</td><td><%= dto.getDate() %></td></tr>
        <tr><td>Count</td><td><%= dto.getCount() %></td></tr>
        <tr><td>Soap Used</td><td><%= dto.isSoapUsed() %></td></tr>
        <tr><td>Location</td><td><%= dto.getLocation() %></td></tr>
        <tr><td>Duration</td><td><%= dto.getDuration() %></td></tr>
        <tr><td>Remarks</td><td><%= dto.getRemarks() %></td></tr>
    </table>
    <br>
    <a href="index.jsp">Go Back Home</a>
</div>
</body>
</html>
