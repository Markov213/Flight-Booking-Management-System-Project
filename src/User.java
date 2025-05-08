public abstract class User {
    protected long UserID = 0;
    protected String Username = null;
    protected String Password = null;
    protected String Name = null;
    protected String Email = null;
    protected long Phone = 0;
    protected boolean Activated = false;

    public User(long userID, String Username, String password, String name, String email, long phone) {
        this.UserID = userID;
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
    public abstract User login(String Username, String Password);
    public abstract User logout();
    public void UpdateProfile(long userID, String Username, String password, String name, String email, long phone){
        this.UserID = userID;
        this.Username = Username;
        this.Password = password;
        this.Name = name;
        this.Email = email;
        this.Phone = phone;
    }
    public void DisplayProfile(){
        System.out.println("Name: "+Name+"\nUsername: "+Username+"\nEmail: "+Email+"\nUserID: "+UserID+"\nPhone: 0"+Phone);
    }
}
