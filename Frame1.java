/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbogui2;

/**
 *
 * @author asus
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form LP1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        alamat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        absen = new javax.swing.JLabel();
        kelas = new javax.swing.JLabel();
        jurusan = new javax.swing.JLabel();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JComboBox<>();
        rdb2 = new javax.swing.JRadioButton();
        rdb1 = new javax.swing.JRadioButton();
        Absen1 = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        Alamat1 = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        alamat.setText("Alamat");
        getContentPane().add(alamat);
        alamat.setBounds(20, 270, 50, 30);

        jLabel2.setText("Biodata");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 20, 50, 30);

        nama.setText("Nama");
        getContentPane().add(nama);
        nama.setBounds(30, 70, 50, 30);

        absen.setText("Absen");
        getContentPane().add(absen);
        absen.setBounds(30, 120, 50, 30);

        kelas.setText("Kelas");
        getContentPane().add(kelas);
        kelas.setBounds(30, 170, 50, 30);

        jurusan.setText("Jurusan");
        getContentPane().add(jurusan);
        jurusan.setBounds(20, 220, 50, 30);

        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama1);
        Nama1.setBounds(90, 80, 220, 30);

        Kelas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4", " ", " " }));
        Kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas1ActionPerformed(evt);
            }
        });
        getContentPane().add(Kelas1);
        Kelas1.setBounds(90, 180, 130, 20);

        rdb2.setText("TKJ");
        rdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb2);
        rdb2.setBounds(170, 230, 50, 23);

        rdb1.setText("RPL");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb1);
        rdb1.setBounds(90, 230, 50, 23);

        Absen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Absen1ActionPerformed(evt);
            }
        });
        getContentPane().add(Absen1);
        Absen1.setBounds(90, 130, 220, 30);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(220, 340, 73, 23);

        Alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alamat1ActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat1);
        Alamat1.setBounds(80, 270, 220, 30);

        Send.setText("Send");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        getContentPane().add(Send);
        Send.setBounds(90, 340, 73, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Pictures\\1.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 390);

        setBounds(0, 0, 614, 427);
    }// </editor-fold>//GEN-END:initComponents

    private void rdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb2ActionPerformed

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb1ActionPerformed

    private void Kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas1ActionPerformed

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

    private void Absen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Absen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Absen1ActionPerformed

    private void Alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alamat1ActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        String nama = Nama1.getText();
        String absen = Absen1.getText();
        String kelas = Kelas1.getSelectedItem().toString(); 
        String jurusan = " " ;
        String alamat = Alamat1.getText();
        
        if (rdb1.isSelected())
            jurusan = "RPL";
        else if (rdb2.isSelected())
            jurusan = "TKJ";
        else
            
            if(Kelas1.getSelectedItem()== " X RPL 1 "){
                if(Kelas1.getSelectedItem()== " X RPL 2 "){
                    if(Kelas1.getSelectedItem()== " X RPL 3 "){
                        if(Kelas1.getSelectedItem()== " X RPL 4 "){
                            if(Kelas1.getSelectedItem()== " X TKJ 1 "){
                                if(Kelas1.getSelectedItem()== " X TKJ 2 "){
                                    if(Kelas1.getSelectedItem()== " X TKJ 3 "){
                                        if(Kelas1.getSelectedItem()== " X TKJ 4 "){
                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        new Frame2(nama, absen, kelas, jurusan, alamat).setVisible(true);
    }//GEN-LAST:event_SendActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen1;
    private javax.swing.JTextField Alamat1;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> Kelas1;
    private javax.swing.JTextField Nama1;
    private javax.swing.JButton Send;
    private javax.swing.JLabel absen;
    private javax.swing.JLabel alamat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jurusan;
    private javax.swing.JLabel kelas;
    private javax.swing.JLabel nama;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
