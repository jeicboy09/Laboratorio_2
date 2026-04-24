import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Newuser extends javax.swing.JFrame {
    private ArrayList<Usuario> listaUsuarios;
    public Newuser() {
        initComponents();
    }
    Newuser(ArrayList<Usuario> listaUsuarios) {
        initComponents();
        this.listaUsuarios = listaUsuarios;
        StatusBox.addItem("ADMIN");
        StatusBox.addItem("USER");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserTextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        PassVer = new javax.swing.JLabel();
        StatusBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        PasswordVerField = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserTextField.addActionListener(this::UserTextFieldActionPerformed);

        PasswordField.addActionListener(this::PasswordFieldActionPerformed);

        Username.setText("User name:");

        Password.setText("Password");

        PassVer.setText("Password verification");

        StatusBox.addActionListener(this::StatusBoxActionPerformed);

        status.setText("Group");

        cancel.setText("BACK");
        cancel.addActionListener(this::cancelActionPerformed);

        finish.setText("FINISH");
        finish.addActionListener(this::finishActionPerformed);

        jLabel1.setText("NEW USER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassVer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Username)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cancel)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UserTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordVerField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE))
                        .addContainerGap(108, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finish)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassVer)
                    .addComponent(PasswordVerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(finish))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void UserTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTextFieldActionPerformed
    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed
    private void StatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusBoxActionPerformed
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed
    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        String user = UserTextField.getText();
        String pass = new String(PasswordField.getPassword());
        String passVer = new String(PasswordVerField.getPassword());
        String rol = StatusBox.getSelectedItem().toString();
        // Validar campos
        if (user.isEmpty() || pass.isEmpty() || passVer.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "All fields are required");
            return;
        }
        // Validar contraseñas
        if (!pass.equals(passVer)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match");
            return;
        }
        if (!pass.matches("^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{13,}$")) {
            JOptionPane.showMessageDialog(this,"Password must be at least 13 characters long, include one uppercase letter, and one special character.");
            return;
}
        // Verificar si ya existe
        for (Usuario u : listaUsuarios) {
             if (u.username.equals(user)) {
                JOptionPane.showMessageDialog(this, "User already exists");
                return;
        }
    }
        // Crear usuario
        Usuario nuevo = new Usuario(user, pass, rol, 0, "ACTIVE");
        listaUsuarios.add(nuevo);
        Login.guardarUsuarios(listaUsuarios);
        javax.swing.JOptionPane.showMessageDialog(this, "User created successfully");
        // Limpiar campos
        UserTextField.setText("");
        PasswordField.setText("");
        PasswordVerField.setText("");
    }//GEN-LAST:event_finishActionPerformed
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(() -> new Newuser().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassVer;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPasswordField PasswordVerField;
    private javax.swing.JComboBox<String> StatusBox;
    private javax.swing.JTextField UserTextField;
    private javax.swing.JLabel Username;
    private javax.swing.JButton cancel;
    private javax.swing.JButton finish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}