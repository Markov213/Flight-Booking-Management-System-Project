package org.example;
import java.util.List;
import java.util.ArrayList;

public abstract class User {
    private static long NumberofUsers = 0;
    private long UserID = 0;
    private String Username = null;
    private String Password = null;
    private String Name = null;
    private String Email = null;
    private long Phone = 0;
    private boolean Activated = false;
    private String AccountType = null;
    public User(String Username, String password, String name, String email, long phone) {
        this.UserID = NumberofUsers++;
        this.Username = Username;
        this.Password = password;
        this.Name = name;
        this.Email = email;
        this.Phone = phone;
    }
    public long getUserID() {
        return UserID;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
    public String getName() {
        return Name;
    }
    public String getEmail() {
        return Email;
    }
    public long getPhone() {
        return Phone;
    }
    public boolean isActivated() {
        return Activated;
    }
    public String getAccountType() {
        return AccountType;
    }
    public void setUserID(long userID) {
        this.UserID = userID;
    }
    public void setUsername(String username) {
        this.Username = username;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public void setPhone(long phone) {
        this.Phone = phone;
    }
    public void setActivated(boolean activated) {
        this.Activated = activated;
    }
    public void setAccountType(String accountType) {
        this.AccountType = accountType;
    }
    public abstract boolean login(String Username, String Password);
    public abstract User logout();
    public void UpdateProfile(String Username, String password, String name, String email, long phone){
        this.Username = Username;
        this.Password = password;
        this.Name = name;
        this.Email = email;
        this.Phone = phone;
    }
    public void DisplayProfile(){
        System.out.println("Name: "+Name+"\nUsername: "+Username+"\nEmail: "+Email+"\nUserID: "+UserID+"\nPhone: 0"+Phone);
    }
    public void ViewBookingHistory(){
        System.out.println("No booking history available");
    }
    public void BookFlight(Flight flight){
        System.out.println("No booking history available");
    }
    public void CancelFlight(Flight flight){
        System.out.println("No booking history available");
    }
}
