/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.CityHistory;
import Model.CommunityHistory;
import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.HospitalDirectory;
import Model.HouseHistory;
import Model.PatientDirectory;
import Model.PersonDirectory;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author sumit
 */
public class SysAdminHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminHomeJPanel
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    CityHistory cityHistory;
    CommunityHistory communityHistory;
    HouseHistory houseHistory;
    EncounterHistory encounterHistory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    public JSplitPane jSplitMainPane;
    public JPanel jPanelMainLeft;
    public JPanel jPanelMainRight;

        public SysAdminHomeJPanel(JSplitPane jSplitPane, JPanel leftPanel, JPanel rightPanel) {
        initComponents();
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        cityHistory = new CityHistory();
        communityHistory = new CommunityHistory();
        houseHistory = new HouseHistory();
        encounterHistory = new EncounterHistory();
        doctorDirectory = new DoctorDirectory();
        hospitalDirectory = new HospitalDirectory();
        this.jSplitMainPane = jSplitPane;
        this.jPanelMainLeft = leftPanel;
        this.jPanelMainRight = rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Citybtn = new javax.swing.JButton();
        Communitybtn = new javax.swing.JButton();
        Housebtn = new javax.swing.JButton();
        Hospitalbtn = new javax.swing.JButton();
        Personbtn = new javax.swing.JButton();
        Docotrbtn = new javax.swing.JButton();
        Patientbtn = new javax.swing.JButton();
        Vitalsbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome Admin!");

        Citybtn.setText("City");
        Citybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitybtnActionPerformed(evt);
            }
        });

        Communitybtn.setText("Community");
        Communitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunitybtnActionPerformed(evt);
            }
        });

        Housebtn.setText("House");
        Housebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HousebtnActionPerformed(evt);
            }
        });

        Hospitalbtn.setText("Hospital");
        Hospitalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalbtnActionPerformed(evt);
            }
        });

        Personbtn.setText("Person");
        Personbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonbtnActionPerformed(evt);
            }
        });

        Docotrbtn.setText("Doctor");
        Docotrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocotrbtnActionPerformed(evt);
            }
        });

        Patientbtn.setText("Patient");
        Patientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientbtnActionPerformed(evt);
            }
        });

        Vitalsbtn.setText("Vitals");
        Vitalsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VitalsbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Citybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Housebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Personbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Patientbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vitalsbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Communitybtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Docotrbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hospitalbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Citybtn)
                .addGap(18, 18, 18)
                .addComponent(Communitybtn)
                .addGap(18, 18, 18)
                .addComponent(Housebtn)
                .addGap(18, 18, 18)
                .addComponent(Hospitalbtn)
                .addGap(18, 18, 18)
                .addComponent(Personbtn)
                .addGap(18, 18, 18)
                .addComponent(Docotrbtn)
                .addGap(18, 18, 18)
                .addComponent(Patientbtn)
                .addGap(18, 18, 18)
                .addComponent(Vitalsbtn)
                .addContainerGap(292, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitybtnActionPerformed
        // TODO add your handling code here:
        CityJPanel citycud = new CityJPanel(cityHistory);
        this.jSplitMainPane.setRightComponent(citycud);
    }//GEN-LAST:event_CitybtnActionPerformed

    private void CommunitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunitybtnActionPerformed
        // TODO add your handling code here:
        CommunityJPanel communitycud = new CommunityJPanel(communityHistory,cityHistory);
        this.jSplitMainPane.setRightComponent(communitycud);
    }//GEN-LAST:event_CommunitybtnActionPerformed

    private void HousebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HousebtnActionPerformed
        // TODO add your handling code here:
        HouseJPanel housecud = new HouseJPanel(houseHistory,cityHistory,communityHistory);
        this.jSplitMainPane.setRightComponent(housecud);
    }//GEN-LAST:event_HousebtnActionPerformed

    private void HospitalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalbtnActionPerformed
        // TODO add your handling code here:
        HospitalJPanel doctorcud = new HospitalJPanel(hospitalDirectory,cityHistory,communityHistory);
        this.jSplitMainPane.setRightComponent(doctorcud);
    }//GEN-LAST:event_HospitalbtnActionPerformed

    private void PersonbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonbtnActionPerformed
        // TODO add your handling code here:
        PersonJPanel personcud = new PersonJPanel(personDirectory,houseHistory,cityHistory,communityHistory);
        this.jSplitMainPane.setRightComponent(personcud);
    }//GEN-LAST:event_PersonbtnActionPerformed

    private void DocotrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocotrbtnActionPerformed
        // TODO add your handling code here:
        DoctorJPanel doctorcud = new DoctorJPanel(doctorDirectory,hospitalDirectory);
        this.jSplitMainPane.setRightComponent(doctorcud);
    }//GEN-LAST:event_DocotrbtnActionPerformed

    private void PatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientbtnActionPerformed
        // TODO add your handling code here:
        PatientJPanel patientcud = new PatientJPanel(patientDirectory,personDirectory);
        this.jSplitMainPane.setRightComponent(patientcud);
    }//GEN-LAST:event_PatientbtnActionPerformed

    private void VitalsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VitalsbtnActionPerformed
        // TODO add your handling code here:
        VitalsJPanel vitalscud = new VitalsJPanel(patientDirectory, encounterHistory, doctorDirectory);
        this.jSplitMainPane.setRightComponent(vitalscud);
    }//GEN-LAST:event_VitalsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Citybtn;
    private javax.swing.JButton Communitybtn;
    private javax.swing.JButton Docotrbtn;
    private javax.swing.JButton Hospitalbtn;
    private javax.swing.JButton Housebtn;
    private javax.swing.JButton Patientbtn;
    private javax.swing.JButton Personbtn;
    private javax.swing.JButton Vitalsbtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
