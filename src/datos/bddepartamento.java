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
    
    //traemos la coneccion ya instanciada en conector 
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   //se crea un metodo llamado generar pagos
    public boolean CrearDepto(Departamento dep){
     //se establese la coneccion con la base de datos
        conn = Conector.conectorBd();
     //desmembramos la clase pago y los pasamos de String a integer con parse int
     int cod = dep.getCod();
     int NumDepto=dep.getNumDepto();
     String NombreDueño=(dep.getNombreDueño());
     
     //se hace la query para la base de datos
     String sql ="insert into pago values("+id+",'"+fecha+"',"+Departamento+",'si',"+monto+")";
     //se crea la condicion de try y catch para saber si se tiene acceso o no a la base de datos   
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
    
