
class Base {

    int a, b;

    Base(int a) {
        System.out.println("Base Class Overloaded constractor");
    }
}

class Derived extends Base {

    Derived(int a, int b) {
        super(a);
        System.out.println("Derived Class Overloaded constractor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Derived obj = new Derived(10, 20);
    }
}
