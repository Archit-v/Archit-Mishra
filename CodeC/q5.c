//to accept a no. and determine whether it is armstrong or not. 
#include <stdio.h>
#include <math.h>
int calc_pow_of_digit(int d);
int num;
      
int calc_pow_of_digit(int d)
{     
    int c=0;
    int t=num;   
    while(t!=0)
    {
        // num=num/10;
        t=t/10;
        c++;
    } 
    int y=(int)pow(d,c);
    return y; 
}

int main()
{
    printf("Enter a Number");
    scanf("%d",&num);
    int dig;int sum=0;   
    while(num!=0)
    {
      dig=num%10;
      sum=sum+calc_pow_of_digit(dig);
      printf("%d\t",sum);
      num=num/10;
    }
    printf("%d",sum);
    if(sum==num){printf("Armstrong no!");}
    else{printf("Not an Armstrong");}     
}
