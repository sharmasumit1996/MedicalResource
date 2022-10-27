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
public class CityHistory {
    public ArrayList<City> CityHistory;
    
    public CityHistory(){
        this.CityHistory = new ArrayList<City>();
    }

    public ArrayList<City> getCityHistory() {
        return CityHistory;
    }

    public void setCityHistory(ArrayList<City> CityHistory) {
        this.CityHistory = CityHistory;
    }
    
    public City addNewValue(){
        City city = new City();
        CityHistory.add(city);
        return city;
    }
    
    public void deleteCity(City city){
        CityHistory.remove(city);
    }
    
    public void updateCity(City city){
        int index = CityHistory.indexOf(city);
        CityHistory.add(index, city);
    }
}
