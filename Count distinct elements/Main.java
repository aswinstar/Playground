#include<stdio.h>
int main()
{
  int n,a[100],i,b[100],j,c=0;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    for(j=i+1;j<=n;j++)
    {
      if(a[i]>a[j])
         {
           b[i]=a[i];
           a[i]=a[j];
           a[j]=b[i];
         }
    }
  }
  for(i=1;i<=n;i++)
  {
   if(a[i]==a[i+1])
   {
     c=c+2;
  }
  }
    printf("There are %d distinct elements in the array.",c);

}