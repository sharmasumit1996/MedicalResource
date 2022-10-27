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
public class PersonDirectory {
    public ArrayList<Person> perHistory;
    
    public PersonDirectory() {
        this.perHistory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerHistory() {
        return perHistory;
    }

    public void setPerHistory(ArrayList<Person> perHistory) {
        this.perHistory = perHistory;
    }
    
    public Person addNewValue(){
        Person person = new Person();
        perHistory.add(person);
        return person;
    }

    public void updatePerson(Person person){
        int index = perHistory.indexOf(person);
        perHistory.add(index, person);
    }
    
    public void deletePerson(Person person){
        perHistory.remove(person);
    }
}
