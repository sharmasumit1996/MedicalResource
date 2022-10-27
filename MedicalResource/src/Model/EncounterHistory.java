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
public class EncounterHistory {
    public ArrayList<Encounter> encHistory;
    
    public EncounterHistory(){
        this.encHistory = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncHistory() {
        return encHistory;
    }

    public void setEncHistory(ArrayList<Encounter> encHistory) {
        this.encHistory = encHistory;
    }
    
    public Encounter addNewValue(){
        Encounter encounter = new Encounter();
        encHistory.add(encounter);
        return encounter;
    }
    
    public void deleteEncounter(Encounter encounter){
        encHistory.remove(encounter);
    }
    
    public void updateEncounter(Encounter encounter){
        int index = encHistory.indexOf(encounter);
        encHistory.add(index, encounter);
    }
    
}
