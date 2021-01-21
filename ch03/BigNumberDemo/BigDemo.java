package pepperabbit.BigNumberDemo;

import java.math.BigInteger;
import java.util.Scanner;

public class BigDemo {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for (int i = 1; i <= n; i++)
            factorial = factorial.multiply(BigInteger.valueOf(n));
        System.out.println(factorial);
    }
}
