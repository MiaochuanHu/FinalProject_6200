/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miaoc
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    public SystemAdminJFrame() {
        initComponents();
        populatetblStudentEnrollment();
        populatetblTeachersEnrollment();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCurrentUserName = new javax.swing.JTextField();
        txtCurrentLoginType = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentEnrollment = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTeacherList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        btnImmunizationTracker = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnRegistrationChecker = new javax.swing.JButton();
        btnRegistrationChecker1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClassroom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCurrentUserName.setEditable(false);
        txtCurrentUserName.setBackground(new java.awt.Color(204, 204, 204));
        txtCurrentUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentUserNameActionPerformed(evt);
            }
        });

        txtCurrentLoginType.setEditable(false);
        txtCurrentLoginType.setBackground(new java.awt.Color(204, 204, 204));
        txtCurrentLoginType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentLoginTypeActionPerformed(evt);
            }
        });

        lblUser.setText("User:");

        lblType.setText("Type:");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tblStudentEnrollment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Age(Months)", "Annual Renewed?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentEnrollment);

        tblTeacherList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTeacherList);

        jLabel1.setText("Student Enrollment");

        jLabel2.setText("Teacher");

        btnAddStudent.setBackground(new java.awt.Color(204, 204, 204));
        btnAddStudent.setForeground(new java.awt.Color(0, 0, 0));
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnImmunizationTracker.setText("Immunization Tracker");
        btnImmunizationTracker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImmunizationTrackerActionPerformed(evt);
            }
        });

        jLabel3.setText("Student Name:");

        jLabel4.setText("Student Age:");

        jButton1.setText("Detail Student Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Renewed?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        btnRegistrationChecker.setText("Registration Checker");
        btnRegistrationChecker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationCheckerActionPerformed(evt);
            }
        });

        btnRegistrationChecker1.setText("Assign Teacher to Stu");
        btnRegistrationChecker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationChecker1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dates Tracker");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnClassroom.setText("Classroom");
        btnClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassroomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCurrentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCurrentLoginType, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAge)
                                    .addComponent(txtName)
                                    .addComponent(btnAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnImmunizationTracker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrationChecker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrationChecker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClassroom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurrentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser)
                    .addComponent(txtCurrentLoginType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnAddStudent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrationChecker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrationChecker1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImmunizationTracker))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClassroom)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurrentUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentUserNameActionPerformed

    private void txtCurrentLoginTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentLoginTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentLoginTypeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnImmunizationTrackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImmunizationTrackerActionPerformed
        // TODO add your handling code here:
        StudentImmunizationJFrame imu = new StudentImmunizationJFrame();
        imu.setVisible(true);
    }//GEN-LAST:event_btnImmunizationTrackerActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        // TODO add your handling code here:
        String line = "";
        String splitBy = ",";
        
        if (txtName.getText().equals("") || txtAge.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Name or age can't be empty");
            return;
        }
        
        if (txtAge.getText().matches("-?\\d+") == false){
            JOptionPane.showMessageDialog(this, "Invalid Input");
            return;
        }
        String root = System.getProperty("user.dir");
        String FileName="students.csv"; //change the file name here
        String filePath = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName;
        String FileName2="ImmunizationRecord.csv"; //change the file name here
        String filePath2 = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName2;
        String FileName3="studentsDetailedInfo.csv"; //change the file name here
        String filePath3 = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName3;
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null){
                String[] user = line.split(splitBy);
                if(txtName.getText().equals(user[0]) ){
                    JOptionPane.showMessageDialog(this, "Name Already Exist");
                    txtName.setText("");
                    txtAge.setText("");
                    return;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try {
            // TODO add your handling code here:
            String csv = filePath;
            String csv2 = filePath2;
            String csv3 = filePath3;
            
            CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
            CSVWriter writer2 = new CSVWriter(new FileWriter(csv2, true));
            CSVWriter writer3 = new CSVWriter(new FileWriter(csv3, true));
            
            String[] record = new String[3];
            record[0] = txtName.getText();
            record[1] = txtAge.getText();
            record[2] = jComboBox1.getSelectedItem().toString();
            
            String[] record2 = new String[6];
            record2[0] = txtName.getText();
            record2[1] = "N";
            record2[2] = "N";
            record2[3] = "N";
            record2[4] = "N";
            record2[5] = "N";
            
            String[] record3 = new String[5];
            record3[0] = txtName.getText();
            record3[1] = txtAge.getText();
            record3[2] = "Unknown";
            record3[3] = "Unknown";
            record3[4] = "Unknown";
           
            writer.writeNext(record,false);
            writer.close();
            
            writer2.writeNext(record2,false);
            writer2.close();
            
            writer3.writeNext(record3,false);
            writer3.close();
            
            txtAge.setText("");
            txtName.setText("");

            JOptionPane.showMessageDialog(this, "Registeration as Patient Successful");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        populatetblStudentEnrollment();
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DatailStudentInfoJFrame dsi = new DatailStudentInfoJFrame();
        dsi.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrationCheckerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationCheckerActionPerformed
        // TODO add your handling code here:
        AnnualRegistrationJFrame arj = new AnnualRegistrationJFrame();
        arj.setVisible(true);
    }//GEN-LAST:event_btnRegistrationCheckerActionPerformed

    private void btnRegistrationChecker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationChecker1ActionPerformed
        // TODO add your handling code here:
        StudentAssignedTeacherJFrame arj = new StudentAssignedTeacherJFrame();
        arj.setVisible(true);
    }//GEN-LAST:event_btnRegistrationChecker1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CountdownJFrame ct = new CountdownJFrame();
        ct.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassroomActionPerformed
        // TODO add your handling code here:
        ClassroomJFrame cls = new ClassroomJFrame();
        cls.setVisible(true);
    }//GEN-LAST:event_btnClassroomActionPerformed

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
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnClassroom;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnImmunizationTracker;
    private javax.swing.JButton btnRegistrationChecker;
    private javax.swing.JButton btnRegistrationChecker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblStudentEnrollment;
    private javax.swing.JTable tblTeacherList;
    private javax.swing.JTextField txtAge;
    public static javax.swing.JTextField txtCurrentLoginType;
    public static javax.swing.JTextField txtCurrentUserName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    private void populatetblStudentEnrollment(){
        DefaultTableModel model = (DefaultTableModel) tblStudentEnrollment.getModel();
        model.setRowCount(0);
        
        String line = "";
        String splitBy = ",";
        
        String root = System.getProperty("user.dir");
        String FileName="students.csv"; //change the file name here
        String filePath = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null){
                String[] user = line.split(splitBy);
                Object[] row =  new Object[3];
                row[0]=user[0];
                row[1]=user[1];
                row[2]=user[2];
                model.addRow(row);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    private void populatetblTeachersEnrollment(){
        DefaultTableModel model = (DefaultTableModel) tblTeacherList.getModel();
        model.setRowCount(0);
        
        String line = "";
        String splitBy = ",";
        
        String root = System.getProperty("user.dir");
        String FileName="teachers.csv"; //change the file name here
        String filePath = root+File.separator+"src"+File.separator+"csvFile"+File.separator+FileName;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null){
                String[] user = line.split(splitBy);
                Object[] row =  new Object[1];
                row[0]=user[0];
                model.addRow(row);
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
