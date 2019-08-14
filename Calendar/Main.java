#include<stdio.h>
int main()
{
int a,b,c,d,e,f,g,h;
  scanf("%d\n%d",&a,&b);
  if(a==2&&b%4==0)
  {
    if(b%100==0)
    {
      if(b%400==0)
      {
        printf("Number of days is 29");
      }
    }
  }
  else if(a==2)
  {
   printf("Number of days is 28");
  }
  switch(a)
  {
    case 1:{
    printf("Number of days is 31");
    break;}
    case 3:{
    printf("Number of days is 31");
    break;}
    case 4:{
    printf("Number of days is 30");
    break;}
    case 5:{
    printf("Number of days is 31");
    break;}
    case 6:{
    printf("Number of days is 30");
    break;}
    case 7:{
    printf("Number of days is 31");
    break;}
    case 8:{
    printf("Number of days is 31");
    break;}
    case 9:{
    printf("Number of days is 30");
    break;}
    case 10:{
    printf("Number of days is 31");
    break;}
    case 11:{
    printf("Number of days is 30");
    break;}
    case 12:{
    printf("Number of days is 31");
    break;}
  }
}