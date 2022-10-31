/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.City;
import Model.CityHistory;
import Model.Community;
import Model.CommunityHistory;
import Model.House;
import Model.HouseHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumit
 */
public class HouseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HouseJPanel
     */
    CommunityHistory communityHistory;
    CityHistory cityHistory;
    HouseHistory houseHistory;
    Community community;
    public HouseJPanel(HouseHistory househistory, CityHistory cityhistory, CommunityHistory communityhistory) {
        initComponents();
        this.houseHistory = househistory;
        this.cityHistory = cityhistory;
        this.communityHistory = communityhistory;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)HouseJTable.getModel();
        model.setRowCount(0);
        for(House hous: houseHistory.getHouseHistory()){
            Object[] row = new Object[6];
            row[0] = hous.getHouseID();
            row[1] = hous.getHouseNumber();
            row[2] = hous.getStreet();
            row[3] = hous.getCity();            
            row[4] = hous.getZipcode();
            row[5] = hous.getCommunity();
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

        Houselbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ApartmentNotxt = new javax.swing.JTextField();
        StreetNotxt = new javax.swing.JTextField();
        Citytxt = new javax.swing.JTextField();
        Ziptxt = new javax.swing.JTextField();
        Communitytxt = new javax.swing.JTextField();
        Savebtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HouseJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        HouseIDtxt = new javax.swing.JTextField();

        Houselbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Houselbl.setText("HOUSE");
        Houselbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Apartment Number:");

        jLabel2.setText("Street Name:");

        jLabel3.setText("City:");

        jLabel4.setText("ZIP:");

        jLabel5.setText("Community:");

        ApartmentNotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ApartmentNotxtKeyPressed(evt);
            }
        });

        StreetNotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                StreetNotxtKeyPressed(evt);
            }
        });

        Citytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CitytxtKeyPressed(evt);
            }
        });

        Ziptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ZiptxtKeyPressed(evt);
            }
        });

        Communitytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CommunitytxtKeyPressed(evt);
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

        HouseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "House ID", "Apartment Number", "Street", "City", "ZIP", "Community"
            }
        ));
        HouseJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HouseJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HouseJTable);

        jLabel6.setText("HouseID:");

        HouseIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseIDtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Savebtn)
                                    .addGap(26, 26, 26)
                                    .addComponent(Updatebtn)
                                    .addGap(26, 26, 26)
                                    .addComponent(Deletebtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Communitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HouseIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ApartmentNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StreetNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Ziptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Houselbl))))
                        .addGap(0, 461, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Houselbl)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(HouseIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ApartmentNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(StreetNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Ziptxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Communitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Savebtn)
                    .addComponent(Updatebtn)
                    .addComponent(Deletebtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        // TODO add your handling code here:
        if(validate(ApartmentNotxt.getText(),Citytxt.getText(),Communitytxt.getText(), StreetNotxt.getText(),Ziptxt.getText())){
            House HouseNew = houseHistory.addNewValue();
            HouseNew.setHouseID(Integer.parseInt(HouseIDtxt.getText()));
            HouseNew.setHouseNumber(Integer.parseInt(ApartmentNotxt.getText()));
            HouseNew.setCommunity(Communitytxt.getText());
            HouseNew.setStreet(StreetNotxt.getText());
            HouseNew.setZipcode(Integer.parseInt(Ziptxt.getText()));
            HouseNew.setCommunity(Communitytxt.getText());
            HouseNew.setCity(Citytxt.getText());
            try{
            community.houseList.add(HouseNew);
            }
            catch(NullPointerException e){
                System.out.println("Null Pointer Exception for House");
            }
            JOptionPane.showMessageDialog(this, "New House Added");
            HouseIDtxt.setText("");
            ApartmentNotxt.setText("");
            Citytxt.setText("");
            Communitytxt.setText("");
            StreetNotxt.setText("");
            Ziptxt.setText("");
            populateTable();
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HouseJTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) HouseJTable.getModel();
        String HouseID = model.getValueAt(selectedRowIndex, 0).toString();
        for(House hous: houseHistory.getHouseHistory()){
            if (Integer.parseInt(HouseID) == (hous.getHouseID())){
                houseHistory.deleteHouse(hous);
                break;
            }
            }
            HouseIDtxt.setText("");
            ApartmentNotxt.setText("");
            Citytxt.setText("");
            Communitytxt.setText("");
            StreetNotxt.setText("");
            Ziptxt.setText("");
            Communitytxt.setText("");
            populateTable();
            HouseIDtxt.setEnabled(true);
            JOptionPane.showMessageDialog(this, "House has been deleted!!");    
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void HouseJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HouseJTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = HouseJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) HouseJTable.getModel();
        HouseIDtxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        ApartmentNotxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        StreetNotxt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Citytxt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Ziptxt.setText(model.getValueAt(selectedRowIndex, 4).toString());
        Communitytxt.setText(model.getValueAt(selectedRowIndex, 5).toString());
        HouseIDtxt.setEnabled(false);
    }//GEN-LAST:event_HouseJTableMouseClicked

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = HouseJTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if(Updatevalidate(ApartmentNotxt.getText(),Citytxt.getText(),Communitytxt.getText(), StreetNotxt.getText(),Ziptxt.getText())){
            int HouseID = Integer.parseInt(HouseIDtxt.getText());
            String HouseNumber = ApartmentNotxt.getText();
            String Street = StreetNotxt.getText();
            String City = Citytxt.getText();
            int Zip= Integer.parseInt(Ziptxt.getText());
            String Community = Communitytxt.getText();
            for(House hous: houseHistory.getHouseHistory()){
            if (HouseID == (hous.getHouseID())){
               houseHistory.deleteHouse(hous);
                break;
            }
        }
        House hous2 = houseHistory.addNewValue();
        hous2.setHouseID(HouseID);
        hous2.setHouseNumber(Integer.parseInt(HouseNumber));
        hous2.setStreet(Street);
        hous2.setCity(City);
        hous2.setZipcode(Zip);
        hous2.setCommunity(Community);
        JOptionPane.showMessageDialog(this, "House has been Updated");
        HouseIDtxt.setText("");
        ApartmentNotxt.setText("");
        Citytxt.setText("");
        Communitytxt.setText("");
        StreetNotxt.setText("");
        Ziptxt.setText("");
        Communitytxt.setText("");
        HouseIDtxt.setEnabled(true);
        populateTable();
        }                                    
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void ApartmentNotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApartmentNotxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            ApartmentNotxt.setEditable(false);  
        }
        else {
            ApartmentNotxt.setEditable(true); }
    }//GEN-LAST:event_ApartmentNotxtKeyPressed

    private void StreetNotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StreetNotxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            StreetNotxt.setEditable(true);  
        }
        else {
            StreetNotxt.setEditable(false); }
    }//GEN-LAST:event_StreetNotxtKeyPressed

    private void CitytxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CitytxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            Citytxt.setEditable(true);  
        }
        else {
            Citytxt.setEditable(false); }
    }//GEN-LAST:event_CitytxtKeyPressed

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

    private void HouseIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HouseIDtxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApartmentNotxt;
    private javax.swing.JTextField Citytxt;
    private javax.swing.JTextField Communitytxt;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField HouseIDtxt;
    private javax.swing.JTable HouseJTable;
    private javax.swing.JLabel Houselbl;
    private javax.swing.JButton Savebtn;
    private javax.swing.JTextField StreetNotxt;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JTextField Ziptxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private boolean validate(String AptNum, String CityName, String CommunityName, String StreetNum, String ZIP) {
        //To change body of generated methods, choose Tools | Templates.
        City city;
        Community comm;
        boolean fetch = true, exists = false;
        int i,j;
        for(i =0;i<cityHistory.CityHistory.size();i++){
            city = cityHistory.CityHistory.get(i);
            if(CityName.equals(city.getCityName())){
                if(city.getCommunities().contains(CommunityName)){
                    for(j=0; j<communityHistory.commHistory.size();j++){
                        comm = communityHistory.commHistory.get(j);
                        if(CommunityName.equals(comm.getCommName())){
                            fetch = false;
                            comm.append(AptNum);
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
        for(House house: houseHistory.getHouseHistory()){
            if(String.valueOf(house.getHouseNumber()).equals(AptNum) && house.getStreet().equals(StreetNum) && house.getCommunity().equals(CommunityName) && house.getCity().equals(CityName)){
                exists = true;
            }
        }
        if(AptNum.length() == 0){
            JOptionPane.showMessageDialog(this, "Apartment Number cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
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
        if(StreetNum.length()==0){
            JOptionPane.showMessageDialog(this, "Street Number cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
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
    
    private boolean Updatevalidate(String AptNum, String CityName, String CommunityName, String StreetNum, String ZIP) {
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
                            comm.append(AptNum);
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
        for(House house: houseHistory.getHouseHistory()){
            if(String.valueOf(house.getHouseNumber()).equals(AptNum) && house.getStreet().equals(StreetNum) && house.getCommunity().equals(CommunityName) && house.getCity().equals(CityName) && String.valueOf(house.getZipcode()).equals(ZIP)){
                exists = true;
            }
        }
        if(AptNum.length() == 0){
            JOptionPane.showMessageDialog(this, "Apartment Number cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
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
        if(StreetNum.length()==0){
            JOptionPane.showMessageDialog(this, "Street Number cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
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

