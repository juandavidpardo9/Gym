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
             <input type="hidden" id="txtId" name="txtId" value="<%= ((TipoDeCliente)session.getAttribute("TipoDeCliente")).getId() %>">
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" id="txtNombre" name="txtNombre" value="<%= ((TipoDeCliente)session.getAttribute("TipoDeCliente")).getNombre() %>"></td>
            </tr>
            <tr>
                <td>Edad</td>
                <td><input type="text" id="txtApellido" name="txtEdad" value="<%= ((TipoDeCliente)session.getAttribute("TipoDeCliente")).getEdad() %>"></td>
            </tr>
            <tr>
                <td>Peso</td>
                <td><input type="text" id="txtPeso" name="txtPeso" value="<%= ((TipoDeCliente)session.getAttribute("TipoDeCliente")).getPeso() %>"></td>
            </tr>
            <tr>
                <td>Altura</td>
                <td><input type="text" id="txtAltura" name="txtAltura" value="<%= ((TipoDeCliente)session.getAttribute("TipoDeCliente")).getAltura() %>"></td>
            </tr>                       
        </table>
        </form>
    </body>
</html>
