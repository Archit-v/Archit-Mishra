// code to implement matrix multiplication

#include <stdio.h>
#include <stdlib.h>

#define n 2


void matMlt(int a[][n],int b[][n],int c[][n]);

void display(int c[][n]);

int main()
{
    int a[][n]={{3,6},{2,0}};
    int b[][n]={{1,2},{5,1}};

    int res[][n]={0};
    display(b);

    matMlt(a,b,res);

    display(res);
}

void matMlt(int a[][n],int b[][n],int c[][n])
{
    int i,j;
    for(i=0;i<2;i++)
    {
        for(j=0;j<n;j++)
        {
            int k=0;
            c[i][j]= (a[i][k]*b[k][j] + a[i][k+1]*b[k+1][j]);
        }
    }

}

void display(int c[][n])
{
    int i,j;
    for(i=0;i<2;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }    

}