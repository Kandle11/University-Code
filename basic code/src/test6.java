public class test6 {

    /*去除重复元素（双指针，力扣算法）
    慢指针---存入的位置
    快指针---找不重复的数据

    若相等---舍弃快指针位置的数据
    若不相等---快指针的数据存入慢指针位置
     */
    public static void main(String[] args) {


        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3};
        int slow = 0;
        int fast = 1;

        while (fast < arr.length) {
            if (arr[slow] != arr[fast]) {

                arr[++slow] = arr[fast];

            }
            fast++;
        }

        for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
