/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;
import Clases.Socio;
import java.io.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class AltaSocios extends javax.swing.JFrame {
     public String codigoClienteEntero;
     public Map socios= new HashMap();
     public Socio auxsocio=null;
     public int lenght=socios.size();
     
     
      
     public GregorianCalendar getFechaEntrada() {
        Date dia = (Date) fechaEntrada.getValue();
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dia);
        return gc;
    }
    /**
     * Creates new form AltaSocios
     */
    public AltaSocios() {
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DNItext = new javax.swing.JTextField();
        categoria = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BorrarDatos = new javax.swing.JButton();
        aceptarSocio = new javax.swing.JButton();
        GenerarCodigoCliente = new javax.swing.JButton();
        codigoSocio = new javax.swing.JTextField();
        numero = new javax.swing.JSpinner();
        fechaEntrada = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        opcionAtras = new javax.swing.JMenu();
        IrGestionSocios = new javax.swing.JRadioButtonMenuItem();
        IrMenuPrincipal = new javax.swing.JRadioButtonMenuItem();

        jFormattedTextField1.setText("jFormattedTextField1");

        jMenu2.setText("jMenu2");

        jMenu6.setText("jMenu6");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem3.setText("jMenuItem3");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

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

        jLabel1.setText("Nombre");

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alumno", "Profesor" }));

        jLabel3.setText("Categoria");

        jLabel4.setText("Código del socio");

        jLabel6.setText("Fecha de Inscripción");

        BorrarDatos.setBackground(new java.awt.Color(255, 51, 51));
        BorrarDatos.setText("BORRAR DATOS");
        BorrarDatos.setToolTipText("Reinicia los datos del socio, para escribir unos nuevos sin necesidad de borrar");
        BorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarDatosActionPerformed(evt);
            }
        });

        aceptarSocio.setBackground(new java.awt.Color(51, 255, 51));
        aceptarSocio.setText("ACEPTAR SOCIO");
        aceptarSocio.setName(""); // NOI18N
        aceptarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarSocioActionPerformed(evt);
            }
        });

        GenerarCodigoCliente.setBackground(new java.awt.Color(51, 204, 255));
        GenerarCodigoCliente.setText("Generar Código");
        GenerarCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarCodigoClienteActionPerformed(evt);
            }
        });

        codigoSocio.setEditable(false);
        codigoSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoSocioActionPerformed(evt);
            }
        });

        numero.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(10000), Integer.valueOf(10000), null, Integer.valueOf(1)));
        numero.setValue(10000);

        fechaEntrada.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(-3600000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        fechaEntrada.setToolTipText("haz \"doble click\" en el dato de la fecha que quieras cambiar");
        fechaEntrada.setEditor(new javax.swing.JSpinner.DateEditor(fechaEntrada, "dd/MM/yyyy"));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DNItext, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombreText)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(BorrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(aceptarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GenerarCodigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(numero)
                                    .addComponent(codigoSocio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenerarCodigoCliente)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombreText))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoSocio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(DNItext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrarDatos))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String auxCoSocio = null;
        setLocationRelativeTo(null);
        int auxCodigoControl,auxMayor, auxMenor;
        int longitud=1;
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
        /** todo este codigo sirve, para que cuando se abra esta ventana,
         en el spinner se quede el ultimo numero que se ha generado.*/
        Iterator it = socios.entrySet().iterator();//creas un iterador para recorrer el Map
        if (socios.size()>0){
        Map.Entry me = (Map.Entry)it.next();
        auxCoSocio=(String) me.getKey();//consigues la primera "Clave" del primer elemento del MAP
        String auxCodigo2=auxCoSocio.substring(0, 5);
        auxCodigoControl=Integer.parseInt(auxCodigo2);
        auxMayor=auxCodigoControl;// lo anterior sirve para trasnformar la clave en un numero aceptable para el spinner
        while(it.hasNext()){//recorres el MAP comparando las distintas claves
            me = (Map.Entry)it.next();
            String auxCoSocio2=(String) me.getKey();
            String auxCodigo3=auxCoSocio2.substring(0, 5);
            int auxCodigoControl2=Integer.parseInt(auxCodigo3);
            if (auxCodigoControl2>auxMayor) {
                auxMayor=auxCodigoControl2;
            }
            longitud++;
        }
        
        numero.setValue(auxMayor);//la clave mayor es la que se queda puesta en el spinner
        }else {
            numero.setValue(10000);  
       }
      JOptionPane.showMessageDialog(this,"El número del codigo del socio, es el último guardado",
              "Mensaje Informativo",JOptionPane.INFORMATION_MESSAGE);
      System.out.println(socios.toString());
    }//GEN-LAST:event_formWindowOpened

    private void GenerarCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarCodigoClienteActionPerformed
        // Genera el codigo del Socio uniendo el numero del Spinner con la letra, de la categoria del socio
        String caracterCa = null;
        if (categoria.getSelectedItem().equals("Alumno")) 
            caracterCa="A";//si el socio es un alumno se suma la letra "A"
        else if (categoria.getSelectedItem().equals("Profesor"))
            caracterCa="P";// si el socio es profesor, se le suma la letra "P"
       int codigoNumero=(int) numero.getValue();
       codigoClienteEntero= codigoNumero+"-"+caracterCa;
       codigoSocio.setText(codigoClienteEntero);//se ha generado ya el codigo y se pone en campo de texto correspondiente
    }//GEN-LAST:event_GenerarCodigoClienteActionPerformed

    private void codigoSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoSocioActionPerformed

    private void aceptarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarSocioActionPerformed
        /** Aqui se va a dar de alta al socio, guardandolo en un HASHMAP de tipo socios
         para ello se recogen los datos que el usuario pone y con ellos se instancia la clase*/
        Socio s1;
        String name= nombreText.getText();
        String dni= DNItext.getText();
        String category=(String) categoria.getSelectedItem();
        String codigo= codigoSocio.getText();
        GregorianCalendar fecha=getFechaEntrada();
        Date d =fecha.getTime();
        String fn = DateFormat.getDateInstance(DateFormat.SHORT).format(d);
        if (name.equals("")||dni.equals("")|| category.equals("")||codigo.equals("")){ 
            //si no rellenas todos los campos, no te deja continuar con el alta del socio
            JOptionPane.showMessageDialog(this,"Existen campos sin rellenar!"+"\n"+ "por favor "
                    + "rellene todos los campos para continuar",
                    "Mensaje de Advertencia",JOptionPane.WARNING_MESSAGE);
        }else {//instancia la clase socio
            s1=new Socio (name,dni,category,codigo,fecha);
            if (socios.containsKey(codigo)){//pero si el codigo es el mismo te salta una excepcion
                 JOptionPane.showMessageDialog(this,"El Socio ya esta "
                    + "registrado en la base de datos",
                    "Mensaje de erro",JOptionPane.WARNING_MESSAGE);
            } else  {
                socios.put(codigo,s1);/**Si todo sale correcto,el objeto Socio se introduce
                 en el Map, con la clave, el codogido del mismo*/
                JOptionPane.showMessageDialog(this,"El socio: "+name+"("+category+")"+"\n"+"con DNI: "+dni
                +"\n"+"con codigo de socio: "+codigo+"\n"+
                "Se ha inscrito en el registro a fecha: "+fn+"\n"        
                +"se ha inscrito en el registro de la Biblioteca correctamente");
          }
      } 
    }//GEN-LAST:event_aceptarSocioActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void BorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarDatosActionPerformed
        // Se dejan los campos de texto en blanco.
        //El spinner y el comobo box vuelven a sus valores iniciales.
        int longitud=0;
        int auxCodigoControl,auxMayor, auxMenor;
        String auxCoSocio = null;
        nombreText.setText("");
        codigoSocio.setText("");
        DNItext.setText("");
        categoria.setSelectedIndex(0);
        GregorianCalendar gc = new GregorianCalendar();
        gc=(GregorianCalendar) Calendar.getInstance();
        Date dia = gc.getTime();
        fechaEntrada.setValue(dia);
       /**es el mismo codigo que antes, que sirve para dejar el spinner con el 
        *valor mas alto de codigo*/
        Iterator it = socios.entrySet().iterator();
        if (socios.size()>0){
        Map.Entry me = (Map.Entry)it.next();
        auxCoSocio=(String) me.getKey();
        String auxCodigo2=auxCoSocio.substring(0, 5);
        auxCodigoControl=Integer.parseInt(auxCodigo2);
        auxMayor=auxCodigoControl;
        while(it.hasNext()){
             me = (Map.Entry)it.next();
             String auxCoSocio2=(String) me.getKey();
             String auxCodigo3=auxCoSocio2.substring(0, 5);
             int auxCodigoControl2=Integer.parseInt(auxCodigo3);
             if (auxCodigoControl2>auxMayor) {
                auxMayor=auxCodigoControl2;
             }
             longitud++;
         }
        
            numero.setValue(auxMayor);
        }else {
        numero.setValue(10000);  
        }
    }//GEN-LAST:event_BorrarDatosActionPerformed

    private void IrGestionSociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrGestionSociosActionPerformed
        // TODO add your handling code here:
        GestionSocios Ges1=new GestionSocios();
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
                System.out.println("Error: No hay Socios inscritos en la biblioteca");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    
        this.dispose();//se cierra la ventana con los datos guardados
    }//GEN-LAST:event_IrGestionSociosActionPerformed

    private void IrMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrMenuPrincipalActionPerformed
        // TODO add your handling code here:
        Biblioteca library= new Biblioteca();
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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AltaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaSocios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AltaSocios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarDatos;
    private javax.swing.JTextField DNItext;
    private javax.swing.JButton GenerarCodigoCliente;
    private javax.swing.JRadioButtonMenuItem IrGestionSocios;
    private javax.swing.JRadioButtonMenuItem IrMenuPrincipal;
    public javax.swing.JButton aceptarSocio;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextField codigoSocio;
    private javax.swing.JSpinner fechaEntrada;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField nombreText;
    private javax.swing.JSpinner numero;
    private javax.swing.JMenu opcionAtras;
    // End of variables declaration//GEN-END:variables
}
