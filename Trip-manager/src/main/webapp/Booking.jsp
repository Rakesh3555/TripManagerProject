<!DOCTYPE html>
<html lang="en">
  
<style>
  form {
      display: flex;
      flex-direction: column;
  }

  form label {
      margin-top: 10px;
  }

  form input {
      padding: 10px;
      margin-top: 5px;
      font-size: 16px;
  }

  form button {
      padding: 10px;
      margin-top: 20px;
      font-size: 16px;
      cursor: pointer;
  }

  .modal {
      position: fixed;
      z-index: 1;
      left: 0;
      top: 0;
      width: 100%;
      height: 100%;
      overflow: auto;
      background-color: rgba(0, 0, 0, 0.4);
  }

  .modal-content {
      background-color: #fefefe;
      margin: 15% auto;
      padding: 20px;
      border: 1px solid #888;
      width: 80%;
      max-width: 400px;
  }
  
</style>
</head>
<body>
<% HttpSession sessio = request.getSession();

	String tripName = (String) sessio.getAttribute("TripType");
   System.out.println("tripName + " + tripName);
%>
<div id="loginModal" class="modal">
  <div class="modal-content">
      <form id="bookingMala" action="BookingServlet" method="post">
          <h2 style="text-align: center;"> <%= tripName %> </h2>
          <label for="fromDate">From Date :</label>
          <input type="date" id="from_Date" name="fromDate" min="2024-07-01" required>
          <label for="toDate">To Date :</label>
          <input type="date" id="toDate" name="toDate" min="2024-07-01" required>
          <label for="no_Of_Adults">Number Of Adults :</label>
          <input type="number" id="no_Of_Adults" name="no_Of_Adults" required>
          <label for="no_Of_Childrens">Number Of childrens :</label>
          <input type="number" id="no_Of_Childrens" name="no_Of_Childrens" required>
          <label for="flight_Option">Include Flight</label>
          <input type="radio" id="flight_Option" name="flight_Option" style="margin-right: 40%; margin-top: -15px;">
          <label for="flight_Option">Exclude Flight</label>
          <input type="radio" id="flight_Option" name="flight_Option" style="margin-right: 40%; margin-top: -15px;">
          <button type="submit">Proceed</button>
      </form>
  </div>
</div>

<script>
  function handleSubmit() {
    var includeFlight = document.getElementById("include_Flight").checked;
    if (includeFlight) {
      window.location.href = "";
    } else {
      window.location.href = "";
    }
    return false;
  }
</script>



</body>
</html>