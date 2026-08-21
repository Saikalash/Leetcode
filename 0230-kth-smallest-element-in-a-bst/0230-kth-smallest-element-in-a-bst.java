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
    //int a[] =new int[10000];
    int count=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        //int i=0;
        solve(root,k);
        //Arrays.sort(a);
        return ans;
    }
    public void solve(TreeNode root,int k)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left,k);
        count++;
        if(count==k)
        {
            ans = root.val;
            return;
        }
       // a[i++] = root.val; 
        solve(root.right,k);
       
    }
}