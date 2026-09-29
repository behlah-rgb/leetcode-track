class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if (n < 0) nn = -nn;
        if (x == 0 && n > 0) return 0;
        double ans = 1.0;
        while (nn > 0){
            if (nn % 2 == 1){
                ans *= x;
                nn--;
            } else {
                x *= x;
                nn /= 2;
            }
        }
        if (n < 0) return 1.0 / ans;
        else return ans;
    }
}