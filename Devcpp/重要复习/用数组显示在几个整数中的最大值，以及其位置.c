#include <stdio.h>
 int main() {
     int n;
     // 输入n
     printf("Input n: ");
     scanf("%d", &n);
     
     int arr[10]; // 定义数组存储n个整数
     // 输入n个整数
     printf("Input %d integers: ", n);
     for (int i = 0; i < n; i++) {
         scanf("%d", &arr[i]);
     }
     
     // 找最大值及其下标（IMPORTANT！！！） 
     int max = arr[0];
     int index = 0;
     for (int i = 1; i < n; i++) {
         if (arr[i] > max) {
             max = arr[i];
             index = i;
         }
     }
     
     // 输出结果（格式：等号无空格，逗号后有一个空格）
     printf("max=%d, index=%d\n", max, index);
     
     return 0;
 }
