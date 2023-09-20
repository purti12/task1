//write a program to print EVEN numbers from 1 to N using a while loop.
#include<stdio.h>
int main()
 {
	int i;
	printf("Even numbers between 1 to 20 \n");
	for (i = 1; i <= 20; i++) 
	{
		if(i%2 == 0) 
		{
		  printf("%d ", i);
		}
	}
	return 0;
}