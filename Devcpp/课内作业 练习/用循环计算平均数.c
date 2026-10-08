#include <stdio.h>
int main()
{
	int grade,i=1;
	double av=0;
	while(i<=10)
	{
		printf("Enter grade:\n");
		scanf("%d",&grade);
		av=av+grade/10.0;
		i++;
	}
	printf("Class average is %d",(int)av);
	return 0;
}

