//Write a program to find the sum of two matrices of order 2*2 using
//multidimensional array
#include<stdio.h>
int main()
{
    int a[2][2],b[2][2],c[2][2],i,j;
    printf("enter elemenys of matrix a=");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nmatrix a is=\n");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("\t%d",a[i][j]);
        }
        printf("\n");
    }
    printf("enter elemenys of matrix b=");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            scanf("%d",&b[i][j]);
        }
    }
    printf("\nmatrix b is=\n");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            printf("\t%d",b[i][j]);
        }
        printf("\n");
    }
     printf("add of a and b matrix is=\n");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            printf("\t%d",c[i][j]);
        }
        printf("\n");
    }
    
}