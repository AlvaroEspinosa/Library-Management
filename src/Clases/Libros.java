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
public class Libros extends Publicacion implements Serializable {
   
    
    public String editorial;
    public String localidad;
    public String contenido;
    public String edicion;
    public String localizacionFisica;

    public Libros(String editorial, String localidad, String contenido, String edicion, String localizacionFisica, String codigoControl, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicacion, String caratula, int paginas, String coleccion, String genero, String observaciones) {
        super(codigoControl, ISBN, titulo, autores, fechaPublicacion, caratula, paginas, coleccion, genero, observaciones);
        this.editorial = editorial;
        this.localidad = localidad;
        this.contenido = contenido;
        this.edicion = edicion;
        this.localizacionFisica = localizacionFisica;
    }
 
    
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
   
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
   
   
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    public String getLocalizacionFisica() {
        return localizacionFisica;
    }
    public void setLocalizacionFisica(String localizacionFisica) {
        this.localizacionFisica = localizacionFisica;
    }

}
