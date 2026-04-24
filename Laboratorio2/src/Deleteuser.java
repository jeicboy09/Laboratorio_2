import java.util.ArrayList;
public class Deleteuser extends javax.swing.JFrame {
    private final ArrayList<Usuario> listaUsuarios;
    private final Usuario adminActual;
    private final Usermain ventanaAnterior;
    public Deleteuser(ArrayList<Usuario> listaUsuarios, Usuario adminActual, Usermain ventanaAnterior) {
    initComponents();
    this.listaUsuarios = listaUsuarios;
    this.adminActual = adminActual;
    this.ventanaAnterior = ventanaAnterior;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        USERTextField1 = new javax.swing.JTextField();
        PasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        CButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CancelButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User name:");

        USERTextField1.addActionListener(this::USERTextField1ActionPerformed);

        PasswordField1.addActionListener(this::PasswordField1ActionPerformed);

        jLabel2.setText("Password:");

        CButton1.setText("CONFIRM");
        CButton1.addActionListener(this::CButton1ActionPerformed);

        jLabel3.setText("DELETE USER");

        CancelButton1.setText("BACK");
        CancelButton1.addActionListener(this::CancelButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(USERTextField1)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CancelButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(USERTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton1)
                    .addComponent(CButton1))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USERTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERTextField1ActionPerformed
    private void CButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButton1ActionPerformed
    String username = USERTextField1.getText();
    String passAdmin = new String(PasswordField1.getPassword());
    if (username.isEmpty() || passAdmin.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "All fields are required");
        return;
    }
    // Validar contraseña del admin
    if (!adminActual.password.equals(passAdmin)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid password");
        return;
    }
    Usuario eliminar = null;
    for (Usuario u : listaUsuarios) {
        if (u.username.equals(username)) {
            eliminar = u;
            break;
        }
    }
    if (eliminar == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "User not found");
        return;
    }
    int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
    this,
    "Are you sure you want to delete this user?",
    "Confirm delete",
    javax.swing.JOptionPane.YES_NO_OPTION
);
if (confirmacion != javax.swing.JOptionPane.YES_OPTION) {
    return; // Si elige NO, no hace nada
}
    listaUsuarios.remove(eliminar);
    Login.guardarUsuarios(listaUsuarios);
    javax.swing.JOptionPane.showMessageDialog(this, "The user was deleted successfully");
    USERTextField1.setText("");
    PasswordField1.setText("");
    }//GEN-LAST:event_CButton1ActionPerformed
    private void PasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordField1ActionPerformed
    private void CancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButton1ActionPerformed
        ventanaAnterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CButton1;
    private javax.swing.JButton CancelButton1;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JTextField USERTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
