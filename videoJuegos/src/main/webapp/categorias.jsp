<%-- 
    Document   : categorias
    Created on : 3 jul. 2020, 15:03:46
    Author     : Javier
--%>

<%@page import="Dao.Catalogo"%>
<%@page import="Dao.CatalogoDB"%>
<%@page import="Config.Conexion"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           List<Catalogo> Categorias= new CatalogoDB().ListadoCategorias();
        %>
        <div class="container">
        <table align="center" class="table table-bordered" >
                <caption>Tabla de categorias</caption>
            <tr>
                <th class="text-center">Id</th>
                <th class="text-center">Categorias</th>
            </tr>
                <%for(Catalogo categoria : Categorias){%>
            <tr>
                <td class="text-center"><%= categoria.getIdCat() %></td>
                <td class="text-center"><%=categoria.getNombre() %></td>
            </tr>
            <%}%>
        </table>
        <a href="index.jsp" Class="btn btn-primary btn-block">Regresar</a>
        </div>
        
    </body>
</html>
