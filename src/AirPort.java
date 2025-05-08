import java.util.LinkedList;
import java.util.Scanner;
public class AirPort {
    public static void main(String[] args) throws Exception {
        LinkedList<Customer> Customers = new LinkedList<Customer>();
        LinkedList<Flight> Flights = new LinkedList<Flight>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Airport Management System");
        do { 
            System.out.println("1.login\n2.register\n3.exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your username: ");
                    String username = input.next();
                    System.out.println("Enter your password: ");
                    String password = input.next();
                    if (Customers.isEmpty()) {
                        System.out.println("No customers registered. Please register first.");
                        break;
                    }
                    for(Customer customer : Customers) {
                        if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                            System.out.println("Login successful! Welcome " + customer.getName() + ".");
                            UserProfile userProfile = new UserProfile(customer);
                            userProfile.CustomerMenu();
                            break;
                        } else {
                            System.out.println("Invalid username or password. Please try again.");
                        }
                    }

                    
                    
                    break;
                case 2:
                    System.out.println("Enter your name: ");
                    String name = input.next();
                    System.out.println("Enter your email: ");
                    String email = input.next();
                    System.out.println("Enter your phone number: ");
                    long phone = input.nextLong();
                    System.out.println("Enter your username: ");
                    username = input.next();
                    for (Customer customer : Customers) {
                        if (customer.getUsername().equals(username)) {
                            System.out.println("Username already exists. Please choose a different username.");
                            username = input.next();
                        }
                    }
                    System.out.println("Enter your password: ");
                    password = input.next();
                    System.out.println("Enter your user ID: ");
                    long userID = input.nextLong();
                    Customers.add(new Customer(userID, username, password, name, email, phone));
                    System.out.println("Customer registered successfully!");
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    input.close();
                    return;
                default:
                    throw new AssertionError("Unexpected value: " + choice);
            }
            
        } while (true);
    }
}