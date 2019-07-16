

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <link rel="stylesheet" href="resources/css/login.css" type="text/css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="login-box">
           
           <img src="img/avatar.png" class="avatar">
            <h1>Login Here</h1>
            <form method="post" action ="autentificacion">
                <table align="center"><tr><td><label id="subtitulo1">USUARIO</label></td><td><input type="text" placeholder="&#128272; Enter User"  id="entrada" name="txtusu" /></td></tr>
                    <tr><td> <label id="subtitulo2">CONTRASEÑA</label></td><td><input type="password"  placeholder="&#128272; Enter Password" id="entrada" name="txtclave"/></td></tr> 
                    <center><tr><td><input type="submit" value="Iniciar Sesión"  id="boton"/></td></tr></cente>
                </table>
            </form>
        </div>


    </body>
</html>
