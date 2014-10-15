/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class bdLavanderia {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
  
    public ArrayList<String> traerListaDeptos(int codEdif){
    conn = Conector.conectorBd();  
    String sql = "select * from departamento where codedi="+codEdif+"";           
        try {
            pst = conn.prepareStatement(sql);
            
            ArrayList<String> ls = new ArrayList<String>();
            
            rs = pst.executeQuery();
            while(rs.next()){
            
                ls.add(String.valueOf(rs.getInt("n_dpto")));
            }
            return ls;
            
        } catch (Exception e) {
            return null;
        }
    
    }
    
    public ArrayList<String> traerListado(int codEdif){
    conn = Conector.conectorBd();  
    String sql = "select distinct d.n_dpto as numeroDepto, l.pago as monto, l.fecha from lavanderia l, departamento d, edificio e where l.coddepto=d.id_dpto and d.codedi=e.cod_ed and e.cod_ed\n" +
"="+codEdif+"";           
        try {
            pst = conn.prepareStatement(sql);
            
            ArrayList<String> ls = new ArrayList<String>();
            
            rs = pst.executeQuery();
            while(rs.next()){
            
                ls.add(String.valueOf(rs.getInt("numerodepto")));
                ls.add(String.valueOf(rs.getInt("monto")));
                ls.add(String.valueOf(rs.getDate("fecha")));
            }
            return ls;
            
        } catch (Exception e) {
            return null;
        }
    
    }
 
}