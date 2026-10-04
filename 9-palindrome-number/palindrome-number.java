class Solution {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer();
        sb.append(x);
        int low = 0, high = sb.length() - 1;
        int mid = low + (high - low) / 2;
        while (low <= mid && mid < high) {
            if (sb.charAt(low) != sb.charAt(high)) return false;
            low++; high--;
        }
        return true;
    }
}