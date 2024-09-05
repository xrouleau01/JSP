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
<form method="post" action="ajouter">
  <label for="no">NoProduit</label><br>
  <input type="text" id="no" name="no"><br>
  <label for="nom">Nom</label><br>
  <input type="text" id="nom" name="nom"><br>
  <label for="prix">Prix</label><br>
  <input type="text" id="prix" name="prix"><br>
  <label for="tax">Taxable</label><br>
  <input type="radio" id="tax" name="tax"><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>