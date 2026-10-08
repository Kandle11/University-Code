package toolclasstest1;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        String res = ArrayUitl.printArr(arr);
        System.out.println(res);


        int[] arr2 = {1,23,4,5,1};
        double ave = ArrayUitl.getAverage(arr2);
        System.out.println(ave);
    }
}
