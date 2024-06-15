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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if(root == null) return output;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=1;i<=size;i++) {
                TreeNode poll = queue.poll();
                if(i==size) {
                    output.add(poll.val);
                }
                if(poll.left !=null) queue.add(poll.left);
                if(poll.right !=null) queue.add(poll.right);
            }
        }
        return output;
        
    }
}