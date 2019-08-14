#include<stdio.h>
int main()
{
int a[100],b,c=0,i,d=0;
  scanf("%d",&b);
  for(i=1;i<=b;i++)
  {
    scanf("%d\n",&a[i]);
}
          for(i=1;i<=b;i++)
          {
            if(a[i]%2!=0)
            {
              c++;
            }
            else
            {
              d++;
            }
          }
          printf("Odd: %d\nEven: %d",c,d);
          }