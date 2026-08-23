class Solution {
    List<List<Integer>>al = new ArrayList<>();
    public List<List<Integer>> subsets(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        rec(0,a,l);
        return al;
    }

    public void rec(int i,int a[],ArrayList<Integer> l)
    {
        if(i>=a.length)
        {
            al.add(new ArrayList<>(l));
            return;
        }
        l.add(a[i]);
        rec(i+1,a,l);
        l.remove(l.size()-1);
        rec(i+1,a,l);

    }
}