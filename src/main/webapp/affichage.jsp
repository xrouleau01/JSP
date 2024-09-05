<%@ page import="java.util.ArrayList" %>
<%@ page import="classes.Produit" %>
<%@ page import="classes.Produit" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Liste</title>
</head>
<body>
<h1><%= "Liste" %>
</h1>
<br/>
<table>
  <tr>
    <th>NoProduit</th>
    <th>Nom</th>
    <th>Prix</th>
    <th>Taxable</th>
    <th>Modifier</th>
    <th>Supprimer</th>
  </tr>
  <% for (Produit p : (ArrayList<Produit>) request.getAttribute("lsProduits")) { %>
  <tr>
    <td> <%= p.noProduit %> </td>
    <td> <%= p.nom %> </td>
    <td> <%= p.prix %> </td>
    <td> <%= p.taxable %> </td>
    <td> <a href="${pageContext.request.contextPath}/supprimer?NoProduit=<%=p.noProduit%>">ajouter</a> </td>
  </tr>
  <% } %>
</table>
<a href="ajouter">ajouter</a>
</body>
</html>