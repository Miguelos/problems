package graphs

import graphs.dataClasses.TreeNode

class BinaryTreePreorderTraversalTest extends GroovyTestCase {

  void testPreorderTraversal() {
    def testTree = new TreeNode(1)
    testTree.right = new TreeNode(2)
    testTree.right.left = new TreeNode(3)

    assert BinaryTreePreorderTraversal.preorderTraversal(testTree) == [1, 2, 3]
  }
}
