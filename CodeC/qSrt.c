#include <stdio.h>
#include <stdlib.h>

#define n 8


void qkSrt(int a[],int,int); //to quikly sort

int partition(int a[],int,int);

void display(int a[]); // to display cards
 
void swap(int *,int *); //to swap two cards

int main()
{
    
    int a[]={4,6,2,5,7,9,1,3};
    
    qkSrt(a,0,n-1);





    display(a);
}

void qkSrt(int a[],int low,int high)
{
  /*   if(high==low)
   return;*/

   if(low<high)
   {
   int prtInd= partition(a,low,high);
   qkSrt(a,low,prtInd-1);
   qkSrt(a,prtInd+1,high);
   }
}

int partition(int a[],int low,int high)
{
    int pivot=a[low];
    int i=low,j=high;

    while(i<j)
    {
        while(a[i]<=pivot && i<high)
        {
            i++;
        }   

        while(a[j]>=pivot && j>low)
        {
            j--;
        }
        if(i<j)
        swap(&a[i],&a[j]);
    }
    swap(&a[j],&a[low]);
    return j;    
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