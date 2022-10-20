public class VariableArguments {

    /*
     * Variable Arguments helps us to work with variable size of arguments in methods
     * It takes all the arguments and put it inside a array pass it
     * we write it as data_type...variable
     */

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
