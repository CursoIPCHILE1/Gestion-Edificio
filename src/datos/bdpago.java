/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import negocio.Usuario;
import negocio.Pago;

/**
 *
 * @author Arturoandres
 */
public class bdpago {
 //traemos la coneccion ya instanciada en conector 
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   //se crea un metodo llamado generar pagos
    public boolean GenerarPagos(Pago p){
     //se establese la coneccion con la base de datos
        conn = Conector.conectorBd();
     //desmembramos la clase pago y los pasamos de String a integer con parse int
     int id =p.getId();
     int monto=p.getMonto();
     String fecha=String.valueOf(p.getFechapago());
     int Departamento=(p.getNdepto());
     //se hace la query para la base de datos
     String sql ="insert into pago values("+id+","+monto+",'"+fecha+"',"+Departamento+")";
     //se crea la condicion de try y catch para saber si se tiene acceso o no a la base de datos   
     try{
         JOptionPane.showMessageDialog(null, sql);
         pst = conn.prepareStatement(sql);
            
            if(pst.execute()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(Exception e){
           e.printStackTrace();
            return false;
        }
       
    }
    
}
