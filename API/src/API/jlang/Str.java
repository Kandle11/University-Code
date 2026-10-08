package API.jlang;

//String dont need to java.lang
public class Str {
    public static void main(String[] args) {
        //字符串内容不可更改
        String n = "老牧师";
        String plane = "飞机";
        System.out.println(n + plane);


        String s1 = new String();
        System.out.println("--" + s1 + "@@");

        String s2 = new String(plane);
        System.out.println(s2);

        //字符数组

        char[] chs = {'a','b','c','d','e',};
        System.out.println(chs);
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + ", ");
        }
        System.out.println();
        System.out.println("--------------------");
        byte[] by = {97,98,99,100,101};
        String s4 = new String(by);
        System.out.println(s4);
    }
}
