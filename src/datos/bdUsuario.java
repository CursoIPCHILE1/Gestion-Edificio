/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import negocio.Usuario;
/**
 *
 * @author Profesor
 */
public class bdUsuario {
    
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Boolean valida(Usuario u){
     conn = Conector.conectorBd();
     
    
     int pa =u.getPassword();
     int co =u.getCodigo();
     String di =u.getDireccion();
     int fo =u.getFono();
     String car =u.getCargo();
     int ru =u.getRut();
     String ho =u.getHorario();
     String tur =u.getTurno();
     
     
     String sql ="select * from usuario where nombre='" + us+"' and apellido='" + pa +"'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(Exception e){
            return false;
        }
       
    }
    
}
