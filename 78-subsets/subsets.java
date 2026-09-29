class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            for (int j = 0; j < nums.length; j++){
                if ((i & (1 << j)) != 0)
                    subset.add(nums[j]);
            }
            subsets.add(new ArrayList<>(subset));
            subset.clear();
        }
        return subsets;
    }
}