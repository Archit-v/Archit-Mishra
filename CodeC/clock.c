#include <stdio.h>
#include <unistd.h>
#include <windows.h>
#include <conio.h>

int main()
{
    int h,m,s;
    int d=100000000;
    printf("\nSet Time: ");
    scanf("%d%d%d",&h,&m,&s);
    if(h>24 || m>60 || s>60)
    {
        printf("Invalid!");
        exit(0);
    }
    
    while(1)
    {
        s++;
        if(s>59)
        {
            m++;
            s=0;
        }
        else if(m>59)
        {
            h++;
            m=0;
        }
        else if(h>23)
        {
            h=0;
            m=0;
            s=0;
        }
       
        printf("%02d:%02d:%02d",h,m,s); 
        sleep(3);
        system("cls");
               
    }
    
}