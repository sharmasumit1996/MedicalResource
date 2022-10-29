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
public class Hospital {
    private String HospitalName;
    private String community;
    private String city;
    private int zipcode;
    private String patList;
    private String DocList;
    public ArrayList<Doctor> doctor = new ArrayList<Doctor>();

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPerList() {
        return patList;
    }

    public void setPerList(String patList) {
        this.patList = patList;
    }

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }

    public String getPatList() {
        return patList;
    }

    public void setPatList(String patList) {
        this.patList = patList;
    }

    public String getDocList() {
        return DocList;
    }

    public void setDocList(String DocList) {
        this.DocList = DocList;
    }
   
    public void append(String doctor){
        String ogList = this.DocList;
        this.DocList = ogList + ", "+doctor;
    }
}
