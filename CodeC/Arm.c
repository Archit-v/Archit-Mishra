//Armstrong No.
#include <stdio.h>
#include <math.h>
int tdig(int n);
int tdig(int n)//to calculate total digits in a number
{
    int count=0;
    while(n!=0)
    {
        n=n/10;
        count=count+1;
    }
    return count;
} 

int main () 
{
    int num,temp,sum,tdigit,ndig;//tdig to store called value, ndig to store new-digit
    printf("Enter the Number");
    scanf("%d",&num);
    sum=0;
    temp=num;
    tdigit=tdig(temp);
    while(temp!=0)
    {
        int d=temp%10;//store orignal digit
        ndig=(int)pow(d,tdigit);//store new "raised" digit 
        printf(" new digit = %d\n", ndig );
        sum=sum+ndig;//sum of new digits
        temp=temp/10;
        printf(" sum = %d\n", sum );
    }
    if(sum==num)
    
        printf("Number is Armstrong");
    else 
        printf("Number is not Armstrong");
    return 0;
}