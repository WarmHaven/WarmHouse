/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import warehouse_test.Sql;

/**
 *
 * @author haven
 */
public class importProduct extends javax.swing.JFrame {

    /**
     * Creates new form importProduct
     */
    public importProduct() {
        initComponents();
        Sql s = new Sql();

        s.Select_MaterialItem(Materials_combox);
        s.loadcombo(item_combox);
        s.Select_BigItem(Bigitem_combox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bigitem_combox = new javax.swing.JComboBox<>();
        item_combox = new javax.swing.JComboBox<>();
        money_TFile = new javax.swing.JTextField();
        department_combox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        in_time_spin = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        in_quantity_TFile = new javax.swing.JTextField();
        in_type_combox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Materials_combox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        in_total_btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        company_TFile = new javax.swing.JTextField();
        cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bigitem_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bigitem_comboxActionPerformed(evt);
            }
        });

        item_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_comboxActionPerformed(evt);
            }
        });

        department_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. 吧檯", "2. 外場", "3. 廚房", "4. 甜點" }));

        jLabel13.setText("部　門：");

        in_time_spin.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        jLabel15.setText("進貨數量：");

        in_type_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "箱", "盒", "個", "公斤", "斤", "公克" }));

        jLabel2.setText("進貨金額：");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("大項目：");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("分　類：");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("物　料:");

        jLabel11.setText("進貨日期時間：");

        in_total_btn.setText("進　貨");
        in_total_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_total_btnActionPerformed(evt);
            }
        });

        jLabel14.setText("廠　商：");

        cancel_btn.setText("取消");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(in_time_spin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(31, 31, 31)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bigitem_combox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(money_TFile, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addComponent(department_combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(item_combox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(in_quantity_TFile, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(in_type_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(company_TFile, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Materials_combox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(in_total_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(Bigitem_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Materials_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(money_TFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(in_total_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancel_btn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(department_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_quantity_TFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(in_type_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(company_TFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_time_spin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bigitem_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bigitem_comboxActionPerformed
        // TODO add your handling code here:
        Bigitem_combox = (JComboBox<String>) evt.getSource();
        Object selected = Bigitem_combox.getSelectedIndex();
        String test = Bigitem_combox.getItemAt((int) selected);
        String result[] = test.split(".  ");

        Sql s = new Sql();
        int type = Integer.valueOf(result[0]);
        //        type++;
        //重點
        //        s.SelectCheck_Item_type(item_combox, type);
    }//GEN-LAST:event_Bigitem_comboxActionPerformed

    private void item_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_comboxActionPerformed
        // TODO add your handling code here:
        item_combox = (JComboBox<String>) evt.getSource();
        Object selected = item_combox.getSelectedIndex();
        String test = item_combox.getItemAt((int) selected);
        String result[] = test.split(".  ");

        System.out.println(result[0]);

        Sql s = new Sql();
        int type = Integer.valueOf(result[0]);

        //        type++;

        s.SelectCheck_Material_type(Materials_combox, type);

    }//GEN-LAST:event_item_comboxActionPerformed

    private void in_total_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_total_btnActionPerformed
        // TODO add your handling code here:
        try {

            String no = Materials_combox.getSelectedItem().toString();
            int money = Integer.parseInt(money_TFile.getText());
            int in_quantity = Integer.parseInt(in_quantity_TFile.getText());
            String in_type = in_type_combox.getSelectedItem().toString();
            String time = in_time_spin.getValue().toString();
            String department = department_combox.getSelectedItem().toString();
            String company = company_TFile.getText();

            Sql s = new Sql();
            s.insert_inTotal(no, money, in_quantity, in_type, time, department, company);

            //clear
            money_TFile.setText("");
            in_quantity_TFile.setText("");
            company_TFile.setText("");
            //close
            dispose();

//            test.setText(no + " " + money + " " + in_quantity + " " + in_type + " " + time + " " + department + " " + company);

            //Search
            // TODO add your handling code here:
            //jTable1.invalidate();
            //jTable1.setModel(recycle());
//            DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
//            dm.getDataVector().removeAllElements();
//            dm.fireTableDataChanged();
//            jTable1.clearSelection();
//            jTable1.setModel(getdata());

        } catch (NumberFormatException e) {

            JOptionPane.showConfirmDialog(null, "有資料未輸入！", "進貨錯誤",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "有資料未輸入！", "進貨錯誤",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.ERROR_MESSAGE);
        }
        
        

    }//GEN-LAST:event_in_total_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancel_btnActionPerformed

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
            java.util.logging.Logger.getLogger(importProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(importProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(importProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(importProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new importProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bigitem_combox;
    private javax.swing.JComboBox<String> Materials_combox;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JTextField company_TFile;
    private javax.swing.JComboBox<String> department_combox;
    private javax.swing.JTextField in_quantity_TFile;
    private javax.swing.JSpinner in_time_spin;
    private javax.swing.JButton in_total_btn;
    private javax.swing.JComboBox<String> in_type_combox;
    private javax.swing.JComboBox<String> item_combox;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField money_TFile;
    // End of variables declaration//GEN-END:variables
}
