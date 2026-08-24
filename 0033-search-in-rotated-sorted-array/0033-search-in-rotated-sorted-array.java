class Solution {
    public int search(int[] a, int k) {
        int n =a.length;
        int low=0;
        int high=n-1;
        int  mid=0;
        while(low<high)
        {
             mid= low + (high - low)/2;
            if(a[mid]>a[high])
            {
                low = mid+1;
            }
            else 
            {
                high = mid;
            }

        }
        int p =high;
        int x = 0,y=p-1;
        while(x<=y)
        {
            int f = x+(y-x)/2;
            if(a[f]==k)
            return f;
            else if(a[f]>k)
            {
                y = f-1;
            }
            else
            x = f+1;
        }
        int l = p,m=n-1;
        while(l<=m)
        {
            int f = l+(m-l)/2;
            if(a[f]==k)
            return f;
            else if(a[f]>k)
            {
                m = f-1;
            }
            else
            l = f+1;

        }
        return -1;
    }
}