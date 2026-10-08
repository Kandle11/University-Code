package StaticOut;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
//        String str = "你玩的好菜啊，TMD";
//        String tmd = str.replace("TMD", "***");
//        System.out.println(tmd);


        //定义一个敏感词库
        String []arr = {"TMD","SB","sb","Sb","NMD","LJ"};

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想说的话:");
        String msg = sc.next();

        for (int i = 0; i < arr.length; i++) {
            msg = msg.replace(arr[i],"***");
        }
        System.out.println(msg);
    }
}
