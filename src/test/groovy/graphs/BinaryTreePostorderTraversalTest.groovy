package graphs

import graphs.dataClasses.TreeNode

class BinaryTreePostorderTraversalTest extends GroovyTestCase {

  void testPostorderTraversal() {
    def testTree = new TreeNode(1)
    testTree.right = new TreeNode(2)
    testTree.right.left = new TreeNode(3)

    assert BinaryTreePostorderTraversal.postorderTraversal(testTree) == [3, 2, 1]
  }
}
