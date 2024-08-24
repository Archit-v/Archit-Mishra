
#include <stdio.h>
#include <unistd.h>
#include <time.h>
#include <windows.h>
#define width 50
#define depth 10


//global variables
int x,y;
int fruitX;
int fruitY;

int tailX[10];
int tailY[10];
int ntail=0;

int gameover,score;




void initialize()
{
  x=width/2,y=depth/2;

  fruitX = 10;
  fruitY = 9;

  gameover=0;
  score=0;


}

void setup()
{
    int i,j;
    for(i=0;i<=depth;i++)//no. of rows
    {

        for(j=0;j<=width;j++)//no. of columns
        {
            
            if(i==0 && j<=50 || i==10 && j<=50)//for first and last row
            {
                printf("#");
                
            }
           else if(j==50)
           {
                printf("#");
           }
            

           else if(j==0)
            printf("#");

           else if(i==y && j==x) //drawing snake
            {
                printf("o");
            }

            else if(i==fruitY && j==fruitX)
            printf("F");
            
            else
            {
                int h;
                int print=0;
                for(h=0;h<ntail;h++)
                {
                    if(i==tailY[h] && j==tailX[h])
                    {
                    printf("o");
                    print=1;
                    }
                }

                if(!print)           
                printf(" ");   
            }

        }
        printf("\n");
    }
    printf("%d",score);
}
void input()
{
    
    if(kbhit())
    {
       int i;
       for ( i = ntail-1; i > 0; i--)
       {
          tailX[i] = tailX[i - 1];
          tailY[i] = tailY[i - 1];
       }
       tailX[0] = x;
       tailY[0] = y;
       switch(getch())
       {
            case 'w':
            y--;
            break;

            case 's' :
            y++;
            break;

            case 'a':
            x--;
            break;

            case 'd':
            x++;
            break;

            default: gameover=1;
            break;
        }
    }
}
void draw()
{
    srand(time(0));



    if(x==fruitX && y==fruitY)
    {
        fruitX=rand()%30;
        fruitY=rand()%9;
        score+=10;
        ntail++;
    }
    else if(x<=0 || x>=width || y<=0 || y>=depth)
    {
        gameover=1;
    }
}

int main() 
{
    
   COORD cord = {0,0};
   initialize();
   while(!gameover)
   {
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE),cord); 
    setup();
    input();
    draw();
    
   } 

    
   return 0;
}
    