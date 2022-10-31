/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Doctor;
import Model.DoctorDirectory;
import Model.Hospital;
import Model.HospitalDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumit
 */
public class DoctorViewDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorViewDoctorJPanel
     */
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    Hospital hospital;
    String username;
    String password;
    public DoctorViewDoctorJPanel(DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory, String Username, String Password) {
        initComponents();
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.username=Username;
        this.password=Password;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)DoctorJTable.getModel();
        model.setRowCount(0);
        for(Doctor docs: doctorDirectory.getDocHistory()){
            if (docs.getUsername().equalsIgnoreCase(username)){
            Object[] row = new Object[7];
            row[0] = docs.getDoctorID();
            row[1] = docs.getName();
            row[2] = docs.getAge();
            row[3] = docs.getGender();
            row[4] = docs.getHospital();
            row[5] = docs.getUsername();
            row[6] = docs.getPassword();
            model.addRow(row);
        }
        }
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
        jLabel1 = new javax.swing.JLabel();
        Idlbl = new javax.swing.JLabel();
        Namelbl = new javax.swing.JLabel();
        Agelbl = new javax.swing.JLabel();
        Genderlbl = new javax.swing.JLabel();
        Hospitallbl = new javax.swing.JLabel();
        IDtxt = new javax.swing.JTextField();
        Nametxt = new javax.swing.JTextField();
        Agetxt = new javax.swing.JTextField();
        Gendertxt = new javax.swing.JTextField();
        Hospitaltxt = new javax.swing.JTextField();
        Updatebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorJTable = new javax.swing.JTable();
        Usernamelbl = new javax.swing.JLabel();
        Passwordlbl = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        Passwordtxt = new javax.swing.JTextField();

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 640));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCTOR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Idlbl.setText("ID:");

        Namelbl.setText("Doctor Name:");

        Agelbl.setText("Age:");

        Genderlbl.setText("Gender:");

        Hospitallbl.setText("Hospital:");

        IDtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDtxtKeyPressed(evt);
            }
        });

        Nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NametxtKeyPressed(evt);
            }
        });

        Agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgetxtActionPerformed(evt);
            }
        });
        Agetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgetxtKeyPressed(evt);
            }
        });

        Gendertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GendertxtKeyPressed(evt);
            }
        });

        Hospitaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitaltxtActionPerformed(evt);
            }
        });
        Hospitaltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HospitaltxtKeyPressed(evt);
            }
        });

        Updatebtn.setText("Update");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        DoctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Doctor Name", "Age", "Gender", "Hospital", "Username", "Password"
            }
        ));
        DoctorJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DoctorJTable);

        Usernamelbl.setText("Username:");

        Passwordlbl.setText("Password:");

        Passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Updatebtn))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Namelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Hospitallbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Genderlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Agelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Usernamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Gendertxt)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Agetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(Nametxt)))
                            .addComponent(Hospitaltxt)
                            .addComponent(Usernametxt)
                            .addComponent(Passwordtxt)))
                    .addComponent(Passwordlbl)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idlbl)
                    .addComponent(IDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namelbl)
                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agelbl)
                    .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genderlbl)
                    .addComponent(Gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hospitallbl)
                    .addComponent(Hospitaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usernamelbl)
                    .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passwordlbl)
                    .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Updatebtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IDtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDtxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            IDtxt.setEditable(false);
        }
        else {
            IDtxt.setEditable(true); }
    }//GEN-LAST:event_IDtxtKeyPressed

    private void NametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NametxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Nametxt.setEditable(true);
        }
        else {
            Nametxt.setEditable(false); }
    }//GEN-LAST:event_NametxtKeyPressed

    private void AgetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgetxtActionPerformed

    private void AgetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgetxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Agetxt.setEditable(false);
        }
        else {
            Agetxt.setEditable(true); }
    }//GEN-LAST:event_AgetxtKeyPressed

    private void GendertxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GendertxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Gendertxt.setEditable(true);
        }
        else {
            Gendertxt.setEditable(false); }
    }//GEN-LAST:event_GendertxtKeyPressed

    private void HospitaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HospitaltxtActionPerformed

    private void HospitaltxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HospitaltxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Hospitaltxt.setEditable(true);
        }
        else {
            Hospitaltxt.setEditable(false); }
    }//GEN-LAST:event_HospitaltxtKeyPressed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = DoctorJTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(Updatevalidate(IDtxt.getText(),Nametxt.getText(), Agetxt.getText(),Gendertxt.getText(),Hospitaltxt.getText(),Usernametxt.getText(),Passwordtxt.getText())){
            String DoctorID = IDtxt.getText();
            String Name = Nametxt.getText();
            int Age = Integer.parseInt(Agetxt.getText());
            String Gender = Gendertxt.getText();
            String Hospital = IDtxt.getText();
            String Username = Usernametxt.getText();
            String Password = Passwordtxt.getText();
            for(Doctor doc: doctorDirectory.getDocHistory()){
                if (DoctorID.equals(doc.getDoctorID())){
                    doctorDirectory.deleteDoctor(doc);
                    break;
                }
            }
            Doctor doc2 = doctorDirectory.addNewValue();
            doc2.setDoctorID(DoctorID);
            doc2.setName(Name);
            doc2.setAge(Age);
            doc2.setGender(Gender);
            doc2.setHospital(Hospital);
            doc2.setUsername(Username);
            doc2.setPassword(Password);
            JOptionPane.showMessageDialog(this, "Doctor has been Updated");
            IDtxt.setText("");
            Nametxt.setText("");
            Agetxt.setText("");
            Gendertxt.setText("");
            Hospitaltxt.setText("");
            Usernametxt.setText("");
            Passwordtxt.setText("");
            populateTable();
            IDtxt.setEnabled(true);
        }
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void DoctorJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorJTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = DoctorJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) DoctorJTable.getModel();
        IDtxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Nametxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        Agetxt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Gendertxt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Hospitaltxt.setText(model.getValueAt(selectedRowIndex, 4).toString());
        Usernametxt.setText(model.getValueAt(selectedRowIndex, 5).toString());
        Passwordtxt.setText(model.getValueAt(selectedRowIndex, 6).toString());
        Usernametxt.setEnabled(false);
        IDtxt.setEnabled(false);
    }//GEN-LAST:event_DoctorJTableMouseClicked

    private void PasswordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agelbl;
    private javax.swing.JTextField Agetxt;
    private javax.swing.JTable DoctorJTable;
    private javax.swing.JLabel Genderlbl;
    private javax.swing.JTextField Gendertxt;
    private javax.swing.JLabel Hospitallbl;
    private javax.swing.JTextField Hospitaltxt;
    private javax.swing.JTextField IDtxt;
    private javax.swing.JLabel Idlbl;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JTextField Passwordtxt;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel Usernamelbl;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private boolean Updatevalidate(String DoctorID, String name, String Age, String Gender, String HospitalName,String Username, String Password) {
        //To change body of generated methods, choose Tools | Templates.
        Hospital hosp;
        boolean fetch = true,exists = false;
        for(int i =0;i<hospitalDirectory.HospitalDirectory.size();i++){
            hosp = hospitalDirectory.HospitalDirectory.get(i);
            if(HospitalName.equals(hosp.getHospitalName())){
                fetch = false;
                hosp.append(name);
                break;
            }
        }
        for(Doctor doc: doctorDirectory.getDocHistory()){
            if(doc.getDoctorID().equals(DoctorID) && doc.getHospital().equals(HospitalName) && doc.getName().equals(name) && String.valueOf(doc.getAge()).equals(Age) && doc.getGender().equals(Gender) && doc.getUsername().equals(Username) && doc.getPassword().equals(Password)){
                exists = true;
            }
        }
        for(Doctor doc: doctorDirectory.getDocHistory()){
            if(doc.getUsername().equals(Username) && !doc.getDoctorID().equalsIgnoreCase(DoctorID)){
               JOptionPane.showMessageDialog(this, "Username already exists", "Error", JOptionPane.ERROR_MESSAGE);
               return false;
            }
            }
        if(name.length()==0){
            JOptionPane.showMessageDialog(this, "Doctor Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(DoctorID.length()==0){
            JOptionPane.showMessageDialog(this, "Doctor ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Age.length()==0){
            JOptionPane.showMessageDialog(this, "Doctor Age cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Gender.length()==0){
            JOptionPane.showMessageDialog(this, "Doctor Gender cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Username.length() == 0){
            JOptionPane.showMessageDialog(this, "Username cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Password.length() <=7){
            JOptionPane.showMessageDialog(this, "Password should be atleast 8 characters long", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(HospitalName.length()==0){
            JOptionPane.showMessageDialog(this, "Hospital cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(fetch){
            JOptionPane.showMessageDialog(this, "Hospital doesn't exists", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(exists){
            JOptionPane.showMessageDialog(this, "Doctor already exists in given Hospital", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
}

}