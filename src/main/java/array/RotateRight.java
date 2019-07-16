package array;

public class RotateRight {

  public static void main(String[] args) {
    rotateArray(new int[]{1, 2, 3, 4, 5, 6}, 4);
  }

  /**
   * Recursive solution.
   *
   * <p>
   * Time complexity: O(N). Space complexity: O(1).
   * </p>
   */
  public static void rotateArray(int[] nums, int k) {
    if (nums.length <= 1) {
      return;
    }

    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k % nums.length - 1);
    reverse(nums, k % nums.length, nums.length - 1);
  }

  private static void reverse(int[] nums, int i, int j) {
    while (i < j) {
      int aux = nums[j];
      nums[j] = nums[i];
      nums[i] = aux;
      i++;
      j--;
    }
  }
}