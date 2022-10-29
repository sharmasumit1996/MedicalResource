/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.City;
import Model.CityHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumit
 */
public class SysAdCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdCityJPanel
     */
    CityHistory cityhistory;
    public SysAdCityJPanel(CityHistory cityhistory) {
        initComponents();
        this.cityhistory = cityhistory;
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)CityJTable.getModel();
        model.setRowCount(0);
        for(City city: cityhistory.getCityHistory()){
        
            Object[] row = new Object[10];
            row[0] = city.getCityName();
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

        Citylbl = new javax.swing.JLabel();
        CityNamelbl = new javax.swing.JLabel();
        CityNametxt = new javax.swing.JTextField();
        SaveCitybtn = new javax.swing.JButton();
        UpdateCitybtn = new javax.swing.JButton();
        DeleteCitybtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CityJTable = new javax.swing.JTable();

        Citylbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Citylbl.setText("CITY");

        CityNamelbl.setText("City Name:");

        SaveCitybtn.setText("Save");
        SaveCitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCitybtnActionPerformed(evt);
            }
        });

        UpdateCitybtn.setText("Update");
        UpdateCitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCitybtnActionPerformed(evt);
            }
        });

        DeleteCitybtn.setText("Delete");
        DeleteCitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCitybtnActionPerformed(evt);
            }
        });

        CityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City Name"
            }
        ));
        CityJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CityJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CityJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Citylbl)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CityNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CityNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SaveCitybtn)
                        .addGap(38, 38, 38)
                        .addComponent(UpdateCitybtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteCitybtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Citylbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityNamelbl)
                    .addComponent(CityNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveCitybtn)
                    .addComponent(UpdateCitybtn)
                    .addComponent(DeleteCitybtn))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteCitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCitybtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = CityJTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) CityJTable.getModel();
        String CityName = model.getValueAt(selectedRowIndex, 0).toString();
        for(City city: cityhistory.getCityHistory()){
            if (CityName.equals(city.getCityName())){
                cityhistory.deleteCity(city);
                break;
            }
        }
        CityNametxt.setText("");
        JOptionPane.showMessageDialog(this, "City has been deleted!!");
        populateTable();
    }//GEN-LAST:event_DeleteCitybtnActionPerformed

    private void SaveCitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCitybtnActionPerformed
        // TODO add your handling code here:
        if(validate(CityNametxt.getText())){
            City newCity = cityhistory.addNewValue();
            newCity.setCityName(CityNametxt.getText());
            
            JOptionPane.showMessageDialog(this, "New City Added");
        }
        CityNametxt.setText("");
        populateTable();
    }//GEN-LAST:event_SaveCitybtnActionPerformed

    private void UpdateCitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCitybtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = CityJTable.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }
        if(validate(CityNametxt.getText())){
            City city = new City();
            city.setCityName(CityNametxt.getText());
            //cityhistory.updateCity(city);
            String CityName = CityNametxt.getText();
            for(City city1: cityhistory.getCityHistory()){
            if (CityName.equals(city.getCityName())){
               cityhistory.deleteCity(city1);
                break;
            }
        }
        City city2 = cityhistory.addNewValue();
        city2.setCityName(CityNametxt.getText());
        JOptionPane.showMessageDialog(this, "City has been Updated");
        CityNametxt.setText("");
        populateTable();
        }
        
    }//GEN-LAST:event_UpdateCitybtnActionPerformed

    private void CityJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CityJTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = CityJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) CityJTable.getModel();
        CityNametxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
    }//GEN-LAST:event_CityJTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CityJTable;
    private javax.swing.JLabel CityNamelbl;
    private javax.swing.JTextField CityNametxt;
    private javax.swing.JLabel Citylbl;
    private javax.swing.JButton DeleteCitybtn;
    private javax.swing.JButton SaveCitybtn;
    private javax.swing.JButton UpdateCitybtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

private boolean validate(String cityName) {
        //To change body of generated methods, choose Tools | Templates.
        boolean fetch = false;
        for(City city: cityhistory.getCityHistory()){
            if(city.getCityName().equals(cityName)){
                fetch = true;
            }
        }
        if(cityName.length()==0){
            JOptionPane.showMessageDialog(this, "City Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(fetch){
            JOptionPane.showMessageDialog(this, "City already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
