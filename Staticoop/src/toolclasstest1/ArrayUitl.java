package toolclasstest1;

public class ArrayUitl {
    //私有化构造方法 不让外界创建
    private ArrayUitl() {
    }


    public static String printArr(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1){
//                System.out.print(arr[i] + "]");
//            }else{
//                System.out.print(arr[i] + ", ");
//            }
//        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i] + "]";
            } else {
                result = result + arr[i] + ", ";
            }
        }

        return result;
    }

    public static double getAverage(int[] arr) {
        //求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum * 1.0 / arr.length;
    }
}
