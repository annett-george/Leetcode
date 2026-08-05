class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            for(int j=i-1; j>0; j--){
                // Update backwards to avoid overwriting values needed later 
                row.set(j, row.get(j)+row.get(j-1));
            }
            row.add(1);
        }
        return row;
    }
}