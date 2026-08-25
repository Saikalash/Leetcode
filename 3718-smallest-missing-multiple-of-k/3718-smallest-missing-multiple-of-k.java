class Solution {
    public int missingMultiple(int[] a, int k) {
        HashSet<Integer> h =new HashSet<>();
        int n = a.length;
        int x=k;
        for(int i=0;i<n;i++)
        {
            h.add(a[i]);
        }
        int i=1;
        while(h.contains(x))
        {
            x=k*(i++);
        }
        return x;
    }
}