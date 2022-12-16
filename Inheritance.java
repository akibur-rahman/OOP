
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

public class Inheritance {
    public static void main(String[] args) {
        SmartPhone iPhone = new SmartPhone();
        iPhone.call();
        iPhone.textMessage();
        iPhone.runApps();
        iPhone.videChat();
    }
}
