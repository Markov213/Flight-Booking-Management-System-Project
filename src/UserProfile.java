public class UserProfile {
    private User user;
    public UserProfile(User user) {
        this.user = user;
    }
    public void CustomerMenu(){
        System.out.println("1. View Profile");
        System.out.println("2. Update Profile");
        System.out.println("3. Search Flights");
        System.out.println("4. Book Flight");
        System.out.println("5. Cancel Flight");
        System.out.println("6. View Booking History");
        System.out.println(". Logout");
    }
    public void AdminMenu(){
        System.out.println("1. View Profile");
        System.out.println("2. Update Profile");
        System.out.println("3. Create User");
        System.out.println("4. Manage System Settings");
        System.out.println("5. View System Logs");
        System.out.println("6. Manage User Access");
        System.out.println(". Logout");
    }
    public void AgentMenu(){
        System.out.println("1. View Profile");
        System.out.println("2. Update Profile");
        System.out.println("3. Create Flight");
        System.out.println("4. Manage Flights");
        System.out.println("5. View Flight Schedule");
        System.out.println("6. Manage Bookings");
        System.out.println(". Logout");
    }
}
