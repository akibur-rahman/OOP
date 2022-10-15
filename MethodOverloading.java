/*
 * Method obverloading is a process by which we can declear methods with same name(but not with same parameters ).
 * We can call the methods with parameter and the right method will be called according to the parameter.
 */

import java.util.*;

public class MethodOverloading {

    static void wish() {
        System.out.println("Happy Birthday!");
    }

    static void wish(String name) {
        System.out.println("Happy Birthday " + name);
    }

    public static void main(String[] args) {
        wish();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        wish(name);
    }
}
