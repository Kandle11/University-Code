#include <stdio.h>
int main()
{
	int y,month,days=0;
	
	printf("Please Enter year and month:") 
	scanf("%d %d",&y,&month);
	
	
	if(month>=1 && month<=12) 
	{
		
		
		if(month==2)
	{
		if((y%4==0 && y%100!=0)|| (y%400==0)) 
		days=29;
		else
		days=28;     //判断是否为闰年 
 	}
 	
 	
 		else if(month == 1 || month == 3 || month == 5 || month == 7 || 
                 month == 8 || month == 10 || month == 12) //判断符号 == 
 		{
 		days=31;
 	 	}
 		else
 		days=30;   //其他年月 
	}
	
	
	
	printf("%d",days);
	return 0;
}


