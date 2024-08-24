// code to implement doubly

#include <stdio.h>
#include <stdlib.h>

struct node
{
    struct node *left;
    int data;
    struct node *right;
};

struct node* crLnk(struct node *, int);

struct node* insN(struct node *,int);

//struct node* delN(struct node *);

void display(struct node *);

int main()
{
    struct node *head=NULL;int val,ch;
    do
    {   
        struct node *temp;
        printf("Enter 1 to create\n2 to insert\n3 to delete\n4 to display");
        scanf("%d",&ch);
        switch (ch)
        {
          case 1:  printf("Enter value of node");
                   scanf("%d",&val);
                   head=crLnk(head,val);
                   break;

          case 2:  printf("Enter value of node");
                   scanf("%d",&val);
                   head=insN(head,val);
                   break;

         // case 3:  head=delN(head);
                   //break;

          case 4:  temp=head;
                   while(temp->right!=NULL) 
                   temp=temp->right;

                   display(temp);
        }
    } while (ch!=5);
    

}

struct node* crLnk(struct node *head, int val)
{
    if(head==NULL)
    {
        head=(struct node *)malloc(sizeof(struct node));
        head->data=val;
        head->left=NULL;
        head->right=NULL;
        return head;
    }

    else
    {
        struct node *tr=head;
        while(tr->right!=NULL)
        tr=tr->right;

        struct node *current;
        current=(struct node*)malloc(sizeof(struct node));
        current->data=val;
        current->right=NULL;
        current->left=NULL;

        tr->right=current;
        current->left=tr;

        return head;
    }
}

struct node* insN(struct node *head,int val)
{
    if(head==NULL)
    {
        head=crLnk(head,val);
        return head;
    }

    else
    {
        struct node *tr,*pretr,*current;int n;
        int c;
        printf("\nEnter 1 to insert at beginning\n2 to insert at end\n3 to insert before any post.");
        scanf("%d",&c);
        switch(c)
        {
            case 1: current=(struct node*)malloc(sizeof(struct node));
                    current->data=val;
                    current->left=NULL;
                    current->right=head;
                    head->left=current;
                    head=current;
                    break;

            case 2: current=(struct node*)malloc(sizeof(struct node));
                    current->data=val;
                    current->right=NULL;

                    tr=head;
                    while(tr->right!=NULL)
                    tr=tr->right;

                    tr->right=current;
                    current->left=tr;
                    break;

            case 3: current=(struct node *)malloc(sizeof(struct node));
                    current->data=val;
            
                    printf("\nEnter node value before you want to insert");
                    scanf("%d",&n);

                    tr=head;
                    while(tr->data!=n)
                    {
                        pretr=tr;
                        tr=tr->right;
                    }

                    pretr->right=current;
                    current->left=pretr;
                    tr->left=current;
                    current->right=tr;
                    break;
        }
        return head;
    }
}

void display(struct node* temp)
{
    if(temp==NULL)
    {
        printf("First Create");
    }

    else
    {
        struct node *tr=temp;
        while(tr!=NULL)
        {
          printf("%d\t",tr->data);
          tr=tr->left;
        }
    }
}