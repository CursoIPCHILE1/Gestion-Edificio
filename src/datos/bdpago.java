/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
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
    Date fechas =null;
   //se crea un metodo llamado generar pagos
    public boolean GenerarPagos(Pago p){
     //se establese la coneccion con la base de datos
        conn = Conector.conectorBd();
     //desmembramos la clase pago y los pasamos de String a integer con parse int
     
     int monto=p.getMonto();
     String fecha=(p.getFechapago());
     int Departamento=(p.getNdepto());
     String alerta_moroso=null;
     //se hace la query para la base de datos
     //String sql ="insert into pago values("+id+",'"+fecha+"',"+Departamento+",'si',"+monto+")";
     //se crea la condicion de try y catch para saber si se tiene acceso o no a la base de datos   
     String sql ="select insertarpagos(?,?,?,?)";
     try{
         //JOptionPane.showMessageDialog(null, sql);
         
         pst = conn.prepareStatement(sql);
       // SimpleDateFormat fechas = new SimpleDateFormat("yyyy-MM-dd");
        
        //se comvierte la fecha de tipo date a String con date.valueOf
	fechas = Date.valueOf(fecha);
         pst.setDate(1, fechas);
         pst.setInt(2, Departamento);
         pst.setString(3, alerta_moroso);
         pst.setInt(4, monto);
         
         
            
            
            if(pst.execute()){
          return true;
               
                
            }else {
           return false;
            
            }
            
        }catch(Exception e){
           
            return false;
        }
       
    }
    
}
