package pepperabbit.ArrayDemo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i;
        for (int num : a)
            System.out.print(num + " ");
        System.out.print("\n");

        int[] myNumber = a;   // 两个变量引用同一个数组
        myNumber[5] = -1;
        /* 数组拷贝 */
        int[] copiedNum = Arrays.copyOf(myNumber, 2 * myNumber.length);
        copiedNum[5] = 100;
        Arrays.sort(copiedNum);
        for (int num : a)
            System.out.print(num + " ");
        System.out.print("\n");
        for (int num : copiedNum)
            System.out.print(num + " ");
        System.out.print("\n");
    }
}
