
TREES

in - order
pre - order
post - order


//********************************************

ITERATIVE - pre order

root - left - right

1.push root
print top of stack

(to get first left , & then right )
{
    first push right side nodes onto stack

    then push left side nodes on to stack

    == => LEFT NODES on top of stack ,
    SO root - left - right
}


void preorder(TreeNode *root )
{
    node = root;
    stk.push(node);
    vector<int>v;

    while (!stk.empty())
    {
        root = stk.top();
        stk.pop();

        v.push_back(root->val);

        if (root->right != NULL)
        {
            stk.push(root->right);
        }
        if (root->left != NULL)
        {
            stk.push(root->left);
        }
    }

    return v;

}


//********************************************************************
ITERATIVE - in order

left - root - right

1)move to leftmost possible
put all lefts in stack

2) print top of stack -- > then move to right


void inorder(TreeNode *root )
{
    vector<int>v;

    while (true)
    {
        if (node != NULL)
        {
            stk.push(node);
            node = node->left;
        }
        else
        {
            if (stk.empty())break;

            node = stk.top();
            stk.pop();

            v.push_back(node->val);
            node = node->right;
        }
    }
    return v;
}


//**************************************************************************************
ITERATIVE - post order

left -  right - root


0) push root onto stack

---> pop top of stack and add to answer vector
1)push left , right onto stack


reverse ans vector ;

return ans vector;

void postorder(TreeNode * root)
{
    vector<int>v;

    stack<TreeNode*>stk;
    stk.push(root);

    while (!stk.empty())
    {
        node = stk.top()
               stk.pop();

        v.push_back(node->val);

        if (node->left != NULL)
        {
            stk.push(node->left);
        }
        if (node->right != NULL)
        {
            stk.push(node->right);
        }
    }

    reverse(v); // stores in root right left order
    // reversing it we get , left right root order


    return v;

}

//**************************************************************************************
ALL 3 TRAVERSALS within one

PREORDER  = ROOT - LEFT - RIGHT
            INORDER   = LEFT - ROOT - RIGHT
                        POSTORDER = LEFT - RIGHT - ROOT

                                    stack<pair<int, int>>stk;




























