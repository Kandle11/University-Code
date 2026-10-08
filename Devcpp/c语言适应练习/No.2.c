#include <stdio.h>
#include <math.h>  // 用于fabs()求浮点数绝对值

int main() {
    double nums[1000];  // 存储输入的实数（最多1000组，足够日常/OJ测试）
    int count = 0;      // 记录输入的实数个数
    double num;

    // 步骤1：循环读取所有实数，存入数组（直到输入结束）
    while (scanf("%lf", &num) == 1) {
    	
        nums[count] = num;
        count++;  // 计数+1
        
        // 防止数组越界（可选，根据需求调整数组大小）
        if (count >= 1000) {
            printf("输入数据已达上限（1000组）！\n");
            break;
        }
    }

    // 步骤2：统一输出所有数的绝对值（保留两位小数）
    
    int i;
    for (i = 0; i < count; i++) {
        printf("%.2f\n", fabs(nums[i]));
    }

    return 0;
}
