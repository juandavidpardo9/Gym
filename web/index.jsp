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
<% ResultSet TipoDeCliente = (ResultSet)session.getAttribute("TipoDeCliente"); %>
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
                <% while (TipoDeCliente.next()){ %>
                    <tr>
                        <td><%= TipoDeCliente.getString("id") %></td>
                        <td><%= TipoDeCliente.getString("Nombre") %></td>
                        <td><%= TipoDeCliente.getString("Edad") %></td>
                        <td><%= TipoDeCliente.getString("Peso") %></td>
                        <td><%= TipoDeCliente.getString("Altura") %></td>
                        <td class="links">
                            <a href="CargarContacto?op=edit&item=<%= TipoDeCliente.getString("id") %>">Editar</a>
                            <a href="CargarContacto?op=delete&item=<%= TipoDeCliente.getString("id") %>">Borrar</a>
                        </td>
                    </tr>
                <% }%>
                <tr>
                    <td colspan="5" class="links"><a href="insertar_contacto.jsp">Agregar</a></td>
            </tr>
        </table>
    </body>
</html>
