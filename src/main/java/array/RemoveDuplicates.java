package array;

/**
 * Given an array nums, remove the duplicates in-place such that each element appear only once and
 * return the new length.
 */
public class RemoveDuplicates {

  public static void main(String[] args) {
    removeDuplicates(new int[]{1, 3, 3, 4, 1, 6});
    removeDuplicatesSorted(new int[]{1, 3, 3, 4, 5, 6});
  }

  /**
   * <p>
   * Time complexity: O(N^2). Space complexity: O(1).
   * </p>
   */
  public static int removeDuplicates(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    int size = 1;

    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j < size; j++) {
        if (nums[j] == nums[i]) {
          break;
        } else if (j == size - 1) {
          nums[size] = nums[i];
          size++;
        }
      }
    }

    return size;
  }

  /**
   * <p>
   * Time complexity: O(N). Space complexity: O(1).
   * </p>
   */
  public static int removeDuplicatesSorted(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    int j = 0;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != nums[i + 1]) {
        nums[j++] = nums[i];
      }
    }

    nums[j++] = nums[nums.length - 1];
    return j;
  }
}
