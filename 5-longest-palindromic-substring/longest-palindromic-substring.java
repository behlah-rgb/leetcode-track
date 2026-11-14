class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (j - i + 1 > ans.length() && isPalindrome(s, i, j)) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

    boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}