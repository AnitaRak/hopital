<%-- 
    Document   : personne
    Created on : 2022-02-15, 16:28:53
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        	<meta charset="utf-8">
                <title>Welcome to CodeIgniter</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="css/animate.css">
	<link rel="stylesheet" type="text/css" href="css/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="css/animsition.min.css'">
	<link rel="stylesheet" type="text/css" href="css/select2.min.css'">	
	<link rel="stylesheet" type="text/css" href="css/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    <body>
        <form>
            <h1>Saise Personne</h1>
            <div class="form-row">
            <div class="form-group col-md-6">
              <label for="inputNom">Nom</label>
              <input type="text" class="form-control" name="nom" placeholder="Nom">
            </div>
            <div class="form-group col-md-6">
              <label for="inputPrenom">Prenom</label>
              <input type="text" class="form-control" name="prenom" placeholder="Prenom">
            </div>
          </div>
           <div class="form-group col-md-4">
              <label for="inputSexe">Sexe</label>
              <select id="inputSexe" class="form-control" name="sexe">
                <option>homme</option>
                <option>femme</option>
              </select>
           </div>
            <div class="form-group col-md-6">
              <label for="inputPrenom">Date de Naissance</label>
              <input type="text" class="form-control" name="dateNaissance" >
            </div>

          <div class="form-group">
            <label for="inputAddresse">Addresse</label>
            <input type="text" class="form-control" id="inputAddresse">
          </div>
          <button type="submit" class="btn btn-primary">Enregistre</button>
</form>
    </body>
</html>
