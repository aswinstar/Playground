#include<stdio.h>
int main()
{
 int n,a[100],b=0,c,i;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    b=b+a[i];
  }
  printf("%d",b);
}