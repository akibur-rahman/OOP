import java.util.Random;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter Elements:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }

        System.out.print("Array Length is:");
        System.out.println(marks.length);
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        for (String element : str) {
            System.out.println(element);
        }
    }
}
