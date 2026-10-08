package ConstructUser;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        boolean equals (要比较的字符串）   结果完全一样才是true，否则为false
        boolean equalsIgnoreCase          忽略大小的比较
         */

        /*

        String username = "zhangsan";
        String rightUsername = "zhangsan";
        boolean a = username.equalsIgnoreCase(rightUsername);
        System.out.println(a);

         */

        //1.已知的正确的用户名和密码
        Scanner sc = new Scanner(System.in);


        String rightUsername;
        String rightpassword;

        while (true) {
            System.out.println("===== 用户注册 =====");
            System.out.println("请设置用户名（至少5位，只能是英文）：");
            String newUsername = sc.next();

            System.out.println("请设置密码（至少5位，只能是数字）：");
            String newPassword = sc.next();

            System.out.println("请再次确认密码：");
            String confirmPassword = sc.next();

            if (!(newUsername.length() >= 5 && newUsername.matches("[a-zA-Z]+"))) {
                System.out.println("用户名格式错误，请重新注册！");
                continue;
            }

            if (!(newPassword.length() >= 5 && newPassword.matches("[0-9]+"))) {
                System.out.println("密码格式错误，请重新注册！");
                continue;
            }

            if (!newPassword.equals(confirmPassword)) {
                System.out.println("两次密码不一致，请重新注册！");
                continue;
            }

            rightUsername = newUsername;
            rightpassword = newPassword;
            System.out.println("注册成功！");
            System.out.println("====================");
            break;
        }
//        System.out.println("Please scanner your username:");
//        String username = sc.next();

//        boolean com = username.equals(rightUsername);
//        System.out.println(com);

//        System.out.println("Please scanner your password:");
//        String password = sc.next();
//
//        boolean com1 = password.equals(rightpassword);
//        System.out.println(com1);

        //3.比较
        final int times = 3;
        for (int i = 0; i <= times; i++) {

            String username;
            String password;

            while (true) {
                System.out.println("请输入用户名（至少5位，只能是英文）：");
                username = sc.next();
                System.out.println("请输入密码（至少5位，只能是数字）：");
                password = sc.next();
                if (username.length() >= 5 && username.matches("[a-zA-Z]+") && password.length() >= 5 && password.matches("[0-9]+")) {
                    break;
                } else {
                    System.out.println("用户名或密码的格式错误，请重新输入！");
                }
            }

            boolean com = username.equals(rightUsername);
            boolean com1 = password.equals(rightpassword);

            if (i == times) {
                System.out.println("您的输入次数已经超过三次，请稍后在进行输入账户密码");
                break;
            }

            if (com && com1) {
                System.out.println("恭喜您，登录成功");
                break;
            } else {
                System.out.println("用户或密码输入错误");
                System.out.println("______________________");
            }

        }


    }
}
