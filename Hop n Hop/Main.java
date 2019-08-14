#include<stdio.h>
int main()
{
 int a,b,c;
  scanf("%d\n%d",&a,&b);
  if(a>b)
  printf("%d",a-b);
else
  printf("%d",(b-a)+1);
}