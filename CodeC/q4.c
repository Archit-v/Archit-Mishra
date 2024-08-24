//find if a character is in uppercase or not

#include <stdio.h>

int main () {
    char ch;
    printf("enter a character:- ");
    scanf("%c",&ch);
    int c=(int)ch;
    if(c>=65 && c<=90)
    printf("In Uppercase");else if(c>=97 && c<=122) printf("in Lowercase");
    else printf("Invalid Character");
    return 0;
}