#include <stdio.h>
 int main()
 {
     int a, b, p=1;  	//设p为真 
     scanf("%d", &a);
     
     if(a<=1 || (a%2==0 && a!=2)) 
	 p=0;
     
     for(b=3; b*b<=a && p; b+=2)
         if(a%b==0) 
		 p=0;
         
     printf("%d is %s prime number.", a, p ? "" : "not ");  //%s判断条件运算符 
     return 0;
 }
