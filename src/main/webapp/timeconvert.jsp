<%@page import="com.conversation.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="index.css">

<head>
<meta charset="ISO-8859-1">
<title>TimeConversation</title>
</head>
<body id="bod">
<form action="TimeConvert" method="post">
<table style="border: 2" id="ttab">
				<tr>
					<td><select name="convert" id="convert">
							<option id="opt" value="201">SecondsToMintues</option>
							<option id="opt" value="202">MinutesToSeconds</option>
							<option id="opt" value="203">SecondsToHours</option>
							<option id="opt" value="204">HoursToSeconds</option>
							<option id="opt" value="205">MinutesToHours</option>
							<option id="opt" value="206">HoursToMinutes</option>
							<option id="opt" value="207">DayToHours</option>
							<option id="opt" value="208">DayToMinutes</option>
							<option id="opt" value="209">DayToSeconds</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="text"  placeholder="input type here.. " name="tnumber"></td>
				</tr>
				<tr>
					<td><input type="submit" id="tsubmit" value="submit" name="sub"></td>
				</tr>
				<tr>
					<td id="tres">
						<%
						String name = (String) request.getAttribute("time");
						%> <%=name%></td>
				</tr>
			</table>
</form>
</body>
</html>