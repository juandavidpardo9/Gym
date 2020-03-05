<%-- 
    Document   : editar_contacto
    Created on : 12-dic-2011, 10:27:33
    Author     : Alejo
--%>

<%@page import="Logica.TipoDeCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Contacto</title>
        <script src='validar.jsp' language='JavaScript1.2'></script>
        <link href='diseno.css' rel='stylesheet' type='text/css'>
    </head>
    <body>
         <form id="frmActualizarContacto" action="ActualizarContacto" method="POST">
             <input type="hidden" id="id" name="id" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getId() %>">
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" id="Nombre" name="Nombre" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getNombre() %>"></td>
            </tr>
            <tr>
                <td>Edad</td>
                <td><input type="text" id="Edad" name="Edad" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getEdad() %>"></td>
            </tr>
            <tr>
                <td>Peso</td>
                <td><input type="text" id="Peso" name="Peso" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getPeso() %>"></td>
            </tr>
            <tr>
                <td>Altura</td>
                <td><input type="text" id="Altura" name="Altura" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getAltura() %>"></td>
            </tr>                       
        </table>
        </form>
    </body>
</html>
