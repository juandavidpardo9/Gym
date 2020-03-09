<%-- 
    Document   : index
    Created on : 10/12/2011, 06:25:32 PM
    Author     : alejandro
--%>

<%@page import="java.util.List"%>
<%@page import="Logica.TipoDeCliente"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% ResultSet Datos = (ResultSet)session.getAttribute("Datos"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gimnasio</title>
        <script src='validar.jsp' language='JavaScript1.2'></script>
        <link href="./Estilos/style.css" rel='stylesheet' type='text/css'>
    </head>
    <body>
        
        <div class="container">
        <div class="box">
        <div class="content">
        <table border="1"  style="margin: 0 auto;">
            <h3 align="center">Clientes</h3>
            <tr>
                <th>Codigo</th><th>Nombre</th><th>Edad</th><th>Peso</th><th>Altura</th><th>Acciones</th>
            </tr>
                <% while (Datos.next()){ %>
                    <tr>
                        <td><p><%= Datos.getString("id") %></p></td>
                        <td><p><%= Datos.getString("Nombre") %></p></td>
                        <td><p><%= Datos.getString("Edad") %></p></td>
                        <td><p><%= Datos.getString("Peso") %></p></td>
                        <td><p><%= Datos.getString("Altura") %></p></td>
                        <td class="links">
                            <a href="CargarContacto?op=edit&item=<%= Datos.getString("id") %>">Editar</a>
                            <a href="CargarContacto?op=delete&item=<%= Datos.getString("id") %>">Borrar</a>
                        </td>
                    </tr>
                <% }%>
                <tr>
                    <td colspan="20" class="links"><a align="center"  href="insertar_contacto.jsp">Agregar</a></td>
            </tr>
        </table>
    </body>
</html>
