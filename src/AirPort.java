import java.util.LinkedList;
import java.util.Scanner;
public class AirPort {
    public static void main(String[] args) throws Exception {
        LinkedList<Customer> Customers = new LinkedList<Customer>();
        Customers.add(new Customer(0,"admin","admin", null, null, 0));
        LinkedList<Flight> Flights = new LinkedList<Flight>();
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the Airport Management System\n");
        do { 
            System.out.println("1.login\n2.register\n3.exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    boolean flag = false;
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
                            if (customer.Activated == true){
                                userProfile.CustomerMenu();
                                flag = true;
                            }else{
                                System.out.println("\nWAIT TILL THE ACTIVATION\n");
                            }
                            break;
                        }
                    }
                    if(!flag){
                        System.out.println("Invalid username or password. Please try again.");
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