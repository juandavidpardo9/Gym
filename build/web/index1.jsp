<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gimnasio</title>
        <link rel="stylesheet" href="./Estilos/Estilo.css">
    </head>
    <body>
        <script src="javascript.js"></script>
        <form class="box" method="get" action="Servidor">

            <h1>Completa los datos</h1>
		<input type="text" name="Nombre" id="Nombre" placeholder="Nombre"></input>
		
		<input type="number" name="Edad" id="Edad" placeholder="    Edad" min="0" max="100"></input>
                
		<input step="any" type="text" name="Peso" id="Peso" placeholder="Peso(Kg)" ></input>
                <input step="any" type="text" name="Altura" id="Altura" placeholder="Altura(Mts)" ></input>
                <input type="submit" value="Evaluar" onclick="return validar()" href="insertar_contacto.jsp">
        </form>      
    </body>
</html>
