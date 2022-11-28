import java.util.Scanner;
public class User {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = input.nextLine();

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.print("Enter password: ");
        String pass = input.nextLine();

        System.out.println("Enter username: " + user);
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + pass);
    }    
}

// if you are done to use terminal pls type "clear" to all cmd is erase, matsala