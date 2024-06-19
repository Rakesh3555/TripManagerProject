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
  .form-control {
    width: 94%;
}

</style>
</head>
<body>
<% 
	HttpSession amountSession = request.getSession();
	int totalAmount = (int) amountSession.getAttribute("packagePriceSession");
%>
<div id="loginModal" class="modal">
  <div class="modal-content">
      <form id="dynamicForm" action="Adduser" method="post">
          <b style="font-weight: 200;text-align: center;"><%= totalAmount %> is your total amount which includes hotel and site-seeing and include flight charges . </b>
          <div class="form-group">
            <input type="text" name="textBox[]" class="form-control">
        </div>
        <button type="button" class="add-button" onclick="addTextBox()">Add Another Box</button>
        <br><br>
        <button type="submit">Submit</button>
    </form>
  </div>
</div>


<script>

function addTextBox() {
    
    var newDiv = document.createElement("div");
    newDiv.className = "form-group";

    
    var newInput = document.createElement("input");
    newInput.type = "text";
    newInput.name = "textBox[]"; 
    newInput.className = "form-control";

    
    newDiv.appendChild(newInput);

    
    document.getElementById("dynamicForm").appendChild(newDiv);
}
</script>


</body>
</html>