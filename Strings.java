import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Akibur Rahman";
        // System.out.println("My name is " + name);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = scanner.nextLine();
        // System.out.println("My Name is " + name);

        // String Methods

        System.out.println(name.length()); // returns the length of the string
        System.out.println(name.toLowerCase()); // converts all alphabetes into lower case
        System.out.println(name.toUpperCase()); // converts all alphabetes into upper case
        System.out.println(name.trim()); // trim() method removes all the uncecessary spaces from the starting and
                                         // ending of the sting
        System.out.println(name.substring(2)); // trim the string from Nth index to end
        System.out.println(name.substring(1, 3)); // trims the string form substring(i,j) i+1 to j
        System.out.println(name.replace('k', 'l')); // replaces a character with another
        System.out.println(name.replace("kib", "nib")); // replaces a part of string with a new substring
        System.out.println(name.startsWith("Har")); // Returns true if the name starts with the string “Ak”. (True in
                                                    // this case)
        System.out.println(name.endsWith("ib")); // Returns true if the name starts with the string “ib”. (True in this
                                                 // case)
        System.out.println(name.charAt(2)); // Returns the character at a given index position. (i in this case)
        String modifiedName = "Akibkib";
        System.out.println(modifiedName.indexOf("kib")); // Returns the index of the first occurrence of the specified
                                                         // character in the given string.
        System.out.println(modifiedName.indexOf("kib", 4)); // Returns the last index of the specified character from
                                                            // the given string. (3 in this case)
        System.out.println(modifiedName.lastIndexOf("rry", 7));
        System.out.println(name.equals("Akib")); // Returns true if the given string is equal to “Akib” false
                                                 // otherwise [Case sensitive]
        System.out.println(name.equalsIgnoreCase("aKiB")); // Returns true if two strings are equal, ignoring the case
                                                           // of characters.
        System.out.println("I am escape sequence\tdouble quote");
    }
}
