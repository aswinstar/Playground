#include<stdio.h>
int main()
{
 int n,a[100],b,c=0,i;
  scanf("%d %d",&n,&b);
  for(i=1;i<=n;i++)
  {
    scanf("%d ",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
c=c+a[i];
  }
  if(c<=b)
  {
    printf("YES");
  }
  else
  {
    printf("NO");
  }
}