package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static String password = "abc$123";

    public static void main(String[] args) {
        App myApp = new App();
        String passInput = myApp.getPassword();

        myApp.checkPassword(passInput);
    }

    public void checkPassword(String input) {
        if (input.equals(password))
            System.out.println("Welcome!");

        else
            System.out.println("I don't know you.");
    }

    public String getPassword() {
        System.out.printf("What is the password? ");
        return in.nextLine();
    }
}
