package GUI;

import DataSrc.Estacion;
import DataSrc.Ruta;
import static GUI.Main.userLog;
import Logic.DataManipulation;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rubén Darío Martínez
 */
public class Search extends javax.swing.JFrame {
        DefaultListModel infoEstaciones;
        DefaultListModel infoRutas;
    /**
     * Creates new form Search
     */
    public Search() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaButton();
        infoEstaciones = new DefaultListModel();
        ListaEstaciones.setModel(infoEstaciones);
        infoEstaciones.removeAllElements();           
        infoRutas = new DefaultListModel();
        ListaRutas.setModel(infoRutas);
        infoEstaciones.removeAllElements();
        
    }
    
      public void transparenciaButton(){
        Back.setOpaque(false);
        Back.setContentAreaFilled(false);
        Back.setBorderPainted(false);
        
        Buscar.setOpaque(false);
        Buscar.setContentAreaFilled(false);
        Buscar.setBorderPainted(false);
        
        MasCercana.setOpaque(false);
        MasCercana.setContentAreaFilled(false);
        MasCercana.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuscarEstacion = new javax.swing.JTextField();
        BuscarRuta = new javax.swing.JTextField();
        MasCercana = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaEstaciones = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaRutas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarEstacion.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        BuscarEstacion.setForeground(new java.awt.Color(61, 61, 61));
        BuscarEstacion.setToolTipText("User");
        BuscarEstacion.setBorder(null);
        BuscarEstacion.setSelectedTextColor(new java.awt.Color(87, 81, 81));
        BuscarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEstacionActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 180, 20));

        BuscarRuta.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        BuscarRuta.setForeground(new java.awt.Color(61, 61, 61));
        BuscarRuta.setToolTipText("User");
        BuscarRuta.setBorder(null);
        BuscarRuta.setSelectedTextColor(new java.awt.Color(87, 81, 81));
        BuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarRutaActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, 20));

        MasCercana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MasCercana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasCercanaActionPerformed(evt);
            }
        });
        getContentPane().add(MasCercana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 220, 60));

        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 200, 50));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 153));

        ListaEstaciones.setBackground(new java.awt.Color(220, 0, 23));
        ListaEstaciones.setFont(new java.awt.Font("Rubik", 1, 16)); // NOI18N
        ListaEstaciones.setForeground(new java.awt.Color(204, 204, 204));
        ListaEstaciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaEstaciones);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 180, 170));

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(153, 153, 153));

        ListaRutas.setBackground(new java.awt.Color(220, 0, 23));
        ListaRutas.setFont(new java.awt.Font("Rubik", 1, 16)); // NOI18N
        ListaRutas.setForeground(new java.awt.Color(204, 204, 204));
        ListaRutas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaRutas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 180, 170));

        jLabel1.setBackground(new java.awt.Color(200, 0, 23));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_images/Search.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarEstacionActionPerformed

    private void BuscarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarRutaActionPerformed

    private void MasCercanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasCercanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasCercanaActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new Main(userLog).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        if(DataManipulation.listaEstacionesHM == null){
        if(BuscarRuta.getText().isEmpty() && BuscarEstacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la ruta o la estación a buscar");
        } else{
           Ruta ruta = DataManipulation.listaRutasAVL.find(new Ruta(BuscarRuta.getText()));
           if(ruta == null){
               JOptionPane.showMessageDialog(null, "Ruta no encontrada...");
           } else{
               
               infoEstaciones.removeAllElements();
               for(Estacion estacion: ruta.getParadas()){
                   infoEstaciones.addElement(estacion);
               }
           }
           
           Estacion estacion = DataManipulation.listaEstacionesAVL.find(new Estacion(BuscarEstacion.getText()));
          
           if(estacion == null){
               JOptionPane.showMessageDialog(null, "Estacion no encontrada...");
           } else{
               //ResultadoBusqueadaEstacion.setText("Estación "+ estacion.getNombre() +" encontrada");
           }
        }
        }else {
            if(BuscarRuta.getText().isEmpty() && BuscarEstacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la ruta o la estación a buscar");
        } else{
           Ruta ruta = DataManipulation.listaRutasHM.get(BuscarRuta.getText());
           if(ruta == null){
               JOptionPane.showMessageDialog(null, "Ruta no encontrada...");
           } else{
               
               infoEstaciones.removeAllElements();
               for(Estacion estacion: ruta.getParadas()){
                   infoEstaciones.addElement(estacion);
               }
           }
           
           Estacion estacion = DataManipulation.listaEstacionesHM.get(BuscarEstacion.getText());
          
           if(estacion == null){
               JOptionPane.showMessageDialog(null, "Estacion no encontrada...");
           } else{
               //ResultadoBusqueadaEstacion.setText("Estación "+ estacion.getNombre() +" encontrada");
               
               infoRutas.removeAllElements();
               for(int i = 0; i < estacion.getListaRutas().getSize();i++){
                   infoRutas.addElement(estacion.getListaRutas().get(i));
               }
           }
        }
        }
    }//GEN-LAST:event_BuscarActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo infoEstaciones : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(infoEstaciones.getName())) {
                    javax.swing.UIManager.setLookAndFeel(infoEstaciones.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField BuscarEstacion;
    private javax.swing.JTextField BuscarRuta;
    private javax.swing.JList<String> ListaEstaciones;
    private javax.swing.JList<String> ListaRutas;
    private javax.swing.JButton MasCercana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
