import java.util.Random;

public class Test4 {
    //打乱字符串
    public static void main(String[] args) {
        Random r = new Random();
        String str = "English";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int RandomChar = r.nextInt(arr.length);
            char temp;
            temp = arr[i];
            arr[i] = arr[RandomChar];
            arr[RandomChar] = temp;
        }
        // String 类提供了接收 char[] 的构造方法：public String(char[] value),它会把数组中的所有字符按顺序拼接成一个新的 String 对象
        String str1 = new String(arr);
//        StringBuilder sb = new StringBuilder("[");
//        for (int i = 0; i < arr.length; i++) {
//            if(i == arr.length - 1 ){
//                sb.append(arr[i]).append("]");
//            }else{
//                sb.append(arr[i]).append(", ");
//            }
//        }
        System.out.println(str1);
    }
}
