//Write a program to perform the concept of call by value fibonacci series
#include<stdio.h>
int main()
{
    int a=0,b=1,sum,n,i;
    printf("enter range");
    scanf("%d",&n);
    printf("%d%d",a,b);

   if(i=1,i<=n,i++)
   {
    sum=a+b;
    printf("%d",sum);
    a=b;
    b=sum;
}
}

