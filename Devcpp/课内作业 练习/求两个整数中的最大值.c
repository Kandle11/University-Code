#include <stdio.h>
int main()

{
int max(int x,int y,int l);
int a,b,c,d;
scanf("%d %d",&a,&b);
d=max(a,b,c);
printf("max=%d\n",d);
return 0;
}

int max(int x,int y,int l)
{
int z;
if(x>y && x>l)
z=x;
else if(y>x && y>l)
z=y;
else
z=l;
return(z);
}

