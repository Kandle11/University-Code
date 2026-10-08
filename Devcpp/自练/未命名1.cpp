#include <stdio.h>
#include <math.h>
int main()
{
	double a,b,c,x = 0;
	scanf("%1f %1f %1f",&a,&b,&c);
	x = (-b+sqrt(b*b-4.0*a*c))/(2.0*a);
	printf("x = %1f",x);
	return 0;
}
