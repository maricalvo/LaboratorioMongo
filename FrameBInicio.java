/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermongo;

/**
 *
 * @author Mari Calvo
 */
public class FrameBInicio extends javax.swing.JFrame {

    /**
     * Creates new form FrameBInicio
     */
    public FrameBInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1Pelicula = new javax.swing.JButton();
        jButtonCompañia = new javax.swing.JButton();
        jButtonConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración de Películas y Compañías");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jButton1Pelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1Pelicula.setText("PELÍCULAS");
        jButton1Pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PeliculaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Pelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 70));

        jButtonCompañia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCompañia.setText("COMPAÑÍAS");
        jButtonCompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompañiaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCompañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 70));

        jButtonConsultas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConsultas.setText("CONSULTAS");
        jButtonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultasActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 110, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1PeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1PeliculaActionPerformed
        // TODO add your handling code here:
        FrameBPeliculas prueba = new FrameBPeliculas();
        prueba.setVisible(true);
    }//GEN-LAST:event_jButton1PeliculaActionPerformed

    private void jButtonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultasActionPerformed
        // TODO add your handling code here:
        FrameBConsultas prueba = new FrameBConsultas();
        prueba.setVisible(true);
    }//GEN-LAST:event_jButtonConsultasActionPerformed

    private void jButtonCompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompañiaActionPerformed
        // TODO add your handling code here:
        FrameBCompañias prueba = new FrameBCompañias();
        prueba.setVisible(true);   
    }//GEN-LAST:event_jButtonCompañiaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrameBInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Pelicula;
    private javax.swing.JButton jButtonCompañia;
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
