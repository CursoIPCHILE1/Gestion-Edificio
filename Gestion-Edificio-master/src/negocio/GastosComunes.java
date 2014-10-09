/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class GastosComunes {
    
    private int año;
    private int mes;
    private Lavanderia cobro;
    private Edificio codcant;
    
    private int luz;
    private int agua;
    private int gas;
    private int administracion;
    private int aseo;
    private int contingencia;
    
    public GastosComunes(){
    }

    public int CalcularGastosComunes(){
        int calculargastoscomunes = Sumargastoscomunes()/codcant.getNumPiso(); 
        return calculargastoscomunes;
    }
    
   public int Sumargastoscomunes(){
    int sumagastocomun =  luz+  agua+  gas+ aseo+  administracion+ contingencia;
       return sumagastocomun;
       
   }
   public String Informe(){
       String info = "select año, mes, codcant, luz, agua, gas, administracion, aseo, contingencia from Gastoscomunes"; 
       return info;
   }   
   
    /**
     * @return the cod
     */
    
    

    /**
     * @return the cobro
     */
   public int año() {
       return año;
   }

    /**
     * @param cobro the cobro to set
     */
   public int mes(){
       return mes;
   }
    /**
     * @return the coddepto
     */
    public Edificio getCodcant() {
        return codcant;
    }

    /**
     * @param coddepto the coddepto to set
     */
    public void setCodcant(Edificio codcant) {
        this.codcant = codcant;
    }

    /**
     * @return the fecha
     */
   

    /**
     * @return the luz
     */
    public int getLuz() {
        return luz;
    }

    /**
     * @param luz the luz to set
     */
    public void setLuz(int luz) {
        this.luz = luz;
    }

    /**
     * @return the agua
     */
    public int getAgua() {
        return agua;
    }

    /**
     * @param agua the agua to set
     */
    public void setAgua(int agua) {
        this.agua = agua;
    }

    /**
     * @return the gas
     */
    public int getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(int gas) {
        this.gas = gas;
    }

    /**
     * @return the administracion
     */
    public int getAdministracion() {
        return administracion;
    }

    /**
     * @param administracion the administracion to set
     */
    public void setAdministracion(int administracion) {
        this.administracion = administracion;
    }

    /**
     * @return the aseo
     */
    public int getAseo() {
        return aseo;
    }

    /**
     * @param aseo the aseo to set
     */
    public void setAseo(int aseo) {
        this.aseo = aseo;
    }

    /**
     * @return the contingencia
     */
    public int getContingencia() {
        return contingencia;
    }

    /**
     * @param contingencia the contingencia to set
     */
    public void setContingencia(int contingencia) {
        this.contingencia = contingencia;
    }
    
    
    
    
    
    
    
}