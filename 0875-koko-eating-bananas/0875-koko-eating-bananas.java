class Solution {
    public int minEatingSpeed(int[] a, int h) {
        int n =a.length;
        int l=1;
        int max=0;
        for(int num:a)
        {
            max = Math.max(num,max);
        }
        int r=max;
        while(l<r)
        {
            int mid = l+(r-l)/2;
            if(can(a,mid,h))
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
       


        
        
    }
    public static boolean can(int a[],int x,int h)
    {
        int n=a.length;
        int ac=0;
        for(int i=0;i<n;i++)
        {
            ac+=a[i]/x;
            if((a[i]%x)!=0)
            {
                ac++;
            }
        }
        if(ac<=h)
        return true;

        return false;
    }
}