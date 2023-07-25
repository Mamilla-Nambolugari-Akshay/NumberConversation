<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="index.css">
<head>
<meta charset="ISO-8859-1">
<title>OptionSelectionPage</title>
</head>
<body>
<form action="OptionServlet" method="post">
<select name="selectoption" id="selectoption">
<option id="opt" value="100">Number Conversion</option>
<option id="opt" value="101">TimeConversation</option>
<option id="opt" value="103">NumberSeries</option>

</select>
<br>
<input type="submit" id="opt" value="submit" id="tsubmit">
</form>
</body>
</html>