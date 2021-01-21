package pepperabbit.StringDemo;

import java.util.Date;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        /*
         * 与C不同，Java的String类是常量，创建后不可更改
         * 注意：char在Java中占两个字节
         */
        String greeting = "Hello Java World";
        String sub_string = greeting.substring(0, 3);
        System.out.println(sub_string);
        String add_string = greeting + sub_string;
        System.out.println(add_string);

        /* 把多个字符串放在一起，用一个界定符分割 */
        String all = String.join(" / ", "XS", "S", "M", "L", "XL");
        System.out.println(all);

        /* 检测字符串是否相等，千万不要用== */
        System.out.println(greeting.equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        System.out.println(greeting.compareTo(sub_string));
        String empty = null;
        if (empty == null) System.out.println("null");
        else System.out.println(empty.length());

        /* 构建字符串 */
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append(greeting);
        builder.append(1);
        String completed = builder.toString();
        System.out.println(completed);

        /* 输入 */
        Scanner in = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = in.nextLine();    // in.next() 读取一个单词
        System.out.println("how old are you?");
        int age = in.nextInt();
        System.out.println("hello, " + name + ". Next year, you'll be " + (age + 1));

        System.out.printf("%tc", new Date());
    }
}
