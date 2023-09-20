//Write a program to find the cube of a number use loop
 #include<stdio.h>
 
int main()
{
  int n, cube;
 
  printf(" \n Enter any integer Value ");
  scanf("%d", &n);
  
  cube =n*n*n;
  
  printf("\nCube ofnumber %d is %d",n,cube);
 
  return 0;
}