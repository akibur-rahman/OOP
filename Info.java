
//creat an exception class named OutofClassException extended form class Exception. This calss should contain a constractor
//that takes the the user's age(ex 40) as parameter. Will print the following message: "You are older than the requested age(25 years), you are 40"
//create a main class called Info to promt the user to enter his age. The user application for job if his age is more than 30 years old.
//if the user enters acceptable age, display the message"Your application is accepted and under study".

import java.util.Scanner;

class OutofClassException extends Exception {
    public OutofClassException(int age) {
        System.out.println("You are older than the requested age(25 years), you are " + age);
    }
}

public class Info {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        try {
            if (age > 30) {
                throw new OutofClassException(age);
            } else {
                System.out.println("Your application is accepted and under study");
            }
        } catch (OutofClassException e) {
            System.out.println(e);
        }
    }
}
