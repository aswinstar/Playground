#include<stdio.h>
int main()
{
 int n,a[100],i,j,b[100];
  scanf("%d\n",&n);
  printf("Sorted array is:\n");
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
           b[j]=a[i];
           a[i]=a[j];
           a[j]=b[j];
         }
    }
  
   
  
  }
  for(j=1;j<=n;j++)
  {
    printf("%d\n",a[j]);
  }
  
}