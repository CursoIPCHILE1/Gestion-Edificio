/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import negocio.Pago;
import negocio.Departamento;
/**
 *
 * @author Profesor
 */
public class bddepartamento {
    
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   
    public boolean CrearDepto(Departamento dep){
     
        conn = Conector.conectorBd();
    int codlav   = dep.getcodlav();
    int codedi   = dep.getcodedi();
    int id_dpto   = dep.getid_dpto();
    int n_dpto = dep.getn_dpto();
     
     
     
     String sql ="insert into pago values("+id_dpto+","+codlav+","+codedi+","+n_dpto+")";
       
     try{
         JOptionPane.showMessageDialog(null, sql);
         pst = conn.prepareStatement(sql);
            pst.execute();
            
            return true;
          /*  if(pst.execute()){
                
               return true;
                
            }else {
           return false;
            
            }*/
            
        }catch(Exception e){
           
            return false;
        }
       
    }
    
}
    
