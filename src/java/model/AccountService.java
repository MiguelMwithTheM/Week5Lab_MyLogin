package model;

//import java.io.Serializable;

/**
 *
 * @author migue
 */
public class AccountService {
    private String username;
    private String password;
    
    //Constructors
    public AccountService(){
        username = "";
        password = "";
    }
    
    public AccountService(String newUsername, String newPassword){
        this.username = newUsername;
        this.password = newPassword;
    }
    
    //Methods
    public AccountService login(String newUsername, String newPassword){
        if(newUsername.equals("abe") || newUsername.equals("barb") && newPassword.equals("password")) {
            AccountService acc = new AccountService(newUsername, newPassword);
            return acc;
        } else {
            return null;
        }
    }
    
    //Getters
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    //Setters
    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
    
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }
}
