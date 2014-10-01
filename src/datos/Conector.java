/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;
/**
 *
 * @author Profesor
 */
public class Conector {
    
    Connection conn = null;

    public static Connection conectorBd(){
        try{
            
            Class.forName("org.postgresql.Driver");
         
            String url = "jdbc:postgresql://10.248.31.226:5432/gestion-edificio";
            String usuario = "sistema";
            String password= "1234";
            Connection conn = DriverManager.getConnection(url, usuario, password);
          
            return conn;
        
        
        }catch(Exception e){
          
            return null;
        
            
        }
    } 
    
}
