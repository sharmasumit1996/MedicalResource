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
public class City {
    private String CityName;
    private String communities;
    public ArrayList<Community> CommunityList;

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getCommunities() {
        return communities;
    }

    public void setCommunities(String communities) {
        this.communities = communities;
    }

    public ArrayList<Community> getCommunityList() {
        return CommunityList;
    }

    public void setCommunityList(ArrayList<Community> CommunityList) {
        this.CommunityList = CommunityList;
    }
    
    
}
