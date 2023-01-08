
abstract class Test {
    abstract void greet();
}

class child extends Test {
    void greet() {
        System.out.println("Hello");
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        child obj = new child();
        obj.greet();
    }
}
