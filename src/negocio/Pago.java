/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;
import datos.*;
/**
 *
 * @author Arturoandres
 */
public class Pago {
    
    public int id;
    public int monto;
    public Date fechapago;
    public Departamento pago;

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

    public Pago(int id, int monto, Date fechapago, Departamento pago) {
        this.id = id;
        this.monto = monto;
        this.fechapago = fechapago;
        this.pago = pago;
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

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public Departamento getPago() {
        return pago;
    }

    public void setPago(Departamento pago) {
        this.pago = pago;
    }
    
    
    
    
    
}
