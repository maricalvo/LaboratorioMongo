
package tallermongo;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrameBPeliculas extends javax.swing.JFrame {
   
    //VARIABLES 
    Pelicula datosviejos = new Pelicula();
    Pelicula datosnuevos = new Pelicula();

    public FrameBPeliculas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7compañia = new javax.swing.JTextField();
        jTextField1genero = new javax.swing.JTextField();
        jTextField2director = new javax.swing.JTextField();
        jTextField3franquicia = new javax.swing.JTextField();
        jTextField4pais = new javax.swing.JTextField();
        jTextField5año = new javax.swing.JTextField();
        jTextField6duracion = new javax.swing.JTextField();
        jButton4mostrar = new javax.swing.JButton();
        jButton1Insertar1 = new javax.swing.JButton();
        jButton2Actualizar1 = new javax.swing.JButton();
        jButton3eliminar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField0nombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDATOSPELIS = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jTextField8actores = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PELÍCULAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Actores:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Director:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Franquicia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("País:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Año:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Duración:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        jTextField7compañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7compañiaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7compañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 170, -1));

        jTextField1genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1generoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));

        jTextField2director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2directorActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2director, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));

        jTextField3franquicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3franquiciaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3franquicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, -1));

        jTextField4pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4paisActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, -1));

        jTextField5año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5añoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5año, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 170, -1));

        jTextField6duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6duracionActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 170, -1));

        jButton4mostrar.setText("MOSTRAR");
        jButton4mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        jButton1Insertar1.setText("INSERTAR");
        jButton1Insertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1Insertar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Insertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jButton2Actualizar1.setText("ACTUALIZAR");
        jButton2Actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2Actualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2Actualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jButton3eliminar1.setText("ELIMINAR");
        jButton3eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3eliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Género:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        jPanel1.add(jTextField0nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, -1));

        jTableDATOSPELIS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Género", "Director", "Franquicia", "País", "Año", "Duración", "Compañía", "Agentes"
            }
        ));
        jTableDATOSPELIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDATOSPELISMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableDATOSPELIS);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 510, 360));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Compañia:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 20));
        jPanel1.add(jTextField8actores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7compañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7compañiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7compañiaActionPerformed

    private void jTextField1generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1generoActionPerformed

    private void jTextField2directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2directorActionPerformed

    private void jTextField3franquiciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3franquiciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3franquiciaActionPerformed

    private void jTextField4paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4paisActionPerformed

    private void jTextField5añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5añoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5añoActionPerformed

    private void jTextField6duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6duracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6duracionActionPerformed
   
    //Método para eliminar de la tabla.
    public void limpiartabla(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) jTableDATOSPELIS.getModel();
            int filas=jTableDATOSPELIS.getRowCount();
            for (int i = 0;i<=filas; i++) {
                modelo.removeRow(0);
            }
        } 
        catch (Exception e) {
        }
    }
    
    private void jButton1Insertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1Insertar1ActionPerformed
        // TODO add your handling code here: 
        Pelicula insercion = new Pelicula();
        insercion.ObtenerConexionPelicula();
        
        ArrayList<String> losactores = new ArrayList<>();
        
        //Split
        String conjunto_actores = jTextField8actores.getText();
        String[] arrayconjunto = conjunto_actores.split(",");
        
        //Ciclo para que se inserte en la variable correspondiente:
        
        for(int i =0; i <arrayconjunto.length;i++){
            losactores.add(arrayconjunto[i]);
        }
        System.out.println(losactores);

        //Inserta en la base de datos
        insercion.InsertarPelicula(jTextField0nombre.getText(),jTextField1genero.getText(),jTextField2director.getText(),jTextField3franquicia.getText(),
                jTextField4pais.getText(),Integer.parseInt(jTextField5año.getText()),
                Integer.parseInt(jTextField6duracion.getText()),jTextField7compañia.getText(),losactores);    
    }//GEN-LAST:event_jButton1Insertar1ActionPerformed

    private void jButton4mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4mostrarActionPerformed
        // TODO add your handling code here:
        limpiartabla();
        
        Pelicula collection = new Pelicula();
        collection.ObtenerConexionPelicula();
        
        DefaultTableModel modelo1 = (DefaultTableModel) jTableDATOSPELIS.getModel();
        
        DBCollection laselecciono = collection.getcolec();
        DBCursor cursor = laselecciono.find();
        while (cursor.hasNext()){
            cursor.next();
            
            String nombre = (String)cursor.curr().get("Nombre");
            String genero = (String)cursor.curr().get("Género");
            String director = (String)cursor.curr().get("Director");
            String franquicia = (String)cursor.curr().get("Franquicia");
            String pais = (String)cursor.curr().get("País");
            int año = (int)cursor.curr().get("Año");
            int duracion = (int)cursor.curr().get("Duración");
            String compañia = (String)cursor.curr().get("Compañía"); 
            ArrayList<String> actores = (ArrayList<String>) cursor.curr().get("Actores");
                        
            modelo1.addRow(new Object[]{nombre,genero,director,franquicia,pais,año,duracion,compañia,actores});
        }
    }//GEN-LAST:event_jButton4mostrarActionPerformed

    private void jButton3eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3eliminar1ActionPerformed
        // TODO add your handling code here:
        Pelicula eliminacion = new Pelicula();
        eliminacion.ObtenerConexionPelicula();
        
        ArrayList<String> losactores = new ArrayList<>();
        
        //Split
        String conjunto_actores = jTextField8actores.getText();
        String[] arrayconjunto = conjunto_actores.split(",");
        
        //Ciclo para que se inserte en la variable correspondiente:
        
        for(int i =0; i <arrayconjunto.length;i++){
            losactores.add(arrayconjunto[i]);
        }
        
        //Método de eliminación
        eliminacion.EliminarPeliculas(jTextField0nombre.getText(),jTextField1genero.getText(),jTextField2director.getText(),jTextField3franquicia.getText(),
                jTextField4pais.getText(),Integer.parseInt(jTextField5año.getText()),
                Integer.parseInt(jTextField6duracion.getText()),jTextField7compañia.getText(),losactores);
    }//GEN-LAST:event_jButton3eliminar1ActionPerformed

    private void jButton2Actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2Actualizar1ActionPerformed
        // TODO add your handling code here:
        Pelicula actualizacion = new Pelicula();
        actualizacion.ObtenerConexionPelicula();
        
        //Guardar los datos nuevos.
        datosnuevos.setnombre(jTextField0nombre.getText());
        datosnuevos.setgenero(jTextField1genero.getText());
        datosnuevos.setdirector(jTextField2director.getText());
        datosnuevos.setfranquicia(jTextField3franquicia.getText());
        datosnuevos.setpais(jTextField4pais.getText());
        datosnuevos.setaño(Integer.parseInt(jTextField5año.getText()));
        datosnuevos.setduracion(Integer.parseInt(jTextField6duracion.getText()));
        datosnuevos.setcompañia(jTextField7compañia.getText()); 
                
        actualizacion.ActualizarPeliculas(datosviejos, datosnuevos);
    }//GEN-LAST:event_jButton2Actualizar1ActionPerformed

    private void jTableDATOSPELISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDATOSPELISMouseClicked
        // TODO add your handling code here:
        int seleccion = jTableDATOSPELIS.rowAtPoint(evt.getPoint());        
        //Setear los datos a los txt
        jTextField0nombre.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,0)));
        jTextField1genero.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,1)));
        jTextField2director.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,2)));
        jTextField3franquicia.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,3)));
        jTextField4pais.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,4)));
        jTextField5año.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,5)));
        jTextField6duracion.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,6)));
        jTextField7compañia.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,7)));
        jTextField8actores.setText(String.valueOf(jTableDATOSPELIS.getValueAt(seleccion,8)));
        
        //Guarda Datos viejos        
        datosviejos.setnombre(jTextField0nombre.getText());
        datosviejos.setgenero(jTextField1genero.getText());
        datosviejos.setdirector(jTextField2director.getText());
        datosviejos.setfranquicia(jTextField3franquicia.getText());
        datosviejos.setpais(jTextField4pais.getText());
        datosviejos.setaño(Integer.parseInt(jTextField5año.getText()));
        datosviejos.setduracion(Integer.parseInt(jTextField6duracion.getText()));
        datosviejos.setcompañia(jTextField7compañia.getText());
    }//GEN-LAST:event_jTableDATOSPELISMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameBPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Insertar1;
    private javax.swing.JButton jButton2Actualizar1;
    private javax.swing.JButton jButton3eliminar1;
    private javax.swing.JButton jButton4mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableDATOSPELIS;
    private javax.swing.JTextField jTextField0nombre;
    private javax.swing.JTextField jTextField1genero;
    private javax.swing.JTextField jTextField2director;
    private javax.swing.JTextField jTextField3franquicia;
    private javax.swing.JTextField jTextField4pais;
    private javax.swing.JTextField jTextField5año;
    private javax.swing.JTextField jTextField6duracion;
    private javax.swing.JTextField jTextField7compañia;
    private javax.swing.JTextField jTextField8actores;
    // End of variables declaration//GEN-END:variables
}
