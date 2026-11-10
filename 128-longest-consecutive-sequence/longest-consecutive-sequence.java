class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 0;
        int cnt = 0;
        int lastSmallest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastSmallest) {
                cnt++;
                lastSmallest = nums[i];
            } else if (nums[i] != lastSmallest) {
                cnt = 1;
                lastSmallest = nums[i];
            }
            longest = Math.max(cnt, longest);
        }

        return longest;
    }
}