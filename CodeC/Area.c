#include <stdio.h>

float AreaT(int b,int h);
float AreaC(int rad);
float AreaR(int l,int w);
float AreaS(int a);


float AreaT(int b,int h) 
{
    float a;
    a=b*h/2;
    return a;    
}

float AreaC(int rad)
{
    float a;
    a=3.14*rad*rad;
    return a;
}

float AreaR(int l,int w)
{
    float a;
    a=l*w;
    return a;
}

float AreaS(int a)
{
    float area;
    area=a*a;
    return area;
}

int main () {
    int ch; 
    int b,h,rad,l,w,a;
    printf("Enter Your Choice:\n");
    printf("1 for Area of Triangle\n");
    printf("2 for Area of Circle\n");
    printf("3 for Area of Rectangle\n");
    printf("4 for Area of Square\n");
    scanf("%d",&ch);
    switch(ch)
    {
        case 1:printf("Enter Base and Height\t");
               scanf(" %d %d",&b,&h);
               printf("Area is:%8.3f", AreaT(b,h) );
               break;  
        case 2:printf("Enter radius\t");
               scanf(" %d ",&rad);
               printf("Area is:%8.3f", AreaC(rad) );
               break;  
        case 3:printf("Enter Length & Width\t");
               scanf(" %d %d",&l,&w);
               printf("Area is:%8.3f", AreaR(l,w) );
               break;  
        case 4:printf("Enter side\t");
               scanf(" %d",&a);
               printf("Area is:%8.3f", AreaS(a) );
               break;  
        default:printf("Invalid Input");       

    }
    return 0;
}