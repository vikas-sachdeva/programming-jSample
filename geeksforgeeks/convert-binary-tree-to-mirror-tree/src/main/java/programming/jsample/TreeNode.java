package programming.jsample;

public class TreeNode {

	private TreeNode leftChild;

	private TreeNode rightChild;

	private int value;

	public TreeNode(TreeNode leftChild, TreeNode rightChild, int value) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
