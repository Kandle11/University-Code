import java.util.Random;

public class Test6_____YanZhengMa {
    /*
    验证码内容：可以是小写，可以是大写字母，也可以是数字
    验证码规则:
    长度为5
    内容是四位字母，1位数字
    其中数字只有一位，但可以出现在任何位置
     */

    public static void main(String[] args) {
        //1.生成一个随机验证码
        for (int j = 0; j < 20; j++) {
            char[] arr = new char[52];
            //小写
            for (int i = 0; i < 26; i++) {
                arr[i] = (char) ('a' + i);
            }
            //大写
            for (int i = 0; i < 26; i++) {
                arr[i + 26] = (char) ('A' + i);
            }
            //2.抽取随机索引
            Random r = new Random();
            char[] arr2 = new char[4];
            int num = r.nextInt(10);
            for (int i = 0; i < arr2.length; i++) {
                int Rchar = r.nextInt(arr.length);
                arr2[i] = arr[Rchar];
            }
            String str = new String(arr2);
            str = str + num;

            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                int Rchar = r.nextInt(array.length);
                char temp;
                temp = array[i];
                array[i] = array[Rchar];
                array[Rchar] = temp;
            }
            String str1 = new String(array);
            System.out.println(str1);
        }


    }
}
