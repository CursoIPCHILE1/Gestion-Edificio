/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.*;
/**
 *
 * @author Arturoandres
 */
public class Departamento {
    private int id_dpto;
    private int codlav;
    private int codedi;        
    private int n_dpto;
  private String dueno;

   
  
    public Departamento() {
    }
    
    public boolean CrearDepto(Departamento genera) {
       bddepartamento bddep = new bddepartamento();
       if(bddep.CrearDepto(genera)){
        return true;
        }else{
        return false;
        }
    }

    public int getid_dpto() {
        return id_dpto;
    }

    public void setid_dpto(int id_dpto) {
        this.id_dpto = id_dpto;
    }

    public int getcodlav() {
        return codlav;
    }

    public void setcodlav(int codlav) {
        this.codlav = codlav;
    }

    public int getcodedi() {
        return codedi;
    }

    public void setcodedi(int codedi) {
        this.codedi = codedi;
    }
    
    public int getn_dpto() {
        return n_dpto;
    }

    public void setn_dpto(int n_dpto) {
        this.n_dpto = n_dpto;
    }
 public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueño) {
        this.dueno = dueño;
    }
    


    
    
}

