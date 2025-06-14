<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Handwash Form</title>
  <style>
    .error {
      color: red;
      font-size: 0.9em;
      display: block;
      margin-top: 2px;
    }
  </style>
</head>
<body>

  <form id="handwashForm">
    <label>Date:</label>
    <input type="date" id="date" />
    <span class="error" id="dateError"></span>

    <label>Count:</label>
    <input type="number" id="count" />
    <span class="error" id="countError"></span>

    <label>Soap Used:</label>
    <input type="checkbox" id="soapUsed" />
    <span class="error" id="soapError"></span>

    <label>Location:</label>
    <input type="text" id="location" />
    <span class="error" id="locationError"></span>

    <label>Duration (minutes):</label>
    <input type="number" id="duration" />
    <span class="error" id="durationError"></span>

    <label>Remarks:</label>
    <input type="text" id="remarks" />
    <span class="error" id="remarksError"></span>

    <button type="submit">Submit</button>
  </form>

  <!-- 🔽 Add the script here -->
  <script>
    document.querySelector("#handwashForm").addEventListener("submit", function (e) {
      document.querySelectorAll(".error").forEach((el) => (el.textContent = ""));

      const isValid =
        validateDate() &&
        validateCount() &&
        validateSoapUsed() &&
        validateLocation() &&
        validateDuration() &&
        validateRemarks();

      if (!isValid) {
        e.preventDefault();
      }
    });

    function validateDate() {
      const date = document.querySelector("#date").value.trim();
      if (date === "") {
        document.querySelector("#dateError").textContent = "Date is required";
        return false;
      }
      const today = new Date();
      today.setHours(0, 0, 0, 0);
      const [year, month, day] = date.split("-").map(Number);
      const selectedDate = new Date(year, month - 1, day);

      if (selectedDate >= today) {
        document.querySelector("#dateError").textContent =
          "Date should be in the past";
        return false;
      }

      return true;
    }

    function validateCount() {
      const count = parseInt(document.querySelector("#count").value.trim(), 10);
      if (isNaN(count) || count < 0) {
        document.querySelector("#countError").textContent =
          "Count must be a non-negative number";
        return false;
      }
      return true;
    }

    function validateSoapUsed() {
      const soapUsed = document.querySelector("#soapUsed").checked;
      if (!soapUsed) {
        document.querySelector("#soapError").textContent = "Soap must be used";
        return false;
      }
      return true;
    }

    function validateLocation() {
      const location = document.querySelector("#location").value.trim();
      if (location === "") {
        document.querySelector("#locationError").textContent = "Location is required";
        return false;
      }
      return true;
    }

    function validateDuration() {
      const duration = parseInt(document.querySelector("#duration").value.trim(), 10);
      if (isNaN(duration) || duration < 0) {
        document.querySelector("#durationError").textContent =
          "Duration must be a non-negative number";
        return false;
      }
      return true;
    }

    function validateRemarks() {
      const remarks = document.querySelector("#remarks").value.trim();
      if (remarks.length > 0 && remarks.length < 3) {
        document.querySelector("#remarksError").textContent =
          "Remarks must be at least 3 characters";
        return false;
      }
      return true;
    }
  </script>

</body>
</html>
