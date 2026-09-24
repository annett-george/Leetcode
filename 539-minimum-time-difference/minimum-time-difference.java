class Solution {
    public int findMinDifference(List<String> timePoints) {
        int time = 1500;
        Collections.sort(timePoints);
        for(int i=0; i<timePoints.size(); i++){
            int j = i==timePoints.size()-1 ? 0 :i+1;
            String[] t1 = timePoints.get(i).split(":");
            String[] t2 = timePoints.get(j).split(":");
            int m1= Integer.parseInt(t1[0])*60 + Integer.parseInt(t1[1]);
            int m2 = Integer.parseInt(t2[0])*60 + Integer.parseInt(t2[1]);
            int diff = Math.abs(m1-m2);
            diff = Math.min(diff,1440-diff);
            time= Math.min(time,diff);
        }
        return time;
    }
}