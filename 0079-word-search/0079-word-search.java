class Solution {
    int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    public boolean exist(char[][] a, String x) {
        int n =a.length;
        int m = a[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(a[i][j]==x.charAt(0) && solve(i,j,x,0,a))
                {
                   return true;
                }
            }
        }
        return false;
    }
    public boolean solve(int i,int j,String x,int idx,char a[][])
    {
        int n=a.length;
        int m =a[0].length;
        if(i<0 || i>=n || j<0 || j>=m || a[i][j] =='$'|| a[i][j]!=x.charAt(idx))
        {
            return false;
        }
        if(idx == x.length()-1)
        {return true;
        }
        
        char temp = a[i][j];
        a[i][j]='$';
        for(int[] dir:directions)
        {
            int p = i+dir[0];
            int q = j+dir[1];

            if(solve(p,q,x,idx+1,a))
            return true;
        }
        a[i][j]=temp;

        
    return false;

    }
}