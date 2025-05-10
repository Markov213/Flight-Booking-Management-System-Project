import java.util.ArrayList;
import java.util.List;
public class Customer extends User {
    private static long NumberofCustomers = 0;
    private long CustomerId;
    private String address;
    private String preferences;
    private List<Flight> BookedFlights = new ArrayList<Flight>();
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
    }public void UpdateProfile(String Username, String password, String name, String email, long phone, String address, String preferences) {
        this.UpdateProfile(Username, password, name, email, phone);
        this.address = address;
        this.preferences = preferences;
    }
    public void ViewBookingHistory() {
        for (Flight flight : BookedFlights) {
            System.out.println(flight);
        }
    }
    public void BookFlight(Flight flight) {
        BookedFlights.add(flight);
        flight.ReserveSeatTo(this);
    }
    public void CancelFlight(Flight flight) {
        BookedFlights.remove(flight);
        flight.CancelSeat(this);
    }
    public void DisplayProfile(){
        System.out.println("Name: "+getName()+"\nUsername: "+getUsername()+"\nEmail: "+getEmail()+"\nUserID: "+getUserID()+"\nPhone: 0"+getPhone()+"\nAddress: "+address+"\nPreferences: "+preferences);
    }


}
