package StaticOut;

public class Test {
    public static void main(String[] args) {
        /*
        数据脱敏

        1.String substring(int beginIndex,int endIndex)截取-->包头不包尾
        2.String substring(int beginIndex)-->截取到末尾

         */

//        String str = "eabsdA";
//        String res = str.substring(1,5);
//        System.out.println(res);
//
//        System.out.println(str.substring(0));
//



        /*
        只保留一个字符
        1.charAt（0）；
        2.substring(0,1);
         */

        String username = "zhangsan";
        String firstname = username.substring(0,1);

        String last = firstname + "***";
        System.out.println(last);
    }
}
