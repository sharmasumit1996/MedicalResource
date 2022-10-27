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
public class CommunityHistory {
    public ArrayList<Community> commHistory;
    
    public CommunityHistory(){
        this.commHistory = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommHistory() {
        return commHistory;
    }

    public void setCommHistory(ArrayList<Community> commHistory) {
        this.commHistory = commHistory;
    }
    
    public Community addNewValue(){
        Community community = new Community();
        commHistory.add(community);
        return community;
    }
    
    public void deleteCommunity(Community community){
        commHistory.remove(community);
    }
    
    public void updateCommunity(Community community){
        int index = commHistory.indexOf(community);
        commHistory.add(index, community);
    }
}

