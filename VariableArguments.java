public class VariableArguments {

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6));
        System.out.println(sum(5, 3, 5, 6, 2, 2, 100, 6, 3, 7, 3, 6, 3, 68, 5));
    }
}
