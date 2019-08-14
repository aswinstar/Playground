#include<stdio.h>
int main()
{
 int n,a[100],i,j,b;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    for(j=i+1;j<=n;j++)
    {
      if(a[i]==a[j])
      {
        a[j]='\0';
      }
    }
  }
  for(j=1;j<=n;j++)
  {
    if(a[j]!=0)
    {
    printf("%d\n",a[j]);
    }
  }
  
}