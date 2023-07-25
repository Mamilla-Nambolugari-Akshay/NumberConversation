<%@page import="com.conversation.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<link rel="stylesheet" href="index.css">
<head>
<meta charset="ISO-8859-1">
<title>NumberConversation</title>
</head>
<body>

		<form action="Convert" method="post">
			<div id="conversationform">
			<table style="border: 2">
				<tr>
					<td><select name="convert">
							<option value="101">DecimalToBinary</option>
							<option value="102">BinaryToDecimal</option>
							<option value="103">DecimalToPercent</option>
							<option value="104">PercentToDecimal</option>
							<option value="105">DecimalToHexaDecimal</option>
							<option value="106">HexaDecimalToDecimal</option>
							<option value="107">HexaDecimalToBinary</option>
							<option value="108">BinaryToHexaDecimal</option>
							<option value="109">AlphabetToDecimal</option>
							<option value="110">FactorsOfANumber</option>
							<option value="111">SumOfFactorsOfANumber</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="text" placeholder="input type here.. " name="number"></td>
				</tr>
				<tr>
					<td><input type="submit" id="submit" value="submit" name="sub"></td>
				</tr>
				<tr>
					<td id="res">
						<%
						String name = (String) request.getAttribute("myname");
						%> <%=name%></td>
				</tr>
			</table>
			</div>
		</form>
	
</body>
</html>