/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Appointment;
import Model.AppointmentHistory;
import Model.CityHistory;
import Model.CommunityHistory;
import Model.Doctor;
import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.Hospital;
import Model.HospitalDirectory;
import Model.PatientDirectory;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sumit
 */

public class DoctorViewAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorViewAppointmentJPanel
     */
    public static PatientDirectory patientDirectory;
    public static CityHistory cityHistory;
    public static CommunityHistory communityHistory;
    public static EncounterHistory encounterHistory;
    public static DoctorDirectory doctorDirectory;
    public static HospitalDirectory hospitalDirectory;
    public static AppointmentHistory appointmentHistory;
    public static String Username;
    public static String Password;
    public DoctorViewAppointmentJPanel(PatientDirectory patientDirectory, EncounterHistory encounterHistory, DoctorDirectory doctorDirectory, CityHistory cityHistory, CommunityHistory communityHistory, HospitalDirectory hospitalDirectory, AppointmentHistory appointmentHistory, String username, String password) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.cityHistory = cityHistory;
        this.communityHistory = communityHistory; 
        this.encounterHistory = encounterHistory;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.appointmentHistory = appointmentHistory;
        this.Username = username;
        this.Password = password;
        Nametxt.setEditable(false);
        AppNotxt.setEnabled(false);
        Hospitaltxt.setEditable(false);
        CommNametxt.setEditable(false);
        CityNametxt.setEnabled(false);
        PatientNametxt.setEnabled(false);
        AppDatejdc.setEnabled(false);
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)AppointmentJTable.getModel();
        for(Appointment appt : appointmentHistory.getAppointmentHistory()){
            for(Doctor docs: doctorDirectory.getDocHistory()){
                if(appt.getDoctorName().equalsIgnoreCase(docs.getName())){
                    for(Hospital hosp : hospitalDirectory.getHospitalDirectory()){
                        if(hosp.getHospitalName().equals(docs.getHospital())){
                        model.setRowCount(0);
                        Object[] row = new Object[7];
                        row[0] = appt.getApptNo();
                        row[1] = appt.getPatientName();
                        row[2] = appt.getDoctorName();
                        row[3] = docs.getHospital();                         
                        row[4] = hosp.getCommunity();
                        row[5] = hosp.getCity();
                        row[6] = appt.getApptDate();
                        model.addRow(row);
                        }
                    }
                }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentJTable = new javax.swing.JTable();
        PatientNametxt = new javax.swing.JTextField();
        PatientNamelbl = new javax.swing.JLabel();
        ApptDatelbl = new javax.swing.JLabel();
        AppDatejdc = new com.toedter.calendar.JDateChooser();
        CityNametxt = new javax.swing.JTextField();
        CityNamelbl = new javax.swing.JLabel();
        CommNamelbl = new javax.swing.JLabel();
        CommNametxt = new javax.swing.JTextField();
        Hospitaltxt = new javax.swing.JTextField();
        Hospitallbl = new javax.swing.JLabel();
        Namelbl = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        ApptNolbl = new javax.swing.JLabel();
        AppNotxt = new javax.swing.JTextField();
        BookAppointmentlbl = new javax.swing.JLabel();

        AppointmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment Number", "Patient Name", "Doctor Name", "Hospital", "Community", "City", "Appointment Date"
            }
        ));
        AppointmentJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AppointmentJTable);

        PatientNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PatientNametxtKeyPressed(evt);
            }
        });

        PatientNamelbl.setText("Patient Name:");

        ApptDatelbl.setText("Date:");

        CityNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CityNametxtKeyPressed(evt);
            }
        });

        CityNamelbl.setText("City Name:");

        CommNamelbl.setText("Community Name:");

        CommNametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CommNametxtKeyPressed(evt);
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

        Hospitallbl.setText("Hospital:");

        Namelbl.setText("Doctor Name:");

        Nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NametxtKeyPressed(evt);
            }
        });

        ApptNolbl.setText("Appointment No.");

        BookAppointmentlbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BookAppointmentlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookAppointmentlbl.setText("View Appointment");
        BookAppointmentlbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Hospitallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Hospitaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PatientNamelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CommNamelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CityNamelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ApptDatelbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AppDatejdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CommNametxt)
                                    .addComponent(CityNametxt)
                                    .addComponent(PatientNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ApptNolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AppNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BookAppointmentlbl))
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(BookAppointmentlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApptNolbl)
                    .addComponent(AppNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Namelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hospitallbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Hospitaltxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CommNamelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CommNametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityNamelbl)
                    .addComponent(CityNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApptDatelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AppDatejdc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientNamelbl)
                    .addComponent(PatientNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AppointmentJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentJTableMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = AppointmentJTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) AppointmentJTable.getModel();
        AppNotxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
        PatientNametxt.setText(model.getValueAt(selectedRowIndex, 6).toString());
        Nametxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
        Hospitaltxt.setText(model.getValueAt(selectedRowIndex, 2).toString());
        CommNametxt.setText(model.getValueAt(selectedRowIndex, 3).toString());
        CityNametxt.setText(model.getValueAt(selectedRowIndex, 4).toString());
        AppDatejdc.setDate((Date)model.getValueAt(selectedRowIndex, 4));
    }//GEN-LAST:event_AppointmentJTableMouseClicked

    private void PatientNametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PatientNametxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            PatientNametxt.setEditable(true);
        }
        else {
            PatientNametxt.setEditable(false); }
    }//GEN-LAST:event_PatientNametxtKeyPressed

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

    private void CommNametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CommNametxtKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(Character.isLetter(ch))
        {
            CommNametxt.setEditable(true);
        }
        else {
            CommNametxt.setEditable(false); }
    }//GEN-LAST:event_CommNametxtKeyPressed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AppDatejdc;
    private javax.swing.JTextField AppNotxt;
    private javax.swing.JTable AppointmentJTable;
    private javax.swing.JLabel ApptDatelbl;
    private javax.swing.JLabel ApptNolbl;
    private javax.swing.JLabel BookAppointmentlbl;
    private javax.swing.JLabel CityNamelbl;
    private javax.swing.JTextField CityNametxt;
    private javax.swing.JLabel CommNamelbl;
    private javax.swing.JTextField CommNametxt;
    private javax.swing.JLabel Hospitallbl;
    private javax.swing.JTextField Hospitaltxt;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JLabel PatientNamelbl;
    private javax.swing.JTextField PatientNametxt;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
