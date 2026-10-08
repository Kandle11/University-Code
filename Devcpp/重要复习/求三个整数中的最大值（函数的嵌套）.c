#include <stdio.h>
 // 声明max函数（可选，因为函数定义在main前，也可省略）
 int max(int x, int y, int l);
 
 int main() {
     int a, b, c, d;
     // 输入三个数a、b、c
     scanf("%d %d %d", &a, &b, &c);
     // 调用max函数，接收返回的最大值
     d = max(a, b, c);
     printf("max=%d\n", d);
     return 0;
 }
 // 定义max函数：找x、y、l中的最大值
 int max(int x, int y, int l) {
     int z;
     // 先比较x和y，取较大的一个
     if (x > y) {
         z = x;
     } else {
         z = y;
     }
     // 再用较大的数和l比较，最终得到最大值
     if (z < l) {
         z = l;
     }
     return z;
 }
