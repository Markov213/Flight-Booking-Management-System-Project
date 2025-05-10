public class Admin extends User {
    private static long NumberofAdmins = 0;
    private long AdminID;
    private String SecurityLevel;
    public Admin(String Username, String password, String name, String email, long phone, String SecurityLevel) {
        super(Username, password, name, email, phone);
        this.AdminID = this.NumberofAdmins++;
        this.SecurityLevel = SecurityLevel;
        this.setAccountType("Admin");
    }
    @Override
    public boolean login(String Username, String Password) {
        return this.getUsername().equals(Username) && this.getPassword().equals(Password) ? true : false;
    }
    public User logout() {
        return null;
    }
    public void UpdateProfile(String Username, String password, String name, String email, long phone, String SecurityLevel) {
        this.UpdateProfile(Username, password, name, email, phone);
        this.SecurityLevel = SecurityLevel;
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
