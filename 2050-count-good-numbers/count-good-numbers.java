class Solution {
    private static final long MOD = 1000000007L;

    private long modPower (long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) { 
                result = (base * result) % MOD;
                exponent--;
            } else {
                base = (base * base) % MOD;
                exponent /= 2;
            }
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long oddCount = n / 2, evenCount = (n + 1) / 2;
        long oddWays = modPower(4, oddCount);
        long evenWays = modPower(5, evenCount);

        return (int) ((oddWays * evenWays) % MOD);
    }
}