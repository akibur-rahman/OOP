import java.util.*;

interface CustomizedInterface {
    int factorSum(int n);
}

class MyFactor implements CustomizedInterface {
    public int factorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class Assignment {
    public static void main(String[] args) {
        int num, sum;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        MyFactor obj = new MyFactor();
        sum = obj.factorSum(num);
        System.out.println(sum);
    }
}