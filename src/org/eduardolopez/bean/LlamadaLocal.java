/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.bean;

/**
 *
 * @author EDUARDO
 */
public class LlamadaLocal extends Llamada {
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double calcularPrecio(){
        return this.getPrecio() * this.getDuracion();
    }
    public String toString(){
      return "Numero Origen: " + this.getNumeroOrigen() + 
             " Numero Destino: " + this.getNumeroDestino();
                         
    }
}
