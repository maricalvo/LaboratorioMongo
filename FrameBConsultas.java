
package tallermongo;

import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBObject;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import static com.mongodb.client.model.Projections.include;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Accumulators.avg;
import static com.mongodb.client.model.Accumulators.max;
import static com.mongodb.client.model.Accumulators.min;
import static com.mongodb.client.model.Accumulators.sum;
import com.mongodb.client.model.Aggregates;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import com.mongodb.client.model.BsonField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Filter;
import org.bson.BsonDocument;
import org.bson.BsonString;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;

public class FrameBConsultas extends javax.swing.JFrame {

    public FrameBConsultas() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1consultaC = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4año2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Consultas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2franquicia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5compañia = new javax.swing.JTextField();
        jTextField3año1 = new javax.swing.JTextField();
        jButton1consultaB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1nombrepeli = new javax.swing.JTextField();
        jButton1consultaA = new javax.swing.JButton();
        jButtonCONSULTA = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6compañia = new javax.swing.JTextField();
        jButtonCONSULTAR6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 250, -1));

        jButton1consultaC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1consultaC.setText("CONSULTAR");
        jButton1consultaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1consultaCActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1consultaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta E:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Digite el año mayor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        jPanel1.add(jTextField4año2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 150, -1));

        jTextArea1Consultas.setColumns(20);
        jTextArea1Consultas.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Consultas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 530, 260));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consulta A:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Digite el nombre de la compañía:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        jPanel1.add(jTextField2franquicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 140, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consulta B:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Digite el nombre de la franquicia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel1.add(jTextField5compañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 150, -1));
        jPanel1.add(jTextField3año1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, -1));

        jButton1consultaB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1consultaB.setText("CONSULTAR");
        jButton1consultaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1consultaBActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1consultaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Digite el año menor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta C:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Digite el nombre de la película:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel1.add(jTextField1nombrepeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, -1));

        jButton1consultaA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1consultaA.setText("CONSULTAR");
        jButton1consultaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1consultaAActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1consultaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, -1, 20));

        jButtonCONSULTA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCONSULTA.setText("CONSULTAR");
        jButtonCONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCONSULTAActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCONSULTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Consulta D:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 90, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Digite el nombre de la compañía:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        jPanel1.add(jTextField6compañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 150, -1));

        jButtonCONSULTAR6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCONSULTAR6.setText("CONSULTAR");
        jButtonCONSULTAR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCONSULTAR6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCONSULTAR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1consultaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1consultaCActionPerformed
        // TODO add your handling code here:
        jTextArea1Consultas.setText(null);
        Pelicula collection = new Pelicula();
        collection.ObtenerConexionPelicula();
        //ECONTRAR LA COLECCION
        DBCollection lacoleccion = collection.getcolec();
        //FILTRO DE DATOS
        BasicDBObject filtro = new BasicDBObject("Año",new BasicDBObject("$gt",Integer.parseInt(jTextField3año1.getText()))
        .append("$lt",Integer.parseInt(jTextField4año2.getText())));
         
        DBCursor cursor = lacoleccion.find(filtro);
        while (cursor.hasNext()){
            jTextArea1Consultas.setText(jTextArea1Consultas.getText()+"\n"+cursor.next());
        } 
          
    }//GEN-LAST:event_jButton1consultaCActionPerformed

    private void jButton1consultaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1consultaBActionPerformed
        // TODO add your handling code here:
        jTextArea1Consultas.setText(null);
        
        Pelicula collection = new Pelicula();
        collection.ObtenerConexionPelicula();
        //ECONTRAR LA COLECCION
        DBCollection lacoleccion = collection.getcolec();
        //FILTRO DE DATOS
        BasicDBObject filtro = new BasicDBObject();      
        filtro.put("Franquicia", jTextField2franquicia.getText());
        //ESTABLECER EL CURSOR
        DBCursor cursor = lacoleccion.find(filtro);
        while (cursor.hasNext()){
            jTextArea1Consultas.setText(jTextArea1Consultas.getText()+"\n"+cursor.next());
        } 
  
    }//GEN-LAST:event_jButton1consultaBActionPerformed

    private void jButton1consultaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1consultaAActionPerformed
        // TODO add your handling code here:
        jTextArea1Consultas.setText(null);
        Pelicula collection = new Pelicula();
        collection.ObtenerConexionPelicula();
        //ECONTRAR LA COLECCION
        DBCollection lacoleccion = collection.getcolec();
        //FILTRO DE DATOS
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Nombre", jTextField1nombrepeli.getText());
        //ESTABLECER EL CURSOR
        DBCursor cursor = lacoleccion.find(filtro);
        while (cursor.hasNext()){
            jTextArea1Consultas.setText(jTextArea1Consultas.getText()+"\n"+cursor.next());
        } 
    }//GEN-LAST:event_jButton1consultaAActionPerformed

    private void jButtonCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCONSULTAActionPerformed
        // TODO add your handling code here:
        jTextArea1Consultas.setText(null);
        
        MongoClient mongoclient = new MongoClient ("localhost",27017);
        MongoDatabase database = mongoclient.getDatabase("AdministracionPeliculasCompañias");
        
        MongoCollection<org.bson.Document> coleccion = database.getCollection("peliculas");
        //FILTRO
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Compañía", jTextField5compañia.getText());
        
        //Obtener datos
        FindIterable it = coleccion.find(filtro).projection(include("Nombre","Género","Año"));
        ArrayList<org.bson.Document> docs = new ArrayList();
        
        it.into(docs);

        for (org.bson.Document doc : docs) {
            jTextArea1Consultas.setText(jTextArea1Consultas.getText()+"\n"+ doc.toString());
        }                   
    }//GEN-LAST:event_jButtonCONSULTAActionPerformed

    private void jButtonCONSULTAR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCONSULTAR6ActionPerformed
        // TODO add your handling code here:
        jTextArea1Consultas.setText(null);
        
        MongoClient mongoclient = new MongoClient ("localhost",27017);
        DB  database = mongoclient.getDB("AdministracionPeliculasCompañias");        
        DBCollection coleccion = database.getCollection("peliculas");
        
        //FILTROS
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Compañía", jTextField6compañia.getText());
        
        //agregando el grupo
       //AggregateIterable<Document> agregar = coleccion.aggregate(Arrays.asList(Aggregates.match(eq(filtro))),
               //Aggregates.group("_id", max("MaxDuración", "$Duración"),min("MinDuración", "$Duración"),avg("AvgDuración", "$Duración"))
        //);
       
       //BasicDBObject agregar = coleccion.aggregate(Arrays.asList(Aggregates.match(eq(filtro))),
               //Aggregates.group("_id", max("MaxDuración", "$Duración"),min("MinDuración", "$Duración"),avg("AvgDuración", "$Duración"))
        //);
       // AggregateIterable<Document> agregar = coleccion.aggregate(Arrays.asList(
               // Aggregates.group("_id", new BsonField("AVGDur", new BsonDocument("$avg", new BsonString("$Duración"))))));
       
                      
        //MIN MAX Y AVG
        //MongoCollection<Document> coleccion = (MongoCollection<Document>) database.getCollection("peliculas");
       // MongoCollection<Document> coleccion2 = (MongoCollection<Document>) coleccion.find(filtro);
       // AggregateIterable<Document> agregar = coleccion2.aggregate(Arrays.asList(
                //Aggregates.group("_id", new BsonField("AVGDur", new BsonDocument("$avg", new BsonString("$Duración"))))));
        //Document result = agregar.first();
        //System.out.println("AVG:"+ result);
        
        //db.Peliculas.aggregate([{$match:{companíaProductora:"WingNut Films"}},{ $group:{_id: "$companíaProductora",MasCortaDuracion: { $first: "$minutos"}, MasLargaDuracion:{$last:"$minutos"},PromedioMinutos: { $avg: "$minutos" }, NumeroPeliculas: { $sum: 1 }}}]) 
