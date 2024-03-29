/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.PatientDirectory;
import Model.PersonDirectory;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


/**
 *
 * @author sumit
 */
public class PatientHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientHomeJPanel
     */
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    EncounterHistory encounterHistory;
    DoctorDirectory doctorDirectory;
    public static String Username;
    public static String Password;
    public JSplitPane jSplitMainPane;
    public JPanel jPanelMainLeft;
    public JPanel jPanelMainRight;
    public PatientHomeJPanel(JSplitPane jSplitPane, JPanel leftPanel, JPanel rightPanel,String username, String password) {
        initComponents();
        personDirectory = new PersonDirectory();
        patientDirectory = new PatientDirectory();
        encounterHistory = new EncounterHistory();
        doctorDirectory = new DoctorDirectory();
        Username = username;
        Password = password;
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

        Patientbtn = new javax.swing.JButton();
        Vitalsbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Back");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Vitalsbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(Patientbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Patientbtn)
                .addGap(18, 18, 18)
                .addComponent(Vitalsbtn)
                .addContainerGap(478, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientbtnActionPerformed
        // TODO add your handling code here:
        PatientViewPatientJPanel patientview = new PatientViewPatientJPanel(patientDirectory,personDirectory,Username,Password);
        this.jSplitMainPane.setRightComponent(patientview);
    }//GEN-LAST:event_PatientbtnActionPerformed

    private void VitalsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VitalsbtnActionPerformed
        // TODO add your handling code here:
        PatientViewVitalsJPanel vitalsview = new PatientViewVitalsJPanel(patientDirectory, encounterHistory, doctorDirectory,Username,Password);
        this.jSplitMainPane.setRightComponent(vitalsview);
    }//GEN-LAST:event_VitalsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Patientbtn;
    private javax.swing.JButton Vitalsbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
