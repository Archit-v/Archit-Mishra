// to print the smallest no. of the two values
#include <stdio.h>

int main () {
    int a,b,c;
    printf("Enter Two Numbers\t");
    scanf("%d",&a);
    scanf("%d",&b);
    c=a>b?a:b;
    printf("%d",c);
    return 0;
}