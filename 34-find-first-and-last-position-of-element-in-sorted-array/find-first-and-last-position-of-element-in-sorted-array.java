class Solution {
    public int[] searchRange(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < nums.length && nums[left] != target) {
            left++;
        }

        while (right >= 0 && nums[right] != target) {
            right--;
        }

        if (left > right) {
            return new int[]{-1, -1};
        }

        return new int[]{left, right};
    }
}