/*Pelicula collection = new Pelicula();
        collection.ObtenerConexionPelicula();
        //ECONTRAR LA COLECCION
        DBCollection lacoleccion = collection.getcolec();
        //FILTRO DE DATOS
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Compañía", jTextField6compañia.getText());
        BasicDBObject filtro2 = new BasicDBObject();
        filtro2.put("Duración",1);
        //Contar las películas
        Long count = lacoleccion.count(filtro);
        System.out.println("El número de películas es: \n"+count);*/
//Película con menor duración
        //Cursor cursormin = lacoleccion.find(filtro).sort(new BasicDBObject("Duración",1)).limit(1);
        //Cursor cursormin = lacoleccion.find(filtro).max(filtro2);
        //System.out.println("El mínimo de duración es: \n"+cursormin);
        //Película con mayor duración
        //Cursor cursormax = lacoleccion.find(filtro).sort(filtro2).limit(1);
        //System.out.println("El máximo de duración es: \n"+cursormax);
        
   
        
       
    }//GEN-LAST:event_jButtonCONSULTAR6ActionPerformed
  
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
            java.util.logging.Logger.getLogger(FrameBConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1consultaA;
    private javax.swing.JButton jButton1consultaB;
    private javax.swing.JButton jButton1consultaC;
    private javax.swing.JButton jButtonCONSULTA;
    private javax.swing.JButton jButtonCONSULTAR6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1Consultas;
    private javax.swing.JTextField jTextField1nombrepeli;
    private javax.swing.JTextField jTextField2franquicia;
    private javax.swing.JTextField jTextField3año1;
    private javax.swing.JTextField jTextField4año2;
    private javax.swing.JTextField jTextField5compañia;
    private javax.swing.JTextField jTextField6compañia;
    // End of variables declaration//GEN-END:variables

    private static class DocumentImpl implements Document {

        public DocumentImpl() {
        }

        private DocumentImpl(String compañía, String text) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getLength() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addDocumentListener(DocumentListener dl) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeDocumentListener(DocumentListener dl) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void addUndoableEditListener(UndoableEditListener ul) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeUndoableEditListener(UndoableEditListener ul) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getProperty(Object o) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void putProperty(Object o, Object o1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void remove(int i, int i1) throws BadLocationException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public String getText(int i, int i1) throws BadLocationException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void getText(int i, int i1, Segment sgmnt) throws BadLocationException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Position getStartPosition() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Position getEndPosition() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Position createPosition(int i) throws BadLocationException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Element[] getRootElements() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Element getDefaultRootElement() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void render(Runnable r) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
