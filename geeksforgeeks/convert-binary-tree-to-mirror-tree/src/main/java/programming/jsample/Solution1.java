package programming.jsample;

public class Solution1 {

	public void solution(TreeNode rootNode) {

		interchange(rootNode);
	}

	private void interchange(TreeNode node) {

		if (node == null) {
			return;
		}

		TreeNode leftChild = node.getLeftChild();

		TreeNode rightChild = node.getRightChild();

		node.setRightChild(leftChild);
		node.setLeftChild(rightChild);
		interchange(leftChild);
		interchange(rightChild);

	}
}