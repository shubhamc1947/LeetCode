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
    public List<Integer> preorderTraversal(TreeNode root) {
        //checking for base case
        if(root==null) return new ArrayList<>();
        //creating a result Arraylist for stroing answer
        List<Integer> res=new ArrayList<>();
        //taking stack for bahaving like recursion like algo
        Stack<TreeNode> st=new Stack<>();

        st.push(root);
        //loop till stack is not empty
        while(!st.isEmpty()){
            TreeNode top=st.pop();
            res.add(top.val);


            if(top.right!=null) st.push(top.right);

            if(top.left!=null) st.push(top.left);
        }
        return res;
    }
}