class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char leftChar = Character.toLowerCase(s.charAt(low));
            char rightChar = Character.toLowerCase(s.charAt(high));

            if (!Character.isLetterOrDigit(leftChar)) low++;
            else if (!Character.isLetterOrDigit(rightChar)) high--;
            else {
                if (leftChar != rightChar) return false;
                low++; high--;
            }
        }
        return true;
    }
}