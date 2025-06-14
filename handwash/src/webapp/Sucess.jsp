<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
    <style>
        body {
            font-family: Arial;
            background: #e1fbe1;
            text-align: center;
            padding-top: 100px;
        }
        h2 {
            color: #28a745;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background: #28a745;
            color: white;
            padding: 10px 15px;
        }
    </style>
</head>
<body>
<h2>Hand Wash details saved successfully!</h2>
<a href="Handwash.jsp">Add another record</a>
<p class="text-center pt-3 text-success">${message}</p>
<div
        class="container d-flex justify-content-center align-items-center mt-3 w-50"
>
    <table class="table table-info table-striped table-border border-black">
        <tbody>
        <tr>
            <th scope="col">Date</th>
            <td>${handwashDto.date}</td>
        </tr>
        <tr>
            <th scope="col">Count</th>
            <td>${handwashDto.count}</td>
        </tr>
        <tr>
            <th scope="col">SoapUsed</th>
            <td>${handwashDto.soapUsed}</td>
        </tr>
        <tr>
            <th scope="col">Location</th>
            <td>${handwashDto.location}</td>
        </tr>
        <tr>
            <th scope="col">Duration</th>
            <td>${handwashDto.duration}</td>
        </tr>
        <tr>
            <th scope="col">Remarks</th>
            <td>${handwashDto.remarks}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
