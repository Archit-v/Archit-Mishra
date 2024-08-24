#include <stdio.h>
#include <math.h>
float root;
int n;

float f(int x)
{
   return (pow(x,3)-2*x+1);
}
void bisct()
{
    float x0,x1;
    float x2;
    float f0,f1,f2;
    int c=0;

    for(x0=1; ;x0++)
    {
        if(f(x0)>0)
        {
          f0=f(x0); 
          printf("\n %f \n %f",f0,x0);
          break;
        }
    }

    for(x1=x0-1; ;x1--)
    {
        if(f(x1)<0)
        {
            f1=f(x1);
            printf("\t%f",x1);
            break;
        }
        
    }

    while(c<=n)
    { 
       x2=(x1+x2)/2;
       f2=f(x2);

       printf("\n %f %f",f2,x2);

       if(f2==0)
       root=x2;

       else if(f2*f1<0)
       x0=x2;
       
       else
       x1=x2;


       printf("Iteration: %d\t",c++);
       printf("Root %f",x2);

    }
}

int main()
{
    printf("The function is: x3-2x-5");
    printf("no. of iterations=?");
    scanf("%d",&n);
    bisct();
}