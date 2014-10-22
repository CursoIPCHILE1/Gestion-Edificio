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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Pago;

/**
 *
 * @author Arturoandres
 */
public class bdpago {

    //traemos la coneccion ya instanciada en conector
    public bdpago() {
    }
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Date fechas =null;
   //se crea un metodo llamado generar pagos
   
    public ArrayList<String> listarpago(int codEdif){
    conn = Conector.conectorBd();  
    String sql = "select distinct d.n_dpto as numeroDepto, l.pago as monto, l.fecha from lavanderia l, departamento d, edificio e where l.coddepto=d.id_dpto and d.codedi=e.cod_ed and e.cod_ed\n" +
"="+codEdif+"";           
        try {
            pst = conn.prepareStatement(sql);
            
            ArrayList<String> ls = new ArrayList<String>();
            
            rs = pst.executeQuery();
            while(rs.next()){
            
                ls.add(String.valueOf(rs.getInt("cod_depto")));
                ls.add(String.valueOf(rs.getInt("monto")));
                ls.add(String.valueOf(rs.getDate("fecha_pago")));
            }
            return ls;
            
        } catch (Exception e) {
            return null;
        }
    
    }
    
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
