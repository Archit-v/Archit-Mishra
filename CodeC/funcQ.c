//Different functions to calculate areas of different polygons

#include <stdio.h>
float a_square(float a);
float a_rect(float l,float b);
float a_circle(float r);

int main () {
    int ch;
    float a,l,b,r;//implicit type conversion will occur
    printf("Enter your choice \n");
    printf("1 to calculate area of square \n");
    printf("2 to calculate area of rectangle \n");
    printf("3 to calculate area of circle \n");
    scanf("%d",&ch);
    switch(ch){
        case 1:
                printf("Enter side \t");
                scanf("%f",&a);
                printf("Area of square: %f \n", a_square(a) );
                break;
        case 2:
                printf("Enter length and breadth \t");
                scanf("%f",&l);
                scanf("%f",&b);
                printf("Area of rectangle: %f \n", a_rect(l,b) );
                break;
        case 3: 
                printf("Enter radius");
                scanf("%f",&r);
                printf("Area of circle %f \n", a_circle(r) );   
                break;         
    }
    
    return 0;
}
float a_square(float a)
{
    float area=a*a;
    return area;
}
float a_rect(float l,float b)
{
    float area=l*b;
    return area;
}
float a_circle(float r){
    float area=3.14*r*r;
    return area;
}