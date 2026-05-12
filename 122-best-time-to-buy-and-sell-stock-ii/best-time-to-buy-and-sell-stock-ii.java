
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit=0;
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if(buy<prices[i]){
                maxProfit=maxProfit+prices[i]-buy;
                
            }
            buy=prices[i];
        }
        return maxProfit;
        
    }
}