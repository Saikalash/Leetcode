class Solution {
    public int minOperations(int[] a, int x) {
        int n =a.length;
        int i=0;
        int j=0;
        int count=-1;
        int p=0;
        for(int k=0;k<n;k++)
        {
            p +=a[k];
        }
        if(p<x)
        {
            return -1;
        }
        int sum=0;
        while(j<n)
        {
            sum+=a[j];
            if(sum==p-x)
            count = Math.max(count,j-i+1);
            else if(sum>(p-x))
            {
            while(sum>p-x)
            {
                sum =  sum - a[i];
                i++;
            }
            }
            if(sum==p-x)
            count = Math.max(count,j-i+1);
            j++;
        }
        if(count==-1)
        return -1;
        return n-count;
    }
}