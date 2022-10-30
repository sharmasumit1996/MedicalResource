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
public class HospitalDirectory {
    public ArrayList<Hospital> HospitalDirectory;
    
    public HospitalDirectory(){
        this.HospitalDirectory = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return HospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> HospitalDirectory) {
        this.HospitalDirectory = HospitalDirectory;
    }
    
        public Hospital addNewValue(){
        Hospital hospital = new Hospital();
        HospitalDirectory.add(hospital);
        return hospital;
    }
    
    public void deleteHospital(Hospital hospital){
        HospitalDirectory.remove(hospital);
    }
    
    public void updateHospital(Hospital hospital){
        int index = HospitalDirectory.indexOf(hospital);
        HospitalDirectory.add(index, hospital);
    }
}
