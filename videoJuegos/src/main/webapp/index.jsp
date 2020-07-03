<%-- 
    Document   : index
    Created on : 3/06/2020, 01:58:26 PM
    Author     : Javier García
--%>

<%@page import="java.util.List"%>
<%@page import="Dao.VideoJuegosDB"%>
<%@page import="Dao.VideoJuegos"%>
<%@page import="Config.Conexion"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center" style="color:greenyellow;">VIDEOJUEGOS</h1>
        
        <%
            List<VideoJuegos> VideoJuegos= new VideoJuegosDB().ListadoJuegos();
        %>
    <div class="container">
        <a href="agregar.jsp" class="btn btn-success btn-lg" >Nuevo Registro</a>
        <br></br>
        <table  class="table table-bordered" >
            <caption>Tabla de videojuegos Registrados en la base de datos</caption>
            <tr>
                <th class="text-center">Id</th>
                <th class="text-center">Nombre</th>
                <th class="text-center">Descripcion</th>
                <th class="text-center">Categoria</th>
                <th class="text-center">Precio</th>
                <th class="text-center">Acciones</th>
            </tr>
                <% for(VideoJuegos Juegos : VideoJuegos) { %>
            <tr>
                <td class="text-center"><%= Juegos.getIdJuego() %></td>
                <td class="text-center"><%= Juegos.getNombre() %></td>
                <td class="text-center"><%= Juegos.getDescripcion() %></td>
                <td class="text-center"><%= Juegos.getNombreCat() %></td>
                <td class="text-center"><%= Juegos.getPrecio() %></td>
                <td class="text-center">
                    <a href="editar.jsp?id=<%=Juegos.getIdJuego()%>" Class="btn btn-warning btn-sm btn-block">Editar</a>
                    <a href="delete.jsp?id=<%=Juegos.getIdJuego()%>" Class="btn btn-danger btn-sm btn-block">Eliminar</a>
                </td>
            </tr>
            <% } %>
        </table>
        <a href="categorias.jsp" Class="btn btn-sm btn-block btn-primary">Ver Categorias</a>
        <br></br>
        
    </div>
    </body>
</html>