<%@page import="com.conversation.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
#thres{
    border:3px solid purple;;
    background-color:white;
    border-radius:4px;
    font-size:10px;
    height:90px
    }
</style>
<link rel="stylesheet" href="index.css">
<head>
<meta charset="ISO-8859-1">
<title>NumberSeries</title>
</head>
<body>
	<form action="NumberSeriesFile" method="post">
		<table id="nstab">
			<tr>
				<td><select name="numseries" id="ns">
						<option value="301" id="opt">Prime Numbers</option>
						<option value="302" id="opt">Odd Numbers</option>
						<option value="303" id="opt">Even Numbers</option>
						<option value="304" id="opt">Natural Numbers</option>
						<option value="305" id="opt">SumOfNumbers</option>
						<option value="306" id="opt">FibanacciNumbers</option>
						<option value="307" id="opt">PalinDrome Numbers</option>
						
				</select></td>
			</tr>
			<tr>
				<td id="range"><input type="text" name="number"></td></tr>
				<tr>
				<td id="range"><input type="text" name="num"></td>
			</tr>
			<tr>
				<td><input type="submit" id="submit" value="SUBMIT"></td>
			</tr>
			<tr>
				<td id="thres">
					<%
						String name = (String) request.getAttribute("nseries");
						%> <%=name%></td>
				
			</tr>
		</table>
	</form>
</body>
</html>