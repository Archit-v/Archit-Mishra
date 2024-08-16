//WAP to print sentences on demand-Assertive,Interrogative,Imperative,Exclamatory.
#include <stdio.h>
void As();
void Int();
void Imp();
void Ex();
   
void As(){
printf("Hello Mate. ");
}

void Int(){
printf("Have U Done Dinnner? ");
}
void Imp(){
    printf("Shut Up!");
}
 void Ex(){
    printf("Jai Shankar!");
   }
int main () {
    int ch;
    printf("Press 1 to print Assertive Sentence");
    printf("Press 2 to print Interrogative Sentence");
    printf("Press 3 to print Imperative Sentence");
    printf("Press 4 to print Exclamotory Sentence");
    printf("Enter your choice.");
    scanf("%d", &ch);
    switch(ch){
        case 1: As();
                break;
        case 2: Int();
                break;
        case 3: Imp();
                break;
        case 4: Ex();
                break;
    }
}