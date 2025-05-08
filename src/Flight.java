public class Flight {
    private String flightmuber;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;
    private double price;

    public Flight(String flightmuber, String airline, String origin, String destination, String departureTime, String arrivalTime, int availableSeats, double prices) {
        this.flightmuber = flightmuber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.price = price;
    }
    public boolean CheckAvailability(int seats) {
        return availableSeats > 0;
    }
    public void UpdateShedule(String departureTime, String arrivalTime) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    public void CalculatePrice(double price) {
        this.price = price;
    }
    public void ReserveSeat(int seats) {
        if (CheckAvailability(seats)) {
            availableSeats -= seats;
        } else {
            System.out.println("No available seats.");
        }
    }
}

