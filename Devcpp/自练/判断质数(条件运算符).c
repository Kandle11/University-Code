#include <stdio.h>
#include <math.h>
int main()
{
	int a,isPrime=1,i;
	printf("Please input a prime number:");
	scanf("%d",&a);
	
	for(i=2;i<=sqrt(a);i++){
		if(a%i==0) {
			isPrime=0; 
			break;
		}
	}
	printf("%d is %s prime number.\n",a,isPrime==1 ? "" : "not");
 	return 0;
}

