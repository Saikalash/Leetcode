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
    int a[] =new int[10000];
    int i=0;
    public int kthSmallest(TreeNode root, int k) {
        //int i=0;
        solve(root);
        //Arrays.sort(a);
        return a[k-1];
    }
    public void solve(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        solve(root.left);
        a[i++] = root.val; 
        solve(root.right);
       
    }
}