/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import negocio.Departamento;
import negocio.Perfil;
import negocio.*;

/**
 *
 * @author tawer
 */
public class bdPerfil {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public boolean asignarTurno(Perfil per){
     
        conn = Conector.conectorBd();
    int cod              = per.getCod();
    String descripcion   = per.getDescripcion();
    String turno         = per.getTurno();
    int sueldo           = per.getSueldo();
     
     
     String sql ="insert into Departamento values("+cod+","+descripcion+","+turno+","+sueldo+")";
       
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
