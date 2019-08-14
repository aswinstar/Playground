#include<stdio.h>
int main()
{
  int a,b;
  scanf("%d\n%d",&a,&b);
  if(a>0&&b>0)
    printf("Ist Quadrant");
  if(a<0&&b>0)
    printf("IInd Quadrant");
  if(a<0&&b<0)
    printf("IIIrd Quadrant");
  if(a>0&&b<0)
    printf("IVth Quadrant");
  
}