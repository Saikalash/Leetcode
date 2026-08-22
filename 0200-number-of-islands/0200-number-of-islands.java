class Solution {
    public int numIslands(char[][] a) {
        int n = a.length;
        int m = a[0].length;
        int islands=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]=='1')
                {
                    DFS(a,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }
    public static void DFS(char a[][],int i,int j)
    {
        int n = a.length;
        int m = a[0].length;
        if(i<0 || i>n-1 || j<0 || j>m-1 || a[i][j]=='0' || a[i][j] == '$')
        {
            return ;
        }

        if(a[i][j]=='1')
        {
            a[i][j] = '$';
        }

        DFS(a,i-1,j);
        DFS(a,i+1,j);
        DFS(a,i,j-1);
        DFS(a,i,j+1);


    }
}