#include <stdio.h>
int main()
{
	int a;
	//scanf("%d",&a);
	a=2;
	int i,j,k;
	i=a;
	
	int cnt=0;
	while( i<=a+3 ){
		j=a;
		while( j<=a+3 ){
			k=a;
			while( k<=a+3 ){
				if(i!=a){
					if(j!=a){
						if(k!=a){
							printf("%d%d%d",i,j,k);
							cnt++;
							if(cnt==6){
								printf("\n");
							}else{
								printf(" ");
							}
						}
					}
				}
				k++;
			}
			k++;
		} 
		i++;			//每一轮都要让i++，先将其写好 
	}
 	return 0;
}

