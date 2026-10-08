#include <stdio.h>
int main()
{
 	int x;
 	int n=0;
 	scanf("%d", &x);
	n++;
	x/=10;
	while ( x>0 ){
	printf("x=%d,n=%d\n",x,n);
	n++;
	x/=10;
	
}
 	printf("%d",n);
 	return 0;
}

