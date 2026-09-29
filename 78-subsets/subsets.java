class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n; // 2^n
        
        // Pre-allocate exact list capacities to avoid dynamic resizing
        List<List<Integer>> subsets = new ArrayList<>(totalSubsets);

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>(Integer.bitCount(i));
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
}