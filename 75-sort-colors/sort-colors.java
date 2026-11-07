class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = 1;
        while (left  < right && right < nums.length) {
            if (nums[left] < nums[right]) {
                if (nums[left] == 1 && nums[right] == 2) right++;
                else { if (right - left == 1)
                {left++; right++;} else left++;}
            } else if (nums[left] == nums[right]) right++;
            else {
                if (nums[left] == 2 && nums[right] == 1) right++;
                else {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++; right++;
                }
            }
        }

        right = left + 1;
        while (left < right && right < nums.length) {
            if (nums[left] < nums[right]) {
                if (right - left == 1)
                {left++; right++;} else left++;
            } else if (nums[left] == nums[right]) right++;
            else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++; right++;
            }
        }
    }
}