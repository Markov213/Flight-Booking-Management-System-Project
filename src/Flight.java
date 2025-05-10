import java.util.List;
import java.util.ArrayList;
public class Flight {
    private long flightmuber;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;
    private double price;
    private List<User> Passengers = new ArrayList<User>();
    static List<Flight> Flights = new ArrayList<Flight>();
    public Flight(long flightmuber, String airline, String origin, String destination, String departureTime, String arrivalTime, int availableSeats, double prices) {
        this.flightmuber = flightmuber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.price = prices;
    }
    public boolean CheckAvailability() {
        return availableSeats > 0;
    }
    public void UpdateShedule(String departureTime, String arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    public void CalculatePrice(double price) {
        this.price = price;
    }
    public void ReserveSeatTo(User user) {
        if (CheckAvailability()) {
            Passengers.add(user);
            System.out.println("Seat reserved for " + user.getName());
            availableSeats--;
        } else {
            System.out.println("No available seats.");
        }
    }
    public void CancelSeat(User user) {
        if (Passengers.contains(user)) {
            Passengers.remove(user);
            System.out.println("Seat cancelled for " + user.getName());
            availableSeats++;
        } else {
            System.out.println("No reservation found for " + user.getName());
        }
    }
    public long getFlightNumber() {
        return flightmuber;
    }
    public String getAirline() {
        return airline;
    }
    public String getOrigin() {
        return origin;
    }
    public String getDestination() {
        return destination;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public double getPrice() {
        return price;
    }
    public void UpdateFlightDetails(long flightmuber, String airline, String origin, String destination, String departureTime, String arrivalTime, double price) {
        this.flightmuber = flightmuber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }
    public void DisplayFlightDetails() {
        System.out.println("Flight number: " + flightmuber);
        System.out.println("Airline: " + airline);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Departure time: " + departureTime);
        System.out.println("Arrival time: " + arrivalTime);
        System.out.println("Available seats: " + availableSeats);
        System.out.println("Price: " + price);
        System.out.println("Number of passengers: "+ Passengers.size());
        System.out.println("Passenger list: ");
        for (int i = 0; i < Passengers.size(); i++) {
            User user = Passengers.get(i);
            System.out.println("Passenger: " + user.getName());
        }
    }
}

