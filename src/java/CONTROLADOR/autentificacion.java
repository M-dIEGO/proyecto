package CONTROLADOR;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MODELO.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class autentificacion extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             boolean login=false;
             String nombre = null;
             String contra = null;
          Conexion miConexion =new Conexion();
           ResultSet rs = null; 
           String sql = "SELECT  nombre,contraseña FROM usuarios where nombre= '" +request.getParameter("txtusu")+"' and contraseña= '"+request.getParameter("txtclave")+"'";
            
          System.out.print(sql);
           
           rs = miConexion.Consulta(sql);
            try {
              while (rs.next()){
                    login=true;
                    
                   nombre=rs.getString(1);
                   contra=rs.getString(2); 
                 
               
                
                
                }} catch (SQLException ex) {
                    ex.printStackTrace();
                
            }
            
            
            if (login==true){
                Usuario usu = new Usuario(nombre,contra);
             HttpSession session = request.getSession();
            session.setAttribute("Usuario",usu);
            response.sendRedirect("menu");
            }else{
                response.sendRedirect("error_login.xhtml");
                
            }
        
        
        
    }

    
}
