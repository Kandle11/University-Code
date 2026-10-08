import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        System.out.println(num);


        while( true ){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int guessNum = sc.nextInt();

        if(guessNum > num){
            System.out.println("猜大了");
        }else if(guessNum < num){
            System.out.println("猜小了");
        }else{
            System.out.println("恭喜你猜对了");
            break;
        }
        }
    }
}