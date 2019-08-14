#include<stdio.h>
int main()
{
  int a[100],b,c,i;
  scanf("%d\n",&b);
  for(i=1;i<=b;i++)
  {
    scanf("%d\n",&a[i]);
  }
  
  for(i=1;i<=b;i++)
  {
    if(a[i]>a[i+1])
    {
      a[i+1]=a[i];
    }
  }
    printf("%d",a[b]);
}