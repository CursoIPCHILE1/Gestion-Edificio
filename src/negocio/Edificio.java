
package negocio;



public class Edificio {
    private int cod;
    private String nombre;
    private String direccion;
    private Departamento numDepto;
    private int numPiso;
    private Usuario trabajador;

    public Edificio() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Departamento getNumDepto() {
        return numDepto;
    }

    public void setNumDepto(Departamento numDepto) {
        this.numDepto = numDepto;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public Usuario getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Usuario trabajador) {
        this.trabajador = trabajador;
    }
    
    
    public  void crear_edificio(){
        
           
    
    }
  
    
    
    
}
