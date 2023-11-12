package cleancode;

public class Main {
    public static void main(String[] args) {
        kelasPengguna user = new kelasPengguna("Kurniawan", "753");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        user.setUsername("Randy");
        user.setPassword("357");

        System.out.println("\nUpdated User Information:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        user.storeUserInformation(user.getUsername(), user.getPassword());
    }
}