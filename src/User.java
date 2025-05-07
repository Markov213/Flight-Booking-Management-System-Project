public abstract class User {
    protected long UserID = 0;
    protected String Username = null;
    protected String Password = null;
    protected String Name = null;
    protected String Email = null;
    protected long Phone = 0;

    public User(long userID, String Username, String password, String name, String email, long phone) {
        this.UserID = userID;
        this.Username = Username;
        this.Password = password;
        this.Name = name;
        this.Email = email;
        this.Phone = phone;
    }

    public abstract User login(String Username, String Password);
    public abstract User logout();
    public abstract void UpdateProfile();
}
