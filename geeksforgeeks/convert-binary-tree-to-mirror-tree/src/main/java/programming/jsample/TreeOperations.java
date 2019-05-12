package programming.jsample;

public class TreeOperations {

	public void inOrder(TreeNode rootNode) {

		if (rootNode == null) {
			return;
		}
		inOrder(rootNode.getLeftChild());
		
		System.out.print(rootNode.getValue() + " ");
		
		inOrder(rootNode.getRightChild());

	}
}
