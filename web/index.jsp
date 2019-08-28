<%--
    Document   : index
    Created on : 21/08/2019, 17:26:44
    Author     : Caio Evangelista
--%>

<%@page import="bin.Produtos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>

       <nav class="navbar navbar-inverse">
         <div class="container-fluid">
           <div class="navbar-header">
             <a class="navbar-brand" href="#">MeuSite</a>
           </div>
           <ul class="nav navbar-nav">
             <li class="active"><a href="#">Home</a></li>
             <li><a href="#"></a></li>
             <li><a href="#">Link</a></li>
           </ul>
           <button class="btn btn-danger navbar-btn">Login</button>
         </div>
       </nav>

        <h1>Lista de Produtos</h1>

        <table class="table table-hover">
         <thead>
           <tr>
             <th>.</th>
             <th>Tipo</th>
             <th>Preço</th>
             <th>Qtd</th>
           </tr>
         </thead>
         <tbody>
            <%
              for(Produtos produto : Produtos.produtos){%>
            <tr>
            <td></td>

             <td>Doe</td>
             <td>john@example.com</td>
            </tr>
            <%} %>

         </tbody>
       </table>



        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
