import java.util.ArrayList;
    public class Usermain extends javax.swing.JFrame {
    ArrayList<Usuario> listaUsuarios;
    Usuario adminActual;
    public Usermain() {
    }
    Usermain(ArrayList<Usuario> listaUsuarios, Usuario adminActual) {
    initComponents();
    this.listaUsuarios = listaUsuarios;
    this.adminActual = adminActual;
}
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NuButton = new javax.swing.JButton();
        UMButton = new javax.swing.JButton();
        DLButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NuButton.setText("NEW USER");
        NuButton.addActionListener(this::NuButtonActionPerformed);

        UMButton.setText("EDIT USER");
        UMButton.addActionListener(this::UMButtonActionPerformed);

        DLButton.setText("DELETE USER");
        DLButton.addActionListener(this::DLButtonActionPerformed);

        BackButton.setText("BACK");
        BackButton.addActionListener(this::BackButtonActionPerformed);

        jLabel1.setText("USER MAINTENANCE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UMButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(NuButton)
                .addGap(35, 35, 35)
                .addComponent(UMButton)
                .addGap(35, 35, 35)
                .addComponent(DLButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void NuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuButtonActionPerformed
        new Newuser(listaUsuarios).setVisible(true);
    }//GEN-LAST:event_NuButtonActionPerformed
    private void UMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UMButtonActionPerformed
        new edituser(listaUsuarios, adminActual, this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UMButtonActionPerformed
    private void DLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLButtonActionPerformed
        new Deleteuser(listaUsuarios, adminActual, this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DLButtonActionPerformed
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new menu(adminActual, listaUsuarios).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Usermain().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DLButton;
    private javax.swing.JButton NuButton;
    private javax.swing.JButton UMButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
