#include<stdio.h>
int main()
{
 int a[100],b,i;
  scanf("%d\n",&b);
  for(i=1;i<=b;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=b;i++)
  {
    printf("%d\n",a[i]);
}
}