class Solution {
    public char findTheDifference(String s, String t) {
        return (char)(sumStr(t) - sumStr(s));
    }

    private int sumStr(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum += s.charAt(i);
        }
        return sum;
    }
}