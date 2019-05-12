package programming.jsample;

import java.util.LinkedList;

public class Solution2 {

	private LinkedList<TreeNode> list = new LinkedList<>();

	public void solution(TreeNode rootNode) {
		list.add(rootNode);
		interchange();
	}

	private void interchange() {

		while (!list.isEmpty()) {

			TreeNode node = list.removeFirst();
			TreeNode leftChild = node.getLeftChild();

			TreeNode rightChild = node.getRightChild();

			if (leftChild != null) {
				list.add(leftChild);
			}
			if (rightChild != null) {
				list.add(rightChild);
			}

			node.setRightChild(leftChild);
			node.setLeftChild(rightChild);

		}
	}
}