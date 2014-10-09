/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import java.util.ArrayList;
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
     
    String nom = u.getNombre();
    String ape = u.getApellido();
     int pa =u.getPassword();
     int co =u.getCodigo();
     String di =u.getDireccion();
     int fo =u.getFono();
     String car =u.getCargo();
     int ru =u.getRut();
     String ho =u.getHorario();
     
     
     
   String sql ="select * from Usuario where rut= ("+nom+", "+ape+")";
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
    
  
  
    public ArrayList<String> traerListaCargos(){
    conn = Conector.conectorBd();  
    String sql = "select descripcion from tipousuario";           
        try {
            pst = conn.prepareStatement(sql);
            
            ArrayList<String> ls = new ArrayList<String>();
            
            rs = pst.executeQuery();
            while(rs.next()){
            
                ls.add(rs.getString("descripcion"));
            }
            return ls;
            
        } catch (Exception e) {
            return null;
        }
    
    }
    
    public ArrayList<String> traerListaHorarios(){
    conn = Conector.conectorBd();  
    String sql = "select horario from tipousuario";           
        try {
            pst = conn.prepareStatement(sql);
            
            ArrayList<String> ls = new ArrayList<String>();
            
            rs = pst.executeQuery();
            while(rs.next()){
            
                ls.add(rs.getString("horario"));
            }
            return ls;
            
        } catch (Exception e) {
            return null;
        }
    
    }
    
    
}
