import java.util.ArrayList;
public class Passwordreset extends javax.swing.JFrame {
    private Usuario usuarioActual;
    private ArrayList<Usuario> listaUsuarios;
    public Passwordreset(ArrayList<Usuario> listaUsuarios, Usuario usuarioActual) {
    initComponents();
    this.listaUsuarios = listaUsuarios;
    this.usuarioActual = usuarioActual;
    }
    Passwordreset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        OldPasswordField1 = new javax.swing.JPasswordField();
        NewPasswordField2 = new javax.swing.JPasswordField();
        ConfirmNPasswordField3 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User name:");

        OldPasswordField1.addActionListener(this::OldPasswordField1ActionPerformed);

        NewPasswordField2.addActionListener(this::NewPasswordField2ActionPerformed);

        ConfirmNPasswordField3.addActionListener(this::ConfirmNPasswordField3ActionPerformed);

        jButton1.setText("CONFIRM");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("BACK");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel2.setText("Password:");

        jLabel3.setText("New password");

        jLabel4.setText("New Password Verification");

        username.addActionListener(this::usernameActionPerformed);

        jLabel5.setText("PASSWORD RESET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(OldPasswordField1)
                            .addComponent(NewPasswordField2)
                            .addComponent(ConfirmNPasswordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OldPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmNPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new menu(usuarioActual, listaUsuarios).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = username.getText();
        String oldPass = new String(OldPasswordField1.getPassword());
        String newPass = new String(NewPasswordField2.getPassword());
        String confirmPass = new String(ConfirmNPasswordField3.getPassword());
        // Validar campos
        if (user.isEmpty() || oldPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }
        // Buscar usuario
        Usuario encontrado = null;
        for (Usuario u : listaUsuarios) {
            if (u.username.equals(user)) {
                encontrado = u;
                break;
            }
        }
        if (encontrado == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "User not found");
            return;
        }
        // Validar contraseña actual
        if (!encontrado.password.equals(oldPass)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Current password is incorrect");
            return;
        }
        // Validar nueva contraseña
        if (newPass.length() < 13 || !newPass.matches(".*[A-Z].*") || !newPass.matches(".*[^a-zA-Z0-9].*")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Password must be at least 13 characters long, include 1 uppercase letter, and 1 symbol.");
            return;
        }
        // Confirmar contraseña
        if (!newPass.equals(confirmPass)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match");
            return;
        }
        // Guardar cambio
        encontrado.password = newPass;
        // Guardar en archivo
        Login.guardarUsuarios(listaUsuarios);
        javax.swing.JOptionPane.showMessageDialog(this, "Password updated successfully");
        // Limpiar campos
        username.setText("");
        OldPasswordField1.setText("");
        NewPasswordField2.setText("");
        ConfirmNPasswordField3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void OldPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPasswordField1ActionPerformed
    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    private void NewPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPasswordField2ActionPerformed
    private void ConfirmNPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmNPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmNPasswordField3ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Passwordreset().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmNPasswordField3;
    private javax.swing.JPasswordField NewPasswordField2;
    private javax.swing.JPasswordField OldPasswordField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
