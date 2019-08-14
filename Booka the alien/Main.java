#include<stdio.h>
int main()
{
 int a,b,c,d,e;
  scanf("%d",&a);
  b=a/365;
  c=a%365;
  d=c/7;
  e=c%7;
  printf("%d\n%d\n%d\n",b,d,e);
}