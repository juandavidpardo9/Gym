<%-- 
    Document   : insertar_contacto
    Created on : 12-dic-2011, 9:34:56
    Author     : Alejo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Contacto</title>
        <script  src='javascript.js' language='JavaScript1.2'></script>
        <link href="./Estilos/Estilo.css" rel='stylesheet' type='text/css'>
    </head>
    <body>
        <form id="frmInsertarContacto" class="box" action="Servidor" method="POST">
        
            
               <h1>Completa los datos</h1>
               <input type="text" id="Nombre" name="Nombre" placeholder="Nombre">           
                
               <input type="number" id="Edad" name="Edad"  placeholder="Edad" min="0" max="100">
            
               <input step="any" type="text" id="Peso" name="Peso"placeholder="Peso(Kg)">           
                
               <input step="any" type="text" id="Altura" name="Altura" placeholder="Altura(Mts)">           
          
               <input type="submit" value="Evaluar" onclick="validar(); " >
           
            
        
        </form>
    </body>
</html>
