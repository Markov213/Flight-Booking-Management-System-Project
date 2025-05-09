public class Agent extends User{
    private static long NumberofAgents = 0;
    private long AgentID;
    private String Department;
    private double Commission;
    public Agent(String Username, String password, String name, String email, long phone, String Department, double Commission) {
        super(Username, password, name, email, phone);
        this.AgentID = this.NumberofAgents++;
        this.Department = Department;
        this.Commission = Commission;
        this.setAccountType("Agent");
    }
    @Override
    public boolean login(String Username, String Password) {
        return this.getUsername().equals(Username) && this.getPassword().equals(Password) ? true : false;
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
