/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import negocio.Usuario;
import negocio.Pago;

/**
 *
 * @author Arturoandres
 */
public class bdpago {
 Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public boolean GenerarPagos(Pago p){
     conn = Conector.conectorBd();
     
     String id =String.valueOf(p.getId());
     String monto=String.valueOf(p.getMonto());
     String fecha=String.valueOf(p.getFechapago());
     String Departamento=String.valueOf(p.getPago());
     
     String sql ="insert into pago values("+id+","+monto+","+fecha+",'"+Departamento+"')";
        try{
            pst = conn.prepareStatement(sql);
            
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
