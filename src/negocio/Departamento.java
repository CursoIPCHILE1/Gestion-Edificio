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
    
    private int cod;
    private int NumDepto;
    private String NombreDueño;

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

  

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getNumDepto() {
        return NumDepto;
    }

    public void setNumDepto(int NumDepto) {
        this.NumDepto = NumDepto;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }
    
    
    
}

