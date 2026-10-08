package foriString;

import java.util.Scanner;

public class SpliceString {
    public static void main(String[] args) {
        /*
        键盘录入字符串，统计字符串中的大写字母，小写字母，数字字符出现的次数
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        //1.遍历
        //计数器
        int uppercount = 0;
        int lowercount = 0;
        int numcount = 0;

        for (int i = 0; i < str.length(); i++) {
            //每一个遍历到的字符
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {
                //小写
                lowercount++;
            } else if (c >= 'A' && c <= 'Z') {
                //大写
                uppercount++;
            } else if (c >= '0' && c <= '9') {
                //数字
                numcount++;
            }else{
                System.out.println("Not in the counting line");
            }

        }
        System.out.println("Low:" + lowercount);
        System.out.println("Upper:" + uppercount);
        System.out.println("Num:" + numcount);


    }
}
