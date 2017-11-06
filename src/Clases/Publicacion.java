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
public  class Publicacion implements Serializable{

    public String codigoControl;
    public String ISBN;
    public String titulo;
    public String autores;
    public GregorianCalendar fechaPublicacion;
    public String caratula;
    public int paginas;
    public String coleccion;
    public String genero;
    public String observaciones;

    public Publicacion(String codigoControl, String ISBN, String titulo, String autores, GregorianCalendar fechaPublicacion, String caratula, int paginas, String coleccion, String genero, String observaciones) {
        this.codigoControl = codigoControl;
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autores = autores;
        this.fechaPublicacion = fechaPublicacion;
        this.caratula = caratula;
        this.paginas = paginas;
        this.coleccion = coleccion;
        this.genero = genero;
        this.observaciones = observaciones;
    }

   
    
    
    public String getCodigoControl() {
        return codigoControl;
    }
    public void setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
    }
  
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }
    public void setAutores(String autores) {
        this.autores = autores;
    }

    public GregorianCalendar getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(GregorianCalendar fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getCaratula() {
        return caratula;
    }
    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public String getColeccion() {
        return coleccion;
    }
    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
