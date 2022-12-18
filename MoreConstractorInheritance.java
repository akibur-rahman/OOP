
class Base {

    Base() {
        System.out.println("Base Class Constractor");
    }

    // 4. This constractor will execute first because it is the first.
    Base(int a) {
        System.out.println("Base Class Overloaded constractor with " + a);
    }
}

class Child extends Base {

    Child() {
        System.out.println("Child Class Constractor");
    }

    Child(int a, int b) {
        super(a); // 3.this will call the Base class constractor with 1 argument
        System.out.println("Child class Overloaded constracotr with " + b); // 5. Then This will execute
    }
}

class DerivedChild extends Child {
    DerivedChild() {
        System.out.println("Derived Child Constractor");
    }

    DerivedChild(int a, int b, int c) {
        super(a, b); // 2. this will call the Child class constractor with 2 arguments
        System.out.println("Derived calass overloaded constractor with " + c); // 6. Then this will execute
    }
}

class MoreConstractorInheritance {
    public static void main(String[] args) {
        DerivedChild obj = new DerivedChild(10, 20, 30); // 1. this will call the DerivedChild class
        // constractor with 2 arguments
    }
}

/*
 * Output:
 * Base Class Overloaded constractor
 * Child class Overloaded constracotr
 * Derived calass overloaded constractor
 */