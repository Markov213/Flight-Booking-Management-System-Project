import java.util.LinkedList;

public class Customer extends User {
    private static long NumberofCustomers = 0;
    private long CustomerId;
    private String address;
    private String preferences;
    LinkedList<Flight> BookedFlights = new LinkedList<Flight>();
    public Customer(String Username, String password, String name, String email, long phone, String address, String preferences) {
        super(Username, password, name, email, phone);
        this.CustomerId = this.NumberofCustomers++;
        this.address = address;
        this.preferences = preferences;
        this.setAccountType("Customer");
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


}
