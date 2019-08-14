#include<stdio.h>
int main()
{
 int n,m,a[100],b[100],c=0,i;
  scanf("%d\n%d\n",&m,&n);
  for(i=1;i<=m;i++)
  {
    scanf("%d\n",&a[i]);
  }
  for(i=1;i<=n;i++)
  {
    scanf("%d\n",&b[i]);
  }
  if(m==n)
  {
    for(i=1;i<=m;i++)
    {
      if(a[i]==b[i])
      {
        c++;
      }
    }
  }
if(c==m)
{
  printf("Same");
}
  else
  {
    printf("Not Same");
  }
}
         
