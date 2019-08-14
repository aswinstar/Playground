#include<stdio.h>
int main()
{
 int n,m,a[100],b,i;
  scanf("%d\n",&n);
  printf("Array after deletion is:\n");
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  scanf("%d\n%d",&m);
  for(i=1;i<m;i++)
  {
    printf("%d\n",a[i]);
  }
  for(i=m+1;i<=n;i++)
  {
    printf("%d\n",a[i]);
  }
}