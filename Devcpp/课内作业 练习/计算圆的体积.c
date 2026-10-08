#include <stdio.h>
#include <math.h>
#define PI 3.1415926
int main()
{
double r;
double V;
scanf("%lf",&r);
V=(4.0/3.0)*PI*(r*r*r);
printf("%.2f\n",V);
return 0;
}
