import java.util.Scanner;

public class Ouput_formatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        String str;
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            str = scanner.next();
            x = scanner.nextInt();
            System.out.printf("%-15s%03d\n", str, x);
        }
        System.out.println("================================");
    }
}
