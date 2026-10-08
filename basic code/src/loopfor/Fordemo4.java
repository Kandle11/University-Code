package loopfor;

import java.util.Scanner;

public class Fordemo4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();

        for( int i = 3; i <= 10; i++ ){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
