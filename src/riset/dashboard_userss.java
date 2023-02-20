/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package riset;
 
import aplikasiPenjualan.koneksi;
import aplikasiPenjualan.menu_utama;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author faish
 */
public class dashboard_userss extends javax.swing.JFrame {
    
    

    /**
     * Creates new form home_users
     */
    public dashboard_userss() {
        initComponents();
        
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        
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

        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        img2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        img2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                img2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                img2AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        img2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                img2ComponentShown(evt);
            }
        });
        img2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                img2PropertyChange(evt);
            }
        });
        jPanel1.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 180, 270));

        img1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        img1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                img1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                img1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        img1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                img1ComponentShown(evt);
            }
        });
        img1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                img1PropertyChange(evt);
            }
        });
        jPanel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 180, 270));

        welcomeName.setFont(new java.awt.Font("AR DESTINE", 0, 36)); // NOI18N
        jPanel1.add(welcomeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 270, 80));

        jLabel4.setFont(new java.awt.Font("AR DESTINE", 0, 24)); // NOI18N
        jLabel4.setText("Playing");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("AR DESTINE", 0, 36)); // NOI18N
        jLabel3.setText("WELCOME!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/avatar.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bekgron.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_img1PropertyChange
        // TODO add your handling code here:        
        
        
    }//GEN-LAST:event_img1PropertyChange

    private void img1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_img1ComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_img1ComponentShown

    private void img1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_img1AncestorAdded
        // TODO add your handling code here:
        Connection dbconn = koneksi.connectDB();
        try{
            Statement st = dbconn.createStatement();
            ResultSet rs = st.executeQuery("SELECT img FROM films WHERE id_film = 'TUX-001'");
            if (rs.next()){
                
                byte[] img = rs.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                img1.setIcon(newImage);
            
            }else {
                JOptionPane.showMessageDialog(null, "Tidak Ada Data");
            }                  
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_img1AncestorAdded

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null,"Apakah yakin Logout?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (pilih == JOptionPane.OK_OPTION){            
            dashboard_userss du = new dashboard_userss();
            dispose();
            menu_utama mu = new menu_utama();
            mu.setVisible(true);
            
                                            
        } else {
            JOptionPane.getRootFrame();
            
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void img1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_img1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_img1AncestorMoved

    private void img2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_img2AncestorAdded
        // TODO add your handling code here:
        Connection dbconn = koneksi.connectDB();
        try{
            Statement st = dbconn.createStatement();
            ResultSet rs = st.executeQuery("SELECT img FROM films WHERE id_film = 'TUX-002'");
            if (rs.next()){
                
                byte[] img = rs.getBytes("img");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImg = im.getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImg);
                img2.setIcon(newImage);
            
            }else {
                JOptionPane.showMessageDialog(null, "Tidak Ada Data");
            }                  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_img2AncestorAdded

    private void img2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_img2AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_img2AncestorMoved

    private void img2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_img2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_img2ComponentShown

    private void img2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_img2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_img2PropertyChange

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
            java.util.logging.Logger.getLogger(dashboard_userss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_userss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_userss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_userss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_userss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static final javax.swing.JLabel welcomeName = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
