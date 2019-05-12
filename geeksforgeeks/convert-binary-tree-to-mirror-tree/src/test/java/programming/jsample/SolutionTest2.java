package programming.jsample;

import org.junit.jupiter.api.Test;

public class SolutionTest2 {

	private Solution2 solution = new Solution2();

	private TreeOperations treeOps = new TreeOperations();

	@Test
	public void solutionTest1() {

		TreeNode node1 = new TreeNode(null, null, 5);
		TreeNode node2 = new TreeNode(null, null, 4);
		TreeNode node3 = new TreeNode(node1, node2, 2);

		TreeNode node4 = new TreeNode(null, null, 3);

		TreeNode rootNode = new TreeNode(node4, node3, 1);

		System.out.println("\nOriginal tree - ");

		treeOps.inOrder(rootNode);

		solution.solution(rootNode);
		System.out.println("\nMirror tree - ");
		treeOps.inOrder(rootNode);

		/*
		 * Original tree - 3 1 5 2 4 
		 * Mirror tree - 4 2 5 1 3
		 */
	}

	@Test
	public void solutionTest2() {

		TreeNode node1 = new TreeNode(null, null, 5);
		TreeNode node2 = new TreeNode(null, null, 4);
		TreeNode node3 = new TreeNode(node1, node2, 2);

		TreeNode node4 = new TreeNode(null, null, 3);
		TreeNode node5 = new TreeNode(node4, null, 7);
		TreeNode node6 = new TreeNode(null, node5, 8);

		TreeNode node7 = new TreeNode(null, node3, 9);

		TreeNode rootNode = new TreeNode(node6, node7, 1);

		System.out.println("\nOriginal tree - ");

		treeOps.inOrder(rootNode);

		solution.solution(rootNode);
		System.out.println("\nMirror tree - ");
		treeOps.inOrder(rootNode);

		/*
		 * Original tree - 8 3 7 1 9 5 2 4 
		 * Mirror tree - 4 2 5 9 1 7 3 8
		 */
	}
}