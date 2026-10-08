#include <stdio.h>
#include <math.h>

int main() 
{
    double a, b, c;
    scanf("%lf %lf %lf", &a, &b, &c);

    if (a <= 0 || b <= 0 || c <= 0) 
	{
        printf("It isn't triangle.\n");
        return 0;
    }

   
    if (a + b <= c || a + c <= b || b + c <= a) 
	{
        printf("It isn't triangle.\n");
        return 0;
    }

   
    if (a == b && b == c) 
	{
        printf("equilateral triangle\n");
    }
    
	else 
{
        double max_val = a;
        if (b > max_val) max_val = b;
        if (c > max_val) max_val = c;

        int is_right = 0;
        if (fabs(max_val - a) < 1e-9) 
		{
            is_right = (fabs(b*b + c*c - a*a) < 1e-9);
        } 
		else if (fabs(max_val - b) < 1e-9) 
		{
            is_right = (fabs(a*a + c*c - b*b) < 1e-9);
        } 
		else 
		{ 
            is_right = (fabs(a*a + b*b - c*c) < 1e-9);
}
        int is_isoceles = (fabs(a - b) < 1e-9) || (fabs(a - c) < 1e-9) || (fabs(b - c) < 1e-9);

        if (is_right) 
		{
            printf("right-angled triangle\n");
        } 
		else if (is_isoceles) 
		{
            printf("isoceles triangle\n");
        } 
		else 
		{
            printf("arbitrary triangle\n");
        }
}

    return 0;
}
