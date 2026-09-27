class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } 
            else if (s.charAt(i) == ')') {
                int j = st.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int flag = 1;
        while (i < n) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = pair[i];
                flag = -flag;
            } 
            else {
                ans.append(s.charAt(i));
            }
            i += flag;
        }
        return ans.toString();
    }
}