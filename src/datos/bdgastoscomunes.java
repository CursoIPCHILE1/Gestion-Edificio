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
    
    public boolean CrearGastosComunes(GastosComunes g) {
        
            conn = Conector.conectorBd();
        int Ano = g.getAno();
        int Mes = g.getMes();
        int Agua = g.getAgua();
        int Luz = g.getLuz();
        int Gas = g.getGas();
        int Administracion = g.getAdministracion();
        int Aseo = g.getAseo();
        int Contingencia = g.getContingencia();
         //se hace la query para la base de datos
        //String sql ="insert into GastosComunes values("+Agua+","+Luz+","+Gas+","+Administracion+","+Aseo+","+Contingencia+")";
        //se crea la condicion de try y catch para saber si se tiene acceso o no a la base de datos  
        
        String sql ="insert into GastosComunes values("+Ano+","+Mes+","+Agua+","+Luz+","+Gas+","+Administracion+","+Aseo+","+Contingencia+")";
         try{
          //  pst = conn.prepareStatement(sql);
         //   pst.setInt(1, Ano);
         //   pst.setInt(2, Mes);
         //   pst.setInt(3, Agua);
          //  pst.setInt(4, Luz);
          //  pst.setInt(5, Gas);
          //  pst.setInt(6, Administracion);
           // pst.setInt(7, Aseo);
           // pst.setInt(8, Contingencia);
            
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

        //try{
         //JOptionPane.showMessageDialog(null, sql);
        // pst = conn.prepareStatement(sql);
           // pst.execute();
            
       //     return true;
      // }catch(Exception e){
           
     //       return false;
    //    }
       
   // } 
   // }
    
    
    
    
    
    

