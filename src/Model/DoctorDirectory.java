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
public class DoctorDirectory {
    public ArrayList<Doctor> docHistory;

    public DoctorDirectory (){
    this.docHistory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDocHistory() {
        return docHistory;
    }

    public void setDocHistory(ArrayList<Doctor> docHistory) {
        this.docHistory = docHistory;
    }
      
    public Doctor addNewValue(){
        Doctor doctor = new Doctor();
        docHistory.add(doctor);
        return doctor;
    }
    
    public void updateDoctor(Doctor doctor){
        int index = docHistory.indexOf(doctor);
        docHistory.set(index, doctor);
        
    }
    
    public void deleteDoctor(Doctor doctor){
        docHistory.remove(doctor);
    }
    
}
