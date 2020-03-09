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
        <title>Editar Cliente</title>
        <script src='validar.jsp' language='JavaScript1.2'></script>
        <link href="./Estilos/Estilo.css" rel='stylesheet' type='text/css'>
    </head>
    <body>
        <form class="box" id="frmActualizarContacto" action="ActualizarContacto" method="POST">
             <h1>Edita el cliente</h1>
            <input type="hidden" id="id" name="id" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getId() %>">
      
                
             <input type="text" id="Nombre" name="Nombre" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getNombre() %>">
            
                
             <input type="text" id="Edad" name="Edad" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getEdad() %>">
            
               
             <input type="text" id="Peso" name="Peso" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getPeso() %>">
          
               
             <input type="text" id="Altura" name="Altura" value="<%= ((TipoDeCliente)session.getAttribute("Datos")).getAltura() %>">
             
             <input type="submit" value="Aceptar" onclick="submit();">
        
        </form>
    </body>
</html>
