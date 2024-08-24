#include <stdio.h>
#include <stdlib.h>

#define n 5


void sSrt(int a[],int);

void display(int a[]);

void swap(int *,int *);

int main()
{
    
    int a[]={30,5,15,20,40};
    
    sSrt(a,0);

    display(a);
}

void sSrt(int a[],int ind)
{
    if(ind==n)
    return;

    int min=ind,i;

    for(i=ind+1;i<n;i++)
    {
        if(a[min]>a[i])
        {
            min=i;
        }
    }

    swap(&a[min],&a[ind]);

    sSrt(a,ind+1); 
}

void swap(int *a,int *b)
{
    int temp;
    temp=*a;
    *a = *b;
    *b=temp;
}

void display(int a[])
{
    int i;
    for(i=0;i<n;i++)
    printf("%d ",a[i]);
}