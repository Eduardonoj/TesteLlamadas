/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.sistema;

import java.util.ArrayList;
import java.util.List;
import org.eduardolopez.bean.Llamada;
import org.eduardolopez.bean.LlamadaDepartamental;
import org.eduardolopez.bean.LlamadaLocal;

/**
 *
 * @author EDUARDO
 */
public class Principal {
    public static void main(String args[]){
        Llamada localUno = new LlamadaLocal();
        Llamada localDos = new LlamadaLocal();
        Llamada llamadaDepartamentalUno = new LlamadaDepartamental();
        List<Llamada> listaLlamadas = new ArrayList<Llamada>();
        localUno.setNumeroOrigen("123");
        localUno.setNumeroDestino("456");
        localUno.setDuracion(3.30);
        /*se convirtio a objeto tipo LlamadaLocal con (LlamadaLocal) xq se hizo de tipo llamada y se instancio de tipo LlamadaDepartamental 
        (observar linea: Llamada localUno = new LlamadaLocal();), se realizo el cast xq setPrecio no existe en Llamada y si en Llamada Local*/      
        ((LlamadaLocal)localUno).setPrecio(1.15);
        localDos.setNumeroOrigen("555");
        localDos.setNumeroDestino("777");
        localDos.setDuracion(5.30);
        /*se convirtio a objeto tipo LlamadaLocal con (LlamadaLocal) xq se hizo de tipo llamada y se instancio de tipo LlamadaDepartamental 
        (observar linea: Llamada localUno = new LlamadaLocal();), se realizo el cast xq setPrecio no existe en Llamada y si en Llamada Local*/
        ((LlamadaLocal)localDos).setPrecio(1.15);
        llamadaDepartamentalUno.setDuracion(5.30);
        llamadaDepartamentalUno.setNumeroOrigen("888");
        llamadaDepartamentalUno.setNumeroDestino("999");
        /*se convirtio a objeto tipo LlamadaDepartamental con (LlamadaDepartamental) xq se hizo de tipo llamada y se instancio
        de tipo LlamadaDepartamental (ver linea: Llamada llamadaDepartamentalUno = new LlamadaDepartamental(); ), se realizo el cast xq setFranja no existe en Llamada y si en LlamadaDepartamental*/
        ((LlamadaDepartamental)llamadaDepartamentalUno).setFranja(2);
        /*se convirtio a objeto tipo LlamadaDepartamental con (LlamadaDepartamental) xq se hizo de tipo llamada y se instancio
        de tipo LlamadaDepartamental (ver linea: Llamada llamadaDepartamentalUno = new LlamadaDepartamental(); ), se realizo el cast xq setFranja no existe en Llamada y si en LlamadaDepartamental*/
        ((LlamadaDepartamental)llamadaDepartamentalUno).setPrecioTres(2.5);         
        listaLlamadas.add(localUno);
        listaLlamadas.add(localDos);
        listaLlamadas.add(llamadaDepartamentalUno);
        for(Llamada elemento: listaLlamadas){
            if(elemento instanceof LlamadaLocal){
                System.out.println("Local: " + elemento + "Precio: " + elemento.calcularPrecio());
            }else if(elemento instanceof LlamadaDepartamental){
                System.out.println("Depto: " + elemento + "Precio: " + elemento.calcularPrecio());
            }else{
                System.out.println("Llamada no registrada en el sistema");
            }
            
        }
        
    }
}
