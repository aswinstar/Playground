#include<stdio.h>
int main()
{
int a,b,c,d;
  scanf("%d\n%d\n%d",&a,&b,&c);
  d=(b*75)+(c*30);
  if(d<=a)
    printf("Boat is stable");
  else
    printf("Boat will drow");
}