public class DeleteNum {
    public static void main(String[] args) {
        //算法：双指针
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};

        int val = 2;

        int slow = 0;
        int fast = 0;

        while (fast < arr.length) {
            if (arr[fast] == val) {
                fast++;
            } else {
                arr[slow++] = arr[fast++];
            }
        }

        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("剩余" + slow + "个元素");
    }


}
