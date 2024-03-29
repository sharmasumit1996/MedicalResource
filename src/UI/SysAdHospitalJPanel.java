/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.City;
import Model.CityHistory;
import Model.Community;
import Model.CommunityHistory;
import Model.Hospital;
import Model.HospitalDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sumit
 */
public class SysAdHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdHospitalJPanel
     */
    CommunityHistory communityHistory;
    CityHistory cityHistory;
    HospitalDirectory hospitalDirectory;
    Community community;
    public SysAdHospitalJPanel(HospitalDirectory hospitalDirectory, CityHistory cityhistory, CommunityHistory communityhistory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
        this.cityHistory = cityhistory;
        this.communityHistory = communityhistory;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)HospitalJTable.getModel();
        model.setRowCount(0);
        for(Hospital hosp: hospitalDirectory.getHospitalDirectory()){
            Object[] row = new Object[5];
            System.out.println(hosp.getCity());
            row[0] = hosp.getHospitalName();
            row[1] = hosp.getCommunity();
            row[3] = hosp.getCity();
            row[4] = hosp.getZipcode();
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

        Hospitallbl = new javax.swing.JLabel();
        HospitalNamelbl = new javax.swing.JLabel();
        Communitylbl = new javax.swing.JLabel();
        CityNamelbl = new javax.swing.JLabel();
        Ziplbl = new javax.swing.JLabel();
        HospitalNametxt = new javax.swing.JTextField();
        Communitytxt = new javax.swing.JTextField();
        CityNametxt = new javax.swing.JTextField();
        Ziptxt = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalJTable = new javax.swing.JTable();

        Hospitallbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Hospitallbl.setText("HOSPITAL");

        HospitalNamelbl.setText("Hospital Name:");

        Communitylbl.setText("Community:");

        CityNamelbl.setText("City:");

        Ziplbl.setText("ZipCode:");

        HospitalNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HospitalNametxtKeyPressed(evt);
            }
        });

        Communitytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CommunitytxtKeyPressed(evt);
            }
        });

        CityNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CityNametxtKeyPressed(evt);
            }
        });

        Ziptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ZiptxtKeyPressed(evt);
            }
        });

        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });

        Updatebtn.setText("Update");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        HospitalJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Community", "City", "ZipCode"
            }
        ));
        HospitalJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HospitalJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HospitalJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Communitylbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HospitalNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(CityNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ziplbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Communitytxt)
                                    .addComponent(CityNametxt)
                                    .addComponent(Ziptxt, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(HospitalNametxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Savebtn)
                                .addGap(37, 37, 37)
                                .addComponent(Updatebtn)
                                .addGap(36, 36, 36)
                                .addComponent(Deletebtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(Hospitallbl)))
                .addContainerGap(331, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Hospitallbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalNamelbl)
                    .addComponent(HospitalNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Communitylbl)
                    .addComponent(Communitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityNamelbl)
                    .addComponent(CityNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ziplbl)
                    .addComponent(Ziptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Updatebtn)
                    .addComponent(Deletebtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        // TODO add your handling code here:
        if(validate(HospitalNametxt.getText(),Communitytxt.getText(),CityNametxt.getText(), Ziptxt.getText())){
            Hospital HospitalNew = hospitalDirectory.addNewValue();
            HospitalNew.setHospitalName(HospitalNametxt.getText());
            HospitalNew.setCommunity(Communitytxt.getText());
            HospitalNew.setZipcode(Integer.parseInt(Ziptxt.getText()));
            HospitalNew.setCity(CityNametxt.getText());
            try{
            community.hospList.add(HospitalNew);
            }
            catch(NullPointerException e){
                System.out.println("Null Pointer Exception for House");
            }
            JOptionPane.showMessageDialog(this, "New Hospital Added");
            HospitalNametxt.setText("");
            Communitytxt.setText("");
            CityNametxt.setText("");
            Ziptxt.setText("");
            populateTable();
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void HospitalJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospitalJTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = HospitalJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) HospitalJTable.getModel();
        HospitalNametxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Communitytxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        CityNametxt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Ziptxt.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_HospitalJTableMouseClicked

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HospitalJTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if(Updatevalidate(HospitalNametxt.getText(),Communitytxt.getText(),CityNametxt.getText(), Ziptxt.getText())){
            Hospital hosp = new Hospital();
            hosp.setHospitalName(HospitalNametxt.getText());
            hosp.setCommunity(Communitytxt.getText());
            hosp.setCity(CityNametxt.getText());
            hosp.setZipcode(Integer.parseInt(Ziptxt.getText()));
            String HospName = HospitalNametxt.getText();
            for(Hospital hosp1: hospitalDirectory.getHospitalDirectory()){
            if (HospName.equals(hosp.getHospitalName())){
               hospitalDirectory.deleteHospital(hosp1);
                break;
            }
        }
        Hospital hosp2 = hospitalDirectory.addNewValue();
        hosp2.setHospitalName(HospitalNametxt.getText());
        hosp2.setCommunity(Communitytxt.getText());
        hosp2.setCity(CityNametxt.getText());
        hosp2.setZipcode(Integer.parseInt(Ziptxt.getText()));
        JOptionPane.showMessageDialog(this, "Hospital has been Updated");
        HospitalNametxt.setText("");
        Communitytxt.setText("");
        CityNametxt.setText("");
        Ziptxt.setText("");
        populateTable();
        }   
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HospitalJTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) HospitalJTable.getModel();
        String HospName = model.getValueAt(selectedRowIndex, 0).toString();
        for(Hospital hosp: hospitalDirectory.getHospitalDirectory()){
            if (HospName.equals(hosp.getHospitalName())){
                hospitalDirectory.deleteHospital(hosp);
                break;
            }
            HospitalNametxt.setText("");
            Communitytxt.setText("");
            CityNametxt.setText("");
            Ziptxt.setText("");
            populateTable();
            JOptionPane.showMessageDialog(this, "Hospital has been deleted!!");    
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void HospitalNametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HospitalNametxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            HospitalNametxt.setEditable(true);  
        }
        else {
            HospitalNametxt.setEditable(false); }
    }//GEN-LAST:event_HospitalNametxtKeyPressed

    private void CommunitytxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CommunitytxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Communitytxt.setEditable(true);  
        }
        else {
            Communitytxt.setEditable(false); }
    }//GEN-LAST:event_CommunitytxtKeyPressed

    private void CityNametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityNametxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            CityNametxt.setEditable(true);  
        }
        else {
            CityNametxt.setEditable(false); }
    }//GEN-LAST:event_CityNametxtKeyPressed

    private void ZiptxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ZiptxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Ziptxt.setEditable(false);  
        }
        else {
            Ziptxt.setEditable(true); }
    }//GEN-LAST:event_ZiptxtKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CityNamelbl;
    private javax.swing.JTextField CityNametxt;
    private javax.swing.JLabel Communitylbl;
    private javax.swing.JTextField Communitytxt;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTable HospitalJTable;
    private javax.swing.JLabel HospitalNamelbl;
    private javax.swing.JTextField HospitalNametxt;
    private javax.swing.JLabel Hospitallbl;
    private javax.swing.JButton Savebtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel Ziplbl;
    private javax.swing.JTextField Ziptxt;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private boolean validate(String HospitalName, String CommunityName, String CityName, String ZIP) {
        //To change body of generated methods, choose Tools | Templates.
        City city;
        Community comm;
        boolean fetch = true, exists = false;
        int i,j;
        for(i =0;i<cityHistory.CityHistory.size();i++){
            city = cityHistory.CityHistory.get(i);
            if(CityName.equals(city.getCityName())){
                System.out.println("Here "+city.getCityName());
                if(city.getCommunities().contains(CommunityName)){
                    System.out.println("Here now");
                    for(j=0; j<communityHistory.commHistory.size();j++){
                        comm = communityHistory.commHistory.get(j);
                        if(CommunityName.equals(comm.getCommName())){
                            fetch = false;
                            comm.append(HospitalName);
                            community = comm;
                            break;
                        }
                    }
                    if(j == communityHistory.commHistory.size()){
                        JOptionPane.showMessageDialog(this, "Community Doesn't exist in given city", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                }
            }
        }
        for(Hospital hosp: hospitalDirectory.getHospitalDirectory()){
            if(String.valueOf(hosp.getHospitalName()).equals(HospitalName) && hosp.getCommunity().equals(CommunityName) && hosp.getCity().equals(CityName) && String.valueOf(hosp.getZipcode()).equals(ZIP)){
                exists = true;
            }
        }
        if(HospitalName.length() == 0){
            JOptionPane.showMessageDialog(this, "Hospital Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(CityName.length()==0){
            JOptionPane.showMessageDialog(this, "City Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(CommunityName.length()==0){
            JOptionPane.showMessageDialog(this, "Community Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ZIP.length()==0){
            JOptionPane.showMessageDialog(this, "ZIP cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(fetch){
            JOptionPane.showMessageDialog(this, "Community doesn't exists in given city, please add community first", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(exists){
            JOptionPane.showMessageDialog(this, "Apartment already exists in given Community", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

private boolean Updatevalidate(String HospitalName, String CommunityName, String CityName, String ZIP) {
        //To change body of generated methods, choose Tools | Templates.
        City city;
        Community comm;
        boolean fetch = true, exists = false;
        int i,j;
        for(i =0;i<cityHistory.CityHistory.size();i++){
            city = cityHistory.CityHistory.get(i);
            if(CityName.equals(city.getCityName())){
                System.out.println("Here "+city.getCityName());
                if(city.getCommunities().contains(CommunityName)){
                    System.out.println("Here now");
                    for(j=0; j<communityHistory.commHistory.size();j++){
                        comm = communityHistory.commHistory.get(j);
                        if(CommunityName.equals(comm.getCommName())){
                            fetch = false;
                            comm.append(HospitalName);
                            community = comm;
                            break;
                        }
                    }
                    if(j == communityHistory.commHistory.size()){
                        JOptionPane.showMessageDialog(this, "Community Doesn't exist in given city", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    }
                }
            }
        }
        for(Hospital hosp: hospitalDirectory.getHospitalDirectory()){
            if(String.valueOf(hosp.getHospitalName()).equals(HospitalName) && hosp.getCommunity().equals(CommunityName) && hosp.getCity().equals(CityName) && String.valueOf(hosp.getZipcode()).equals(ZIP)){
                exists = true;
            }
        }
        if(HospitalName.length() == 0){
            JOptionPane.showMessageDialog(this, "Hospital Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(CityName.length()==0){
            JOptionPane.showMessageDialog(this, "City Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(CommunityName.length()==0){
            JOptionPane.showMessageDialog(this, "Community Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ZIP.length()==0){
            JOptionPane.showMessageDialog(this, "ZIP cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(fetch){
            JOptionPane.showMessageDialog(this, "Community doesn't exists in given city, please add community first", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(exists){
            JOptionPane.showMessageDialog(this, "Apartment already exists in given Community", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
