// code to implement singly linked list

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
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

          case 4: display(head);
        }
    } while (ch!=5);
    

}

struct node* crLnk(struct node *head, int val)
{
    if(head==NULL)
    {
        head=(struct node *)malloc(sizeof(struct node));
        head->data=val;
        head->next=NULL;
        return head;
    }

    else
    {
        struct node *tr=head;
        while(tr->next!=NULL)
        tr=tr->next;

        struct node *current;
        current=(struct node*)malloc(sizeof(struct node));
        current->data=val;
        current->next=NULL;

        tr->next=current;
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
                    current->next=head;
                    head=current;
                    break;

            case 2: current=(struct node*)malloc(sizeof(struct node));
                    current->data=val;
                    current->next=NULL;

                    tr=head;
                    while(tr->next!=NULL)
                    tr=tr->next;

                    tr->next=current;
                    break;

            case 3: current=(struct node *)malloc(sizeof(struct node));
                    current->data=val;
            
                    printf("\nEnter node value before you want to insert");
                    scanf("%d",&n);

                    tr=head;
                    while(tr->data!=n)
                    {
                        pretr=tr;
                        tr=tr->next;
                    }

                    pretr->next=current;
                    current->next=tr;
                    break;
        }
        return head;
    }
}

void display(struct node* head)
{
    struct node *tr=head;
    while(tr!=NULL)
    {
        printf("%d\t",tr->data);
        tr=tr->next;
    }
}