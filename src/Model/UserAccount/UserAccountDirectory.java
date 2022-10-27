/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

import Model.Person;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sumit
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> AccountList;

    public UserAccountDirectory() {
        AccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getAccountList() {
        return AccountList;
    }

    public void setAccountList(ArrayList<UserAccount> AccountList) {
        this.AccountList = AccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
       for (UserAccount ua : AccountList)
           if (ua.getUserName().equals(username) && ua.getPassword().equals(password)){
               return ua;
           }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
            UserAccount userAccount = new UserAccount();
            userAccount.setUserName(username);
            userAccount.setPassword(password);
            userAccount.setPerson(person);
            userAccount.setRole(role);
            AccountList.add(userAccount);
            return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : AccountList){
            if (ua.getUserName().equals(username))
                return false;
        }
        return true;
    }
}
