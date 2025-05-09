import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AirPort {
    public static void main(String[] args) throws Exception {
        List<User> Users = new ArrayList<>();
        Users.add(new Admin("admin", "admin", "admin", null, 0,"SuperAdmin"));
        Users.get(0).setActivated(true);
        List<Flight> Flights = new ArrayList<>();
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
                    if (Users.isEmpty()) {
                        System.out.println("No Users registered. Please register first.");
                        break;
                    }
                    for(User User : Users) {
                        if (User.getUsername().equals(username) && User.getPassword().equals(password)) {
                            System.out.println("Login successful! Welcome " + User.getName() + ".");
                            UserProfile userProfile = new UserProfile(User,Users);
                            if (User.isActivated()){
                                if (User.getAccountType().equals("Admin")) {
                                    userProfile.AdminMenu();
                                } else if (User.getAccountType().equals("Agent")) {
                                    userProfile.AgentMenu();
                                } else if (User.getAccountType().equals("Customer")) {
                                    userProfile.CustomerMenu();
                                }
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
                    input.nextLine();
                    String name = input.next();
                    System.out.println("Enter your email: ");
                    input.nextLine();
                    String email = input.next();
                    System.out.println("Enter your phone number: ");
                    long phone = input.nextLong();
                    System.out.println("Enter your username: ");
                    username = input.next();
                    for (User User : Users) {
                        if (User.getUsername().equals(username)) {
                            System.out.println("Username already exists. Please choose a different username.");
                            username = input.next();
                        }
                    }
                    System.out.println("Enter your password: ");
                    password = input.next();
                    System.out.println("\nCHOOSE YOUR ACCOUNT TYPE \n1. Customer \n2. Agent");
                    System.out.println("Enter your account Type:");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter your address: ");
                            input.nextLine();
                            String address = input.next();
                            System.out.println("Enter your preferences: ");
                            input.nextLine();
                            String preferences = input.next();
                            Users.add(new Customer(username, password, name, email, phone, address, preferences));
                            break;
                        case 2:
                            System.out.println("Enter your department: ");
                            String department = input.next();
                            Users.add(new Agent(username, password, name, email, phone, department, 0.0));
                            break;
                        default:
                            throw new AssertionError();
                    }
                    System.out.println("User registered successfully!");
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