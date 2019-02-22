/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.bean;

/**
 *
 * @author EDUARDO
 */
public class LlamadaDepartamental extends Llamada {
    private double precioUno;
    private double precioDos;
    private double precioTres;
    private int franja;

    public double getPrecioUno() {
        return precioUno;
    }

    public void setPrecioUno(double precioUno) {
        this.precioUno = precioUno;
    }

    public double getPrecioDos() {
        return precioDos;
    }

    public void setPrecioDos(double precioDos) {
        this.precioDos = precioDos;
    }

    public double getPrecioTres() {
        return precioTres;
    }

    public void setPrecioTres(double precioTres) {
        this.precioTres = precioTres;
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
    
    @Override
    public double calcularPrecio(){
        //Llamada: Lunes - VIernes 06:00 - 22:00
        double resultado =0;
        if(this.getFranja() == 0){
            resultado = this.getDuracion() * this.getPrecioUno();
        }else if(this.getFranja() == 1){  //Llamada: Lunes - Viernes 22:01 - 05:59
            resultado = this.getDuracion() * this.getPrecioDos();
        }else if (this.getFranja() == 2){ //Llamada: Sabado - Domingo 06:01 - 05:59
            resultado = this.getDuracion() * this.getPrecioTres();
        }
        return resultado;
    }
    public String toString(){
      return "Numero Origen: " + this.getNumeroOrigen() + 
             " Numero Destino: " + this.getNumeroDestino() + 
             " Franja: " + this.getFranja();
    }
}
