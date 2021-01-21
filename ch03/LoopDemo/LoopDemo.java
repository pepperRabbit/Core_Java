package pepperabbit.LoopDemo;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--)
            System.out.println("Counting down... " + i);
        System.out.println("Blast off");

        Scanner in = new Scanner(System.in);
        int n;
        read_data:
        while (true) {
            System.out.println("enter a number >= 0：");
            n = in.nextInt();
            if (n < 0) break read_data; /* or continue */
            /* ... */
        }
        if (n < 0) System.out.println("bad situation");
    }
}
