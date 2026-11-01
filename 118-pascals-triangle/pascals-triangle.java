class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));

        if (numRows == 1) return result;
        for (int i = 1; i < numRows; i++) {
            int[] temp = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) temp[j] = 1;
                else temp[j] = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
            }
            List<Integer> tempList = new ArrayList<>();
            for (int num : temp) tempList.add(num);
            result.add(tempList);
        }
        return result;
    }
}