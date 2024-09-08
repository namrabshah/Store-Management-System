<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change Phone Number</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
 h2 {
            text-align: center;
            color: #333;
        }

    
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        table {
            width: 100%;
            margin: 0 auto;
        }

        td {
            padding: 8px;
        }

        label {
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        tr:last-child td {
            text-align: center;
        }
    </style>
</head>
<body>
    
    <form action="Forget1" method="post">
        <table>
        <h2><center>Change Phone Number</center></h2><br>
            <tr>
                <td><label for="uname">Name:</label></td>
                <td><input type="text" placeholder="Enter Your name" name="uname" id="uname"></td>
            </tr>

            <tr>
                <td><label for="uage">Age:</label></td>
                <td><input type="number" placeholder="Enter your age" name="uage" id="uage"></td>
            </tr>

            <tr>
                <td><label for="uphoneno">Phone no:</label></td>
                <td><input type="number" placeholder="Enter your phone number" name="uphoneno" id="uphoneno"></td>
            </tr>

            <tr>
                <td colspan="2" style="text-align:center">
                    <input type="submit" name="submit" value="Change Phone Number">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
