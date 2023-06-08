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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=q.size();
            while(size-- >0){
                TreeNode Top=q.remove();
                level.add(Top.val);
                if(Top.left!=null) q.add(Top.left);
                if(Top.right!=null) q.add(Top.right);
            }
            ans.add(level);
        }
        return ans;

    }
}