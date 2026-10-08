import java.lang.reflect.Array;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        String s = ArrayUtil.arrayToString(arr);

        System.out.println(s);


    }
}


class ArrayUtil {
    private ArrayUtil() {
    }


    public static String arrayToString(int[] arr) {
        //1.创建StringBuilder容器对象，并创建左括号
        StringBuilder sb = new StringBuilder("[");
        //
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                //String里的append方法，意为增添东西
                sb.append(arr[i]);
                sb.append("]");
//                str = str + arr[i] + "]";
            } else {
                sb.append(arr[i]);
                sb.append(", ");
            }

        }
        return sb.toString();
    }

}
