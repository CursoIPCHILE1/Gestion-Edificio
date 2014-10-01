/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.bdUsuario;
/**
 *
 * @author Profesor
 */
public class Usuario {
    
    private String usuario;
    private String pass;
    
    public Usuario(){}

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public Boolean validar(Usuario usu){
    
        bdUsuario usua = new bdUsuario();
        
        if(usua.valida(usu)){
            return true;
        }else{
            return false;
        }
        
        
        
    }
    
    
}
