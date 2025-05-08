import java.util.LinkedList;

public class Customer extends User {
    private long customerId;
    private String address;
    private String preferences;
    LinkedList<Flight> BookedFlights = new LinkedList<Flight>();
    public Customer(long userID, String Username, String password, String name, String email, long phone) {
        super(userID, Username, password, name, email, phone);
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


}
