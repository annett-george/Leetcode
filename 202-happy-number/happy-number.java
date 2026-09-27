class Solution {
    public boolean isHappy(int n) {
        int sq=n;
        HashSet<Integer> set = new HashSet<>();
        while(sq!=1){
            int dup = sq;
            sq =0;
            while(dup!=0){
                sq += (dup%10)*(dup%10);
                dup/=10;
            }
            if(set.contains(sq)){
                return false;
            }
            set.add(sq);
        }
        return true;
    }
}