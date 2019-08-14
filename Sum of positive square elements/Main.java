#include<stdio.h>
int main()
{
  int n,a[100],i,b,j;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(a[i]==j*j)
      {
        printf("%d\n",a[i]);
      }
    }
  }
}
