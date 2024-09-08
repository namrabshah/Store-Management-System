<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
    }

    body {
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        background: url('file:///D:/Eclipse/practice11/Img/login1.jpg') no-repeat;
        background-size: cover;
        background-position: center;
        color: #f0f0f0;
    }

    .wrapper {
        width: 420px;
        background: rgba(0, 0, 0, 0.7); /* Darker transparent background */
        border: 2px solid rgba(255, 255, 255, 0.2);
        backdrop-filter: blur(20px);
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.5); /* Stronger shadow for depth */
        color: white;
        border-radius: 10px;
        padding: 30px 40px;
    }

    .wrapper h1 {
        font-size: 36px;
        text-align: center;
        margin-bottom: 20px;
        color: #f8f8f8;
        font-weight: 700;
    }

    .input-box {
        width: 100%;
        height: 50px;
        margin: 30px 0;
        position: relative;
    }

    .input-box input {
        width: 100%;
        height: 100%;
        background: transparent;
        border: none;
        outline: none;
        border: 2px solid rgba(255, 255, 255, 0.4);
        border-radius: 16px;
        color: #f8f8f8;
        padding: 20px;
        font-size: 16px;
    }

    .input-box input::placeholder {
        color: #bbb; /* Light placeholder text */
    }

    .input-box i {
        position: absolute;
        right: 20px;
        top: 50%;
        transform: translateY(-50%);
        font-size: 20px;
        color: #bbb; /* Light icon color */
    }

    .wrapper .remember-forgot {
        display: flex;
        justify-content: space-between;
        font-size: 14.5px;
        margin: 5px 15px -20px;
        margin-left: auto;
    }

    .remember-forgot label input {
        accent-color: white;
        margin-right: 3px;
    }

    .remember-forgot a {
        color: #ff0000;
        text-decoration: none;
    }

    .remember-forgot a:hover {
        text-decoration: underline;
    }

    .namu a {
        margin-left: 200px;
        color: blue; /* Changed color to blue */
        
    }

    .namu a:hover {
        color: darkblue; /* Optional hover effect */
    }
    
 .namu1 a {
    
        color: blue; /* Changed color to blue */
        
    }
    .wrapper .btn {
        width: 100%;
        height: 45px;
        background: #fff;
        border: none;
        outline: none;
        border-radius: 40px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        cursor: pointer;
        font-size: 16px;
        color: #333;
        font-weight: 600;
    }

    .wrapper .btn:hover {
        background: #ddd; /* Slight hover effect */
    }

    .wrapper .register-link {
        font-size: 14.5px;
        text-align: center;
        margin-top: 20px;
    }

    .register-link p {
        margin-bottom: 10px;
    }

    .register-link p a {
        text-decoration: none;
        font-weight: 600;
    }

    .register-link p a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="wrapper">
        <h1>Login</h1>
        <form action="Login1" method="post">
            <div class="input-box">
                <tr>
                    <td><label for="uname">Name:</label></td>
                    <td><input type="text" name="uname" id="uname" placeholder="Enter Your Name:" required></td>
                </tr>
                <i class='bx bx-user'></i>
            </div>

            <div class="input-box">
                <tr>
                    <td><label for="uphoneno">Phone no:</label></td>
                    <td><input type="text" name="uphoneno" id="uphoneno" placeholder="Enter Your Phone No:" required></td>
                </tr>
                <i class='bx bx-lock-alt'></i>
            </div>

            <div class="namu">
                <a href="forgetpnum.jsp">forget password?</a><br><br>
            </div>

            <button type="submit" class="btn">Login</button>
            <br><br>
            <div class="namu1">
                <h4>Don't have an account?</h4>
                <a href="Registration.jsp">Register here</a>
            </div>
        </form>
    </div>
</body>
</html>
