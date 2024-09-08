<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Additems" method="post">
<table>
<tr>
<td>product_name:</td>
<td><input type="text" name="pname"></td>
</tr>

<tr>
<td>product_price:</td>
<td><input type="number" name="pprice"></td>
</tr>

<tr>
<td colspan="2" style="text-align:center"><input type="submit" name="Additem" value="submit"></td>
</tr>

</table>
</form>
</body>
</html>