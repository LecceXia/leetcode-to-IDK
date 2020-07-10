class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int buy=0;
        int sell=0;
        int profit=0;
        while(i<prices.length-1){
            while(i<prices.length-1&&prices[i+1]<=prices[i]){
                i++;
            }
            buy=prices[i];
            while(i<prices.length-1&&prices[i+1]>prices[i]){
                i++;
            }
            sell=prices[i];
            profit+=sell-buy;

        }
        return profit;
    }
}

//用曲线图非常好理解 股票曲线处于谷底的时候买入 峰顶的时候卖出即可
