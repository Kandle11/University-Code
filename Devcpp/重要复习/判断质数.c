#include <stdio.h>
#include <math.h>
int main()
{
 	int a,b;
 	printf("Please input a number:");
	scanf("%d",&a);
	
	if(a<=1)
{
	printf("%d isnt the prime number.",a);
	return 0;
}

	for(b=2;b<=sqrt(a);b++)     //b=2开始 ，确保 2也为质数的情况 
{
		if( a%b==0 )
		{
		printf("%d isnt the prime number.",a);
		return 0； 
		}
}
	printf("%d is a prime number.", a);
	
 	return 0;
}

