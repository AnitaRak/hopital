<%-- 
    Document   : chambre
    Created on : 2022-02-15, 16:51:59
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>choisir chambre</h1>
           <div class="form-group col-md-4">
              <label for="inputSexe">type chambre</label>
              <select id="inputSexe" class="form-control" name="typeChambre">
                <option>Vip</option>
                <option>commune</option>
              </select>
           </div>
         <div class="form-group col-md-4">
              <label for="inputSexe">numero</label>
              <select id="inputSexe" class="form-control" name="numero">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
                <option>6</option>
                <option>7</option>
                <option>8</option>
                <option>9</option>
                <option>10</option>
              </select>
           </div>
    </body>
</html>
