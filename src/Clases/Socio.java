/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author Alvaro
 */
public class Socio implements Serializable {

    public String nombreSocio;
    public String DNI;
    public String categoria;
    public String codigo;
    public GregorianCalendar fechaInscripcion;
    public Revistas tipoRevistas;
    public Libros tipoLibros;
    private GregorianCalendar fechaEntradaPubli;

    public Socio(String nombreSocio, String DNI, String categoria, String codigo, GregorianCalendar fechaInscripcion) {
        this.nombreSocio = nombreSocio;
        this.DNI = DNI;
        this.categoria = categoria;
        this.codigo = codigo;
        this.fechaInscripcion = fechaInscripcion;
        
    }

    public Socio(String nombreSocio, String DNI, String categoria, String codigo, GregorianCalendar fechaInscripcion, Libros tipoLibros, GregorianCalendar fechaEntradaPubli) {
        this.nombreSocio = nombreSocio;
        this.DNI = DNI;
        this.categoria = categoria;
        this.codigo = codigo;
        this.fechaInscripcion = fechaInscripcion;
        this.tipoLibros = tipoLibros;
        this.fechaEntradaPubli = fechaEntradaPubli;
    }

    public Socio(String nombreSocio, String DNI, String categoria, String codigo, GregorianCalendar fechaInscripcion, Revistas tipoRevistas, GregorianCalendar fechaEntradaPubli) {
        this.nombreSocio = nombreSocio;
        this.DNI = DNI;
        this.categoria = categoria;
        this.codigo = codigo;
        this.fechaInscripcion = fechaInscripcion;
        this.tipoRevistas = tipoRevistas;
        this.fechaEntradaPubli = fechaEntradaPubli;
    }


    
    
    
   
    public String getNombreSocio() {
        return nombreSocio;
    }
    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }
    
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String Codigo) {
        this.codigo = codigo;
    }
    
    public GregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }
    public void setFechaInscripcion(GregorianCalendar fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
  

    public Libros getTipoLibros() {
        return tipoLibros;
    }
    public void setTipoLibros(Libros tipoLibros) {
        this.tipoLibros = tipoLibros;
    }
    

    public Revistas getTipoRevistas() {
        return tipoRevistas;
    }
    public void setTipoRevistas(Revistas tipoRevistas) {
        this.tipoRevistas = tipoRevistas;
    }
    

    public GregorianCalendar getFechaEntradaPubli() {
        return fechaEntradaPubli;
    }
    public void setFechaEntradaPubli(GregorianCalendar fechaEntradaPubli) {
        this.fechaEntradaPubli = fechaEntradaPubli;
    }

}
