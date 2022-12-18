
class Base2 {

    int a, b;

    Base2(int a) {
        System.out.println("Base Class Overloaded constractor");
    }
}

class Derived2 extends Base2 {

    Derived2(int a, int b) {
        super(a);
        System.out.println("Derived Class Overloaded constractor");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Derived2 obj = new Derived2(10, 20);
    }
}
