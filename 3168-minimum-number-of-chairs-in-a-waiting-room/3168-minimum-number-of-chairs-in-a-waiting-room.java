class Solution {
    public int minimumChairs(String s) {
        int n = s.length();
        int c=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='E')
            {
                c++;
            }
            else
            c--;
            max = Math.max(max,c);
        }
        return max;
    }
}