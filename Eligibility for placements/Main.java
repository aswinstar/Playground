#include<stdio.h>
int main()
{
 char a[100];
  int b,c;
  float d;
  scanf("%s\n",&a);
  scanf("%d\n",&b);
  scanf("%f\n",&d);
  scanf("%d",&c);
  printf("%s\n",a);
  printf("%d\n",b);
  if(c>=7)
    printf("Eligible to attend placement");
  else
    printf("Not Eligible to attend placement");
}