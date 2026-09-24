class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] seen = new boolean[1440];
        for(String str: timePoints){
            int h = Integer.parseInt(str.substring(0,2));
            int m = Integer.parseInt(str.substring(3,5));
            int min = h*60+ m;
            if(seen[min]){
                return 0;
            }
            seen[min]=true;
        }
        int time=1500;
        int prev=-1, first=-1;
        for(int i=0; i<1440; i++){
            if(seen[i]){
                if(first==-1){
                    first=i;
                }
                else{
                    time=Math.min(time,i-prev);
                }
                prev=i;
            }
        }
        time = Math.min(time,1440-prev+first);
        return time;
    }
}