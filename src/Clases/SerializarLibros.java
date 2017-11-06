/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author Alvaro
 */
public class SerializarLibros {
    private static ArrayList<Libros> libros = new ArrayList<Libros>();
    private static Libros objlibro;
    
     public static void setLibros(ArrayList<Libros> book) {
        libros = book;
    }
     
      public static ArrayList<Libros> getLibros() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomPerComp = new Comparator() {

            public int compare(Object o1, Object o2) {
                Libros book1 = (Libros) o1;
                Libros book2 = (Libros) o2;
                return book1.getCodigoControl().compareTo(book2.getCodigoControl());
            }
        };
        //Ordenamos el array
        Collections.sort(libros, NomPerComp);
        return libros;
    }
      
      
      public static boolean altaLibro(Libros objlibro) {
        if (!libros.contains(objlibro)) {
            libros.add(objlibro);
            return true;
        } else {
            return false;
        }

    }
      

      
    public static Libros consultaLibro(int indice) {
        objlibro = libros.get(indice);
        return objlibro;
    }
    
     public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamLib = new FileInputStream("LibrosDatos.dat");
            ObjectInputStream oisLib = new ObjectInputStream(istreamLib);
            libros = (ArrayList) oisLib.readObject();// el arrayList libros toma lo que haya en LibrosDatos.dat
            istreamLib.close();//se cierra el stream
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin ca
 
 public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!libros.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamLib = new FileOutputStream("LibrosDatos.dat");
                ObjectOutputStream oosLib = new ObjectOutputStream(ostreamLib);
                //guardamos el array de personas
                oosLib.writeObject(libros);
                ostreamLib.close();
            } else {
                System.out.println("Error: No hay libros en la biblioteca");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        

       }
 }    
    
}
