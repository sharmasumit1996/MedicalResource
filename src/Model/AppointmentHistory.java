/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sumit
 */
public class AppointmentHistory {
    public ArrayList<Appointment> AppointmentHistory;

    public AppointmentHistory(){
        this.AppointmentHistory = new ArrayList<Appointment>();
    }
    
    public ArrayList<Appointment> getAppointmentHistory() {
        return AppointmentHistory;
    }

    public void setAppointmentHistory(ArrayList<Appointment> AppointmentHistory) {
        this.AppointmentHistory = AppointmentHistory;
    }
    
    public Appointment addNewValue(){
        Appointment appointment = new Appointment();
        AppointmentHistory.add(appointment);
        return appointment;
    }
}
