public class Test2 {
    public static void main(String[] args) {
        int m = 7;
        String binaryString = Integer.toBinaryString(m);
        System.out.println(binaryString);
        m = -8;
        binaryString = Integer.toBinaryString(m);
        System.out.println(binaryString);
        double sum = 0,item = 0;
        boolean computable = ture;
        for(String s : args){
            try {
                item = Double.parseDouble(s);
                sum = sum + item;
            }catch (NumberFormatException e){
                System.out.println("您输入了非数字字符:" + e);
                computable = false;
            }

        }
    }
}
