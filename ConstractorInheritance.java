
class Base {
    Base() {
        System.out.println("Base class constructor");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor");
    }
}

class MoreDerived extends Derived {
    MoreDerived() {
        System.out.println("MoreDerived class constructor");
    }
}

public class ConstractorInheritance {
    public static void main(String[] args) {
        MoreDerived obj = new MoreDerived();
    }
}

/*
 * "Output: Base class constructor
 * Derived class constructor
 * MoreDerived class constructor"
 * 
 * The constructor of the base class is called first, then the constructor of
 * the Derived class is called, and then the constructor of the MoreDerived
 * class is called.
 */