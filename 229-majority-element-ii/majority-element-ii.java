class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0, e1 = 0, e2 = 1; // e1 != e2

        for (int n : nums) {
            if (n == e1) c1++;
            else if (n == e2) c2++;
            else if (c1 == 0) { e1 = n; c1 = 1; }
            else if (c2 == 0) { e2 = n; c2 = 1; }
            else { c1--; c2--; }
        }

        c1 = c2 = 0;
        for (int n : nums) {
            if (n == e1) c1++;
            else if (n == e2) c2++;
        }

        List<Integer> ans = new ArrayList<>();
        int t = nums.length / 3;
        if (c1 > t) ans.add(e1);
        if (c2 > t) ans.add(e2);
        return ans;
    }
}