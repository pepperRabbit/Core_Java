package pepperabbit.ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many do you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest you can draw?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i;
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            int r = (int) (Math.random() * n);
            res[i] = numbers[r];
        }
        Arrays.sort(res);
        System.out.println("your result:");
        for (int num : res)
            System.out.print(num + " ");
    }
}
