class Solution {
    List<List<Integer>> al =new ArrayList<>();
    HashSet<Integer> h = new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l = new ArrayList<>();
        solve(l,nums);
        return al;
    }
    public void solve(List<Integer> l,int nums[])
    {
        if(l.size()==nums.length)
        {
            al.add(new ArrayList(l));
            //return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!h.contains(nums[i]))
            {
                l.add(nums[i]);
                h.add(nums[i]);
                solve(l,nums);
                l.remove(l.size()-1);
                h.remove(nums[i]);
            }
        }
    }
}