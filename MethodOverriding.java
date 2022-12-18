
class Base3 {
    void print() {
        System.out.println("Print method of base class");
    }
}

class Derived3 extends Base3 {
    @Override
    void print() {
        System.out.println("Print Method of Derived Class"); // overriding method of base class
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Derived3 obj = new Derived3();
        obj.print();
    }
}
