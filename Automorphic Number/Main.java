#include<stdio.h>
int main()
{
 int a,b;
  scanf("%d",&a);
  b=a*a;
  int c=b%10;
  if(a==c)
    printf("Automorphic Number");
  else
    printf("Not Automorphic Number");
}