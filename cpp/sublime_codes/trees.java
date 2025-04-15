BSTNode insert(BSTNode r , int d) {

	BSTNode n = new BSTNode(d);

	if (r == null) {
		return n;
	}

	BSTNode t = r;
	while (t != null) {
		if (d < t.data) {
			if (t.left == null) {
				t.left = n;
				return r;
			} else t = t.left;
		} else {
			if (t.right == null) {
				t.right = n;
				return r;
			} else t = t.right;
		}
	}
}
//BST INSERT
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

//BST from array

BSTNode createBST(int a[]) {
	BSTNoder = null;

	for (int x : a) {
		r = insert(r, x);
	}
	return r;
}


* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
PREORDER
root - left - right

void preorder(btnode r) {
	if (r == null)return;

	System.out.Println(r.data + " ");
	preorder(r.left);
	preorder(r.right);

}




* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
INORDER
left - root - right


void inorder(btnode r) {
	if (r == null)return;

	System.out.Println(r.left + " ");
	preorder(r);
	preorder(r.right);

}



* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
POSTORDER
left - right - root





* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *





