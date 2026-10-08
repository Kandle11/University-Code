#include <stdio.h>
int main()
{
	int x,b,a;
	x=10000;
	int t=x;
	int mask=1;
	
	while(t>9){
		t/=10;
		mask*=10;
	}
	
	do {
		b=x/mask;
		
		printf("%d",b);
		
		if(mask>9){
		printf(" ");
		}
		
		x = x % mask;
		
		mask/=10;
		
	}while(mask>0);
	
	printf("\n");
	
 	return 0;
}

