#include<stdio.h>
int main()
{
  int n,m,a[100][100],b[100][100],c[100][100],i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d\n",&a[i][j]);
    }
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  printf("Transpose matrix is :\n");
  for(j=0;j<n;j++)
  {
    for(i=0;i<n;i++)
    {
      printf("%d ",a[i][j]);
    }
    printf("\n");
  }
  
}