/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviliapp;

/**
 *
 * @author Rubén Darío Martínez
 */
public class Travel extends javax.swing.JFrame {

    /**
     * Creates new form Travel
     */
    public Travel() {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaButton();
        
    }
    
     public void transparenciaButton(){
        Atras.setOpaque(false);
        Atras.setContentAreaFilled(false);
        Atras.setBorderPainted(false);
        
        Iniciar.setOpaque(false);
        Iniciar.setContentAreaFilled(false);
        Iniciar.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PuntoDestino = new javax.swing.JTextField();
        PuntoPartida = new javax.swing.JTextField();
        Atras = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PuntoDestino.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        PuntoDestino.setForeground(new java.awt.Color(61, 61, 61));
        PuntoDestino.setToolTipText("User");
        PuntoDestino.setBorder(null);
        PuntoDestino.setSelectedTextColor(new java.awt.Color(87, 81, 81));
        PuntoDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(PuntoDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 140, 20));

        PuntoPartida.setFont(new java.awt.Font("Rubik", 1, 18)); // NOI18N
        PuntoPartida.setForeground(new java.awt.Color(61, 61, 61));
        PuntoPartida.setToolTipText("User");
        PuntoPartida.setBorder(null);
        PuntoPartida.setSelectedTextColor(new java.awt.Color(87, 81, 81));
        PuntoPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(PuntoPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 140, 20));

        Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        Iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src_images/Travel.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PuntoDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntoDestinoActionPerformed

    private void PuntoPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuntoPartidaActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Travel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Travel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextField PuntoDestino;
    private javax.swing.JTextField PuntoPartida;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
