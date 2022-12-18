//This java file won't compile because of the following error:
//1.Multiple classes with same name(used to explain the concept of inheritance)

//There are 3 types of inheritance in java based on class.

//1. Single inheritance

class Phone {
    void call() {
        System.out.println("Calling!");
    }

    void textMessage() {
        System.out.println("Texting!");
    }
}

class SmartPhone extends Phone {
    void runApps() {
        System.out.println("Running YouTube!");
    }

    void videChat() {
        System.out.println("Video Calling!");
    }
}

// In Single inheritance, a class can only inherit from one class.

// 2. Multilevel inheritance

class FeaturePhone extends Phone {
    void playMusic() {
        System.out.println("Playing Music!");
    }
}

class SmartPhone extends FeaturePhone {
    void runApps() {
        System.out.println("Running YouTube!");
    }

    void videChat() {
        System.out.println("Video Calling!");
    }
}

// In Multilevel inheritance, a class can inherit from another class which is
// inherited from another class.

// 3. Hierarchical inheritance

class FeaturePhone extends Phone {
    void playMusic() {
        System.out.println("Playing Music!");
    }
}

class SmartPhone extends Phone {
    void runApps() {
        System.out.println("Running YouTube!");
    }

    void videChat() {
        System.out.println("Video Calling!");
    }
}

// In Hierarchical inheritance, a class can inherit from more than one class.

public class TypesOfInheritance {
    public static void main(String[] args) {

    }
}
