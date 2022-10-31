/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author sumit
 */
public class Appointment {
    private int ApptNo;
    private Date ApptDate;
    private String DoctorName;
    private String PatientName;

    public int getApptNo() {
        return ApptNo;
    }

    public void setApptNo(int ApptNo) {
        this.ApptNo = ApptNo;
    }

    public Date getApptDate() {
        return ApptDate;
    }

    public void setApptDate(Date ApptDate) {
        this.ApptDate = ApptDate;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }
    
}
