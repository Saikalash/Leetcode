class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int x=prices[0];;
        int p=0;
        for(int i=1;i<n;i++)
        {

            if(prices[i]>x)
            {
                p += prices[i]-x;
                x = prices[i];
            }
            else
            x = prices[i];
            
        }
        return p;
    }
    
}