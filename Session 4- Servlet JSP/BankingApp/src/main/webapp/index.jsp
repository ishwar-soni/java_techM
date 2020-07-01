<html>
<head>
    <title>Welcome to ADHDFC bank! </title>
</head>
<body>
<h1>AHDFC Bank</h1>
<h2> Create new account </h2>
<form>
    <div>
        <h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>

        <label for="name"><b>Name</b></label>
        <input type="text" placeholder="Enter Name" name="name" id="name" required>
        <br>
        <br>
        <label for="name"><b>Account Number</b></label>
        <input type="text" placeholder="Account Number" name="accountNumber" id="accountNumber" required>
        <br>
        <br>
        <label for="name"><b>Pin</b></label>
        <input type="text" placeholder="Enter Pin" name="pin" id="pin" required>
        <br>
        <br>
        <label for="name"><b>Initial Balance</b></label>
        <input type="text" placeholder="Enter Initial Balance" name="currentBalance" id="currentBalance" required>
        <br>
        <br>

        <label for="accountType">Choose account type :</label>
        <select id="accountType">
            <option value="SavingsAccount">Savings Account</option>
            <option value="CurrentAccount">Current Account</option>
        </select>
        <br>
        <br>

        <label for="email"><b>Email</b></label>
        <input type="email"  placeholder="Enter Email" name="email" id="email" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

        <label for="psw-repeat"><b>Repeat Password</b></label>
        <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
        <hr>

        <p>By creating an account you agree to our <a href="servlet">Terms & Privacy</a>.</p>
        <button type="submit" >Register</button>
    </div>

    <div>
        <p>Already have an account? <a href="#">Sign in</a>.</p>
    </div>
</form>

    <div>
        <%
            int a = 3;
            int b = 4;
            int c = a + b;
            out.println("c = " + c);
            session.setAttribute("user", "sandeep");
            out.println(session.getAttribute("user"));

        %>
    </div>
</body>
</html>

