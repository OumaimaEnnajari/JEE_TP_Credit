<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="web.ModelCredit"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcule Credit</title>
</head>
<body>

	<form action="/TP-Credit/montant" method="POST">
		<table>
			<tr>
				<td>Montant :</td>
				<td><input name="montant" type="text" placeholder="montant"
					value="${model.montant}" required></td>
				<td>DH</td>
			</tr>

			<tr>
				<td>Taux :</td>
				<td><input name="taux" type="text" placeholder="taux"
					value="${model.taux}" required></td>
				<td>%</td>
			</tr>

			<tr>
				<td>Duree :</td>
				<td><input name="duree" type="text" placeholder="duree"
					value="${model.duree}" required></td>
				<td>mois</td>
			</tr>
		</table>

		<button type="submit">Calculer</button>

		<p>
			<%
			if (request.getAttribute("model") != null) {
				ModelCredit res = (ModelCredit) request.getAttribute("model");
				out.println("Credit= " + res.getCredit());
			}
			%>
		</p>
	</form>
</body>
</html>