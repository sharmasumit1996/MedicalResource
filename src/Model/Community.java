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
public class Community {
    private String commName;
    private String houses;
    private String City;
    public ArrayList<House> houseList = new ArrayList<House>();
    public ArrayList<Hospital> hospList = new ArrayList<Hospital>();
    

    public String getCommName() {
        return commName;
    }

    public void setCommName(String commName) {
        this.commName = commName;
    }

    public String getHouses() {
        return houses;
    }

    public void setHouses(String houses) {
        this.houses = houses;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    public ArrayList<Hospital> getHospList() {
        return hospList;
    }

    public void setHospList(ArrayList<Hospital> hospList) {
        this.hospList = hospList;
    }

    public void append(String House){
        String ogList = this.houses;
        this.houses = ogList + ", "+House;
    }
    
    
}
