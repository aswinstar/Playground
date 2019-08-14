#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d",&a,&b);
c=a*b;
  if(c<=1500)
    printf("Cannot store");
  else
     printf("Can store");
}