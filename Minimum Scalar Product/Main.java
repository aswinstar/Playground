#include<stdio.h>
int main()
{
  int n,a[100],b[100],c=0,d=0,i,j,k;
  scanf("%d\n",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d ",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    scanf("%d ",&b[i]);
  }
  for(i=1;i<=n;i++)
  {
    for( k=i+1;k<=n;k++)
    {
    if(b[i]<b[k])
       {
         c=b[i];
         b[i]=b[k];
         b[k]=c;
       }
       }
    //printf("%d\n",b[j]);
  }
  for(i=1;i<=n;i++)
  {
    d=d+(a[i]*b[i]);
  }
  printf("%d",d);
  
}