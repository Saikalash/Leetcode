class Solution {
    int min=0;
    public int orangesRotting(int[][] a) {
        int n =a.length;
        int m =a[0].length;
      //  int min=0;
      
      int fresh=0;
      Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                if(a[i][j]==1)
                {
                    fresh++;
                }
            }
        }
        if(fresh==0)
        return 0;
        int min=0;
        int directions[][] = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty())
        {
            int p =q.size();
            while(p-->0)
            {
                int curr[] = q.poll();
                int x = curr[0];
                int y = curr[1];
                for(int[] dir:directions)
                {
                    int x1 = x+dir[0];
                    int x2 = y+dir[1];
                    if(x1>=0 && x2>=0 && x1<n && x2<m && a[x1][x2]==1)
                    {
                        a[x1][x2]=2;
                        fresh--;
                        q.offer(new int[]{x1,x2});
                    }
                }
                

            }
            min++;
        }
        if(fresh!=0)
        {
            return -1;
        }
        return min-1;


        //return min;
    }
}