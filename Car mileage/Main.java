#include<stdio.h>
int main()
{
  float a,d;
  int b,c;
  scanf("%f\n%d\n%d",&a,&b,&c);
  d=a*b;
  if(d<c)
    printf("Cannot reach");
  else
    printf("Can reach");
}