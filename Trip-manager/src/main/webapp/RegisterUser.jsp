<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
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
    <div id="loginModal" class="modal">
        <div class="modal-content">
            <form id="loginForm" action="RegistrationServlet" method="post">
                <h2 style="text-align: center;">Register</h2>
                <label for="username">Username :</label>
                <input type="text" id="username" name="username" required>
                <label for="mobileNumber">Mobile Number :</label>
                <input type="text" id="mobileNumber" name="mobileNumber" required>
                <label for="mail">MailId:</label>
                <input type="text" id="mail" name="mail" required>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
                <button type="submit">Verify User</button>
            </form>
        </div>
    </div>



</body>
</html>
