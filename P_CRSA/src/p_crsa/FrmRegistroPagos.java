/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p_crsa;

/**
 *
 * @author Valeri
 */
public class FrmRegistroPagos extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistroPagos
     */
    public FrmRegistroPagos() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtRegistro1 = new javax.swing.JLabel();
        txtRegistro3 = new javax.swing.JLabel();
        txtRegistro2 = new javax.swing.JLabel();
        txtRegistro4 = new javax.swing.JLabel();
        chkRealizado1 = new javax.swing.JCheckBox();
        chkNoRealizado1 = new javax.swing.JCheckBox();
        chkRealizado2 = new javax.swing.JCheckBox();
        chkNoRealizado2 = new javax.swing.JCheckBox();
        chkRealizado3 = new javax.swing.JCheckBox();
        chkNoRealizado3 = new javax.swing.JCheckBox();
        chkRealizado4 = new javax.swing.JCheckBox();
        chkNoRealizado4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        chkRealizado5 = new javax.swing.JCheckBox();
        chkNoRealizado5 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRegistro1.setText("Pago mensual de agua");

        txtRegistro3.setText("Cooperación de pozo");

        txtRegistro2.setText("Pago de agua por transferencia/deposito");

        txtRegistro4.setText("Descuento aplicado en personas de 3ra edad");

        chkRealizado1.setText("Realizado");
        chkRealizado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRealizado1ActionPerformed(evt);
            }
        });

        chkNoRealizado1.setText("No realizado");

        chkRealizado2.setText("Realizado");

        chkNoRealizado2.setText("No realizado");

        chkRealizado3.setText("Realizado");

        chkNoRealizado3.setText("No realizado");

        chkRealizado4.setText("Realizado");

        chkNoRealizado4.setText("No realizado");

        jLabel1.setText("Adeudos saldados");

        chkRealizado5.setText("Realizado");

        chkNoRealizado5.setText("No realizado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistro1)
                    .addComponent(txtRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistro3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistro4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkRealizado5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkRealizado1)
                            .addComponent(chkRealizado2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkNoRealizado2)
                            .addComponent(chkNoRealizado1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkRealizado3)
                            .addComponent(chkRealizado4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkNoRealizado4)
                            .addComponent(chkNoRealizado3)
                            .addComponent(chkNoRealizado5))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistro1)
                    .addComponent(chkRealizado1)
                    .addComponent(chkNoRealizado1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistro2)
                    .addComponent(chkRealizado2)
                    .addComponent(chkNoRealizado2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistro3)
                    .addComponent(chkRealizado3)
                    .addComponent(chkNoRealizado3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistro4)
                    .addComponent(chkRealizado4)
                    .addComponent(chkNoRealizado4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chkRealizado5)
                    .addComponent(chkNoRealizado5))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkRealizado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRealizado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRealizado1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkNoRealizado1;
    private javax.swing.JCheckBox chkNoRealizado2;
    private javax.swing.JCheckBox chkNoRealizado3;
    private javax.swing.JCheckBox chkNoRealizado4;
    private javax.swing.JCheckBox chkNoRealizado5;
    private javax.swing.JCheckBox chkRealizado1;
    private javax.swing.JCheckBox chkRealizado2;
    private javax.swing.JCheckBox chkRealizado3;
    private javax.swing.JCheckBox chkRealizado4;
    private javax.swing.JCheckBox chkRealizado5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtRegistro1;
    private javax.swing.JLabel txtRegistro2;
    private javax.swing.JLabel txtRegistro3;
    private javax.swing.JLabel txtRegistro4;
    // End of variables declaration//GEN-END:variables
}
