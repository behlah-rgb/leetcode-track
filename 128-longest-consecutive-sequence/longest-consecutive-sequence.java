class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) set.add(num);

        for (int num : set) {
            if (set.contains(num - 1)) continue;

            int curr = 1;
            int nextNum = num + 1;

            while (set.contains(nextNum)) { curr++; nextNum++; }

            longest = Math.max(longest, curr);
        }

        return longest;
    }
}