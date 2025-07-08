function validateHandwashForm() {
    let valid = true;

    const date = document.getElementById("date").value;
    const count = document.getElementById("count").value;
    const soapUsed = document.getElementById("soapUsed").checked;
    const location = document.getElementById("location").value;
    const duration = document.getElementById("duration").value;
    const remarks = document.getElementById("remarks").value;

    clearErrors();

    if (!date) {
        document.getElementById("dateError").innerText = "Date is required";
        valid = false;
    }
    if (count < 0) {
        document.getElementById("countError").innerText = "Count must be non-negative";
        valid = false;
    }
    if (!soapUsed) {
        document.getElementById("soapError").innerText = "Soap must be used";
        valid = false;
    }
    if (location.trim() === "") {
        document.getElementById("locationError").innerText = "Location is required";
        valid = false;
    }
    if (duration < 0) {
        document.getElementById("durationError").innerText = "Duration must be positive";
        valid = false;
    }
    if (remarks && remarks.trim().length < 3) {
        document.getElementById("remarksError").innerText = "Remarks too short";
        valid = false;
    }

    return valid;
}

function validateIdForm() {
    const id = document.getElementById("handwashId").value;
    document.getElementById("idError").innerText = "";

    if (id === "" || parseInt(id) <= 0) {
        document.getElementById("idError").innerText = "Please enter valid positive ID";
        return false;
    }
    return true;
}

function clearErrors() {
    const errors = document.getElementsByClassName("error");
    for (let e of errors) {
        e.innerText = "";
    }
}
