package org.example;

public class Passenger {
    private String name;
    private String passportNumber;
    private String dateOfBirth;
    private String specialRequests;

    public Passenger(String name, String passportNumber, String dateOfBirth) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public String getPassportNumber() { return passportNumber; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getSpecialRequests() { return specialRequests; }

    public void setSpecialRequests(String requests) {
        this.specialRequests = requests;
    }
}