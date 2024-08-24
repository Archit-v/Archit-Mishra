//C-boilerplate
#include <stdio.h>
#include <stdlib.h>
//make a structure
struct node
{
    int data;
    struct node *left;
    struct node *right;
};

//create a function
struct node* create(struct node *t,int val);

//deleting fnction
struct node* delete(struct node *t,int val);

void display(struct node *t);

int height(struct node *,int);

int main()//driver code
{
    struct node *root=NULL,*temp;int ch,val;

             /*  20
                /  \ 
              15    23
             /   \     \
            12    16     25
           
 */

    do
    {
        printf("\nEnter your choice.");
        printf("\n1.Insert\n2.Display\n3.Delete\nEnter -999 to End: ");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: printf("\nEnter value of leaf");
                    scanf("%d",&val);
                    root=create(root,val);
                    break;

            case 2:display(root);
                   break;
                      
            case 3:printf("\nEnter value of node to be deleted: ");
                   scanf("%d",&val); 
                   root=delete(root,val);
                   break;  

            /*   case 4:printf("%d",height(root,0));
                   break;*/
                          
        }

    } while(ch!=-999);
      
    
    return 0;
}

struct node* create(struct node *t,int val)
{
   if(t==NULL)
   {
       t=(struct node *)malloc(sizeof(struct node));
       t->data=val;
       t->left=NULL;
       t->right=NULL;
       return t;
   }

   else
   {
        struct node *tr,*parnt,*leaf;
        leaf=(struct node *)malloc(sizeof(struct node));
        leaf->data=val;
        leaf->left=NULL;
        leaf->right=NULL;

        tr=t;
        while(tr!=NULL)
        {
            parnt=tr;
            if(val<tr->data)
            tr=tr->left;
            else
            tr=tr->right;
        }

        if(val<parnt->data)
        {
            parnt->left=leaf;
            return t;
        }
        else
        {
            parnt->right=leaf;
            return t;
        }
   }
}

struct node* delete(struct node *t,int val)
{
    struct node *tr=t;//child node for traversal
    struct node *parnt; //parent node

    //Lets Search first
    while(tr->data!=val)
    {
        parnt=tr;
        if(val<tr->data)
        tr=tr->left;

        else if(val>tr->data)
        tr=t->right;

        else
        printf("No such node!");
    }

    if(parnt->left==tr) //if tr is left child
    { 
        //if tr has one child
        if(tr->left==NULL) 
        {
        parnt->left=tr->right;
        free(tr);
        }

        else if(tr->right==NULL)
        {
        parnt->left=tr->left;
        free(tr);
        }
         
        //if tr has 2 children
        else if(tr->left!=NULL && tr->right!=NULL)
        {
            struct node *subT;
            subT=tr->right;

            while(subT->left!=NULL)
            subT=subT->left;
            
            subT->left=tr->left;
            parnt->left=tr->right;
            free(tr);
        }
    }

    else if(parnt->right==tr) //if tr is right child
    {
        //if tr has one child
        if(tr->left==NULL)
        {
        parnt->right=tr->right;
        free(tr);
        }
        
        else if(tr->right==NULL)
        {
        parnt->right=tr->left;
        free(tr);
        }

        //if tr has 2 children
        else if(tr->left!=NULL && tr->right!=NULL)
        {
            struct node *subT;
            subT=tr->right;

            while(subT->left!=NULL)
            subT=subT->left;
            
            subT->left=tr->left;
            parnt->right=tr->right;
            free(tr);
        }

        else
            free(tr);
    }

    return t;
}

void display(struct node *t)
{
    if(t==NULL)
    return;

    else
    {
        printf("%d  ",t->data);
        display(t->left);
        display(t->right);
    }
}

/*  int height(struct node *t,int c)
{
    if(t==NULL)
    return c;

    else
    {
        height(t->left,c++);
        height(t->right,c);
    }
} 