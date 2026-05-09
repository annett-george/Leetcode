class StockSpanner {
    Stack<int[]> st;
    int index;
    public StockSpanner() {
        st = new Stack<>();
        index=0;
    }
    
    public int next(int price) {
        int span;
        while(!st.isEmpty() && price>=st.peek()[0]){
            st.pop();
        }
        if(st.isEmpty()){
            span=index+1;
        }
        else{
            span=index-st.peek()[1];
        }
        st.push(new int[]{price,index});
        index++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */