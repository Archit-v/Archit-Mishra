//different approach to print Hello,World!
//one function for addresser and addresse,and one for punctutiaton
#include <stdio.h>

void printComma()
{
    printf(",");
}
void greet( char* greetings,char* addresse )
{
    printf("%s", greetings);
    printComma();
    printf( "%s" , addresse);
    printf("!\n");
}
int main()
{
    greet( "Hello", "world");
    return 0;
}