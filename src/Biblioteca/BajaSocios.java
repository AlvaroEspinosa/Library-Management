/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;


import Clases.Socio;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class BajaSocios extends javax.swing.JFrame {
     public Map socios= new HashMap();
     public Socio auxSocio=null;
     public Iterator it;
      
    /**
     * Creates new form BajaSocios
     */
    public BajaSocios() {
        initComponents();
        this.setTitle("Biblioteca de la UAH");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoSocio = new javax.swing.JTextField();
        darBajaSocio = new javax.swing.JButton();
        reiniciarDatos = new javax.swing.JButton();
        listaSocio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        opcionAtras = new javax.swing.JMenu();
        IrGestionSocios = new javax.swing.JRadioButtonMenuItem();
        IrMenuPrincipal = new javax.swing.JRadioButtonMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBiblio.png"))); // NOI18N

        jLabel4.setText("Código del socio");

        codigoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSocioActionPerformed(evt);
            }
        });

        darBajaSocio.setBackground(new java.awt.Color(255, 0, 0));
        darBajaSocio.setText("DAR DE BAJA AL SOCIO");
        darBajaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darBajaSocioActionPerformed(evt);
            }
        });

        reiniciarDatos.setBackground(new java.awt.Color(255, 102, 51));
        reiniciarDatos.setText("Reiniciar");
        reiniciarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarDatosActionPerformed(evt);
            }
        });

        listaSocio.setBackground(new java.awt.Color(51, 204, 255));
        listaSocio.setText("GENERAR LISTA CODIGO-SOCIO");
        listaSocio.setToolTipText("Genera una lista \"socio-codigo\" en un mensaje");
        listaSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSocioActionPerformed(evt);
            }
        });

        opcionAtras.setText("ATRAS");

        IrGestionSocios.setSelected(true);
        IrGestionSocios.setText("Gestion de Socios");
        IrGestionSocios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrGestionSociosActionPerformed(evt);
            }
        });
        opcionAtras.add(IrGestionSocios);

        IrMenuPrincipal.setSelected(true);
        IrMenuPrincipal.setText("Menu Principal");
        IrMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrMenuPrincipalActionPerformed(evt);
            }
        });
        opcionAtras.add(IrMenuPrincipal);

        jMenuBar1.add(opcionAtras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reiniciarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(darBajaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(listaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(reiniciarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(codigoSocio)
                    .addComponent(darBajaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setLocationRelativeTo(null);
        try {
            //Lectura de los objetos de tipo Socio
            FileInputStream istreamSoc = new FileInputStream("fichasDeSocios.dat");
            ObjectInputStream oisSoc = new ObjectInputStream(istreamSoc);
            socios = (Map) oisSoc.readObject();
            istreamSoc.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    
        
    }//GEN-LAST:event_formWindowOpened

    private void IrGestionSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrGestionSociosActionPerformed
        // TODO add your handling code here:
        GestionSocios Ges1 = new GestionSocios();
        Ges1.setVisible(true);
         try {
            //Si hay datos los guardamos...
            if (!socios.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de los socios
                FileOutputStream ostreamSoc = new FileOutputStream("fichasDeSocios.dat");
                ObjectOutputStream oosSoc = new ObjectOutputStream(ostreamSoc);
                //guardamos el map de los socios
                oosSoc.writeObject(socios);
                ostreamSoc.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        this.dispose();
    }//GEN-LAST:event_IrGestionSociosActionPerformed

    private void IrMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrMenuPrincipalActionPerformed
        // TODO add your handling code here:
        Biblioteca library = new Biblioteca();
        library.setVisible(true);
         try {
            //Si hay datos los guardamos...
            if (!socios.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de los socios
                FileOutputStream ostreamSoc = new FileOutputStream("fichasDeSocios.dat");
                ObjectOutputStream oosSoc = new ObjectOutputStream(ostreamSoc);
                //guardamos el Map de los socios
                oosSoc.writeObject(socios);
                ostreamSoc.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        this.dispose();
    }//GEN-LAST:event_IrMenuPrincipalActionPerformed

    private void codigoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoSocioActionPerformed

    private void reiniciarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarDatosActionPerformed
        // TODO add your handling code here:
        codigoSocio.setText(""); //s deja el blanco el campo de texto
    }//GEN-LAST:event_reiniciarDatosActionPerformed

    private void darBajaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darBajaSocioActionPerformed
        // TODO add your handling code here:   
        String codi;
        String auxname;
        int n = 0;
        n = JOptionPane.showConfirmDialog( //primero lanzamos un mensaje de confirmacion para asegurar de que se quiere borrar
                    this, "Desea borrar al socio?",
                    "Diálogo de Confirmación",
                    JOptionPane.YES_NO_CANCEL_OPTION);
        if (n == JOptionPane.YES_OPTION) { // si la opcion es SI se efectua el codigo
             codi=codigoSocio.getText();
             if (socios.containsKey(codi)) {//se comprueba que el codigo existe
                Socio auxsocio=(Socio) socios.get(codi);
                auxname=auxsocio.getNombreSocio();
                socios.remove(codi);//se borra del Map Socios, a la persona con el codigo que hemos introducido
                JOptionPane.showMessageDialog(this, "Socio: "+auxname+" ha sido  borrado de "
                    + "la Biblioteca", "Mensaje de baja", JOptionPane.WARNING_MESSAGE);
                codigoSocio.setText("");
            } 
            else {// si el codigo no existe se lanza un mensaje de error
                JOptionPane.showMessageDialog(this,"El codigo de socio no existe","Mensaje de error", JOptionPane.ERROR_MESSAGE);
            } 
            }else if (n == JOptionPane.NO_OPTION) {
         
            }else if (n == JOptionPane.CANCEL_OPTION){
        
            }
    }//GEN-LAST:event_darBajaSocioActionPerformed

    private void listaSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSocioActionPerformed
        // Generamos una lista para saber todos los codigos y los nombres a los que estan asignados
        String auxCoSocio;
        String auxname;
        String auxcod;
        int lengh =socios.size();//se coge la longitud del MAP SOCIOS
        String [] lista = new String [lengh];//se crea una array donde introduciremos los datos
        int cont=0;//se estable un contador 
        it = socios.entrySet().iterator();//se crea un iterator para recorrer el MAP 
        if (socios.size()>0){// si hay socios 
           while(it.hasNext() && cont<=lengh){ // se comprueba que hay socios y que el contador sea igual o menor que la longitud del MAP
              Map.Entry me = (Map.Entry)it.next();
              auxCoSocio=(String) me.getKey();//se consigue la clave del siguiente elemento del MAP
              auxSocio=(Socio) socios.get(auxCoSocio);//se consigue el objeto Socio con la clave adquirida
              auxname=auxSocio.getNombreSocio();//se consigue el nombre del socio
              auxcod=auxSocio.getCodigo();//se consigue el codigo del socio
              lista[cont]="Nombre del Socio :"+auxname+" - codigo del socio: "
                    + " "+auxcod+"\n";
              cont++;
              //se introduce esta cadena en array
            }
     }
     JOptionPane.showMessageDialog(this, lista , "lista nombre-codigo", JOptionPane.INFORMATION_MESSAGE);
     //se crea una mensaje con la lista de nombres-codigo de los socios  
    }//GEN-LAST:event_listaSocioActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         try {
            //Si hay datos los guardamos...
            if (!socios.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de los socios
                FileOutputStream ostreamSoc = new FileOutputStream("fichasDeSocios.dat");
                ObjectOutputStream oosSoc = new ObjectOutputStream(ostreamSoc);
                //guardamos el MAP de los socios con los nuevos cambios
                oosSoc.writeObject(socios);
                ostreamSoc.close();
            } else {
                System.out.println("Error: No hay datos...");//si no se tiene datos en el MAP se imprime este error
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BajaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BajaSocios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem IrGestionSocios;
    private javax.swing.JRadioButtonMenuItem IrMenuPrincipal;
    private javax.swing.JTextField codigoSocio;
    private javax.swing.JButton darBajaSocio;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listaSocio;
    private javax.swing.JMenu opcionAtras;
    private javax.swing.JButton reiniciarDatos;
    // End of variables declaration//GEN-END:variables
}