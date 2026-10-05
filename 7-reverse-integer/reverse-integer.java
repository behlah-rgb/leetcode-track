class Solution {
    public int reverse(int x) {
        // StringBuffer sb = new StringBuffer();
        // sb.append(x);
        // int low = 0;
        // if (sb.charAt(0) == '-') low = 1;
        // int high = sb.length() - 1;
        // while (sb.charAt(high) == '0' && sb.length() > 0){
        //     sb.deleteCharAt(high);
        //     high--;
        // }
        // int mid = low + (high - low) / 2;
        // while (low <= mid && mid < high) {
        //     char temp = sb.charAt(low);
        //     sb.setCharAt(low, sb.charAt(high));
        //     sb.setCharAt(high, temp);
        //     low++; high--;
        // }
        // return Integer.parseInt(sb.toString());

        long rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) return 0;
        return (int) rev;
    }
}