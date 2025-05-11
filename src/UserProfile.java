import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserProfile {
    private User user;
    List<User> Users;
    List<Flight> Flights;
    Scanner input = new Scanner(System.in);
    public UserProfile(User user, List<User> Users) {
        this.Users = Users;
        this.user = user;
    }




    // Customer Menu
    public void CustomerMenu(){
        int choice = 1;
        do {
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Search Flights");
            System.out.println("4. Book Flight");
            System.out.println("5. Cancel Flight");
            System.out.println("6. View Booking History");
            System.out.println("7. Logout");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                System.out.println("\nUSER DETAILS\n");
                    user.DisplayProfile();
                    break;
                case 2:
                System.out.println("\nPLEASE PROVIDE YOUR NEW DETAILS\n");
                System.out.println("New username: ");
                String Username = input.next();
                System.out.println("New password: ");
                String Password = input.next();
                System.out.println("New name: ");
                input.nextLine();
                String Name = input.nextLine();
                System.out.println("New email: ");
                String Email = input.next();
                System.out.println("New phone: ");
                long Phone = input.nextLong();
                user.UpdateProfile(Username,Password,Name,Email,Phone);
                    break;
                case 3:
                    System.out.println("\nPLEASE PROVIDE SEARCH TYPE\n");
                    System.out.println("1. By flight number");
                    System.out.println("2. By airline");
                    System.out.println("3. By origin");
                    System.out.println("4. By destination");
                    System.out.println("5. By departure time");
                    System.out.println("6. By arrival time");
                    System.out.println("7. Range of price");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("\nPLEASE PROVIDE FLIGHT NUMBER\n");
                            long flightnumber = input.nextLong();
                            for (Flight flight : Flight.Flights) {
                                if (flight.getFlightNumber() == flightnumber) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                    System.out.println("We considered your preferences and added a plane with"+user.getPrefrences(0)+" and your favorate food "+user.getPrefrences(1));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("\nPLEASE PROVIDE AIRLINE\n");
                            String airline = input.next();
                            for (Flight flight : Flight.Flights) {
                                if (flight.getAirline().equals(airline)) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                }
                            }
                            break;
                        case 3:
                            System.out.println("\nPLEASE PROVIDE ORIGIN\n");
                            String origin = input.next();
                            for (Flight flight : Flight.Flights) {
                                if (flight.getOrigin().equals(origin)) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                }
                            }
                            break;
                        case 4:
                            System.out.println("\nPLEASE PROVIDE DESTINATION\n");
                            String destination = input.next();
                            System.out.println("Enter your payment method: ");
                            System.out.println("1.Credit Card\n2.Bank Transfer");
                            int paymentMethod = input.nextInt();
                            if (paymentMethod == 1) {
                                System.out.println("Enter your credit card number: ");
                                String creditCardNumber = input.next();
                                System.out.println("Enter your credit card expiry date: ");
                                String expiryDate = input.next();
                                System.out.println("Enter your credit card CVV: ");
                                String cvv = input.next();
                            
                            } else if (paymentMethod == 2) {
                                System.out.println("Enter your bank account number: ");
                                String bankAccountNumber = input.next();
                            } else {
                                System.out.println("Invalid payment method. Please try again.");
                            }
                            System.out.println("We will send you a confirmation email to "+user.getEmail());
                            for (Flight flight : Flight.Flights) {
                                if (flight.getDestination().equals(destination)) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                }
                            }
                            break;
                        case 5:
                            System.out.println("\nPLEASE PROVIDE DEPARTURE TIME\n");
                            String departureTime = input.next();
                            for (Flight flight : Flight.Flights) {
                                if (flight.getDepartureTime().equals(departureTime)) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                    System.out.println("We will carge you "+flight.getPrice()+"$ for this flight");
                                }
                            }
                            break;
                        case 6:
                            System.out.println("\nPLEASE PROVIDE ARRIVAL TIME\n");
                            String arrivalTime = input.next();
                            for (Flight flight : Flight.Flights) {
                                if (flight.getArrivalTime().equals(arrivalTime)) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                }
                            }
                            break;
                        case 7:
                            System.out.println("\nPLEASE PROVIDE RANGE OF PRICE\n");
                            System.out.println("Minimum price: ");
                            double minPrice = input.nextDouble();
                            System.out.println("Maximum price: ");
                            double maxPrice = input.nextDouble();
                            for (Flight flight : Flight.Flights) {
                                if (flight.getPrice() >= minPrice && flight.getPrice() <= maxPrice) {
                                    System.out.println("Flight found!");
                                    System.out.println("Flight details:");
                                    flight.DisplayFlightDetails();
                                }
                            }
                            break;
                        }
                case 4:
                    System.out.println("\nPLEASE PROVIDE FLIGHT DETAILS\n");
                    System.out.println("Flight number: ");
                    long flightnumber = input.nextLong();
                    for (Flight flight : Flight.Flights) {
                        if (flight.getFlightNumber() == flightnumber) {
                            System.out.println("Flight found!");
                            System.out.println("Flight details:");
                            flight.DisplayFlightDetails();
                            System.out.println("Booking flight...");
                            user.BookFlight(flight);
                            System.out.println("Flight booked successfully!");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nPLEASE PROVIDE FLIGHT NUMBER\n");
                    System.out.println("Flight number: ");
                    flightnumber = input.nextLong();
                    for (Flight flight : Flight.Flights) {
                        if (flight.getFlightNumber() == flightnumber) {
                            System.out.println("Flight found!");
                            System.out.println("Cancelling flight...");
                            user.CancelFlight(flight);
                            System.out.println("Flight cancelled successfully!");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nBOOKING HISTORY\n");
                    user.ViewBookingHistory();
                    break;
                case 7:
                System.out.println("USER LOGED OUT\n");
                choice = -1;
                    break;
                default:
                    throw new AssertionError();
            }
        } while(choice!=-1);
    }




    // Admin Menu
    public void AdminMenu(){
        int choice = 1;
        do {
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Manage User");
            System.out.println("4. Create User");
            System.out.println("5. Manage agent commission");
            System.out.println("6. View System Logs");
            System.out.println("7. Logout");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nUSER DETAILS\n");
                    user.DisplayProfile();
                    break;
                case 2:
                    System.out.println("\nPLEASE PROVIDE YOUR NEW DETAILS\n");
                    System.out.println("New username: ");
                    String Username = input.next();
                    System.out.println("New password: ");
                    String Password = input.next();
                    System.out.println("New name: ");
                    input.nextLine();
                    String Name = input.nextLine();
                    System.out.println("New email: ");
                    String Email = input.next();
                    System.out.println("New phone: ");
                    long Phone = input.nextLong();
                    user.UpdateProfile(Username,Password,Name,Email,Phone);
                    break;
                case 3:
                    System.out.println("\nPLEASE PROVIDE USERNAME AND USER ID OF THE NEEDED USER\n");
                    System.out.println("User ID: ");
                    long UserID = input.nextLong();
                    System.out.println("Username: ");
                    String Username1 = input.next();
                    boolean flag = false;
                    System.out.println("\nYOU WANT TO: 1. ACTIVATE USER 2. DEACTIVATE USER\n");
                    choice = input.nextInt();
                    for (User User : Users) {
                        if (User.getUserID() == UserID && User.getUsername().equals(Username1)) {
                            switch (choice) {
                                case 1:
                                    System.out.println("\nACTIVATING USER...\n");
                                    User.setActivated(true);
                                    System.out.println("User activated successfully!");
                                    flag = true;
                                    break;
                                case 2:
                                    System.out.println("\nDEACTIVATING USER..\n");
                                    User.setActivated(false);
                                    System.out.println("User deactivated successfully!");
                                    flag = true;
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        }
                    }
                    if(!flag){
                        System.out.println("Invalid username or user ID. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("\nPLEASE PROVIDE USER DETAILS\n");
                    System.out.println("Enter user name: ");
                    input.nextLine();
                    String name = input.next();
                    System.out.println("Enter user email: ");
                    input.nextLine();
                    String email = input.next();
                    System.out.println("Enter user phone number: ");
                    long phone = input.nextLong();
                    System.out.println("Enter user username: ");
                    String username = input.next();
                    for (User User : Users) {
                        if (User.getUsername().equals(username)) {
                            System.out.println("Username already exists. Please choose a different username.");
                            username = input.next();
                        }
                    }
                    System.out.println("Enter user password: ");
                    String password = input.next();
                    while (password.length() < 6) {
                        System.out.println("Password must be at least 6 characters long. Please enter a new password: ");
                        password = input.next();
                    }
                    System.out.println("\nCHOOSE USER ACCOUNT TYPE \n1. Customer \n2. Agent\n3. Admin");
                    System.out.println("Enter user account Type:");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter user address: ");
                            input.nextLine();
                            String address = input.next();
                            System.out.println("Enter user preferences: ");
                            List<String> preferences = new ArrayList<>();
                            System.out.println("1. Business Class \n2. Economy Class");
                            int preferenceChoice = input.nextInt();
                            switch (preferenceChoice) {
                                case 1:
                                    preferences.add("Business Class");
                                    break;
                                case 2:
                                    preferences.add("Economy Class");
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                            System.out.println("Favorite food:");
                            String food = input.next();
                            preferences.add(food);
                            Users.add(new Customer(username, password, name, email, phone, address, preferences));
                            break;
                        case 2:
                            System.out.println("Enter user department: ");
                            String department = input.next();
                            Users.add(new Agent(username, password, name, email, phone, department, 0.0));
                            break;
                        case 3:
                            System.out.println("Enter user security level: ");
                            String securityLevel = input.next();
                            Users.add(new Admin(username, password, name, email, phone,securityLevel));
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 5:
                    System.out.println("\nPLEASE PROVIDE AGENT USERNAME AND COMMISSION\n");
                    System.out.println("Agent username: ");
                    String agentUsername = input.next();
                    System.out.println("Commission: ");
                    double commission = input.nextDouble();
                    for (User User : Users) {
                        if (User.getUsername().equals(agentUsername)) {
                            ((Agent) User).setCommission(commission);
                            System.out.println("Commission updated successfully!");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nSYSTEM LOGS:\n");
                    System.out.println("Flights:\n");
                    for (int i = 0; i < Flight.Flights.size(); i++) {
                        Flight flight = Flight.Flights.get(i);
                        flight.DisplayFlightDetails();
                        System.out.println("------------------------");
                    }
                    System.out.println("\n######################################################\n");
                    System.out.println("Users:\n");
                    for (User user : Users) {
                        user.DisplayProfile();
                        System.out.println("------------------------");
                    }
                    break;
                case 7:
                    System.out.println("USER LOGED OUT\n");
                    choice = -1;
                    break;
                default:
                    throw new AssertionError();
            }
        } while(choice!=-1);
    }




    // Agent Menu
    public void AgentMenu(){
        int choice = 1;
        do {
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Create Flight");
            System.out.println("4. Manage/Edit Flights");
            System.out.println("5. Create Booking");
            System.out.println("6. Generate Reports");
            System.out.println("7. Remove Bookings");
            System.out.println("8. Logout");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                System.out.println("\nUSER DETAILS\n");
                    user.DisplayProfile();
                    break;
                case 2:
                System.out.println("\nPLEASE PROVIDE YOUR NEW DETAILS\n");
                System.out.println("New username: ");
                String Username = input.next();
                System.out.println("New password: ");
                String Password = input.next();
                System.out.println("New name: ");
                input.nextLine();
                String Name = input.nextLine();
                System.out.println("New email: ");
                String Email = input.next();
                System.out.println("New phone: ");
                long Phone = input.nextLong();
                user.UpdateProfile(Username,Password,Name,Email,Phone);
                    break;
                case 3:
                    System.out.println("\nPLEASE PROVIDE FLIGHT DETAILS\n");
                    System.out.println("Flight number: ");
                    long flightmuber = input.nextLong();
                    System.out.println("Airline: ");
                    String airline = input.next();
                    System.out.println("Origin: ");
                    String origin = input.next();
                    System.out.println("Destination: ");
                    String destination = input.next();
                    System.out.println("Departure time: ");
                    String departureTime = input.next();
                    System.out.println("Arrival time: ");
                    String arrivalTime = input.next();
                    System.out.println("Available seats: ");
                    int availableSeats = input.nextInt();
                    System.out.println("Price: ");
                    double prices = input.nextDouble();
                    System.out.println("Flight created successfully");
                    Flight.Flights.add(new Flight(flightmuber, airline, origin, destination, departureTime, arrivalTime, availableSeats, prices));
                    ((Agent) user).getAssignedFlights().add(new Flight(flightmuber, airline, origin, destination, departureTime, arrivalTime, availableSeats, prices));
                    break;
                case 4:
                    System.out.println("\nPLEASE PROVIDE FLIGHT NUMBER TO EDIT IT'S DETAILS\n");
                    System.out.println("Flight number: ");
                    long flightnumber = input.nextLong();
                    for (Flight flight : Flight.Flights) {
                        if (flight.getFlightNumber() == flightnumber) {
                            System.out.println("Flight found!");
                            System.out.println("Flight details:");
                            flight.DisplayFlightDetails();
                            System.out.println("\nPLEASE PROVIDE NEW FLIGHT DETAILS\n");
                            System.out.println("New airline: ");
                            airline = input.next();
                            System.out.println("New origin: ");
                            origin = input.next();
                            System.out.println("New destination: ");
                            destination = input.next();
                            System.out.println("New departure time: ");
                            departureTime = input.next();
                            System.out.println("New arrival time: ");
                            arrivalTime = input.next();
                            System.out.println("New price: ");
                            prices = input.nextDouble();
                            flight.UpdateFlightDetails(flightnumber, airline, origin, destination, departureTime, arrivalTime, prices);
                            break;
                        }
                    }


                case 5:
                    System.out.println("PLEASE PROVIDE FLIGHT NUMBER AND USER ID\n");
                    System.out.println("Flight number: ");
                    flightnumber = input.nextLong();
                    System.out.println("User ID: ");
                    long userID = input.nextLong();
                    for (Flight flight : Flight.Flights) {
                        if (flight.getFlightNumber() == flightnumber) {
                            System.out.println("Flight found!");
                            System.out.println("Flight details:");
                            flight.DisplayFlightDetails();
                            for (User user : Users) {
                                if (user.getUserID() == userID) {
                                    System.out.println("User found!");
                                    System.out.println("Booking flight...");
                                    user.BookFlight(flight);
                                    System.out.println("Flight booked successfully!");
                                    System.out.println("We will send you a confirmation email to "+user.getEmail());
                                    System.out.println("We will charge you "+flight.getPrice()+"$ for this flight");
                                    break;
                                }
                            }
                            break;
                        }
                    }
                case 6:
                    System.out.println("Your Commissions: ");
                    ((Agent) user).CalculateCommissionEachFlight();
                    System.out.println("Total Salary: " + ((Agent) user).getSalary());
                    System.out.println("Your Flights Details: ");
                    ((Agent) user).DisplayFlightsDetails();
                    break;
                case 7:
                    System.out.println("\nPLEASE PROVIDE FLIGHT NUMBER AND USER ID\n");
                    System.out.println("Flight number: ");
                    flightnumber = input.nextLong();
                    System.out.println("User ID: ");
                    userID = input.nextLong();
                    for (Flight flight : Flight.Flights) {
                        if (flight.getFlightNumber() == flightnumber) {
                            System.out.println("Flight found!");
                            System.out.println("Cancelling flight...");
                            for (User user : Users) {
                                if (user.getUserID() == userID) {
                                    user.CancelFlight(flight);
                                    System.out.println("Flight cancelled successfully!");
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 8:
                System.out.println("USER LOGED OUT\n");
                choice = -1;
                    break;
                default:
                    throw new AssertionError();
            }
        } while(choice!=-1);
    }
}
