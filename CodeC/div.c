// divisiblity test by 7
#include <stdio.h>
int ldig(int n);
int rdig(int n);

int ldig(int n)
{
    int l=n%10;
    return l;
}
int rdig(int n)
{
    int d=n/10;
    return d;
}

int main () {  
    int num;
    printf("Enter a number");
    scanf("%d",&num);
    int dif=2*ldig(num)-rdig(num);
    printf("%d", dif);
    if(dif%7==0||dif==0) printf("The no is divisible by 7");
    else printf("The no is not divisible by 7");
    return 0;
}