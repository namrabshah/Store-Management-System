<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
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
        height: 100vh;
        background-color: #f4f4f4;
    }

    .form-container {
        background-color: #fff;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 500px;
    }

    h1 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    table {
        width: 100%;
    }

    table tr td {
        padding: 10px 0;
    }

    label {
        font-weight: bold;
        color: #555;
    }

    input[type="text"], input[type="number"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin-top: 5px;
    }

    input[type="radio"] {
        margin-right: 10px;
    }

    .form-container .gender-label {
        display: inline-block;
        margin-right: 20px;
        color: #555;
        font-weight: normal;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #4CAF50;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        margin-top: 20px;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }

</style>
</head>
<body>
    <div class="form-container">
        <h1>Sign Up Page</h1>
        <form action="Registration1" method="post">
            <table>
                <tr>
                    <td><label for="uname">Name:</label></td>
                    <td><input type="text" name="uname" id="uname" placeholder="Enter your name" required></td>
                </tr>
                <tr>
                    <td><label for="uage">Age:</label></td>
                    <td><input type="text" name="uage" id="uage" placeholder="Enter your age" required></td>
                </tr>
                <tr>
                    <td><label for="gender">Gender:</label></td>
                    <td>
                        <label class="gender-label"><input type="radio" name="gender" value="male" required> Male</label>
                        <label class="gender-label"><input type="radio" name="gender" value="female" required> Female</label>
                    </td>
                </tr>
                <tr>
                    <td><label for="uphoneno">Phone no:</label></td>
                    <td><input type="number" name="uphoneno" id="uphoneno" placeholder="Enter your phone number" required></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" name="submit" value="Submit">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
