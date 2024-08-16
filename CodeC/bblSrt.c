#include <stdio.h>
#include <stdlib.h>

#define n 5


void bubSrt(int a[],int);

void display(int a[]);

void swap(int a[],int);

int main()
{
    
    int a[]={30,5,15,20,40};
    
    bubSrt(a,n);

    display(a);
}

void bubSrt(int a[],int s)
{
    int j;
    if(s==1)
    return;
    
    for(j=0;j<s-1;j++)
    {
        if(a[j]>a[j+1])
        swap(a,j);
    }
    bubSrt(a,s-1);
    
}

void swap(int a[], int j)
{
    int temp;
    temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;  
}

    
void display(int a[])
{
    int i;
    for(i=0;i<n;i++)
    printf("%d ",a[i]);
}