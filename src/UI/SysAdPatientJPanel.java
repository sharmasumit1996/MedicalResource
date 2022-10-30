/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Patient;
import Model.PatientDirectory;
import Model.Person;
import Model.PersonDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumit
 */
public class SysAdPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdPatientJPanel
     */
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    Person personCurrent;
    public SysAdPatientJPanel(PatientDirectory patientDirectory, PersonDirectory personDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.personDirectory = personDirectory;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)PatientJTable.getModel();
        model.setRowCount(0);
        for(Patient pats: patientDirectory.getPatHistory()){
            Object[] row = new Object[8];
            row[0] = pats.getPatientID();
            row[1] = pats.getName();
            row[2] = pats.getAge();
            row[3] = pats.getHeight();
            row[4] = pats.getWeight();
            row[5] = pats.getUsername();
            row[6] = pats.getPassword();
            row[7] = pats.getHospital();
            model.addRow(row);
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

        PatientIDlbl = new javax.swing.JLabel();
        Namelbl = new javax.swing.JLabel();
        Agelbl = new javax.swing.JLabel();
        Heightlbl = new javax.swing.JLabel();
        Weightlbl = new javax.swing.JLabel();
        PatientIDtxt = new javax.swing.JTextField();
        Nametxt = new javax.swing.JTextField();
        Agetxt = new javax.swing.JTextField();
        Heighttxt = new javax.swing.JTextField();
        Weighttxt = new javax.swing.JTextField();
        SavePatientbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UpdatePatientbtn = new javax.swing.JButton();
        DeletePatientbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientJTable = new javax.swing.JTable();
        Usernamelbl = new javax.swing.JLabel();
        Passwordlbl = new javax.swing.JLabel();
        Passwordtxt = new javax.swing.JTextField();
        Usernametxt = new javax.swing.JTextField();
        HospitalNamelbl = new javax.swing.JLabel();
        Hospitaltxt = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(720, 640));

        PatientIDlbl.setText("ID:");

        Namelbl.setText("Name");

        Agelbl.setText("Age:");

        Heightlbl.setText("Height(in cm):");

        Weightlbl.setText("Weight(in kg):");

        Nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NametxtActionPerformed(evt);
            }
        });

        SavePatientbtn.setText("Save");
        SavePatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePatientbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PATIENT");

        UpdatePatientbtn.setText("Update");
        UpdatePatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePatientbtnActionPerformed(evt);
            }
        });

        DeletePatientbtn.setText("Delete");
        DeletePatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientbtnActionPerformed(evt);
            }
        });

        PatientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Height", "Weight", "Username", "Password", "Hospital"
            }
        ));
        PatientJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PatientJTable);

        Usernamelbl.setText("Username:");

        Passwordlbl.setText("Password:");

        Passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordtxtActionPerformed(evt);
            }
        });

        HospitalNamelbl.setText("Hospital:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SavePatientbtn)
                        .addGap(30, 30, 30)
                        .addComponent(UpdatePatientbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeletePatientbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PatientIDlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Namelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Agelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Heightlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Weightlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Passwordlbl)
                            .addComponent(Usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HospitalNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Usernametxt)
                            .addComponent(Heighttxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(Agetxt)
                            .addComponent(Nametxt)
                            .addComponent(PatientIDtxt)
                            .addComponent(Weighttxt)
                            .addComponent(Passwordtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Hospitaltxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientIDlbl)
                    .addComponent(PatientIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namelbl)
                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agelbl)
                    .addComponent(Agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Heightlbl)
                    .addComponent(Heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Weightlbl)
                    .addComponent(Weighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usernamelbl)
                    .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passwordlbl)
                    .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalNamelbl)
                    .addComponent(Hospitaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SavePatientbtn)
                    .addComponent(UpdatePatientbtn)
                    .addComponent(DeletePatientbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NametxtActionPerformed

    private void SavePatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePatientbtnActionPerformed
        // TODO add your handling code here:
        if(validate(PatientIDtxt.getText(),Nametxt.getText(),Agetxt.getText(),Heighttxt.getText(),Weighttxt.getText(),Usernametxt.getText(),Passwordtxt.getText(),Hospitaltxt.getText())){
            Patient PatientNew = patientDirectory.addNewValue();
            PatientNew.setPatientID(PatientIDtxt.getText());
            PatientNew.setName(Nametxt.getText());
            PatientNew.setAge(Integer.parseInt(Agetxt.getText()));
            PatientNew.setHeight(Integer.parseInt(Heighttxt.getText()));
            PatientNew.setWeight(Integer.parseInt(Weighttxt.getText()));
            PatientNew.setUsername(Usernametxt.getText());
            PatientNew.setPassword(Passwordtxt.getText());
            PatientNew.setHospital(Passwordtxt.getText());
            personCurrent.setPatient(PatientNew);
            JOptionPane.showMessageDialog(this, "New Patient Added");
            PatientIDtxt.setText("");
            Nametxt.setText("");
            Agetxt.setText("");
            Heighttxt.setText("");
            Weighttxt.setText("");
            Usernametxt.setText("");
            Passwordtxt.setText("");
            Hospitaltxt.setText("");
            populateTable();
        }
    }//GEN-LAST:event_SavePatientbtnActionPerformed

    private void UpdatePatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePatientbtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PatientJTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if(Updatevalidate(PatientIDtxt.getText(),Nametxt.getText(),Agetxt.getText(),Heighttxt.getText(),Weighttxt.getText(),Usernametxt.getText(),Passwordtxt.getText(),Hospitaltxt.getText())){
            Patient pat = new Patient();
            pat.setPatientID(PatientIDtxt.getText());
            pat.setName(Nametxt.getText());
            pat.setAge(Integer.parseInt(Agetxt.getText()));
            pat.setHeight(Integer.parseInt(Heighttxt.getText()));
            pat.setWeight(Integer.parseInt(Weighttxt.getText()));
            pat.setUsername(Usernametxt.getText());
            pat.setPassword(Passwordtxt.getText());
            pat.setHospital(Passwordtxt.getText());
            String PatientID = PatientIDtxt.getText();
            for(Patient pat1: patientDirectory.getPatHistory()){
            if (PatientID.equals(pat.getPatientID())){
               patientDirectory.deletePatient(pat1);
                break;
            }
        }
        Patient pat2 = patientDirectory.addNewValue();
        pat2.setPatientID(PatientIDtxt.getText());
        pat2.setName(Nametxt.getText());
        pat2.setAge(Integer.parseInt(Agetxt.getText()));
        pat2.setHeight(Integer.parseInt(Heighttxt.getText()));
        pat2.setWeight(Integer.parseInt(Weighttxt.getText()));
        pat2.setUsername(Usernametxt.getText());
        pat2.setPassword(Passwordtxt.getText());
        pat2.setHospital(Passwordtxt.getText());
        JOptionPane.showMessageDialog(this, "Patient has been Updated");
        PatientIDtxt.setText("");
        Nametxt.setText("");
        Agetxt.setText("");
        Heighttxt.setText("");
        Weighttxt.setText("");
        Usernametxt.setText("");
        Passwordtxt.setText("");
        Hospitaltxt.setText("");
        populateTable();
        }                        
    }//GEN-LAST:event_UpdatePatientbtnActionPerformed

    private void DeletePatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePatientbtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HouseJTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) HouseJTable.getModel();
        String HouseNum = model.getValueAt(selectedRowIndex, 0).toString();
        for(House hous: houseHistory.getHouseHistory()){
            if (HouseNum.equals(hous.getHouseNumber())){
                houseHistory.deleteHouse(hous);
                break;
            }
            ApartmentNotxt.setText("");
            Citytxt.setText("");
            Communitytxt.setText("");
            StreetNotxt.setText("");
            Ziptxt.setText("");
            populateTable();
            JOptionPane.showMessageDialog(this, "House has been deleted!!");    
        }
    }//GEN-LAST:event_DeletePatientbtnActionPerformed

    private void PatientJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientJTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = PatientJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) PatientJTable.getModel();
        PatientIDtxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Nametxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        Agetxt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Heighttxt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Weighttxt.setText(model.getValueAt(selectedRowIndex, 4).toString());
        Usernametxt.setText(model.getValueAt(selectedRowIndex, 5).toString());
        Passwordtxt.setText(model.getValueAt(selectedRowIndex, 6).toString());
        Hospitaltxt.setText(model.getValueAt(selectedRowIndex, 7).toString());
    }//GEN-LAST:event_PatientJTableMouseClicked

    private void PasswordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agelbl;
    private javax.swing.JTextField Agetxt;
    private javax.swing.JButton DeletePatientbtn;
    private javax.swing.JLabel Heightlbl;
    private javax.swing.JTextField Heighttxt;
    private javax.swing.JLabel HospitalNamelbl;
    private javax.swing.JTextField Hospitaltxt;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JTextField Passwordtxt;
    private javax.swing.JLabel PatientIDlbl;
    private javax.swing.JTextField PatientIDtxt;
    private javax.swing.JTable PatientJTable;
    private javax.swing.JButton SavePatientbtn;
    private javax.swing.JButton UpdatePatientbtn;
    private javax.swing.JLabel Usernamelbl;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel Weightlbl;
    private javax.swing.JTextField Weighttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private boolean validate(String ID, String Name, String Age, String Height, String Weight,String Username, String Password, String Hospital) {
        //To change body of generated methods, choose Tools | Templates.
        Person per;
        boolean fetch = true, exists = false;
        for(int i=0; i<personDirectory.perHistory.size();i++){
            per = personDirectory.perHistory.get(i);
            if(ID.equals(String.valueOf(per.getPersonID())) && Name.equals(per.getName())){
                fetch = false;
                personCurrent = per;
                break;
            }
        }
        for(Patient patient: patientDirectory.getPatHistory()){
            if(patient.getPatientID().equals(ID)){
                exists =true;
            }
        }
        for(Patient patient: patientDirectory.getPatHistory()){
            if(patient.getUsername().equals(Username)){
               JOptionPane.showMessageDialog(this, "Username already exists", "Error", JOptionPane.ERROR_MESSAGE);
               return false;
            }
            }
        if(ID.length() == 0){
            JOptionPane.showMessageDialog(this, "ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Name.length() == 0){
            JOptionPane.showMessageDialog(this, "Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Integer.parseInt(Age) == 0){
            JOptionPane.showMessageDialog(this, "Please enter a valid Age", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Integer.parseInt(Height) == 0){
            JOptionPane.showMessageDialog(this, "Please enter a valid Height", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Integer.parseInt(Weight) == 0){
            JOptionPane.showMessageDialog(this, "Please enter a valid Weight", "Error", JOptionPane.ERROR_MESSAGE);
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
        if(Hospital.length() == 0){
            JOptionPane.showMessageDialog(this, "Username cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(fetch){
            JOptionPane.showMessageDialog(this, "Person doesn't exists, please add person first", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(exists){
            JOptionPane.showMessageDialog(this, "Patient already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private boolean Updatevalidate(String ID, String Name, String Age, String Height, String Weight,String Username, String Password, String Hospital) {
        //To change body of generated methods, choose Tools | Templates.
        Person per;
        boolean fetch = true, exists = false;
        for(int i=0; i<personDirectory.perHistory.size();i++){
            per = personDirectory.perHistory.get(i);
            if(ID.equals(String.valueOf(per.getPersonID())) && Name.equals(per.getName())){
                fetch = false;
                personCurrent = per;
                break;
            }
        }
        for(Patient patient: patientDirectory.getPatHistory()){
            if(patient.getPatientID().equals(ID) && patient.getName().equals(Name) && String.valueOf(patient.getAge()).equals(Age) && String.valueOf(patient.getHeight()).equals(Height)&& String.valueOf(patient.getWeight()).equals(Weight) && patient.getUsername().equals(Username) && patient.getPassword().equals(Password)){
                exists =true;
            }
        }
        for(Patient patient: patientDirectory.getPatHistory()){
            if(patient.getUsername().equals(Username)){
               JOptionPane.showMessageDialog(this, "Username already exists", "Error", JOptionPane.ERROR_MESSAGE);
               return false;
            }
            }
        if(ID.length() == 0){
            JOptionPane.showMessageDialog(this, "ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Name.length() == 0){
            JOptionPane.showMessageDialog(this, "Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Integer.parseInt(Age) == 0){
            JOptionPane.showMessageDialog(this, "Please enter a valid Age", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Integer.parseInt(Height) == 0){
            JOptionPane.showMessageDialog(this, "Please enter a valid Height", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(Integer.parseInt(Weight) == 0){
            JOptionPane.showMessageDialog(this, "Please enter a valid Weight", "Error", JOptionPane.ERROR_MESSAGE);
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
        if(Hospital.length() == 0){
            JOptionPane.showMessageDialog(this, "Username cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(fetch){
            JOptionPane.showMessageDialog(this, "Person doesn't exists, please add person first", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(exists){
            JOptionPane.showMessageDialog(this, "Patient already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
