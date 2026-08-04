class Solution {
    public List<Integer> findMissingElements(int[] a) {
        List<Integer> l = new ArrayList<>();
        int n =a.length;
        HashSet<Integer> h = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
            h.add(a[i]);
        }
        for(int i=min;i<max;i++)
        {
            if(!h.contains(i))
            {
                l.add(i);
            }
        }
        return l;
    }
}