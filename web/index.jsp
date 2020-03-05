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
        <title>Agenda web</title>
        <script src='validar.jsp' language='JavaScript1.2'></script>
        <link href='diseno.css' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <h1>Clientes</h1>
        <table>
            <tr>
                <th>codigo</th><th>nombre</th><th>Edad</th><th>Peso</th><th>Altura</th><th>Acciones</th>
            </tr>
                <% while (Datos.next()){ %>
                    <tr>
                        <td><%= Datos.getString("id") %></td>
                        <td><%= Datos.getString("Nombre") %></td>
                        <td><%= Datos.getString("Edad") %></td>
                        <td><%= Datos.getString("Peso") %></td>
                        <td><%= Datos.getString("Altura") %></td>
                        <td class="links">
                            <a href="CargarContacto?op=edit&item=<%= Datos.getString("id") %>">Editar</a>
                            <a href="CargarContacto?op=delete&item=<%= Datos.getString("id") %>">Borrar</a>
                        </td>
                    </tr>
                <% }%>
                <tr>
                    <td colspan="5" class="links"><a href="insertar_contacto.jsp">Agregar</a></td>
            </tr>
        </table>
    </body>
</html>
