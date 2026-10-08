import java.sql.SQLOutput;

public class Test5 {
    /*
    定义两个字符串，记录为非负整数，求他们的和；
    输入：“12395”和“123”，输出：“12528“
    注意：需要数据过大，超出int范围
     */
    public static void main(String[] args) {
        String str1 = "12395";
        String str2 = "133";

        int len = str1.length() >= str2.length() ? str1.length() : str2.length();
        int[] arr1 = copyData(str1, len);
        int[] arr2 = copyData(str2, len);

        int[] sum = new int[len + 1];

        int num = 0;

        /*
        核心：遍历数组，从个位（最大索引）位置开始计算
        arr[i] + arr2[2] + 进位 = result
        结果的个位 --- 存到sum数组当中
        结果的十位数 --- 进位sum
         */
        for (int i = arr1.length - 1; i >= 0; i--) {
            int temp = arr1[i] + arr2[i] + num;
            sum[i + 1] = temp % 10;
            num = temp / 10;

        }

        //考虑最终结果的首位 9999+9999
        sum[0] = num;
        System.out.println(ArrayUtil.arrayToString(arr1));
        System.out.println(ArrayUtil.arrayToString(arr2));

        StringBuilder sb = new StringBuilder();

        if (sum[0] != 0) {
            sb.append(sum[0]);
        }

        for (int i = 1; i < sum.length; i++) {
            sb.append(sum[i]);
        }
        System.out.println(sb);
    }


    public static int[] copyData(String str, int len) {
        int[] arr = new int[len];
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int num = c - 48;
            arr[i + len - str.length()] = num;
        }
        return arr;
    }
//    public static String add(String str1, String str2) {
//        StringBuilder sb = new StringBuilder();
//        int i = str1.length() - 1;
//        int j = str2.length() - 1;
//        int carry = 0;
//
//        while (i >= 0 || j >= 0 || carry > 0) {
//            int a = i >= 0 ? str1.charAt(i) - '0' : 0;
//            int b = j >= 0 ? str2.charAt(j) - '0' : 0;
//            int sum = a + b + carry;
//            sb.append(sum % 10);
//            carry = sum / 10;
//            i--;
//            j--;
//        }
//        return sb.reverse().toString();
//    }

}
