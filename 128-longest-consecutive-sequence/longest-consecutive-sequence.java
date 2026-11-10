class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;

        Set<Integer> set = new HashSet<>(nums.length * 2);
        //O(n)
        for (int num : nums) set.add(num);

        //O(2n)
        for (int num : set) {
            // previous exists dont waste the run on this one, previous will cover it
            if (set.contains(num - 1)) continue;

            int curr = 1;
            int nextNum = num + 1;

            while (set.contains(nextNum)) { curr++; nextNum++; }

            longest = Math.max(longest, curr);
        }

        return longest;
    }
}