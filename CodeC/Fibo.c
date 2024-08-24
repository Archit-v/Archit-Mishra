#include <stdio.h>

int Fibo(int n)
{
    if(n==0)
    return n;
    
     if(n==1)
    return n;

    
    return Fibo(n-1)+Fibo(n-2); 
    
}
int main () {
    int ans;
    ans=Fibo(4);
    printf(" %d ",ans);
    return 0;
}