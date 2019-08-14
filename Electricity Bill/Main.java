#include<stdio.h>
#include<math.h>
int main()
{
 float a,b;
  scanf("%f",&a);
  if(a<=200)
    printf("Rs.%.0f",a*.5);
  else if(a>200 && a<400)
  {
    b=(a*0.65)+100;
    printf("Rs.%.0f",ceil(b));
  }
  else if(a>400 && a<600)
  {
    b=a*.80+200;
    printf("Rs.%.0f",b);
  }
  else
  {
     b=a*1.25+425;
    printf("Rs.%.0f",b);
  }
}