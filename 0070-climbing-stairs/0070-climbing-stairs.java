class Solution {
    //int x=0;
    int t[] =new int[46];
    public int climbStairs(int n) {
        Arrays.fill(t, -1);
        //solve(n);
        return  solve(n);
    }
    public int solve(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }

        if(t[n]!=-1)
        {
            return t[n];
        }
        

        int l = solve(n-1);
        int r = solve(n-2);
        t[n]=l+r;
        return t[n];
    }
}