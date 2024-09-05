<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Êtes-vous sûr de vouloir supprimer cet objet?</h1>
  <p>NoProduit: ${requestScope.produit.noProduit} Nom: ${requestScope.produit.nom} Prix: ${requestScope.produit.prix} Taxable: ${requestScope.produit.taxable}</p>
  <form method="post" action="/supprimer">
      <input name="a" id="a">
  </form>

</body>
</html>
