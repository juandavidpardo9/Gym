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
        <script src='validar.jsp' language='JavaScript1.2'></script>
        <link href="./Estilos/Estilo.css" rel='stylesheet' type='text/css'>
    </head>
    <body>
        <form id="frmInsertarContacto" class="box" action="Servidor" method="POST">
        <table>
            <tr>
               <h1>Completa los datos</h1>
                <td><input type="text" id="Nombre" name="Nombre" placeholder="Nombre"></td>
            </tr>
            <tr>
                
                <td><input type="text" id="Edad" name="Edad"  placeholder="    Edad" min="0" max="100"></td>
            </tr>
            <tr>
                
                <td><input type="text" id="Peso" name="Peso"placeholder="Peso(Kg)"></td>
            </tr>
            <tr>
                
                <td><input type="text" id="Altura" name="Altura" placeholder="Altura(Mts)"></td>
            </tr>           
            <tr>
            <td colspan="2">
                    <input type="submit" value="Evaluar" onclick="return validar()" >
            </tr>
            
        </table>
        </form>
    </body>
</html>
