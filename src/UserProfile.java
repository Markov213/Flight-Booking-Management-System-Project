import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserProfile {
    private User user;
    List<User> Users;
    Scanner input = new Scanner(System.in);
    public UserProfile(User user, List<User> Users) {
        this.Users = Users;
        this.user = user;
    }
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
    public void AdminMenu(){
        int choice = 1;
        do {
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Activate User");
            System.out.println("4. Manage System Settings");
            System.out.println("5. View System Logs");
            System.out.println("6. Manage User Access");
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
                System.out.println("\nPLEASE PROVIDE USERNAME AND USER ID TO ACTIVATE\n");
                System.out.println("User ID: ");
                long UserID = input.nextLong();
                System.out.println("Username: ");
                String Username1 = input.next();
                boolean flag = false;
                for (User User : Users) {
                    if (User.getUserID() == UserID && User.getUsername().equals(Username1)) {
                        User.setActivated(true);
                        System.out.println("User activated successfully!");
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println("Invalid username or user ID. Please try again.");
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
    public void AgentMenu(){
        int choice = 1;
        do {
            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Create Flight");
            System.out.println("4. Manage Flights");
            System.out.println("5. View Flight Schedule");
            System.out.println("6. Manage Bookings");
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
}
