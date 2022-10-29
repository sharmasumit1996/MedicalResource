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
public class House {
    private int HouseNumber;
    private String Street;
    private String community;
    private String city;
    private int zipcode;
    private String perList;
    public ArrayList<Person> person = new ArrayList<Person>();

    public int getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(int HouseNumber) {
        this.HouseNumber = HouseNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
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
        return perList;
    }

    public void setPerList(String perList) {
        this.perList = perList;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public void append(String person){
        String ogList = this.perList;
        this.perList = ogList + ", "+person;
    }
    
}
