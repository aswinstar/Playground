#include<stdio.h>
int main()
{
 int n,a[100],b,c=0,i,j;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    for(j=i;j>0;j--)
    {
      if(a[i]>a[j])
      {
        c++;
      }
      
    }
      printf("%d\n",c+1);
    c=0;
  }
}