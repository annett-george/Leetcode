class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+i);
            ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)-i);
        }
        int res=0;
        for(int val : hm.values()){
            res+=Math.abs(val);
        }
        return res;
    }
}