#include<stdio.h>
int main()
{
 int n,m,a[100][100],b[100][100],c[100][100],i,j;
  scanf("%d\n%d",&m,&n);
  printf("The Result is:\n");
  for(i=1;i<=m;i++)
  {
    for(j=1;j<=n;j++)
    {
      scanf("%d\n",&a[i][j]);
    }
  }
  for(i=1;i<=m;i++)
  {
    for(j=1;j<=n;j++)
    {
      scanf("%d\n",&b[i][j]);
    }
  }
  for(i=1;i<=m;i++)
  {
    for(j=1;j<=n;j++)
    {
     c[i][j]=-a[i][j]+b[i][j];
    }
  }
  for(i=1;i<=m;i++)
  {
    for(j=1;j<=n;j++)
    {
      printf("%d ",c[i][j]);
    }
    printf("\n");
}
}
