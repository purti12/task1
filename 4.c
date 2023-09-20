//Write a program to compare two no by using the ternary operator in c.
#include<stdio.h>
int main()
{
    int a,b;
    printf("\nEnter First value");
    scanf("%d",&a);
    printf("\nEnter Second value:");
    scanf("%d",&b);
    a==b?
    printf("2 values are equal%d",a):printf("two values not equal%d,%d",a,b);
    return 0;
}