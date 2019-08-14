#include<stdio.h>
int main()
{
  int n,m,a[100],b,i,j;
  scanf("%d\n",&n);
  printf("Array after insertion is:\n");
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  scanf("%d\n%d",&m,&b);
  for(i=1;i<m;i++)
  {
    printf("%d\n",a[i]);
  }
  printf("%d\n",b);
  for(i=m;i<=n;i++)
  {
    printf("%d\n",a[i]);
  }
  
}