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
public class SerializarRevistas {
    private static ArrayList<Revistas> revistas = new ArrayList<Revistas>();
    private static Revistas objRevista;
    
     public static void setLibros(ArrayList<Revistas> magazine) {
        revistas = magazine;
    }
     
      public static ArrayList<Revistas> getRevista() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomPerComp = new Comparator() {

            public int compare(Object o1, Object o2) {
                Revistas magazine1 = (Revistas) o1;
                Revistas magazine2 = (Revistas) o2;
                return magazine1.getCodigoControl().compareTo(magazine2.getCodigoControl());
            }
        };
        //Ordenamos el array
        Collections.sort(revistas, NomPerComp);
        return revistas;
    }
      
      
      public static boolean altaRevista(Revistas objRevista) {
        if (!revistas.contains(objRevista)) {
            revistas.add(objRevista);
            return true;
        } else {
            return false;
        }

    }
      


 public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamRev = new FileInputStream("RevistasDatos.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamRev);
            revistas = (ArrayList) oisPer.readObject();
            istreamRev.close();
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
            if (!revistas.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream ostreamRev = new FileOutputStream("RevistasDatos.dat");
                ObjectOutputStream oosRev = new ObjectOutputStream(ostreamRev);
                //guardamos el array de personas
                oosRev.writeObject(revistas);
                ostreamRev.close();
            } else {
                System.out.println("Error: No hay revistas en la biblioteca");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


 }
}


