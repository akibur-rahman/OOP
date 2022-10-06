import java.security.DrbgParameters.NextBytes;
import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter age:");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("you can drive.");
        } else {
            System.out.println("you can't drive");
        }
    }
}