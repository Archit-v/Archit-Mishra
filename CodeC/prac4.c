//code to implement BST

#include <stdio.h>
#include <stdlib.h>

struct node
{
    struct node *left;
    int data;
    struct node *right;
};

struct node* ins(struct node *,int );

struct node* newNd(int);

void display(struct node*);
int main()
{
    struct node *root=NULL;
    root=crBst(root,30);
    root=crBst(root,25);
    
    printf("%d",root->left->data);
    root=crBst(root,40);
    root=crBst(root,45);
    root=crBst(root,22);
    root=crBst(root,22);
    
    display(root);

    return 0;
}

struct node* ins(struct node *root,int val)
{
    if(root==NULL)
    {
        return newNd(val);
    }

    else if(val<root->data)
    root->left=ins(root->left,val);    
        
    else if(val>root->data)
    root->right=ins(root->right,val);

    return root;    

}

void display(struct node *root)
{
    if(root==NULL)
    return;

    else
    {
        printf("%d", root->data);
        display(root->left);
        display(root->right);
    }
}