package graphs;

import graphs.dataClasses.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

  /**
   * Given a binary tree, return the preorder traversal of its nodes' values.
   *
   * Time complexity: O(N). Space complexity: O(N).
   */
  public static List<Integer> preorderTraversal(TreeNode root) {
    ArrayList<Integer> ret = new ArrayList<>();

    if (root != null) {
      ret.add(root.val);
      if (root.left != null) {
        ret.addAll(preorderTraversal(root.left));
      }
      if (root.right != null) {
        ret.addAll(preorderTraversal(root.right));
      }
    }
    return ret;
  }
}