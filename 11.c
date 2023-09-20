//Write a program to Calculate Product of Digits of a Number
#include<stdio.h>
int main()
{
    int a,b,c,d,n;
    printf("enter 3 digit number ");
    scanf("%d",&n);
   a=n/100%10;
   b=n/10%10;
   c=n%10;
   d=a*b*c;
   printf("%d",d);

}