import java.util.Random;


public class Test7_2 {
    public static void main(String[] args) {
        Random r = new Random();

        //1.生成十一位随机手机号
        StringBuilder phoneNum = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            phoneNum.append(r.nextInt(10));
        }
        System.out.println("随机手机号: " + phoneNum);

        //2.生成随机邮箱（3位字母 + 8位数字 + @163.com）
        char[] letters = new char[52];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('a' + i);
            letters[i + 26] = (char) ('A' + i);
        }

        StringBuilder email = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            email.append(letters[r.nextInt(letters.length)]);
        }
        for (int i = 0; i < 8; i++) {
            email.append(r.nextInt(10));
        }
        email.append("@163.com");
        System.out.println("随机邮箱: " + email);




        //3.手机号脱敏（第4~7位替换为*）
        char[] phoneChars = phoneNum.toString().toCharArray();
        for (int i = 3; i < Math.min(7, phoneChars.length); i++) {
            phoneChars[i] = '*';
        }
        System.out.println("脱敏手机号: " + new String(phoneChars));





        //4.邮箱脱敏（@前面的第2位起替换为*）
        char[] emailChars = email.toString().toCharArray();
        int atIndex = email.indexOf("@");
        for (int i = 1; i < Math.min(atIndex, emailChars.length); i++) {
            emailChars[i] = '*';
        }
        System.out.println("脱敏邮箱: " + new String(emailChars));
    }
}
