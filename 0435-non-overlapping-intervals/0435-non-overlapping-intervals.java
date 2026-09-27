class Solution {
    public int eraseOverlapIntervals(int[][] a) {
        int n =a.length;
        int m = a[0].length;
        int score=0;
        Arrays.sort(a, (c, b) -> c[1] - b[1]);

        int max =a[0][1];
        for(int i=1;i<n;i++)
        {
                if(a[i][0]<max)
                {
                    score++;
                    //i++;
                }
                else
                {
                    max = a[i][1];
                }
            
        }
        return score;
    }
}