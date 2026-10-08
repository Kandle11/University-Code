package Manager;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner sc = new Scanner(System.in);

    //读取安全的整数
    public static int nextInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } else {
                System.out.println("请输入有效的整数！");
                sc.nextLine();
            }
        }
    }

    //读取安全的小数
    public static double nextDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } else {
                System.out.println("请输入有效数字！");
                sc.nextLine();
            }
        }
    }


    //读取安全的字符串
    public static String nextString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("输入不能为空！请重新输入！");
        }
    }
}
