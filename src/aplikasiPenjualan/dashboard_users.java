/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiPenjualan;
 
import static aplikasiPenjualan.pilih_film.posterFilm;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static aplikasiPenjualan.pilih_film.judulFilm_pilih;
import static aplikasiPenjualan.pilih_film.idFilm;
import static aplikasiPenjualan.pilih_film.tfSinopsis;



/**
 *
 * @author faish
 */
public class dashboard_users extends javax.swing.JFrame {
    
    public void populateJtable(){
        MyQuery mq = new MyQuery();
        ArrayList<film> list = mq.BindTable();
        String[] columnName = {"ID","NAMA FILM","TANGGAL FILM","KUOTA"," ","SINOPSIS"};
        Object[][] rows = new Object[list.size()][10];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getID();
            rows[i][1] = list.get(i).getName();
            rows[i][2] = list.get(i).getDate();
            rows[i][3] = list.get(i).getQuota();
            
            if(list.get(i).getMyImage() != null){
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
             .getScaledInstance(100, 120, Image.SCALE_SMOOTH) );

            rows[i][4] = image;
            rows[i][5] = list.get(i).getSynopsis();
            }
            else{
                rows[i][4] = null;
            }
        }
        //TABEL MODEL LEBAR KOLOM
        TheModel model = new TheModel(rows, columnName);
        jTable.setModel(model);
        jTable.setRowHeight(120);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(160);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(45);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        // HIDE KOLOM
//        TableColumnModel tcm = jTable.getColumnModel();
//        tcm.removeColumn(tcm.getColumn(0));
//        jTable.getModel().getValueAt(jTable.getSelectedRow(),0);
        jTable.removeColumn(jTable.getColumnModel().getColumn(0));
        jTable.removeColumn(jTable.getColumnModel().getColumn(4));
        
        
    }
    
    

    /**
     * Creates new form home_users
     */
    public dashboard_users() {
        initComponents();
        populateJtable();
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        orderNow = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        judulFilm = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 600, 460));

        orderNow.setText("ORDER NOW");
        orderNow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orderNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowActionPerformed(evt);
            }
        });
        jPanel1.add(orderNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 120, 40));

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        welcomeName.setFont(new java.awt.Font("AR DESTINE", 0, 36)); // NOI18N
        welcomeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(welcomeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 310, 90));

        judulFilm.setFont(new java.awt.Font("Poppins", 3, 20)); // NOI18N
        judulFilm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulFilm.setToolTipText("");
        jPanel1.add(judulFilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 280, 60));

        img3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 170, 270));

        jLabel4.setFont(new java.awt.Font("AR DESTINE", 0, 24)); // NOI18N
        jLabel4.setText("NOW PLAYING");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("AR DESTINE", 0, 36)); // NOI18N
        jLabel3.setText("WELCOME!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/avatar.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bekgron.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 730));

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

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null,"Apakah yakin Logout?",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if (pilih == JOptionPane.OK_OPTION){            
            dashboard_users du = new dashboard_users();
            dispose();
//            menu_utama mu = new menu_utama();
//            mu.setVisible(true);
            
                                            
        } else {
            JOptionPane.getRootFrame();
            
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        int i = jTable.getSelectedRow();
       
        if(jTable.getValueAt(i, 3) != null){
            ImageIcon image = (ImageIcon)jTable.getValueAt(i, 3);
            Image myImg = image.getImage().getScaledInstance(img3.getWidth(), img3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);
            img3.setIcon(newImage);  
        }
        else{
            System.out.println("No Image");
        }
        
        TheModel model = (TheModel)jTable.getModel();
        judulFilm.setText(model.getValueAt(i, 1).toString());
        

    }//GEN-LAST:event_jTableMouseClicked

    private void orderNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowActionPerformed
        // TODO add your handling code here:
        
        pilih_film coba1 = new pilih_film();
        coba1.setVisible(true);
        this.dispose();
        
        int i = jTable.getSelectedRow();
        if (jTable.getValueAt(i, 3)!= null){
            ImageIcon image = (ImageIcon)jTable.getValueAt(i, 3);
            Image myImg = image.getImage().getScaledInstance(posterFilm.getWidth(), posterFilm.getHeight(), 
                    Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImg);
            posterFilm.setIcon(newImage);
        }
        else{
                JOptionPane.showMessageDialog(this,"Username/Password tidak ditemukan", 
                        "ups Error",JOptionPane.ERROR_MESSAGE);
        }
        TheModel model = (TheModel)jTable.getModel();
        judulFilm_pilih.setText(model.getValueAt(i, 1).toString());
        idFilm.setText(model.getValueAt(i,0).toString());
        tfSinopsis.setText(model.getValueAt(i,5).toString());
        
    }//GEN-LAST:event_orderNowActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel judulFilm;
    private javax.swing.JButton orderNow;
    public static final javax.swing.JLabel welcomeName = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
