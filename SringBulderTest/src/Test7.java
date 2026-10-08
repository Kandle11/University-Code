import java.util.Random;


public class Test7 {
    public static void main(String[] args) {

        //1.生成十一位随机数字
        Random r = new Random();
        StringBuilder phoneNum = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            phoneNum.append(r.nextInt(10));
        }

        char[] arr = new char[52];
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('a' + i);
        }
        for (int i = 0; i < 26; i++) {
            arr[i + 26] = (char) ('A' + i);
        }

        //2.生成一个随机邮箱
        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            email.append(arr[r.nextInt(arr.length)]);
        }
        for (int i = 0; i < 8; i++) {
            email.append(r.nextInt(10));
        }
        email.append("@163.com");
        System.out.println(email);
        //3.开始数字脱敏
        char[] c = phoneNum.toString().toCharArray();
        System.out.println(c);
        for (int i = 3; i < 7; i++) {
            c[i] = '*';
        }
        System.out.println(c);
        char[] b = email.toString().toCharArray();
        for (int i = 1; i < 11; i++) {
            b[i] = '*';
        }
        System.out.println(b);
    }
}
