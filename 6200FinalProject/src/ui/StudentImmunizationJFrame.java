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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAgeGroup = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

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
        if (tblImmunization.getColumnModel().getColumnCount() > 0) {
            tblImmunization.getColumnModel().getColumn(0).setHeaderValue("Name");
        }

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

        jLabel3.setText("Immunization rules:");

        jLabel4.setText("Chickenpox");

        txtC.setEditable(false);

        txtP.setEditable(false);

        jLabel5.setText("Pneumococcal");

        txtM.setEditable(false);

        jLabel6.setText("MMR");

        txtPO.setEditable(false);

        jLabel7.setText("Polio");

        txtR.setEditable(false);

        jLabel8.setText("Rotavirus");

        txtAgeGroup.setEditable(false);

        jLabel9.setText("Age Group");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImmunizationTracker))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtP))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtM)
                                    .addComponent(txtPO)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSelectedStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAgeGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tblSelectVaccines)
                                            .addComponent(tblSelectVaccines1))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
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
                        .addGap(18, 18, 18)
                        .addComponent(btnSelect)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAgeGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtR))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        String root = System.getProperty("user.dir");
        String FileName="students.csv"; //change the file name here
        String filePath = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName;
        String a,b,c,d,e= null;
        int f,g;
        String temp;
        String temp2;
        
        int selectedRowIndex = tblImmunization.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Select a student to edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblImmunization.getModel();
        txtSelectedStudent.setText(model.getValueAt(selectedRowIndex, 0).toString());
        
        String line = "";
        String splitBy = ",";
        String AgeGroup = "";
        int CurrentAge = 0;
        int indicator = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null){
                String[] user = line.split(splitBy);
                if (user[0].equals(txtSelectedStudent.getText())){
                    CurrentAge = Integer.parseInt(user[1]);
                    if(Integer.parseInt(user[1]) <= 12 && Integer.parseInt(user[1]) > 6){
                        AgeGroup = "6~12 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                        indicator = 1;
                    }
                    else if(Integer.parseInt(user[1]) <= 24 && Integer.parseInt(user[1]) > 13){
                        AgeGroup = "13~24 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                        indicator = 2;
                    }
                    else if(Integer.parseInt(user[1]) <= 35 && Integer.parseInt(user[1]) > 25){
                        AgeGroup = "25~35 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                        indicator = 3;
                    }
                    else if(Integer.parseInt(user[1]) <= 47 && Integer.parseInt(user[1]) > 36){
                        AgeGroup = "36~47 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                        indicator = 4;
                    }
                    else if(Integer.parseInt(user[1]) <= 59 && Integer.parseInt(user[1]) > 48){
                        AgeGroup = "48~59 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                        indicator = 5;
                    }
                    else if(Integer.parseInt(user[1]) > 60){
                        AgeGroup = "above 60 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                        indicator = 6;
                    }else{
                        AgeGroup = "below 6 months";
                        AgeGroup+=(" ("+user[1]+" months)");
                    }
                }    
            }
            br.close();
        }catch(IOException es){
            es.printStackTrace();
        }
        
        txtAgeGroup.setText(AgeGroup);
        if(indicator == 1){
            a="Y";b="N";c="N";d="N";e="N";f=12;
        }
        else if(indicator == 2){
            a="Y";b="N";c="Y";d="N";e="N";f=24;
        }
        else if(indicator == 3){
            a="Y";b="Y";c="Y";d="N";e="N";f=35;
        }
        else if(indicator == 4){
            a="Y";b="Y";c="Y";d="N";e="Y";f=47;
        }
        else if(indicator == 5){
            a="Y";b="Y";c="Y";d="Y";e="Y";f=59;
        }
        else if(indicator == 6){
            a="Y";b="Y";c="Y";d="Y";e="Y";f=60;
        }else {
            a="N";b="N";c="N";d="N";e="N";
        }
        
        //Track student immunization record
        String A = model.getValueAt(selectedRowIndex, 1).toString();
        String B = model.getValueAt(selectedRowIndex, 2).toString();
        String C = model.getValueAt(selectedRowIndex, 3).toString();
        String D = model.getValueAt(selectedRowIndex, 4).toString();
        String E = model.getValueAt(selectedRowIndex, 5).toString();
        
        temp = (a.equals(A)) ? "Accomplish" : "Not Accomplish";
        g = 12 - CurrentAge;
        temp2 = (temp.equals("Not Accomplish") ? " | Due in "+Integer.toString(g) + " months" :"");
        txtC.setText(temp+temp2);
        
        temp = (b.equals(B)) ? "Accomplish" : "Not Accomplish";
        g = 35 - CurrentAge;
        temp2 = (temp.equals("Not Accomplish") ? " | Due in "+Integer.toString(g)+ " months":"");
        txtP.setText(temp+temp2);
        
        temp = (c.equals(C)) ? "Accomplish" : "Not Accomplish";
        g = 24 - CurrentAge;
        temp2 = (temp.equals("Not Accomplish") ? " | Due in "+Integer.toString(g)+ " months":"");
        txtM.setText(temp+temp2);
        
        temp = (d.equals(D)) ? "Accomplish" : "Not Accomplish";
        g = 59 - CurrentAge;
        temp2 = (temp.equals("Not Accomplish") ? " | Due in "+Integer.toString(g)+ " months":"");
        txtPO.setText(temp+temp2);
        
        temp = (e.equals(E)) ? "Accomplish" : "Not Accomplish";
        g = 59 - CurrentAge;
        temp2 = (temp.equals("Not Accomplish") ? " | Due in "+Integer.toString(g)+ " months":"");
        txtR.setText(temp+temp2);
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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImmunizationTracker;
    private javax.swing.JTable tblImmunization;
    private javax.swing.JLabel tblSelectVaccines;
    private javax.swing.JLabel tblSelectVaccines1;
    private javax.swing.JTextField txtAgeGroup;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtPO;
    private javax.swing.JTextField txtR;
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
