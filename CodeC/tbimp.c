//top-to-bottom implementation of Hello2
//an approach of breaking complex problem into small chunks 
#include <stdio.h>

void greet(char* greeting,char* adresse);
void toGreet(char* a);
void putComma();
void toAddresse(char* a);
void printLn();
int main () {
 greet("Hello","world"); 
    return 0;
}
 void greet(char* greeting, char* addresse)
{
     toGreet(greeting);
     putComma();
     toAddresse(addresse);
     printLn();
}
void toGreet(char* a){
    printf("%s", a);
}
void putComma(){
    printf(",");
}
void toAddresse(char* a){
    printf("%s", a);
}
void printLn(){
    printf("! \n");
}
