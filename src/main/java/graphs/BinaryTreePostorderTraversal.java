package graphs;

import graphs.dataClasses.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

  /**
   * Given a binary tree, return the postorder traversal of its nodes' values.
   *
   * Time complexity: O(N). Space complexity: O(N).
   */
  public static List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer> ret = new ArrayList<>();

    if (root != null) {
      if (root.left != null) {
        ret.addAll(postorderTraversal(root.left));
      }
      if (root.right != null) {
        ret.addAll(postorderTraversal(root.right));
      }
      ret.add(root.val);
    }
    return ret;  }
}