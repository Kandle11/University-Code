import java.util.Scanner;

public class Test2 {
    //字符串的反转
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input a String:");
            String str = sc.next();

            //equals-->将前面的字符串与后面括号中的字符串进行比较是否一致
            if (str.equals("拜拜")) {
                //程序停止运行
                System.out.println("0");
            } else {
                //反转
//            for ( int length = str.length() - 1; length >= 0; length-- ){
//                char s = str.charAt(length);
//                System.out.print(s);
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                String s = sb.toString();
                System.out.println(s);
            }
        }

    }
}
