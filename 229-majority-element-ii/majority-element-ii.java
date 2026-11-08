class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int mini = nums.length / 3 + 1;
        HashMap<Integer, Integer> count = new HashMap<>(nums.length);
        List<Integer> ans = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) == mini) 
                ans.add(nums[i]);
        }

        return ans;
    }
}