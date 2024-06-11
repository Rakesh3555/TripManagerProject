<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<style>
.modal {
	display: none;
	position: fixed;
	z-index: 1;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	overflow: auto;
	background-color: rgb(0, 0, 0);
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
</style>
<body>
	<% HttpSession sessio = request.getSession();
int opt=(int)request.getAttribute("otp");
	
		String mail = (String) sessio.getAttribute("email");
	%>

</html>
<div class="modal-content">
	<form id="loginForm" action="ValidateOtp" method="post">
		<h2 style="text-align: center;">E-Mail Verification</h2>

		<p>
			<%= mail %>, OTP has been send to this mailID please enter your OTP.
		</p>
<input type="hidden" value="<%= opt %>" name="checkotp">
		
			<label for="valOtp">Enter Otp :</label> 
			<input type="text" id="valOtp" name="valOtp" required>

		<button type="submit">Verify</button>
	</form>
</div>

<script>
  
  const urlParams = new URLSearchParams(window.location.search);
  if (urlParams.has('invalid')) {
      
      document.title = "Invalid OTP! Please try again.";
  }
  
  </script>

</body>


