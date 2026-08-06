class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        generate(ans,n,0,0,str);
        return ans;
    }
    public void generate(List<String> ans, int n, int open, int close, StringBuilder str){
        if(str.length()==n*2){
            ans.add(str.toString());
            return;
        }
        if(open<n){
            str.append('(');
            generate(ans,n,open+1,close,str);
            str.deleteCharAt(str.length()-1);
        }
        
        if(open>close){
            str.append(')');
            generate(ans,n,open,close+1,str);
            str.deleteCharAt(str.length()-1);
        }
        return;
    }
}