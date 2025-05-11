import java.util.ArrayList;
import java.util.List;
public class Agent extends User{
    private static long NumberofAgents = 0;
    private long AgentID;
    private String Department;
    private double Commission;
    private List<Flight> AssignedFlights = new ArrayList<Flight>();
    private double Salary;
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
    public void UpdateProfile(String Username, String password, String name, String email, long phone, String Department) {
        this.UpdateProfile(Username, password, name, email, phone);
        this.Department = Department;
    }
    public void setCommission(double Commission) {
        this.Commission = Commission;
    }
    public void CalculateCommissionEachFlight() {
        for (Flight flight : AssignedFlights) {
                double A = flight.getPrice() * Commission / 100;
                Salary += A;
                System.out.println("Commission for flight number " + flight.getFlightNumber() + " is: " + (A));
        }
        Salary = 0;
    }
    public void DisplayFlightsDetails() {
        for (Flight flight : AssignedFlights) {
            flight.DisplayFlightDetails();
        }
    }
    public double getSalary() {
        return Salary;
    }
    public void SetSalary(double Salary) {
        this.Salary = Salary;
    }
    public List<Flight> getAssignedFlights() {
        return AssignedFlights;
    }
}
