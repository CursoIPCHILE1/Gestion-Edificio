/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
String de        = per.getDescripcion();
String tu        = per.getTurno();
int su           = per.getSueldo();
     
     
     String sql ="insert into Perfil values("+cod+","+tu+")";
       try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
               return true;
                
            }else {
           return false;
            
            }
            
        }catch(Exception e){
            return false;
        }
       
    }
    
     public ArrayList<String> traerListaCargos(){
    conn = Conector.conectorBd();  
    String sql = "select descripcion from usuario";           
        try {
            pst = conn.prepareStatement(sql);
            
            ArrayList<String> ls = new ArrayList<String>();
            
            rs = pst.executeQuery();
            while(rs.next()){
            
                ls.add(rs.getString("descripcion"));
            }
            return ls;
            
        } catch (Exception e) {
            return null;
        }
        

     }
}

    // }

    // CREATE OR REPLACE FUNCTION tu_asignar (int, int) RETURNS setof perfil AS $BODY$
             
            // DECLARE 
// perfil% ROWTYPE; -- ver turnos 

             // BEGIN 

                 // for r in select * from perfil where tUrno=$1 and cod = $2 loop 
   // return next tu;
  // end loop;

//END;

//$BODY$

        

     

    // CREATE OR REPLACE FUNCTION tu_asignar (int, int) RETURNS setof perfil AS $BODY$
             
            // DECLARE 
// perfil% ROWTYPE; -- ver turnos 

             // BEGIN 

                 // for r in select * from perfil where tUrno=$1 and cod = $2 loop 
   // return next tu;
  // end loop;

//END;



// language plpgsql;


//select tu_asignar(cod)

//String sql = "Select tu_asignar(?,?)";
//try{

//pat = conn.prepareStatement (sql);
//pst = setint (1,cod);
//pst.= setint (2, tu);
//rs = pat. executeQuery();
//if = (rs.next ()){


        
    
    

     
    

       
              
      
              
              
     
    
         
