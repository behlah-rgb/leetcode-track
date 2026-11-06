class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int drop = -1;

        // find the 1st drop and break, as any drop after this will be a higher permutation
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] > nums[i]) {
                drop = i;
                break;
            }
        }

        // if no drop then reverse and return
        if (drop == -1) {
            int end = n - 1, start = 0;
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
            return;
        }

        // swapping the 1st element > drop since its all already in order
        for (int i = n - 1; i > drop; i--) {
            if (nums[i] > nums[drop]) {
                int temp = nums[drop];
                nums[drop] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // reverse the tail
        int end = n - 1; drop++;
        while (drop < end) {
            int temp = nums[drop];
            nums[drop] = nums[end];
            nums[end] = temp;
            drop++; end--;
        }
    }
}