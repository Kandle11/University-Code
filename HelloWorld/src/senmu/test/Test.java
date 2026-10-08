package senmu.test;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int num = (int)(Math.random()*10000000);

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入7位数的彩票号码：");

        int inputNum = sc.nextInt();

        if(inputNum == num) {
            System.out.println("恭喜你，中奖了！");
        } else {
            System.out.println("很遗憾 你未能中将");
        }
    }
}

