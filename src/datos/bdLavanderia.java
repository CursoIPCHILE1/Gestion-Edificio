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
    
}
