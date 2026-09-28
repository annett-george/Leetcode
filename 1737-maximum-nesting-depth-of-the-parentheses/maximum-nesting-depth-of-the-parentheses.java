class Solution {
    public int maxDepth(String s) {
        int depth =0;
        int max=0;
        for(Character ch: s.toCharArray()){
            if(ch=='('){
                depth++;
                if(depth>max){
                    max=depth;
                }
            }
            else if(ch==')'){
                depth--;
            }
        }
        return max;
    }
}