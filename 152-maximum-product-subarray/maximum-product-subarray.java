class Solution {
    public int maxProduct(int[] nums) {
        int cmax = nums[0], cmin = nums[0], maxp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int pmax = cmax, pmin = cmin;
            cmax = Math.max(Math.max(pmax * nums[i], pmin * nums[i]), nums[i]);
            cmin = Math.min(Math.min(pmax * nums[i], pmin * nums[i]), nums[i]);
            maxp = Math.max(maxp, cmax);
        }

        return maxp;
    }
}