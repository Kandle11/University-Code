#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c;
    double discriminant, root1, root2;

    // 提示用户输入系数a, b和c
    printf("请输入一元二次方程的系数 a, b 和 c: ");
    scanf("%lf %lf %lf", &a, &b, &c);

    // 计算判别式
    discriminant = b * b - 4 * a * c;

    // 根据判别式的值判断根的情况
    if (discriminant > 0) {
        root1 = (-b + sqrt(discriminant)) / (2 * a);
        root2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("该方程有两个不同的实数根: %.2lf 和 %.2lf\n", root1, root2);
    } else if (discriminant == 0) {
        root1 = root2 = -b / (2 * a);
        printf("该方程有一个实数根: %.2lf\n", root1);
    } else {
        double realPart = -b / (2 * a);
        double imaginaryPart = sqrt(-discriminant) / (2 * a);
        printf("该方程有一对共轭复数根: %.2lf + %.2lfi 和 %.2lf - %.2lfi\n", realPart, imaginaryPart, realPart, imaginaryPart);
    }

    return 0;
}
