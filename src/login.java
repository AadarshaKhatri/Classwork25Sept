import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        String Password = "2";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter your password:");
            String pass = sc.nextLine();
            if ( Password.equals(pass)) {
                System.out.println("Password is correct!");
                break;
            } else {
                System.out.println("Invalid password, Attempts left: "+(5-i));
            }

        }
    }
}
