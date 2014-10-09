/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.bdLavanderia;
import datos.bdUsuario;
import java.util.ArrayList;
/**
 *
 * @author Profesor
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private int password;
    private int codigo;
    private String direccion;
    private int fono;
    private String cargo;
    private Perfil tipoUsuario;
    private int rut;
    private String horario;
 
    
    public Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Perfil getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Perfil tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getPass() {
        return password;
    }

    public void setPass(int pass) {
        this.password = pass;
    }
    
    public Boolean valida(Usuario usu){
    
        bdUsuario usua = new bdUsuario();
        
        if(usua.valida(usu)){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<String> listarCargos(){
    
        bdUsuario lista = new bdUsuario();
        return lista.traerListaCargos();
    }
    public ArrayList<String> listarHorarios(){
    
        bdUsuario lista = new bdUsuario();
        return lista.traerListaHorarios();
    }
    
     public Boolean crearUsuario(Usuario usu){
         return null;
     }   
     public Boolean actualizarUsuario(Usuario usu){
         return null;
     }   
     public Boolean eliminarUsuario(Usuario usu){
         return null;
    }
    
    
}
