<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greetings</title>
</head>
<body>
<h3>Greetings!</h3>

<h4> Add User </h4>
<form id="form1" method="post" action="addUser">
    <label for="Id">ID</label>
    <input type="text" name="id" /><br>
    <label for="name">Name</label>
    <input type="text" name="uname" /><br>
    <button type="submit">Submit</button>
</form>

<br><br>
<h4> Fetch User </h4>
<form id="form2" action="getUser">
    <label for="Id">ID</label>
    <input type="text" name="uid" /><br>
    <button type="submit">Fetch User</button>
</form>

</body>
</html>