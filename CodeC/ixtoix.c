//infix to postfix
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int top=-1;

char st[10];

char infix[20];
char postfix[20];

void inToPost(char []);

void push(char);

char pop();

int prsDnce(char);

int isEmpty();

int main()
{
    int i=0;
    char ch;
    
   
    printf("Enter Infix Expression within brackets OR Enter # to end: ");
    gets(infix);
   
    inToPost(infix);

    int j=0;
    while(postfix[j]!='\0')
    {
        printf("%c",postfix[j]);
        j++;
    }
 
    return 0;
}

void inToPost(char infix[])
{   
    int i=0,j=i;
    for(;i<strlen(infix);i++)
    {
        char ch=infix[i];
        switch(ch)
        {
            case '(': push('(');
            break;

            case ')':
            { 
            char c=pop();
            while(!isEmpty() && c!='(')
            {
               
 
                postfix[j++]=c;
                c=pop();
            }
            }
            break;

            case '+' :
            case '-' :
            case '*' :
            case '/' : 
            case '^' : 
            while(!isEmpty() && prsDnce(st[top])>=prsDnce(ch))
            {  
                postfix[j++]=pop();
               
            }
            push(ch);
            break;

            default : postfix[j++]=ch;
            break;
        }
    }
    postfix[j+1]='\0';
}

void push(char ch)
{
    if(top==9)
    printf("stack overflow");

    else 
    {
        top++;
        st[top]=ch;
    }
}

char pop() 
{
    
    char c=st[top];
    top--;
    return c;
    
}

int prsDnce(char ch)
{
    if(ch=='^')
    return 3;

    else if(ch=='*' || ch=='/')
    return 2;

    else if(ch=='+' || ch=='-')
    return 1;

    else
    return 0;

}

int isEmpty()
{
    if(top==-1)
    return 1;
    else 
    return 0;
}