/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiPenjualan;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author faish
 */
public class dashboard_admin extends javax.swing.JFrame {

    /**
     * Creates new form dashboard_admin
     */
    public dashboard_admin() {
        initComponents();
        // Central
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x,y);
        //SCALING TO FIT
        ImageIcon bg = new ImageIcon("C:\\Users\\faish\\Documents\\NetBeansProjects\\tubesPBO\\src\\gambar\\bekgronz.jpg");
        Image img1 = bg.getImage();
        Image img2 = img1.getScaledInstance(labelBG.getWidth(),labelBG.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaledImg = new ImageIcon(img2);
        labelBG.setIcon(scaledImg);
   
        ImageIcon n = new ImageIcon("C:\\Users\\faish\\Documents\\NetBeansProjects\\tubesPBO\\src\\gambar\\admin.png");
        Image img3 = n.getImage();
        Image img4 = img3.getScaledInstance(admin.getWidth(),admin.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scale = new ImageIcon(img4);
        admin.setIcon(scale);
        
        ImageIcon m = new ImageIcon("C:\\Users\\faish\\Documents\\NetBeansProjects\\tubesPBO\\src\\gambar\\trash.png");
        Image img5 = m.getImage();
        Image img6 = img5.getScaledInstance(delete.getWidth(),delete.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon s = new ImageIcon(img6);
        delete.setIcon(s);

        ImageIcon o = new ImageIcon("C:\\Users\\faish\\Documents\\NetBeansProjects\\tubesPBO\\src\\gambar\\add.png");
        Image img7 = o.getImage();
        Image img8 = img7.getScaledInstance(add.getWidth(),add.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon v = new ImageIcon(img8);
        add.setIcon(v);
 
        ImageIcon p = new ImageIcon("C:\\Users\\faish\\Documents\\NetBeansProjects\\tubesPBO\\src\\gambar\\update.png");
        Image img9 = p.getImage();
        Image img10 = img9.getScaledInstance(update.getWidth(),update.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon l = new ImageIcon(img10);
        update.setIcon(l);
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
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 58)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("              UPDATE KUOTA FILM");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 580, 130));
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 90, 90));

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 58)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("           TAMBAH FILM");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 480, 110));

        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 90, 90));

        jLabel5.setFont(new java.awt.Font("Gabriola", 0, 58)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("          HAPUS FILM");
        jLabel5.setToolTipText("");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 460, 110));
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 90, 90));
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 180));

        jLabel2.setFont(new java.awt.Font("Rota", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Halo min, mau ngapain sekarang?");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 700, 80));

        jLabel3.setBackground(new java.awt.Color(255, 102, 51));
        jLabel3.setFont(new java.awt.Font("Rota", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bekgronz.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 130));
        jPanel1.add(labelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 930, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        admin_hapusFilm hapus = new admin_hapusFilm();
        hapus.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_deleteMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        admin_hapusFilm hapus = new admin_hapusFilm();
        hapus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        admin_tambahFilm tambah = new admin_tambahFilm();
        tambah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        admin_updateFilm update = new admin_updateFilm();
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null,"Apakah yakin Logout?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (pilih == JOptionPane.OK_OPTION){            
            dashboard_admin da = new dashboard_admin();
            dispose();
            admin_updateFilm au = new admin_updateFilm();
            au.dispose();
//            menu_utama mu = new menu_utama();
//            mu.setVisible(true);
            
                                            
        } else {
            JOptionPane.getRootFrame();
            
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBG;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
