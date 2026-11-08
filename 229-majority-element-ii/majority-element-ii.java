class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int threshold = nums.length / 3;
        List<Integer> ans = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (ans.size() == 0 || ans.getFirst() != nums[i]) {
                int cnt = 0;
                if (!ans.contains(nums[i])) {
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == nums[i]) cnt++;
                    }
                    if (cnt > threshold) ans.add(nums[i]);
                }
            }
        }

        return ans;
    }
}