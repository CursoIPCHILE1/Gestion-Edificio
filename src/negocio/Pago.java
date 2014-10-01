/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;

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
    
     public int GenerarPagos() {
        int generapago = 0;
         return generapago;
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
