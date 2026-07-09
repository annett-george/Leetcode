class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+i);
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)-i);
        }
        int res=0;
        for(int val : hm.values()){
            res+=Math.abs(val);
        }
        return res;
    }
}