/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiPenjualan;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author faish
 */
public class admin_hapusFilm extends javax.swing.JFrame {
    

    /**
     * Creates new form dashboard_admin
     */
    
    public void populateJtable(){
        MyQuery mq = new MyQuery();
        ArrayList<film> list = mq.BindTable();
        String[] columnName = {"ID", "NAMA FILM","TANGGAL FILM","KUOTA"," "};
        Object[][] rows = new Object[list.size()][6];
        for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getID();
            rows[i][1] = list.get(i).getName();
            rows[i][2] = list.get(i).getDate();
            rows[i][3] = list.get(i).getQuota();
            
            if(list.get(i).getMyImage() != null){
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
             .getScaledInstance(100, 120, Image.SCALE_SMOOTH) );

            rows[i][4] = image;
            
            }
            else{
                rows[i][4] = null;
            }

        }
        TheModel model = new TheModel(rows, columnName);
        jTable.setModel(model);
        jTable.setRowHeight(120);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(150);
    }
    
    
    
    
    public admin_hapusFilm() {
        initComponents();
        populateJtable();
        
        ImageIcon m = new ImageIcon("C:\\Users\\faish\\Documents\\NetBeansProjects\\tubesPBO\\src\\gambar\\trash.png");
        Image img5 = m.getImage();
        Image img6 = img5.getScaledInstance(delete.getWidth(),delete.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon s = new ImageIcon(img6);
        delete.setIcon(s);
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        delete = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 670, 510));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 650, 80, 30));

        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 90, 90));
        jPanel1.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 180));

        jLabel2.setFont(new java.awt.Font("Rota", 0, 43)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("P I L I H   F I L M   Y A N G   A K A N   D I H A P U S");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 910, 80));

        jLabel3.setBackground(new java.awt.Color(255, 102, 51));
        jLabel3.setFont(new java.awt.Font("Rota", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bekgronz.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 130));
        jPanel1.add(labelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 940, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        int pilih = JOptionPane.showConfirmDialog(null,"Apakah yakin Hapus film ini?",
                "KONFIRMASI", JOptionPane.OK_CANCEL_OPTION);
        if (pilih == JOptionPane.OK_OPTION){
            Connection conn = koneksi.connectDB();
            PreparedStatement pst = (null);
            int row = jTable.getSelectedRow();
            String cell = jTable.getModel().getValueAt(row,0 ).toString();
            String sql = "DELETE FROM films WHERE id_film = " + cell;
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null,"FILM BERHASIL DIHAPUS!");
                dashboard_admin da = new dashboard_admin();
                da.setVisible(true);
                this.dispose();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }               
        }else {
            JOptionPane.getRootFrame();
        }
 
        
        
        

    }//GEN-LAST:event_deleteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dashboard_admin da = new dashboard_admin();
        da.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_hapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_hapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_hapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_hapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new admin_hapusFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel labelBG;
    // End of variables declaration//GEN-END:variables
}
