#include<stdio.h>
int main()
{
float a,b,c;
  scanf("%f\n%f\n%f",&a,&b,&c);
  float d=a+b;
  float e=d*(100-c)/100;
  float f=d*(c/100);
  printf("%.2f\n%.2f\n%.2f",d,e,f);
}