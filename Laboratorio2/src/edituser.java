import java.util.ArrayList;
public class edituser extends javax.swing.JFrame {
    private final java.util.ArrayList<Usuario> listaUsuarios;
    private final Usuario adminActual;
    private final Usermain ventanaAnterior;
    public edituser(ArrayList<Usuario> listaUsuarios, Usuario adminActual, Usermain ventanaAnterior) {
    initComponents();
    this.listaUsuarios = listaUsuarios;
    this.adminActual = adminActual;
    this.ventanaAnterior = ventanaAnterior;
    StatusComboBox1.removeAllItems();
    StatusComboBox1.addItem("ACTIVE");
    StatusComboBox1.addItem("INACTIVE");
    }
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UTextField = new javax.swing.JTextField();
        StatusComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ConfirmPasswordField1 = new javax.swing.JPasswordField();
        ConfirmButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CancellJButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User name:");

        UTextField.addActionListener(this::UTextFieldActionPerformed);

        StatusComboBox1.addActionListener(this::StatusComboBox1ActionPerformed);

        jLabel2.setText("Status:");

        jLabel3.setText("Password");

        ConfirmPasswordField1.addActionListener(this::ConfirmPasswordField1ActionPerformed);

        ConfirmButton1.setText("CONFIRM");
        ConfirmButton1.addActionListener(this::ConfirmButton1ActionPerformed);

        jLabel4.setText("EDIT USER");

        CancellJButton1.setText("BACK");
        CancellJButton1.addActionListener(this::CancellJButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(48, 48, 48)
                                            .addComponent(ConfirmPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(67, 67, 67)
                                            .addComponent(StatusComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(46, 46, 46)
                                        .addComponent(UTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel4)))
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CancellJButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ConfirmPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancellJButton1)
                    .addComponent(ConfirmButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void UTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UTextFieldActionPerformed
    private void StatusComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusComboBox1ActionPerformed
    private void ConfirmPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordField1ActionPerformed
    private void ConfirmButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButton1ActionPerformed
    String username = UTextField.getText();
    String nuevoEstado = StatusComboBox1.getSelectedItem().toString();
    String passAdmin = new String(ConfirmPasswordField1.getPassword());
    // Validar campos
    if (username.isEmpty() || passAdmin.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "All fields are required");
        return;
    }
    // Validar contraseña del admin
    if (!adminActual.password.equals(passAdmin)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Invalid administrator password");
        return;
    }
    // Buscar usuario
    Usuario encontrado = null;
    for (Usuario u : listaUsuarios) {
        if (u.username.equals(username)) {
            encontrado = u;
            break;
        }
    }
    if (encontrado == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "User not found");
        return;
    }
    // Cambiar estado
    encontrado.estado = nuevoEstado;
    if (encontrado.intentos >= 3) {
        encontrado.intentos = 0;
    }
    javax.swing.JOptionPane.showMessageDialog(this, "User updated successfully");
    Login.guardarUsuarios(listaUsuarios);
    UTextField.setText("");
    ConfirmPasswordField1.setText("");
    }//GEN-LAST:event_ConfirmButton1ActionPerformed
    private void CancellJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancellJButton1ActionPerformed
        ventanaAnterior.setVisible(true); //REGRESA al mismo Usermain
        this.dispose(); 
    }//GEN-LAST:event_CancellJButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancellJButton1;
    private javax.swing.JButton ConfirmButton1;
    private javax.swing.JPasswordField ConfirmPasswordField1;
    private javax.swing.JComboBox<String> StatusComboBox1;
    private javax.swing.JTextField UTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
