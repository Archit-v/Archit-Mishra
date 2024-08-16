//find sum of first n natural no.s through recursion
 
#include <stdio.h>
int s;// global variable
int rec_sum(int n);

int main () 
{   
    int n;
    printf("Enter Limit");
    scanf("%d",&n);
    s=0;
    printf("The sum is= %d \n", rec_sum(n)); 
    return 0;
}
  
int rec_sum(int n) 
{
    if(n==8)
        return 8;
    else
    {
        
    
        return s=s+rec_sum(n-1);
    }
}