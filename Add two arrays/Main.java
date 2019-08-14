#include<stdio.h>
int main()
{
  int n,a[100],i,j,b[100];
  scanf("%d\n",&n);
  for(i=1;i<=n*2;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    b[i]=a[i]+a[n+i];
    printf("%d ",b[i]);
  }
}