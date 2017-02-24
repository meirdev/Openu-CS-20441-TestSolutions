package Test_2015_86_465;

import Global.Node;

public class Question_3 {
	public static Node secret(Node root, Node p, Node q)
	{
		if (root == null)
			return null;
		if (root == p || root == q)
			return root;
		Node left = secret(root.getLeftSon(), p, q);
		Node right = secret(root.getRightSon(), p, q);
		
		if (left != null && right != null)
			return root;
		if (left != null && right == null)
			return left;
		return right;
	}
}
