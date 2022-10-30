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
public class PatientDirectory {
    public ArrayList<Patient> patHistory;
    
    public PatientDirectory (){
        this.patHistory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatHistory() {
        return patHistory;
    }

    public void setPatHistory(ArrayList<Patient> patHistory) {
        this.patHistory = patHistory;
    }
    
    public Patient addNewValue(){
        Patient patient = new Patient();
        patHistory.add(patient);
        return patient;
    }
    
    public void updatePatient(Patient patient){
        int index = patHistory.indexOf(patient);
        patHistory.set(index, patient);
        
    }
    
    public void deletePatient(Patient patient){
        patHistory.remove(patient);
    }
    
}
