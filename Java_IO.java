import java.util.*;

public class Java_IO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String str = scanner.next(); //next method will only read one word and break
        // before space. To read whole line, we need to use nextLine() method
        // int number = scanner.nextInt();
        // System.out.println("myString is: " + str);
        // System.out.println("myInt is: " + number);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}