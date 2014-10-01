/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Profesor
 */
public class Perfil {
    
     private int cod;
    private String descripcion;
    private int sueldo;
    private String turno;
    
    public Perfil(){}{
        
    }
    
   public String Perfil() {
        String Perfil=null;
        return Perfil;
    }
   
  public Perfil(int cod, String descripcion, int sueldo, String turno) {
        
    this.cod = cod;
    this.descripcion = descripcion;
    this.sueldo = sueldo;
    this.turno = turno;
}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
    
  public String asignarTurno(Usuario usu) {
   return null;
      
  }
  
}


    

