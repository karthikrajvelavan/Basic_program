
class Bst
{
class Node
{
	int value;
	Node left;
	Node right;
	Node(int value)
	{
	this.value=value;
	right=null;
	left=null;
	}

}
Node root;
Node insertrec(Node root,int val)
{
	if(root==null)
	return new Node(val);

	if(val<root.val)
	root.left=insertrec(root.left,val);
	else if(val>root.val)
	root.right=insertrec(root.right,val);
	

	return root;
}
void insert(int val)
{
	root=insertrec(root,val);
}
	public static void main(String args[])
	{
	Bst r=new Bst();
    r.insert(2);
    r.insert(1);
    r.insert(3);
    r.insert(4);
	}
}