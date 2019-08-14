#include<stdio.h>
int main()
{
 int a[100],b,n,i,c=0,d=0;
  scanf("%d %d",&n,&b);
  for(i=1;i<=n;i++)
  {
    scanf("%d ",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    c=c+a[i];
  }
  if(c%b!=0)
  {
    d=c+b;
  }
  printf("%d",d/b);
  
}