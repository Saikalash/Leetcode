class Solution {
    public static int p=0;
    public int shipWithinDays(int[] a, int k) {
        int n=a.length;
        int sum=0;
        int min = 0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
            min=Math.max(min,a[i]);
        }
        int l=min;
        int r = sum;
        while(l<r)
        {
            int mid = l+(r-l)/2;
            if(can(a,mid,k))
            {
                r=mid;
            }
            else
            l=mid+1;
        }
        return l;
    }
    public static boolean can(int a[],int x,int k)
    {
        int n =a.length;
        int m=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if((sum+a[i])>x)
            {
                m++;
                sum=a[i];
            }
            else
            sum+=a[i];
            
        }
        return (m<=k);
    }
}