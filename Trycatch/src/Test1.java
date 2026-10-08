public class Test1 {
    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt("88a9989");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(num);
    }


//    public static int parseInt(String s){
//
//    }
}
