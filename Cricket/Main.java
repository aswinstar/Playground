#include<stdio.h>
#include<math.h>
int main()
{
 float a,b,c,d,e,f,g,h,j;
  scanf("%f\n%f\n%f\n%f",&a,&b,&c,&d);
  h=a/6;
  printf("%.f\n",a/6);
  e=floor(d /6);
    f=fmod(d,6)*.1;
  g=e+f;
  printf("%.1f\n",g);
  j=c/g;
  int q=b/h;
   printf("%.1f\n",c/g);
  printf("%.1f\n",b/h);
  if(j>=q)
    printf("Eligible to Win");
  else
    printf("Not Eligible to Win");
}