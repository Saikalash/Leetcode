/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> l =new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum=0;
        List<Integer> al = new ArrayList<Integer>();
        
        solve(root,targetSum,al);
        return l;
    }

    public void solve(TreeNode root,int sum,List<Integer> al)
    {
        if(root==null)
        return;
        //sum+=root.val;
        al.add(root.val);
        if(root.left==null && root.right==null && root.val== sum)
        {
            l.add(new ArrayList<>(al));
        }
        solve(root.left,sum-root.val,al);
        solve(root.right,sum-root.val,al);
        al.remove(al.size() - 1);
    }
}