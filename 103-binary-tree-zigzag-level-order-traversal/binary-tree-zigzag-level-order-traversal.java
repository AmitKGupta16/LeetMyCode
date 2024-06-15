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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root == null) return output;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 0;
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left !=null) queue.add(poll.left);
                if(poll.right != null) queue.add(poll.right);
            }
            if(index % 2 != 0) Collections.reverse(list);
            output.add(list);
            index++;

        }

        return output;

    }
}