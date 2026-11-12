class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int count=1;
        int max=1;
        int n  =a.length;
        int x=1;
        int max1=1;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                x=1;
                count++;
                 max =  Math.max(count,max);
            }
            else if(a[i]>a[i+1])
            {
                count=1;
                x++;
                max1 = Math.max(x,max1);
            }
            else
            {
                count=1;
                x=1;
                
            }
            //max =  Math.max(count,max);

        }
        
        return Math.max(max,max1);
    }
}