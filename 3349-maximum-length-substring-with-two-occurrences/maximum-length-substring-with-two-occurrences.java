class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i=0, j=0,max=0,len=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(hm.getOrDefault(ch,0)>=2){
                while(s.charAt(i)!=ch){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                    i++;
                }
                hm.put(ch,hm.get(ch)-1);
                i++;
            }
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            len=j-i+1;
            max=Math.max(max,len);
            j++;
        }
        return max;
    }
}