public class Test5_2__double {
    public static void main(String[] args) {
        //双指针


        String str1 = "12395";
        String str2 = "133789456";

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = str1.length() - 1;
        int j = str2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int a = i >= 0 ? str1.charAt(i) - '0' : 0;
            int b = j >= 0 ? str2.charAt(j) - '0' : 0;
            int temp = a + b + carry;
            sb.append(temp % 10);
            carry = temp / 10;
            i--;
            j--;
        }

        System.out.println(sb.reverse());
    }
}
