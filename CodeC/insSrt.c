#include <stdio.h>
#include <stdlib.h>

#define n 5


void insSrt(int a[]); //for insertion sort

void display(int a[]); // to display cards
 
void swap(int *,int *); //to swap two cards

// driver code
int main()
{
    
    int a[]={12,11,13,5,6};
    
    insSrt(a);

    display(a);
}

void insSrt(int a[])
{
  int i,j;
  for(i=0;i<n;i++)//back cards
  {
      int pos=i;
      for(j=i-1;j>=0;j--)// front cards
      {
          if(a[pos]<a[j]) // if the back card is smaller thn front,then swap
          swap(&a[pos--],&a[j]);
      }
  } 
  
}

void swap(int *a,int *b) //Let me swap the two cards
{
    int temp;
    temp=*a;
    *a = *b;
    *b=temp;
}

void display(int a[])// Let me reveal my cards
{
    int i;
    for(i=0;i<n;i++)
    printf("%d ",a[i]);
}