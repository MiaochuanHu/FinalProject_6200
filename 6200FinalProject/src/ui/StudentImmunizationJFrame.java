/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miaoc
 */
public class StudentImmunizationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentImmunizationJFrame
     */
    public StudentImmunizationJFrame() {
        initComponents();
        populatetblImmunizationTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblImmunization = new javax.swing.JTable();
        lblImmunizationTracker = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSelectedStudent = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        tblSelectVaccines = new javax.swing.JLabel();
        tblSelectVaccines1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblImmunization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Chickenpox", "Pneumococcal", "MMR", "Polio", "Rotavirus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblImmunization);

        lblImmunizationTracker.setText("Immunization Tracker");

        jLabel1.setText("Operation Area");

        jLabel2.setText("Selected Student:");

        txtSelectedStudent.setEditable(false);

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chickenpox", "Pneumococcal", "MMR", "Polio", "Rotavirus" }));

        tblSelectVaccines.setText("Selected Vaccines:");

        tblSelectVaccines1.setText("Selected Status:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finished(Y)", "Not Finished(N)", "Don't Know(U)" }));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImmunizationTracker))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSelectedStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tblSelectVaccines)
                                .addComponent(tblSelectVaccines1))
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmunizationTracker)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSelectedStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelect)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tblSelectVaccines)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tblSelectVaccines1))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblImmunization.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Select a student to edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblImmunization.getModel();
        txtSelectedStudent.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String studentName = txtSelectedStudent.getText();
        
        int vaccines = jComboBox1.getSelectedIndex();
        int vaccinesStatus = jComboBox2.getSelectedIndex();
        String status = "";
        if (vaccinesStatus == 0){
            status = "Y";
        } else if (vaccinesStatus == 1){
            status = "N";
        } else{
            status = "U";
        }
        
        if (studentName.equals("")){
            JOptionPane.showMessageDialog(this, "Select a student first");
            return;
        }
        
        String root = System.getProperty("user.dir");
        String FileName="ImmunizationRecord.csv"; //change the file name here
        String filePath = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName;
        
        int selectedRowIndex = tblImmunization.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Select a student to first");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblImmunization.getModel();
        String name = model.getValueAt(selectedRowIndex, 0).toString();
        String A = model.getValueAt(selectedRowIndex, 1).toString();
        String B = model.getValueAt(selectedRowIndex, 2).toString();
        String C = model.getValueAt(selectedRowIndex, 3).toString();
        String D = model.getValueAt(selectedRowIndex, 4).toString();
        String E = model.getValueAt(selectedRowIndex, 5).toString();
        if(vaccines == 0){
            A = status;
        }
        if(vaccines == 1){
            B = status;
        }
        if(vaccines == 2){
            C = status;
        }
        if(vaccines == 3){
            D = status;
        }
        if(vaccines == 4){
            E = status;
        }
        String data = name + "," + A + "," + B + "," + C + "," + D + "," + E;

        try{
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            lines.set(selectedRowIndex, data);
            Files.write(path, lines);
            JOptionPane.showMessageDialog(this, "Record Updated");
        }catch(Exception e){
            e.printStackTrace();
        }
        populatetblImmunizationTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(StudentImmunizationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentImmunizationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentImmunizationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentImmunizationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentImmunizationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImmunizationTracker;
    private javax.swing.JTable tblImmunization;
    private javax.swing.JLabel tblSelectVaccines;
    private javax.swing.JLabel tblSelectVaccines1;
    private javax.swing.JTextField txtSelectedStudent;
    // End of variables declaration//GEN-END:variables
    private void populatetblImmunizationTable(){
        DefaultTableModel model = (DefaultTableModel) tblImmunization.getModel();
        model.setRowCount(0);
        
        String line = "";
        String splitBy = ",";
        
        String root = System.getProperty("user.dir");
        String FileName="ImmunizationRecord.csv"; //change the file name here
        String filePath = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null){
                String[] user = line.split(splitBy);
                Object[] row =  new Object[6];
                row[0]=user[0];
                row[1]=user[1];
                row[2]=user[2];
                row[3]=user[3];
                row[4]=user[4];
                row[5]=user[5];
                
                model.addRow(row);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}