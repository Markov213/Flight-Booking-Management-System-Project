package org.example;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String bookingReference;
    private Customer customer;
    private Flight flight;
    private List<Passenger> passengers;
    private String status;
    private Payment payment;

    public Booking(Customer customer, Flight flight) {
        this.bookingReference = "BK" + System.currentTimeMillis();
        this.customer = customer;
        this.flight = flight;
        this.passengers = new ArrayList<>();
        this.status = "Reserved";
    }

    public String getBookingReference() { return bookingReference; }
    public Customer getCustomer() { return customer; }
    public Flight getFlight() { return flight; }
    public List<Passenger> getPassengers() { return passengers; }
    public String getStatus() { return status; }
    public Payment getPayment() { return payment; }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void confirmBooking(Payment payment) {
        this.payment = payment;
        this.status = "Confirmed";
    }

    public void cancelBooking() {
        this.status = "Cancelled";
        flight.CancelSeat(customer);
    }

    public void displayDetails() {
        System.out.println("\n=== Booking Details ===");
        System.out.println("Reference: " + bookingReference);
        System.out.println("Flight: " + flight.getFlightNumber() + " (" + flight.getOrigin() + " → " + flight.getDestination() + ")");
        System.out.println("Status: " + status);
        if (payment != null) {
            System.out.println("Paid: " + payment.getAmount() + " via " + payment.getMethod());
        }
    }
}