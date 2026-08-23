class Solution {
    List<List<Integer>> al =new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] a, int x) {
        ArrayList<Integer> l =new ArrayList<>();
        int i=0;
        solve(i,a,l,x);
        return al;
    }
    public void solve(int i,int a[],List<Integer> l,int x)
    {
       if (x == 0) {
            al.add(new ArrayList<>(l));
            return;
        }

        if (i >= a.length || x < 0)
            return;

        // Take
        l.add(a[i]);
        solve(i, a, l, x - a[i]);
        l.remove(l.size() - 1);

        // Don't take
        solve(i + 1, a, l, x);
    }
}