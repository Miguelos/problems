package graphs

import graphs.dataClasses.TreeNode

class BinaryTreeInorderTraversalTest extends GroovyTestCase {

  void testInorderTraversal() {
    def testTree = new TreeNode(1)
    testTree.right = new TreeNode(2)
    testTree.right.left = new TreeNode(3)

    assert BinaryTreeInorderTraversal.inorderTraversal(testTree) == [1, 3, 2]
  }
}
