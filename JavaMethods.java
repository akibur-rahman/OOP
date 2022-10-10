public class JavaMethods {

    static int mul(int a, int b) {
        return a * b;
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sum(4, 7);
        int c = mul(3, 5);
        System.out.println(c);
    }
}