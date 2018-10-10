
package tallermongo;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import javax.swing.table.DefaultTableModel;


public class FrameBCompañias extends javax.swing.JFrame {
    
    //VARIABLES
    Compañia datosviejos = new Compañia();
    Compañia datosnuevos = new Compañia();
    
    public FrameBCompañias() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3link = new javax.swing.JTextField();
        jTextField1nombre = new javax.swing.JTextField();
        jTextField2año = new javax.swing.JTextField();
        MOSTRAR = new javax.swing.JButton();
        jButton1insertar1 = new javax.swing.JButton();
        jButton2actualizar1 = new javax.swing.JButton();
        jButton3eliminar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPAÑÍAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Link:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(jTextField3link, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 150, -1));
        jPanel1.add(jTextField1nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));
        jPanel1.add(jTextField2año, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, -1));

        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });
        jPanel1.add(MOSTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jButton1insertar1.setText("INSERTAR");
        jButton1insertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1insertar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1insertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jButton2actualizar1.setText("ACTUALIZAR");
        jButton2actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2actualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2actualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jButton3eliminar1.setText("ELIMINAR");
        jButton3eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3eliminar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Año", "Link"
            }
        ));

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 460, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para eliminar de la tabla.
    public void limpiartabla(){
        try {
            DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
            int filas=jTable1.getRowCount();
            for (int i = 0;i<=filas; i++) {
                modelo.removeRow(0);
            }
        } 
        catch (Exception e) {
        }
    }
    
    private void jButton1insertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1insertar1ActionPerformed
        // TODO add your handling code here:
        Compañia insercion = new Compañia();
        insercion.ObtenerConexionCompañia();
                
        insercion.InsertarCompañia(jTextField1nombre.getText(), Integer.parseInt(jTextField2año.getText()), jTextField3link.getText());
        //tabladatoscompañias.addRow(new Object[]{jTextField1nombre.getText(),jTextField2año.getText(), jTextField3link.getText()});      
    }//GEN-LAST:event_jButton1insertar1ActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        // TODO add your handling code here:       
        limpiartabla();
        
        Compañia collection = new Compañia();
        collection.ObtenerConexionCompañia();
        
        DefaultTableModel modelo1 = (DefaultTableModel) jTable1.getModel();
        
        DBCollection laselecciono = collection.getcolec();
        DBCursor cursor = laselecciono.find();
        while (cursor.hasNext()){
            //jTextAreaAreaPelis.setText(jTextAreaAreaPelis.getText()+"\n"+cursor.next());  
            cursor.next();
            String nombre = (String)cursor.curr().get("Nombre");
            int año = (int)cursor.curr().get("Año");
            String link = (String)cursor.curr().get("Link");           
            modelo1.addRow(new Object[]{nombre,año,link});      
            
        }
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void jButton3eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3eliminar1ActionPerformed
        // TODO add your handling code here:
        Compañia eliminacion = new Compañia();
        eliminacion.ObtenerConexionCompañia();
        eliminacion.EliminarCompañia(jTextField1nombre.getText(), Integer.parseInt(jTextField2año.getText()), jTextField3link.getText());
    }//GEN-LAST:event_jButton3eliminar1ActionPerformed

    private void jButton2actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2actualizar1ActionPerformed
        // TODO add your handling code here:
        Compañia actualizacion = new Compañia();
        actualizacion.ObtenerConexionCompañia();
        
        //Obtener datos nuevos
        datosnuevos.setnombre(jTextField1nombre.getText());
        datosnuevos.setaño( Integer.parseInt(jTextField2año.getText()));
        datosnuevos.setlink( jTextField3link.getText());
        
        actualizacion.ActualizarCompañia(datosviejos, datosnuevos);
        
    }//GEN-LAST:event_jButton2actualizar1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int seleccion = jTable1.rowAtPoint(evt.getPoint());        
        //Setear los datos a los txt
        jTextField1nombre.setText(String.valueOf(jTable1.getValueAt(seleccion,0)));
        jTextField2año.setText(String.valueOf(jTable1.getValueAt(seleccion,1)));
        jTextField3link.setText(String.valueOf(jTable1.getValueAt(seleccion,2)));
        
        //Obtener datos viejos
        datosviejos.setnombre(jTextField1nombre.getText());
        datosviejos.setaño(Integer.parseInt(jTextField2año.getText()));
        datosviejos.setlink(jTextField3link.getText());
    }//GEN-LAST:event_jTable1MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBCompañias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBCompañias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JButton jButton1insertar1;
    private javax.swing.JButton jButton2actualizar1;
    private javax.swing.JButton jButton3eliminar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1nombre;
    private javax.swing.JTextField jTextField2año;
    private javax.swing.JTextField jTextField3link;
    // End of variables declaration//GEN-END:variables
}
