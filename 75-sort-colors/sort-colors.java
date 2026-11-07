class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        // [0...low - 1] extreme left is 0
        // [low ... mid - 1] is 1
        // [mid...high] unsorted
        // [high + 1 ... n - 1] extreme right is 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++; mid++;
            } else if (nums[mid] == 1) mid++;
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}