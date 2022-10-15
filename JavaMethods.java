public class JavaMethods {

    static int div(int num1, int num2) {
        int result;
        result = num1 / num2;
        return result;
    }

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
        int result = div(30, 6);
        System.out.println(result);
    }
}