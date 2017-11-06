/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;
import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author Alvaro
 */
public class Revistas extends Publicacion implements Serializable {
    
    
    public String periocidad;
    public int volumen; 
    public int numero;
    public GregorianCalendar anioDisponible;
    public String localizacionFisica;

    public Revistas(String periocidad, int volumen, int numero, GregorianCalendar anioDisponible, String localizacionFisica, String codigoControl, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicacion, String caratula, int paginas, String coleccion, String genero, String observaciones) {
        super(codigoControl, ISBN, titulo, autores, fechaPublicacion, caratula, paginas, coleccion, genero, observaciones);
        this.periocidad = periocidad;
        this.volumen = volumen;
        this.numero = numero;
        this.anioDisponible = anioDisponible;
        this.localizacionFisica = localizacionFisica;
    }

   
    
    public String getPeriocidad() {
        return periocidad;
    }
    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }
    
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public GregorianCalendar getAnioDisponible() {
        return anioDisponible;
    }
    public void setAnioDisponible(GregorianCalendar anioDisponible) {
        this.anioDisponible = anioDisponible;
    }

    public String getLocalizacionFisica() {
        return localizacionFisica;
    }
    public void setLocalizacionFisica(String localizacionFisica) {
        this.localizacionFisica = localizacionFisica;
    }

}
