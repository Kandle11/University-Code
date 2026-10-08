#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c, t;
    scanf("%lf %lf %lf", &a, &b, &c);
	
	
	//开始对比三个数 ，令a,b,c按大小排序，方便后续判断 
    if (a > b) { t = a; a = b; b = t; }
    if (b > c) { t = b; b = c; c = t; }
    if (a > b) { t = a; a = b; b = t; }    //再次进行判断，如果a>b，进一步保证a<=b； 


    if (a <= 0 || a + b <= c) 			//判断是否为三角形 
	{
        printf("It isn't triangle.\n");
        return 0;
    }


    if (fabs(a - c) < 1e-9) 			//计算机语言，一个数的绝对值小于十的-9次方为相等 
	{
        printf("equilateral triangle\n");
    } 
    
	else if (fabs(a*a + b*b - c*c) < 1e-9)
	{
        printf("right-angled triangle\n");
    } 
    
	else if (fabs(a - b) < 1e-9 || fabs(b - c) < 1e-9) 
	{
        printf("isoceles triangle\n");
    } 
    
	else 
	{
        printf("arbitrary triangle\n");
    }

    return 0;
}
