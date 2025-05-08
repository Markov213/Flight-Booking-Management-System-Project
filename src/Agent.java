public class Agent extends User{
    private long AgentID;
    private String Department;
    private String Commission;
    public Agent(long userID, String Username, String password, String name, String email, long phone, long AgentID, String Department, String Commission) {
        super(userID, Username, password, name, email, phone);
        this.AgentID = AgentID;
        this.Department = Department;
        this.Commission = Commission;
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
    public void manageFlights() {
        System.out.println("manage flights");
    }
    public void createBookingForCustomer() {
        System.out.println("create booking for customer");
    }
    public void modifyBooking() {
        System.out.println("modify booking");
    }
    public void generateReports() {
        System.out.println("generate reports");
    }
}
