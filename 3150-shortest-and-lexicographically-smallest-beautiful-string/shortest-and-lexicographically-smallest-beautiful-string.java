class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0, j=0, count=0;
        int[] arr ={0,s.length()+1};
        while(j<s.length()){
            while(j<s.length() && count<k){
                if(s.charAt(j)=='1'){
                    count++;
                }
                j++;
            }
            if(count==k){
                while(i<j && s.charAt(i)=='0'){
                    i++;
                }
                if (j - i < arr[1] - arr[0] || (j - i == arr[1] - arr[0] &&s.substring(i, j).compareTo(s.substring(arr[0], arr[1])) < 0)){
                    arr[0]=i;
                    arr[1]=j;
                }
                if(s.charAt(i)=='1'){
                    count--;
                }
                i++;
                
            }
        }
        if (arr[1] == s.length() + 1) {
            return "";
        }
        return s.substring(arr[0], arr[1]);
    }
}