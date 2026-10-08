import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input any String: ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print(c);
            if ((i + 1) % 8 == 0){
                System.out.println();
            }
        }

    }
}
