package graphs;

import graphs.dataClasses.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

  /**
   * Given a binary tree, return the inorder traversal of its nodes' values.
   *
   * Time complexity: O(N). Space complexity: O(N).
   */
  public static List<Integer> inorderTraversal(TreeNode root) {
    ArrayList<Integer> ret = new ArrayList<>();

    if (root != null) {
      if (root.left != null) {
        ret.addAll(inorderTraversal(root.left));
      }
      ret.add(root.val);
      if (root.right != null) {
        ret.addAll(inorderTraversal(root.right));
      }
    }
    return ret;
  }
}