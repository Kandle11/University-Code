package foriString;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        public char charAt(int index):根据索引返回字符
        public int length():


         */

        //1.chatAt
        String str = "HelloHello123";
        char c = str.charAt(3);
        System.out.println(c);

        int length = str.length();
        System.out.println(length);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.next();
        //s.length().fori
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            System.out.print(c1 + ", ");
        }
    }
}
