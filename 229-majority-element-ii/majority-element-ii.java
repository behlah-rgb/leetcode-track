class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length / 3;
        HashMap<Integer, Integer> count = new HashMap<>(nums.length);
        List<Integer> ans = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            if (count.get(nums[i]) > threshold && !ans.contains(nums[i])) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}