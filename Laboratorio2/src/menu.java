import java.util.ArrayList;
public class menu extends javax.swing.JFrame {
    ArrayList<Usuario> listaUsuarios;
    Usuario usuarioActual;
    public menu(Usuario u, ArrayList<Usuario> listaUsuarios) {
    initComponents();
    this.usuarioActual = u;
    this.listaUsuarios = listaUsuarios;
        if (usuarioActual != null && !usuarioActual.rol.equals("ADMIN")) {
        UsermainBottom.setEnabled(false);
        PassButton1.setEnabled(false);
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        LogoutButton = new javax.swing.JButton();
        UsermainBottom = new javax.swing.JButton();
        UsersListButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PassButton1 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogoutButton.setText("LOG OUT");
        LogoutButton.addActionListener(this::LogoutButtonActionPerformed);

        UsermainBottom.setText("USER MAINTENANCE");
        UsermainBottom.addActionListener(this::UsermainBottomActionPerformed);

        UsersListButton.setText("USERS LIST");
        UsersListButton.addActionListener(this::UsersListButtonActionPerformed);

        jLabel1.setText("MAIN MENU");

        PassButton1.setText("PASSWORD RESET");
        PassButton1.addActionListener(this::PassButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(LogoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsermainBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UsersListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PassButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(UsermainBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PassButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsersListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        new Login().setVisible(true);
        this.dispose();    }//GEN-LAST:event_LogoutButtonActionPerformed
    private void UsermainBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsermainBottomActionPerformed
        if (usuarioActual != null && usuarioActual.rol.equals("ADMIN")) {
        new Usermain(listaUsuarios, usuarioActual).setVisible(true);
        this.dispose();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this, "Access denied");
        }
    }//GEN-LAST:event_UsermainBottomActionPerformed
    private void UsersListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersListButtonActionPerformed
        new Usersl(listaUsuarios, usuarioActual).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsersListButtonActionPerformed
    private void PassButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassButton1ActionPerformed
        new Passwordreset(listaUsuarios, usuarioActual).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PassButton1ActionPerformed
    public static void main(String args[]) {
        new menu(null, new ArrayList<>()).setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PassButton1;
    private javax.swing.JButton UsermainBottom;
    private javax.swing.JButton UsersListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
