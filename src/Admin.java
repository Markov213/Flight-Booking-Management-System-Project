public class Admin extends User {
    long AdminID;
    String SecurityLevel;
    public Admin(long UserID, String Username, String password, String name, String email, long phone, String SecurityLevel) {
        super(UserID,Username, password, name, email, phone);
        this.AdminID = UserID;
        this.SecurityLevel = SecurityLevel;
    }
    @Override
    public User login(String Username, String Password) {
        return this;
    }
    public User logout() {
        return null;
    }
    public void UpdateProfile() {
        System.out.println("updated profile");
    }
    public void createUser(){
        System.out.println("create user");
    }
    public void manageSystemSettings() {
        System.out.println("manage system settings");
    }
    public void viewSystemLogs() {
        System.out.println("view system logs");
    }
    public void manageUserAccess() {
        System.out.println("manage user access");
    }
}
