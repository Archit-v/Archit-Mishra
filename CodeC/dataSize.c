//to print sizes of datatypes in ur comp.
#include <stdio.h>
#include <stdint.h>  //using predefined class which has int D.T prototyped
#include <stdbool.h>

void printSize();

int main () {
    printSize();
}
void printSize(){
    printf("Size Of Char= %lu\n", sizeof(char));
    printf("Size Of int= %lu\n", sizeof(int));

}  