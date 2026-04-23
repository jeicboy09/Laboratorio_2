import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 * @author jeicb
 */
public class Login extends javax.swing.JFrame {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public Login() {
        initComponents();
        cargarUsuarios();
    }
    public void cargarUsuarios(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jeicb\\OneDrive\\Documentos\\NetBeansProjects\\Laboratorio2\\build\\classes\\users.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Usuario u = new Usuario(
                        datos[0],
                        datos[1],
                        datos[2],
                        Integer.parseInt(datos[3]),
                        datos[4]
                );
                listaUsuarios.add(u);
            }
            br.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer usuarios");
        }
  }
public void guardarUsuarios() {
    try {
        java.io.BufferedWriter bw = new java.io.BufferedWriter(
            new java.io.FileWriter("C:\\Users\\jeicb\\OneDrive\\Documentos\\NetBeansProjects\\Laboratorio2\\build\\classes\\users.txt")
        );
        for (Usuario u :listaUsuarios) {
            bw.write(u.username + "," +
                     u.password + "," +
                     u.rol + "," +
                     u.intentos + "," +
                     u.estado);
            bw.newLine();
        }
        bw.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar usuarios");
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User:");

        jLabel2.setText("Password:");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton1.setText("Login");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());

        if (usuario.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar usuario y contraseña");
            return;
        }
        for (Usuario u : listaUsuarios) {
            if (u.username.equals(usuario)) {
                if (u.estado.equals("BLOQUEADO") && !u.rol.equals("ADMIN")) {
                    JOptionPane.showMessageDialog(this, "Usuario bloqueado. Contacte al administrador.");
                    return;
                }
                if (u.password.equals(password)) {
                    JOptionPane.showMessageDialog(this, "Bienvenido " + u.username);
                    u.intentos = 0;
                    guardarUsuarios();
                    return;
                } else {
                   u.intentos++;
                    JOptionPane.showMessageDialog(this, "Error, contraseña equivocada intente de nuevo");
                    guardarUsuarios();
                        if (u.intentos >= 3 && !u.rol.equals("ADMIN")) {
                            u.estado = "BLOQUEADO";
                            JOptionPane.showMessageDialog(this, "Usuario bloqueado");
                            guardarUsuarios();
    }
    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Usuario no encontrado");
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
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
        } catch (Exception ex) {
                }
        new Login().setVisible(true);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}