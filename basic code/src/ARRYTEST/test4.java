package ARRYTEST;

import java.util.Random;

public class test4 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;
            int count = 0;

            for (int j = 0; j < i; j++) {
                if (num == arr[j]) {
                    count++;
                    break;
                }
            }


            if (count == 0) {
                arr[i] = num;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
