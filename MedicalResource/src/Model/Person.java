/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sumit
 */
public class Person {
    private String personID;
    private String name;
    private int age;
    private String community;
    private String city;
    private String house; 
    public Patient patient;

    public String getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCommunity() {
        return community;
    }

    public String getCity() {
        return city;
    }

    public String getHouse() {
        return house;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString(){
        return personID;
    }
}
