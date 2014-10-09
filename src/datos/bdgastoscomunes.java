/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import negocio.GastosComunes;

/**
 *
 * @author Profesor
 */
public class bdgastoscomunes {
   
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public boolean CrearGastosComunes(GastosComunes gcomun) {
        
            conn = Conector.conectorBd();
        int Agua = gcomun.getAgua();
        int Luz = gcomun.getLuz();
        int Gas = gcomun.getGas();
        int Administracion = gcomun.getAdministracion();
        int Aseo = gcomun.getAseo();
        int Contingencia = gcomun.getContingencia();
        
        String sql ="insert into GastosComunes values("+Agua+","+Luz+","+Gas+","+Administracion+","+Aseo+","+Contingencia+")";
       
        try{
         JOptionPane.showMessageDialog(null, sql);
         pst = conn.prepareStatement(sql);
            pst.execute();
            
            return true;
       }catch(Exception e){
           
            return false;
        }
       
    } 
    }
    
    
    
    
    
    

