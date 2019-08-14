#include<stdio.h>
int main()
{
  int n,a[100],b,i,j,c=0;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  scanf("%d",&b);
  for(i=1;i<=n;i++)
  {
    if(a[i]==b)
    {
      c++;
    }
  }
  if(c==1)
  {
      printf("%d is present in the array",b);
      
    }
    else
    {
      printf("%d is not present in the array",b);
    }
}
