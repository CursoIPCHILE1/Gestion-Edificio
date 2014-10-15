/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Profesor
 */
//se establese la clase conector
public class Conector {
    
    Connection conn = null;
    
//arturo :se establese la coneccion
    public static Connection conectorBd(){
        
        try{
            
            Class.forName("org.postgresql.Driver");
         //se da la direccion o url de la pagina mas el usuario y pass para entrar a la BD
            String url = "jdbc:postgresql://10.248.31.226:5432/gestion-edificio";
            String usuario = "sistema";
            String password= "1234";
            Connection conn = DriverManager.getConnection(url, usuario, password);
          //se retorna conn como la coneccion
            JOptionPane.showMessageDialog(null," ok");
            return conn;
        
        // si no hay movimiento de datos se hace la exepcion cpn el catch para no retornar nada
        }catch(Exception e){
          
            return null;
        
            
        }
    } 
    
}
