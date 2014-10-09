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
public class Pago {
    
    public int id;
    public int monto;
    public String fechapago;
    public int Ndepto;

    public Pago() {
    }
    
     public boolean GenerarPagos(Pago pag) {
        bdpago bp = new bdpago();
        if(bp.GenerarPagos(pag)){
        return true;
        }else{
        return false;
        }
         
         
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public int getNdepto() {
        return Ndepto;
    }

    public void setNdepto(int Ndepto) {
        this.Ndepto = Ndepto;
    }
    
    
    
    
    
}
