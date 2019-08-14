#include<stdio.h>
int main()
{
 int a,b,c;
  scanf("%d\n%d\n%d",&a,&b,&c);
  if(a>b && a>c)
    printf("%d is greater",a);
  if(b>a && b>c)
    printf("%d is greater",b);
  if(c>b && a<c)
    printf("%d is greater",c);
  
}