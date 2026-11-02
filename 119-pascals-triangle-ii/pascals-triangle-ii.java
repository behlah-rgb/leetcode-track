class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = null;
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) row.add(prev.get(j - 1) + prev.get(j));
            if (i > 0) row.add(1);
            prev = row;
        }
        return prev;
    }
}