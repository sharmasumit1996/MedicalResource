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
public class HouseHistory {
    public ArrayList<House> houseHistory;
    
    public HouseHistory(){
        this.houseHistory = new ArrayList<House>();
    }

    public ArrayList<House> getHouseHistory() {
        return houseHistory;
    }

    public void setHouseHistory(ArrayList<House> houseHistory) {
        this.houseHistory = houseHistory;
    }
    
    public House addNewValue(){
        House house = new House();
        houseHistory.add(house);
        return house;
    }
    
    public void deleteHouse(House house){
        houseHistory.remove(house);
    }
    
    public void updateHouse(House house){
        int index = houseHistory.indexOf(house);
        houseHistory.add(index, house);
    }
            
}
