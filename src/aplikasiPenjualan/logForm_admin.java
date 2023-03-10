/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package aplikasiPenjualan;

//import riset.dashboard_userss;
import java.awt.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faish
 */
public class logForm_admin extends javax.swing.JInternalFrame {

    /**
     * Creates new form regForm
     */
    
    public logForm_admin() {
        initComponents();
        
        // CENTRALIZE WINDOW
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 4 - this.getSize().width / 2;
        int y = layar.height / 4 - this.getSize().height / 3;
        this.setLocation(x,y);
        
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        setClosable(true);
        setForeground(java.awt.Color.green);
        setTitle("LOGIN ADMIN");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUsername)
                    .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = tfUsername.getText();
        String password = String.valueOf(tfPassword.getPassword());
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,"Username/Password tidak boleh kosong", 
                    "ups Error",JOptionPane.ERROR_MESSAGE);
        }else{
            // START LOGIN PROCCESS
            adminLogin(username,password);
        }
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    private void adminLogin(String username,String password){
        Connection dbconn = koneksi.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("SELECT * from admin WHERE username = ? AND password = ? ");
            st.setString(1,username);
            st.setString(2,password);
            ResultSet res = st.executeQuery();
            if(res.next()){
                // MENAMPILKAN DASHBOARD SETELAH LOGIN
                dispose();                
                dashboard_admin d = new dashboard_admin();
                d.setTitle("Dashboard nih boousss");
                d.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this,"Username/Password tidak ditemukan", 
                        "ups Error",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(logForm_user.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("Databse tidak tersedia");
        }
        
    }
}